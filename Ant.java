public class Ant extends Animal{
	
	private static int population = 0;

	public Ant(String name, int xcoord, int ycoord) {
		super(name, xcoord, ycoord);
		population++;
	}
	
	public static int getPopulation()
	{
		return population;
	}
	
	public static void setPopulation(int population)
	{
		Ant.population = population;
	}

	public void run(int xcoord, int ycoord)
	{
		setXCoord(xcoord);
		setYCoord(ycoord);
	}

}
