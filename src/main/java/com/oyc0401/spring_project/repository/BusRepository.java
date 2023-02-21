package com.oyc0401.spring_project.repository;

import com.oyc0401.spring_project.domain.Bus;

import java.util.List;
import java.util.Optional;

public interface BusRepository {
    Bus save(Bus bus);
    Optional<Bus> findById(Long id);
    Optional<Bus> findByTime(String time);
    Optional<Bus> findByBusId(int busId);
    Optional<Bus> findFirstByOrderByIdDesc();
    List<Bus> findAll();


}
