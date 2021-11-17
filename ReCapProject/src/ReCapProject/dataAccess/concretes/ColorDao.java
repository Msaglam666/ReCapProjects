package ReCapProject.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import ReCapProject.dataAccsess.abstracts.ColorRepository;
import ReCapProject.entities.concretes.Color;

public class ColorDao implements ColorRepository{
	List<Color>colors;
	
	public ColorDao() {
		colors=new ArrayList<Color>();
	}

	@Override
	public void add(Color category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Color category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Color category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Color getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Color> getAll() {
		// TODO Auto-generated method stub
		return colors;
	}

}
