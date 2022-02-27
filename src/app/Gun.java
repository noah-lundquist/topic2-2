package app;

public class Gun extends Weapon {

	public void fireWeapon(int power)
	{
		System.out.println("In Gun, fireWeapon() with a power of " + power);
	}
	public void fireWeapon()
	{
		System.out.println("in overloaded Gun, fireWeapon()");
		super.fireWeapon(10);
	}
	public void activate(boolean enable) {
		System.out.println("In the Gun. activate() with an enable of " +enable);
	}
}
