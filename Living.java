public class Living {
	protected int xcoord;
	protected int ycoord;
	protected String name;
	protected int energy;
	
	protected Living()
	{
		name = "undefined";
		xcoord = 0;
		ycoord = 1;
		energy = 50;
		
	}
	protected Living(String name, int xcoord, int ycoord)
	{
		this.name = name;
		this.xcoord = xcoord;
		this.ycoord = ycoord;
		energy = 50;
	}
	
	protected void setXCoord(int xcoord)
	{
		this.xcoord = xcoord;
	}
	
	protected void setYCoord(int ycoord)
	{
		this.ycoord = ycoord;
	}
	
	protected int getXCoord()
	{
		return xcoord;
	}
	
	protected int getYCoord()
	{
		return ycoord;
	}
	
	protected void setEnergy(int energy)
	{
		this.energy = energy;
	}
	protected int getEnergy()
	{
		return energy;
	}
	
	@Override
	public String toString()
	{
		return (name + " is at " + xcoord + ", " + ycoord + "\nEnergy: " + energy);
	}
}
