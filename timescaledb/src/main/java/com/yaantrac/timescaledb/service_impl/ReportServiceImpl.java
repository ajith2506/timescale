package com.yaantrac.timescaledb.service_impl;

import com.yaantrac.timescaledb.config.APIResponse;
import com.yaantrac.timescaledb.criteria_builder_methods.ReportCriteriaBuilder;
import com.yaantrac.timescaledb.entity.MovementReport;
import com.yaantrac.timescaledb.service.ReportService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ReportServiceImpl implements ReportService {
    @Autowired
    private ReportCriteriaBuilder criteriaBuilder;
    @Override
    public ResponseEntity<APIResponse> getMovementReport(Long startDate, Long endDate, List<String> deviceID, Integer pageNo, Integer pageSize, String sortBy) {
        try {
            List<MovementReport> movementReports = criteriaBuilder.getMovementReport(startDate, endDate, deviceID, pageNo, pageSize, sortBy);
            log.info("Push Ngrok R");
            return ResponseEntity.ok(new APIResponse("success", "No Error", "Data Fetched successfully", movementReports));
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }


}
