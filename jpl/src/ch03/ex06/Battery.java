public class Battery extends EnergySource {
	private double battery;
	Battery(double battery) { this.battery = battery; }
	public boolean empty(){
		if(battery > 0)
			return false;
		else
			return true;
	}
}