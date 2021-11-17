package ReCapProject.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import ReCapProject.dataAccsess.abstracts.CarRepository;
import ReCapProject.entities.concretes.Car;

public class CarDao implements CarRepository {
	List<Car> cars;

	public CarDao() {
		cars = new ArrayList<Car>();
	}

	@Override
	public void add(Car category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Car category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Car category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Car getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Car> getAll() {
		// TODO Auto-generated method stub
		return cars;
	}
	
}
