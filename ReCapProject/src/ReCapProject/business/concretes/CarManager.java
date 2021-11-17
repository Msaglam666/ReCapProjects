package ReCapProject.business.concretes;

import java.util.List;

import ReCapProject.business.abstracts.CarService;
import ReCapProject.core.utilities.result.DataResult;
import ReCapProject.core.utilities.result.Result;
import ReCapProject.core.utilities.result.SuccessDataResult;
import ReCapProject.dataAccsess.abstracts.CarRepository;
import ReCapProject.entities.concretes.Car;

public class CarManager implements CarService {
	private CarRepository carRepository;

	public CarManager(CarRepository carRepository) {
		super();
		this.carRepository = carRepository;
	}

	public DataResult<List<Car>> getAll() {
		return new SuccessDataResult<List<Car>>(this.carRepository.getAll());
	}

	@Override
	public Result add(Car car) {
		// TODO Auto-generated method stub
		return null;
	}
}
