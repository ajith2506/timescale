package com.yaantrac.timescaledb.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "parking_activity")
public class ParkingReport {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name="id", updatable = false, nullable = false)
    private UUID id;

    @Column(name="vehicle_number")
    private String vehicle_number;

    @Column(name="vehicle_type")
    private String vehicleType;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name="longitude")
    private Double longitude;

    @Column(name="duration")
    private Long duration;

    @Column(name="driver_name")
    private String driverName;

    @Column(name="start_time")
    private Long startTime;

    @Column(name="end_time")
    private Long endTime;

    @Column(name="driver_id")
    private String driverId;

    @Column(name="device_ip")
    private String deviceIp; // Changed to camelCase

    @Column(name="imei")
    private String imei;

    @Column(name="geofence_id")
    private String geofenceId;
}