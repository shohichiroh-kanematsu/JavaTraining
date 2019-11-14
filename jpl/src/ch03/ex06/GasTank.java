public class GasTank extends EnergySource{
	private double fuel;
	public GasTank(double fuel){ this.fuel = fuel; }
	public boolean empty(){
		if(fuel > 0)
			return false;
		else
			return true;
	}
}