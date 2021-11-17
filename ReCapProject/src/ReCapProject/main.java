package ReCapProject;

import ReCapProject.business.abstracts.BrandService;
import ReCapProject.business.abstracts.CarService;
import ReCapProject.business.abstracts.ColorService;
import ReCapProject.business.concretes.BrandManager;
import ReCapProject.business.concretes.CarManager;
import ReCapProject.business.concretes.ColorManager;
import ReCapProject.dataAccess.concretes.BrandDao;
import ReCapProject.dataAccess.concretes.CarDao;
import ReCapProject.dataAccess.concretes.ColorDao;
import ReCapProject.entities.concretes.Brand;
import ReCapProject.entities.concretes.Car;
import ReCapProject.entities.concretes.Color;

public class main {

	public static void main(String[] args) {
		
		CarService carService =new CarManager(new CarDao());
		carService.add(new Car(1, "2015","250"));
		carService.add(new Car(2, "2016","200"));
		carService.add(new Car(3, "2017","225"));
		carService.add(new Car(4, "2018","175"));
		carService.add(new Car(5, "2019","220"));
		carService.add(new Car(6, "2020","300"));
		carService.add(new Car(7,"2021","500"));

		for(Car car: carService.getAll().getData()) {
			System.out.println(car.getCarId());
		}
		BrandService brandService =new BrandManager(new BrandDao());		
		brandService.add(new Brand(1, "Mercedes Benz"));
		brandService.add(new Brand(2, "Bmw"));
		brandService.add(new Brand(3, "Audi"));
		brandService.add(new Brand(4, "Volkswagen"));
		brandService.add(new Brand(5, "Renault"));
		brandService.add(new Brand(6, "Fiat"));
		brandService.add(new Brand(7,"Hyundai"));

		for(Brand brand: brandService.getAll().getData()) {
			System.out.println(brand.getBrandName());
		}
		
		ColorService colorService= new ColorManager(new ColorDao());
		colorService.add(new Color(1, "Beyaz"));
		colorService.add(new Color(2, "Siyah"));
		colorService.add(new Color(3, "Kýrmýzý"));
		colorService.add(new Color(4, "Mavi"));
		
		for(Color color: colorService.getAll().getData()) {
			System.out.println(color.getColorName());
		}
		
		
	}
	
}
