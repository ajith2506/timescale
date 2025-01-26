package com.yaantrac.timescaledb.service;

import com.yaantrac.timescaledb.config.APIResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ReportService {
    ResponseEntity<APIResponse> getMovementReport(Long startDate, Long endDate, List<String> deviceID, Integer pageNo, Integer pageSize, String sortBy);
}
