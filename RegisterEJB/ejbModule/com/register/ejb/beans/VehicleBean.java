package com.register.ejb.beans;

import java.util.List;

import com.register.jpa.entity.Vehicle;
import com.register.ejb.beans.interfaces.VehicleBeanLocal;
import com.register.ejb.beans.interfaces.VehicleBeanRemote;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class VehicleBean
 */
@Stateless
public class VehicleBean implements VehicleBeanRemote, VehicleBeanLocal {

	@PersistenceContext
	private EntityManager em;
	
    /**
     * Default constructor. 
     */
    public VehicleBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Vehicle createVehicle(Vehicle vehicle) {
		em.persist(vehicle);
		return vehicle;
	}

	@Override
	public Vehicle updateVehicle(Vehicle vehicle) {
		em.merge(vehicle);
		return vehicle;
	}

	@Override
	public void deleteVehicle(int id) {
		em.remove(getVehicle(id));
		
	}

	@Override
	public Vehicle getVehicle(int id) {
		Vehicle vehicle = em.find(Vehicle.class, id);
		return vehicle;
	}

	@Override
	public List<Vehicle> getVehicleList() {
		return em.createNamedQuery("Vehicle.findById", Vehicle.class).getResultList();
	}

}
