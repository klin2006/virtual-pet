package virtualpet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualPetTest {
	@Test
	public void shouldHaveFullOf100() {
		VirtualPet underTest = new VirtualPet(100, 100, 100);
		int full = underTest.getFull();
		assertEquals(100, full);
	}
	@Test
	public void shouldHaveFullOf75AfterJustChill() {
		VirtualPet underTest = new VirtualPet (100, 0, 0);
		underTest.justChill();
		int full = underTest.getFull();
		assertEquals(75, full);
		
	}
	
	@Test
	public void shouldHaveFullOf25AfterJustChill() {
		VirtualPet underTest = new VirtualPet (50, 0, 0);
		underTest.justChill();
		int full = underTest.getFull();
		assertEquals(25, full);
	
}
}
	