package main;

import java.util.Scanner;

import Factory.NikeFactory;
import Factory.PumaFactory;
import model.FashionStore;
import model.Pants;
import model.Shirt;

public class Main {
	
	Scanner scanner = new Scanner(System.in);
	
	public Main() {
		
		String store;
		FashionStore fashionStore;
		
		System.out.println("Program start...");
		
		while(true) {
			
			System.out.println("What store you want to build [Nike/Puma]");
			System.out.println(">> ");
			store = scanner.nextLine();
			
			if(store.equals("Nike")) {
				
				fashionStore = new FashionStore(new NikeFactory());
				break;
			}else if (store.equals("Puma")) {
				
				fashionStore = new FashionStore(new PumaFactory());
				break;
			}else {
				
				System.out.println("Store must be eeither Puma or Nike");
			}	
		};
		
		String productType;
		
		while(true) {
			System.out.println("Product Type to produce? [Shirt or Pants]");
			System.out.println(">> ");
			productType = scanner.nextLine();
			
			if(productType.equals("Shirt")) {
				
				Shirt shirt = fashionStore.produceShirt();
				break;
			}else if (productType.equals("Pants")) {
				
				Pants pants = fashionStore.producePants();
				break;
			}else {
				
				System.out.println("Type must be either Shirt or Pants");
			}
		}
		
	}

	public static void main(String[] args) {
		new Main();
	}

}
