package ReCapProject.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import ReCapProject.dataAccsess.abstracts.BrandRepository;
import ReCapProject.entities.concretes.Brand;

public class BrandDao implements BrandRepository {

	List<Brand> brands;

	public BrandDao() {
		brands = new ArrayList<Brand>();
	}

	@Override
	public void add(Brand brand) {
		brands.add(brand);

	}

	@Override
	public void delete(Brand brand) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Brand brand) {
		// TODO Auto-generated method stub

	}

	@Override
	public Brand getById(int id) {
		// TODO Auto-generated method stub
		return null;

	}

	@Override
	public List<Brand> getAll() {
		return brands;
	}

}
