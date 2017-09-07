package com.register.ejb.beans.interfaces;

import java.util.List;

import javax.ejb.Remote;

import com.register.jpa.entity.Vehicle;

@Remote
public interface VehicleBeanRemote {
	public Vehicle createVehicle(Vehicle vehicle);
	public Vehicle updateVehicle(Vehicle vehicle);
	public void deleteVehicle(int id);
	public Vehicle getVehicle(int id);
	public List<Vehicle> getVehicleList();
}
