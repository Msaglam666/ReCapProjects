package ReCapProject.business.concretes;

import java.util.List;

import ReCapProject.business.abstracts.BrandService;
import ReCapProject.core.utilities.result.DataResult;
import ReCapProject.core.utilities.result.Result;
import ReCapProject.core.utilities.result.SuccessDataResult;
import ReCapProject.dataAccsess.abstracts.BrandRepository;
import ReCapProject.entities.concretes.Brand;

public class BrandManager implements BrandService {

	private BrandRepository brandRepository;

	public BrandManager(BrandRepository brandRepository) {
		super();
		this.brandRepository = brandRepository;
	}

	public DataResult<List<Brand>> getAll() {
		return new SuccessDataResult<List<Brand>>(this.brandRepository.getAll());
	}

	@Override
	public Result add(Brand brand) {
		// TODO Auto-generated method stub
		return null;
	}

}
