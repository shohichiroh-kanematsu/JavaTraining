public class Vehicle {
	private long VehicleID;
	private static long NextVehicleID=0;
	private EnergySource es;

	Vehicle(){
		VehicleID = NextVehicleID;
		NextVehicleID++;
	}
		
	Vehicle(EnergySource es){
		this();
		this.es = es;
	}
	
	public void start(){
		if(es.empty())
			System.out.println("îRóøÇ™ãÛÇ≈Ç∑ÅB");
		else
			System.out.println("î≠é‘Ç≈Ç´Ç‹Ç∑ÅB");
	}
	
	public static void main(String args[]){
		Vehicle gasVehicle = new Vehicle(new GasTank(10.0));
		Vehicle noGasVehicle = new Vehicle(new GasTank(0.0));
		Vehicle batteryVehicle = new Vehicle(new Battery(100.0));
		Vehicle noBatteryVehicle = new Vehicle(new Battery(0.0));
		
		gasVehicle.start();
		noGasVehicle.start();
		batteryVehicle.start();
		noBatteryVehicle.start();
	}
}