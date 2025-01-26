package com.yaantrac.timescaledb.repository;

import com.yaantrac.timescaledb.entity.ParkingReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ParkingActivityRepo extends JpaRepository<ParkingReport, Long> {
}
