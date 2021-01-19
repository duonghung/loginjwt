package com.bezkoder.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.springjwt.models.Record;

public interface RecordRepository extends JpaRepository<Record, Long>{
}
