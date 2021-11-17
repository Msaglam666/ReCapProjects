package ReCapProject.entities.concretes;

public class Car {
private int CarId;
private String ModelYear;
private String DailyPrice;
public Car() {
	super();
}
public Car(int carId, String modelYear, String dailyPrice) {
	super();
	CarId = carId;
	ModelYear = modelYear;
	DailyPrice = dailyPrice;
}
public int getCarId() {
	return CarId;
}
public void setCarId(int carId) {
	CarId = carId;
}
public String getModelYear() {
	return ModelYear;
}
public void setModelYear(String modelYear) {
	ModelYear = modelYear;
}
public String getDailyPrice() {
	return DailyPrice;
}
public void setDailyPrice(String dailyPrice) {
	DailyPrice = dailyPrice;
}

}
