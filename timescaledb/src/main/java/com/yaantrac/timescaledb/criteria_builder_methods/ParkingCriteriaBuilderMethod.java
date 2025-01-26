package com.yaantrac.timescaledb.criteria_builder_methods;

import com.yaantrac.timescaledb.entity.ParkingReport;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Component
@Slf4j
public class ParkingCriteriaBuilderMethod {
    @PersistenceContext
    EntityManager entityManager;


    public List<ParkingReport> getParkingReport(Long startDate, Long endDate, List<String> deviceID, Integer pageNo, Integer pageSize, String sortBy) {
        CriteriaBuilder parkingReportCb = entityManager.getCriteriaBuilder();
        CriteriaQuery<ParkingReport> parkingReportCq = parkingReportCb.createQuery(ParkingReport.class);
        Root<ParkingReport> parkingReportRoot = parkingReportCq.from(ParkingReport.class);
        parkingReportCq.select(parkingReportRoot);

        parkingReportCq.where(
                parkingReportCb.and(parkingReportRoot.get("vehicle_number").in(deviceID)));
//                        parkingReportCb.greaterThanOrEqualTo(parkingReportRoot.get("start_time"), startDate));
//                        parkingReportCb.lessThanOrEqualTo(parkingReportRoot.get("end_time"), endDate),
//                        parkingReportCb.notEqual(parkingReportRoot.get("duration"), 0),
//                        parkingReportCb.greaterThanOrEqualTo(parkingReportRoot.get("duration"), 60)));
//        parkingReportCq.orderBy(parkingReportCb.desc(parkingReportRoot.get(Constants.PARKING_DATE)));
        return entityManager.createQuery(parkingReportCq).getResultList();

    }
}
