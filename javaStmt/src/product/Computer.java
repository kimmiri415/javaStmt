package product;

public class Computer extends Product {
	protected String cpu, ram, hdd;

	public void setComputerInfo(String company, String name, String serialNo, String cpu, String ram, String hdd) {
		super.setProductInfo(company, name, serialNo);
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;

	}

	@Override
	public String display() {
		return "제조회사 : " + super.company + "\n제품명 : " + super.name + "\n고유번호 : " + super.serialNo + "\nCPU : "
				+ this.cpu + "\nRAM : " + this.ram + "\nHDD : " + this.hdd;
	}

}
