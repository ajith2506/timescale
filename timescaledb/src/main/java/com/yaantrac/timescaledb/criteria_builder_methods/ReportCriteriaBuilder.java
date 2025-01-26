package com.yaantrac.timescaledb.criteria_builder_methods;

import com.yaantrac.timescaledb.entity.MovementReport;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Component
@Slf4j
public class ReportCriteriaBuilder {
    @PersistenceContext
    private EntityManager entityManager;

    public List<MovementReport> getMovementReport(Long startTime, Long endTime, List<String> deviceIDs, Integer pageNo, Integer pageSize, String sortBy) {

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<MovementReport> movementReportCriteriaQuery = criteriaBuilder.createQuery(MovementReport.class);
        Root<MovementReport> movementReportRoot = movementReportCriteriaQuery.from(MovementReport.class);
        // Build predicates
        Predicate startTimePredicate = criteriaBuilder.greaterThanOrEqualTo(movementReportRoot.get("startTime"), startTime);
        Predicate endTimePredicate = criteriaBuilder.lessThanOrEqualTo(movementReportRoot.get("endTime"), endTime);
        Predicate deviceIdPredicate = movementReportRoot.get("vehicleNumber").in(deviceIDs);
        Predicate durationPredicate = criteriaBuilder.greaterThanOrEqualTo(movementReportRoot.get("duration"), 60L);
        Predicate avgSpeedNotNullPredicate = criteriaBuilder.isNotNull(movementReportRoot.get("averageSpeed"));
        Predicate hikeSpeedNotNullPredicate = criteriaBuilder.isNotNull(movementReportRoot.get("hikeSpeed"));
        // Combine predicates
        Predicate combinedPredicate = criteriaBuilder.and(startTimePredicate, endTimePredicate, deviceIdPredicate,
                durationPredicate, avgSpeedNotNullPredicate, hikeSpeedNotNullPredicate);
        movementReportCriteriaQuery.where(combinedPredicate);

        // Apply sorting
        if ("asc".equalsIgnoreCase(sortBy)) {
            movementReportCriteriaQuery.orderBy(criteriaBuilder.asc(movementReportRoot.get("startTime")));
        } else {
            movementReportCriteriaQuery.orderBy(criteriaBuilder.desc(movementReportRoot.get("startTime")));
        }
        TypedQuery<MovementReport> query = entityManager.createQuery(movementReportCriteriaQuery);

        // Apply pagination
        if (pageNo != null && pageSize != null) {
            query.setFirstResult((pageNo - 1) * pageSize);
            query.setMaxResults(pageSize);
        }

        return query.getResultList();

    }

}
