package EstoquePOO;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Estoque product = new Estoque();

		System.out.println("Defina abaixo as infos do pr0grama: ");
		System.out.print("Name: ");
		product.nameProduct = sc.nextLine();
		System.out.print("Price: ");
		product.priceProduct = sc.nextDouble();
		System.out.print("Quantiy in sotck: ");
		product.quantProduct = sc.nextInt();

		// System.out.println("\nProduct Data: " + product.nameProduct + ", quant: " +
		// product.quantProduct + ", Total: R$"
		// + product.totalPrice());

		System.out.println(product.toString());

		System.out.print("\nEnter the number of products to be added in stock: ");
		product.addProduct(sc.nextInt());

		// System.out.println("\nUpdated data: " + product.nameProduct + ", quant: " +
		// product.quantProduct + ", Total: R$"
		// + product.totalPrice());

		System.out.println(product.toString());

		System.out.print("\nEnter the number of products to be removed from stock: ");
		product.removeProduct(sc.nextInt());

		System.out.println(product.toString());

		// System.out.println("\nUpdated data: " + product.nameProduct + ", quant: " +
		// product.quantProduct + ", Total: R$"
		// + product.totalPrice());

		sc.close();
	}
}
