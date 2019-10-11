public class Location {
	private Living[][] location;
	private int size;
	
	public Location(int size)
	{
		this.size = size;
		location = new Living[size][size];
	}
	
	public void setLiving(Living living, int xcoord, int ycoord)
	{
		location[xcoord][ycoord] = living;
	}
	
	public Living getLiving(int xcoord, int ycoord)
	{
		return location[xcoord][ycoord];
	}
	
	@Override
	public String toString()
	{
		String string = "";
		for(int i = 0; i < size; i++)
		{
			for(int j = 0; j < size; j++)
			{
				if (location[i][j] != null)
				{
					string = string + location[i][j].toString() + "\n";
				}
			}
		}
		return string;
	}
}
