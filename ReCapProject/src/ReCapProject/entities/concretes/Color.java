package ReCapProject.entities.concretes;

public class Color {
private int ColorId;
private String ColorName;
public Color() {
	super();
}
public Color(int colorId, String colorName) {
	super();
	ColorId = colorId;
	ColorName = colorName;
}
public int getColorId() {
	return ColorId;
}
public void setColorId(int colorId) {
	ColorId = colorId;
}
public String getColorName() {
	return ColorName;
}
public void setColorName(String colorName) {
	ColorName = colorName;
}


}
