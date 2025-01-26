package com.yaantrac.timescaledb.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ParkedReportDataDTO {
    private Integer count;
    private List<ParkedReportDTO> parkingReport;
}