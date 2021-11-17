package ReCapProject.business.concretes;

import java.util.List;

import ReCapProject.business.abstracts.ColorService;
import ReCapProject.core.utilities.result.DataResult;
import ReCapProject.core.utilities.result.Result;
import ReCapProject.core.utilities.result.SuccessDataResult;
import ReCapProject.dataAccsess.abstracts.ColorRepository;
import ReCapProject.entities.concretes.Color;

public class ColorManager implements ColorService {

	private ColorRepository colorRepository;

	public ColorManager(ColorRepository colorRepository) {
		super();
		this.colorRepository = colorRepository;
	}

	public DataResult<List<Color>> getAll() {
		return new SuccessDataResult<List<Color>>(this.colorRepository.getAll());
	}

	@Override
	public Result add(Color color) {
		// TODO Auto-generated method stub
		return null;
	}

}
