public class Animal extends Living{
	protected Animal(String name, int xcoord, int ycoord) {
		super(name, xcoord, ycoord);
	}

	public void run(int xcoord, int ycoord) {
		setXCoord(xcoord);
		setYCoord(ycoord);
	}
	//public void hibernate()
	//{
	//}
}
