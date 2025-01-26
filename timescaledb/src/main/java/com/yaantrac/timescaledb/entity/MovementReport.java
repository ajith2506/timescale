package com.yaantrac.timescaledb.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.UUID;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "movement_activity")
public class MovementReport {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name="id", updatable = false, nullable = false)
    private UUID id;
    @Column(name = "time", nullable = false)
    private OffsetDateTime time;
    @Column(name = "vehicle_number")
    private String vehicleNumber;
    @Column(name = "vehicle_type")
    private String vehicleType;
    @Column(name = "driver_id")
    private String driverId;
    @Column(name = "driver_name")
    private String driverName;
    @Column(name = "start_time")
    private Long startTime;
    @Column(name = "end_time")
    private Long endTime;
    @Column(name = "duration")
    private Long duration;
    @Column(name = "start_latitude")
    private Double startLatitude;
    @Column(name = "end_latitude")
    private Double endLatitude;
    @Column(name = "start_longitude")
    private Double startLongitude;
    @Column(name = "end_longitude")
    private Double endLongitude;
    @Column(name = "geofence_id")
    private String geoZoneId;
    @Column(name = "geofence_name")
    private String geoZoneName;
    @Column(name = "imei")
    private String imei;
    @Column(name = "device_ip")
    private String deviceIp;
    @Column(name = "average_speed")
    private Double averageSpeed;
    @Column(name = "hike_speed")
    private Double hikeSpeed;
    @Column(name = "distance")
    private Double distance;
    @Column(name = "odo_start")
    private Double odoStart;
    @Column(name = "odo_end")
    private Double odoEnd;
    @Column(name = "update_time")
    private Long updateTime;

}
