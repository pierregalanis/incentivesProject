package com.incetiveapi.coreicentives.service;

import com.incetiveapi.coreicentives.entity.Vehicle;
import com.incetiveapi.coreicentives.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService  {

    @Autowired
    private VehicleRepository vehicleRepository;

    public Vehicle addVehicle(Vehicle vehicle){
        return vehicleRepository.save(vehicle);
    }
  public List<Vehicle> getAllVehicles(){
        return vehicleRepository.findAll();
  }

    public Vehicle getVehicleByVin(String vin) {
        return vehicleRepository.findById(vin).orElse(null);
    }
}
