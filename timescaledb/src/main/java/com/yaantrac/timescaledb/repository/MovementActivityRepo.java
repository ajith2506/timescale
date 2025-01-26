package com.yaantrac.timescaledb.repository;

import com.yaantrac.timescaledb.entity.MovementReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface MovementActivityRepo extends JpaRepository<MovementReport, UUID> {
}
