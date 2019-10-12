public class Main {
	public static void main(String args[])
	{
		Location location = new Location(15);
		Animal jubby = new Panda("jubby", 10, 10);
		Bamboo stick = new Bamboo("stick", 0, 10);
		
		location.setLiving(jubby);
		location.setLiving(stick);
		
		jubby.eats(stick);
		
		System.out.println(location);
	}
}
