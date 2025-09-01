package EstoquePOO;

public class Estoque {

	public String nameProduct;
	public double priceProduct;
	public int quantProduct;

	public int addProduct(int n) {
		return quantProduct += n;
	}

	public int removeProduct(int n) {
		return quantProduct -= n;
	}

	public double totalPrice() {
		return priceProduct * quantProduct;
	}

	public String toString() {
		return "\nUpdated data: " + nameProduct + ", quant: " + quantProduct + ", Total: R$" + totalPrice();
	}
}
