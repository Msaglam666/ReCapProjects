package ReCapProject.business.abstracts;

import java.util.List;

import ReCapProject.core.utilities.result.DataResult;
import ReCapProject.core.utilities.result.Result;
import ReCapProject.entities.concretes.Color;

public interface ColorService {
	DataResult<List<Color>> getAll();

	Result add(Color color);
}
