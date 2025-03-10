package com.incetiveapi.coreicentives.repository;

import com.incetiveapi.coreicentives.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, String> {

}
