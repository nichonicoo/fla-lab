package ses2;

import java.util.Scanner;

import database.Database;
import factory.CarFactory;
import factory.HondaFactory;
import factory.SuzukiFactory;
import factory.TeslaFactory;
import model.Car;
import model.Hondacar;
import model.SuzukiCar;
import model.TeslaCar;

// Creational Design  Pattern ( Signleton, Factory ) 

public class Main {
	
	Scanner scan = new Scanner(System.in);
	
	public Main() {
		
		String carBrand;
		System.out.println("What car do you want to build ? ");
		carBrand = scan.nextLine();
		
		
		Car car;
		
		CarFactory carFactory = null;
		
		if(carBrand.equals("Honda")) {
			carFactory = new HondaFactory();
		} else if(carBrand.equals("Suzuki")) {
			carFactory = new SuzukiFactory();
		} else if(carBrand.equals("Tesla")) {
			carFactory = new TeslaFactory();
		}
		
		carFactory.createCar();
		
//		if(carBrand.equals("Honda")) {
//			car = new Hondacar();
//		} else if (carBrand.equals("Suzuki")) {
//			car = new SuzukiCar();
//		} else if(carBrand.equals("Tesla")) {
//			car = new TeslaCar();
//		}
		
	
		/* Multi Threading
		Runnable run1 = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Database db = Database.getInstance();
				System.out.println(db);
			}
		};
		
		Thread thread1 = new Thread(run1);
		Thread thread2 = new Thread(run1);
		
		thread1.start();
		thread2.start();		*/
		
		
//		Database db1 = Database.getInstance();
//		Database db2 = Database.getInstance();
//		
//		System.out.println(db1);
//		System.out.println(db2);
	}
	

	public static void main(String[] args) {
		 new Main();
		

	}

}
