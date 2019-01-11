// #17

public abstract class Vehicle {
	
	public boolean canFloat;
	public int totalKnots;

	int getTotaSpeed() { return totalKnots; }

	abstract int calculateSpeed();

	void refuel() {};

	abstract void operate();
}