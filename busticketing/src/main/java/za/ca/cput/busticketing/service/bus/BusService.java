package za.ca.cput.busticketing.service.bus;

import za.ca.cput.busticketing.entity.bus.Bus;

import java.util.List;
import java.util.Optional;

public interface BusService
{
	List<Bus> getAllBuses();

	Optional<Bus> getByID(Integer id);

	Bus save(Bus bus);

	Bus update(Bus bus);

	void delete(Integer id);

}