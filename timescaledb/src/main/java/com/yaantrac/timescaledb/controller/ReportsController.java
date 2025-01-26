package com.yaantrac.timescaledb.controller;

import com.yaantrac.timescaledb.config.APIResponse;
import com.yaantrac.timescaledb.service.ParkingReportsService;
import com.yaantrac.timescaledb.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user/tsdb")
public class ReportsController {
    @Autowired
    private ParkingReportsService parkingReportsService;
    @Autowired
    private ReportService reportService;

    @GetMapping("/parking")
    public ResponseEntity<APIResponse> getParkingReport(
            @RequestParam(value = "deviceid", required = false) List<String> deviceID,
            @RequestParam(value = "startdate") Long startDate,
            @RequestParam(value = "enddate") Long endDate,
            @RequestParam(name = "pageno", required = false) Integer pageNo,
            @RequestParam(name = "pagesize", required = false) Integer pageSize,
            @RequestParam(value = "sortBy", required = false, defaultValue = "DESC") String sortBy) {
        System.out.println("I was Called");
        return parkingReportsService.getParkingReport(startDate, endDate, deviceID, pageNo, pageSize, sortBy);
    }
//
//    @GetMapping("/idle")
//    public ResponseEntity<APIResponse> getIdlereport(
//
//            @RequestParam(value = "deviceid", required = false) List<String> deviceID,
//            @RequestParam(value = "startdate") Long startDate,
//            @RequestParam(value = "enddate") Long endDate,
//            @RequestParam(name = "pageno", required = false) Integer pageNo,
//            @RequestParam(name = "pagesize", required = false) Integer pageSize,
//            @RequestParam(value = "sortBy", required = false, defaultValue = "DESC") String sortBy)
//    {
//        return influxService.getVehicleIdleReport(startDate, endDate, deviceID, pageNo, pageSize,sortBy);
//    }
//
//    @ApiOperation(value = "API to get Engine Report API")
//    @GetMapping("/engine")
//    public ResponseEntity<APIResponse> engineReport(
//            @RequestParam(value = "deviceid", required = false) List<String> deviceID,
//            @RequestParam(value = "startdate") Long startTimeStamp,
//            @RequestParam(value = "enddate") Long endTimeStamp,
//            @RequestParam(name = "pageno", required = false) Integer pageNo,
//            @RequestParam(name = "pagesize", required = false) Integer pageSize,
//            @RequestParam(value = "sortBy", required = false, defaultValue = "DESC") String sortBy) {
//        return influxService.deviceEngineReport(deviceID, startTimeStamp, endTimeStamp, pageNo, pageSize,sortBy);
//    }
//
//    @ApiOperation(value = "API to get Goefence Operation report")
//    @GetMapping("/geofence")
//    public ResponseEntity<APIResponse> geoFenceReport(
//            @RequestParam(value = "deviceid", required = false) List<String> deviceID,
//            @RequestParam(value = "geozoneid", required = false) List<String> geoZoneId,
//            @RequestParam(value = "startdate") Long startDate,
//            @RequestParam(value = "enddate") Long endDate,
//            @RequestParam(value = "pageno", required = false) Integer pageNo,
//            @RequestParam(value = "pagesize", required = false) Integer pageSize,
//            @RequestParam(value = "sortBy", required = false, defaultValue = "DESC") String sortBy
//    ) {
//        return influxService.geofenceOperationsReport(deviceID, geoZoneId, startDate, endDate, pageNo, pageSize,sortBy);
//
//    }
//
//    @GetMapping("/vehicleDetails")
//    public ResponseEntity<APIResponse> getVehicleDetails(
//            @RequestParam(value = "pageno", required = false) Integer pageNo,
//            @RequestParam(value = "pagesize", required = false) Integer pageSize,
//            @RequestParam(value = "sortBy", required = false, defaultValue = "DESC") String sortBy) {
//        return influxService.getVehicleDetails(pageNo, pageSize,sortBy);
//    }
//
//    @ApiOperation(value = "API to get Overall Report API")
//    @GetMapping("/overall")
//    public ResponseEntity<APIResponse> getOverAllReport(
//            @RequestParam(value = "deviceid", required = false) List<String> deviceID,
//            @RequestParam(value = "startdate") Long startTimeStamp,
//            @RequestParam(value = "enddate") Long endTimeStamp,
//            @RequestParam(name = "pageno", required = false) Integer pageNo,
//            @RequestParam(name = "pagesize", required = false) Integer pageSize,
//            @RequestParam(value = "sortBy", required = false, defaultValue = "DESC") String sortBy) {
//        return influxService.getOverAllReportInfluxDB(deviceID, startTimeStamp, endTimeStamp, pageNo, pageSize,sortBy);
//    }
//
//    @ApiOperation(value = "API to get km Report API")
//    @GetMapping("/km")
//    public ResponseEntity<APIResponse> kmReportsAPI(
//            @RequestParam(value = "deviceid", required = false) List<String> deviceID,
//            @RequestParam(value = "startdate") Long startTimeStamp,
//            @RequestParam(value = "enddate") Long endTimeStamp,
//            @RequestParam(value = "pageno", required = false) Integer pageNumber,
//            @RequestParam(value = "pagesize", required = false) Integer pageSize,
//            @RequestParam(value = "sortBy", required = false, defaultValue = "DESC") String sortBy) {
//        return influxService.kmReportAPI(startTimeStamp, endTimeStamp, deviceID, pageNumber, pageSize,sortBy);
//    }
//
//    @ApiOperation(value = "API to get Device Health report API")
//    @GetMapping("/device/health/report")
//    public ResponseEntity<APIResponse> deviceHelthReportAPI(
//            @RequestParam(value = "deviceid", required = false) List<String> deviceID,
//            @RequestParam(value = "pageno", required = false) Integer pageNumber,
//            @RequestParam(value = "pagesize", required = false) Integer pageSize,
//            @RequestParam(value = "sortBy", required = false, defaultValue = "DESC") String sortBy) {
//        return influxService.deviceHelthReportAPI(deviceID, pageNumber, pageSize,sortBy);
//    }
//
//    @ApiOperation(value = "API to get Alert Notification")
//    @GetMapping("/alert/notification")
//    public ResponseEntity<APIResponse> alertNotificationReport(
//            @RequestParam(value = "deviceid", required = false) List<String> deviceID,
//            @RequestParam(value = "statuscodes", required = false) List<Integer> statusCodes,
//            @RequestParam("startdate") Long startDate, @RequestParam("enddate") Long endDate,
//            @RequestParam(value = "pageno", required = false) Integer pageNumber,
//            @RequestParam(value = "pagesize", required = false) Integer pageSize,
//            @RequestParam(value = "sortBy", required = false, defaultValue = "DESC") String sortBy) {
//        return influxService.alertNotificationReport(deviceID, startDate, endDate, statusCodes, pageNumber, pageSize,sortBy);
//
//    }
//
    //Get Vehicle Movement Report
    @GetMapping("/movement")
    public ResponseEntity<APIResponse> getVehicleMovementReport(
            @RequestParam(value = "deviceid", required = false) List<String> deviceID,
            @RequestParam(value = "startdate") Long startDate,
            @RequestParam(value = "enddate") Long endDate,
            @RequestParam(name = "pageno", required = false) Integer pageNo,
            @RequestParam(name = "pagesize", required = false) Integer pageSize,
            @RequestParam(value = "sortBy", required = false, defaultValue = "DESC") String sortBy) {
        return reportService.getMovementReport(startDate, endDate, deviceID, pageNo, pageSize,sortBy);
    }
//
//    @ApiOperation(value = "API to get device details API")
//    @GetMapping("/device/details/logbook")
//    public ResponseEntity<APIResponse> vehicleLogbook(
//            @RequestParam(value = "deviceid", required = false) List<String> deviceID
//    ) {
//        return influxService.vehicleLogbook(deviceID);
//    }
//
//    @ApiOperation(value = "API to get Overspeed report API")
//    @GetMapping("/overspeed")
//    public ResponseEntity<APIResponse> overSpeedReportAPI(
//            @RequestParam(value = "deviceid", required = false) List<String> deviceID,
//            @RequestParam(value = "startdate") Long startTimeStamp,
//            @RequestParam(value = "enddate") Long endTimeStamp,
//            @RequestParam(name = "pageno", required = false) Integer pageNo,
//            @RequestParam(name = "pagesize", required = false) Integer pageSize,
//            @RequestParam(value = "sortBy", required = false, defaultValue = "DESC") String sortBy) {
//        return influxService.overSpeedReportAPI(deviceID, startTimeStamp, endTimeStamp, pageNo, pageSize,sortBy);
//    }
//
//    //new Trip Report API
//    @ApiOperation(value = "API to get  trip reports API")
//    @GetMapping("/trip")
//    public ResponseEntity<APIResponse> tripDetailReportsAPI(
//            @RequestParam(value = "deviceid", required = false) List<String> deviceID,
//            @RequestParam(value = "startdate") Long startTimeStamp,
//            @RequestParam(value = "enddate") Long endTimeStamp,
//            @RequestParam(name = "pageno", required = false) Integer pageNo,
//            @RequestParam(name = "pagesize", required = false) Integer pageSize,
//            @RequestParam(value = "sortBy", required = false, defaultValue = "DESC") String sortBy) {
//        return influxService.getTripDetailReport(startTimeStamp, endTimeStamp, deviceID, pageNo, pageSize,sortBy);
//    }
//
//
//    @ApiOperation(value = "API to get Stoppage Report API")
//    @GetMapping("/stoppage")
//    public ResponseEntity<APIResponse> stoppageReportsAPI(
//            @RequestParam(value = "deviceid", required = false) List<String> deviceID,
//            @RequestParam(value = "startdate") Long startTimeStamp,
//            @RequestParam(value = "enddate") Long endTimeStamp,
//            @RequestParam(value = "pageno", required = false) Integer pageNO,
//            @RequestParam(value = "pagesize", required = false) Integer pageSize,
//            @RequestParam(value = "sortBy", required = false, defaultValue = "DESC") String sortBy) {
//        return influxService.stoppageReportAPI(startTimeStamp, endTimeStamp, deviceID, pageNO, pageSize,sortBy);
//    }
//
//    @PostMapping("/event")
//    public ResponseEntity<APIResponse> reportEventSender(@RequestBody ReportEventDTO event) {
//        return reportEventService.reportEventSender(event);
//    }
//
//    @ApiOperation(value = "API to get Driver Score card API")
//    @GetMapping("/driverscorecard")
//    public ResponseEntity<APIResponse> driverScorecardReport(
//            @RequestParam(value = "deviceid", required = false) List<String> deviceID,
//            @RequestParam(value = "driverid", required = false) List<String> driverid,
//            @RequestParam(value = "startdate") Long startTimeStamp,
//            @RequestParam(value = "enddate") Long endTimeStamp,
//            @RequestParam(value = "pageno", required = false) Integer pageNO,
//            @RequestParam(value = "pagesize", required = false) Integer pageSize,
//            @RequestParam(value = "sortBy", required = false, defaultValue = "DESC") String sortBy) {
//        return influxService.driverScorecardAPI(startTimeStamp, endTimeStamp, deviceID, driverid, pageNO, pageSize,sortBy);
//    }

}
