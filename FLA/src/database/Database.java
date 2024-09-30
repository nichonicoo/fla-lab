package database;

public class Database {
	
	private static Database instance = null;

	private Database() {
		System.out.println("Creating a Database....");
	}
	
	public static Database getInstance() {
		
		// synchronized -> dia buat ngantri, threadnya g jalan barengan.
		// ini biar sync nya pas bikin database aja. kalo di classnya nanti jadi lemot
		
		if(instance == null) {	
			synchronized (Database.class) {
				if(instance == null ) {
					instance = new Database();
				}				
			}		
		}
		return instance;
	}
	
	// Singleton ada problem kalo jalanin multithread. 
	// bakal bentrok di if(instance == null) {, dia bakal rebut2an bikin database
	
	
}
