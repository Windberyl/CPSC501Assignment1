public class Main {
	public static void main(String args[])
	{
		Location location = new Location(15);
		Panda jubby = new Panda("jubby", 10, 10);
		Bamboo stick = new Bamboo("stick", 0, 10);
		
		location.setLiving(jubby, jubby.A(), jubby.getYCoord());
		location.setLiving(stick, stick.A(), stick.getYCoord());
		
		eats(jubby, stick);
		
		System.out.println(location);
	}
	public static void eats(Living object1, Living object2)
	{
		object1.setEnergy(object2.getEnergy() + object1.getEnergy());
	}
}
