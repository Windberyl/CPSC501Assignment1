public class Bamboo extends Plant{
	private static int population = 0;
	protected Bamboo(String name, int xcoord, int ycoord)
	{
		super(name, xcoord, ycoord);
		population++;
	}
	
	public static int getPopulation()
	{
		return population;
	}
	
	public static void setPopulation(int population)
	{
		Bamboo.population = population;
	}
	
	public static void grow()
	{
		
	}
}
