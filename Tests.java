import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class Tests {

	@Test
	void testMainEat() {
		Animal animal = new Animal(null, 0, 0);
		Living plant = new Living();
		
		animal.energy = 23;
		plant.energy = 46;
		
		int sum = animal.energy + plant.energy;
		
		animal.eats(plant);
		
		assertEquals(animal.energy, sum);
	}
	
	@Test
	void testLivingSetXCoord()
	{
		Living animal = new Living();
		animal.setXCoord(20);
		
		assertEquals(animal.xcoord, 20);
	}
	
	@Test
	void testLivingSetYCoord()
	{
		Living animal = new Living();
		animal.setYCoord(20);
		
		assertEquals(animal.ycoord, 20);
	}
	
	@Test
	void testLivingGetYCoord()
	{
		Living animal = new Living();
		animal.ycoord = 20;
		
		assertEquals(animal.getYCoord(), 20);
	}
	
	@Test
	void testLivingGetXCoord()
	{
		Living animal = new Living();
		animal.xcoord = 20;
		
		assertEquals(animal.getXCoord(), 20);
	}
	
	@Test
	void testLivingSetEnergy()
	{
		Living animal = new Living();
		animal.setEnergy(20);
		
		assertEquals(animal.energy, 20);
	}
	
	@Test
	void testLivingGetEnergy()
	{
		Living animal = new Living();
		animal.energy = 20;
		
		assertEquals(animal.getEnergy(), 20);
	}
	
	@Test
	void testAnimalRun()
	{
		Animal animal = new Panda(null, 0, 0 );
		
		animal.run(50, 50);
		assertEquals(animal.getYCoord(), 50);
		assertEquals(animal.getXCoord(), 50);
	}
	
	@Test
	void testLocationSetGetLiving()
	{
		int xcoord = 52;
		int ycoord = 23;
		
		Living animal = new Living("animal", xcoord, ycoord);
		Location location = new Location(100);
		
		location.setLiving(animal);
		
		assertEquals(location.getLiving(xcoord, ycoord), animal);
	}
}
