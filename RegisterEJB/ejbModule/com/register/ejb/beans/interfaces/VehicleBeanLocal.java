package com.register.ejb.beans.interfaces;

import java.util.List;

import javax.ejb.Local;

import com.register.jpa.entity.Vehicle;

@Local
public interface VehicleBeanLocal {
	public Vehicle createVehicle(Vehicle vehicle);
	public Vehicle updateVehicle(Vehicle vehicle);
	public void deleteVehicle(int id);
	public Vehicle getVehicle(int id);
	public List<Vehicle> getVehicleList();
}
