package com.yaantrac.timescaledb.service;

import com.yaantrac.timescaledb.criteria_builder_methods.ParkingCriteriaBuilderMethod;
import com.yaantrac.timescaledb.config.APIResponse;
import com.yaantrac.timescaledb.entity.ParkingReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingReportsService {
    @Autowired
    private ParkingCriteriaBuilderMethod parkingCriteriaBuilderMethod;

    public ResponseEntity<APIResponse> getParkingReport(Long startDate, Long endDate, List<String> deviceID, Integer pageNo, Integer pageSize, String sortBy) {
        try {
            List<ParkingReport> parkingReportsData = parkingCriteriaBuilderMethod.getParkingReport(startDate, endDate, deviceID, pageNo, pageSize, sortBy);
            return ResponseEntity.ok(new APIResponse("success", "No Error", "Data Fetched successfully", parkingReportsData));
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
