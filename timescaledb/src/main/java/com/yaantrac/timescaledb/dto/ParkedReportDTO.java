package com.yaantrac.timescaledb.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ParkedReportDTO {

    private String vehicleNumber;
    private String vehicleType;
    private String driverId;
    private Long startTime;
    private Long endTime;
    private Double latitude;
    private Double longitude;
    private String duration;
    private String timeZone;

}