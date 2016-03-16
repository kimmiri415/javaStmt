package product;

public class TV extends Product {
	protected String picture, screen;

	
	public void setTvInfo(String company, String name, String serialNo, String picture, String screen) {
		super.setProductInfo(company, name, serialNo);
		this.picture = picture;
		this.screen = screen;
	}

	@Override
	public String display() {
		// TODO Auto-generated method stub
		return "제조회사 : " + super.company + "\n제품명 : " + super.name + "\n고유번호 : " + super.serialNo + "\n화소 : "
				+ this.picture + "\n화면크기 : " + this.screen;
	}

}
