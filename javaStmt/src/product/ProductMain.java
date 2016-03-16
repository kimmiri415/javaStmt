package product;

public class ProductMain {
	public static void main(String[] args) {
		TV tv = new TV();
		tv.setTvInfo("LG", "TV", "lg1234", "1000만화소", "IPS");
		Computer computer = new Computer();
		computer.setComputerInfo("삼성", "컴퓨터", "sm1234", "512GH", "8G", "1TB");
		SmartPhone phone = new SmartPhone();
		phone.setSmartPhoneInfo("삼성", "갤럭시", "ga1234", "1000만화소", "6인치");

		// List<Product> list= new ArrayList<Product>(); //DeepCopy
		Product[] cart = new Product[3];
		cart[0] = tv;
		cart[1] = computer;
		cart[2] = phone;
		for (Product product : cart) {
			System.out.println(product.display());
		}
	}
}
