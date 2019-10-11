import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class Tests {

	@Test
	void testMainEat() {
		Living animal = new Living();
		Living plant = new Living();
		
		animal.energy = 23;
		plant.energy = 46;
		
		int sum = animal.energy + plant.energy;
		
		Main.eats(animal, plant);
		
		assertEquals(animal.energy, sum);
	}
	
	void testLivingSetXCoord()
	{
		Living animal = new Living();
		animal.setXCoord(20);
		
		assertEquals(animal.xcoord, 20);
	}
	
	void testLivingSetYCoord()
	{
		Living animal = new Living();
		animal.setYCoord(20);
		
		assertEquals(animal.ycoord, 20);
	}
	
	void testLivingGetYCoord()
	{
		Living animal = new Living();
		animal.ycoord = 20;
		
		assertEquals(animal.getYCoord(), 20);
	}
	
	void testLivingA()
	{
		Living animal = new Living();
		animal.xcoord = 20;
		
		assertEquals(animal.A(), 20);
	}
	
	void testLivingSetEnergy()
	{
		Living animal = new Living();
		animal.setEnergy(20);
		
		assertEquals(animal.energy, 20);
	}
	
	void testLivingGetEnergy()
	{
		Living animal = new Living();
		animal.energy = 20;
		
		assertEquals(animal.getEnergy(), 20);
	}
	
	void testPandaRun()
	{
		Panda panda = new Panda(null, 0, 0 );
		
		panda.run(50, 50);
		assertEquals(panda.getYCoord(), 50);
		assertEquals(panda.A(), 50);
	}
	
	void testAntRun()
	{
		Ant ant = new Ant(null, 0, 0 );
		
		ant.run(50, 50);
		assertEquals(ant.getYCoord(), 50);
		assertEquals(ant.A(), 50);
	}
	
	void testLocationSetGetLiving()
	{
		int xcoord = 52;
		int ycoord = 23;
		
		Living animal = new Living("animal", xcoord, ycoord);
		Location location = new Location(100);
		
		location.setLiving(animal, xcoord, ycoord);
		
		assertEquals(location.getLiving(xcoord, ycoord), animal);
	}
}
