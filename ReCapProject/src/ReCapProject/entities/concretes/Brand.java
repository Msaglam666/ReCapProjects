package ReCapProject.entities.concretes;

public class Brand {
	private int BrandId;
	private String BrandName;

	public Brand() {
		super();
	}

	public Brand(int brandId, String brandName) {
		super();
		this.BrandId = brandId;
		this.BrandName = brandName;
	}

	public int getBrandId() {
		return BrandId;
	}

	public void setBrandId(int brandId) {
		this.BrandId = brandId;
	}

	public String getBrandName() {
		return BrandName;
	}

	public void setBrandName(String brandName) {
		this.BrandName = brandName;
	}

}
