import static org.junit.Assert.*;

import org.junit.Test;

public class LengthconverterTest {

	// Invalid input
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeKm() {
		Lengthconverter convert = new Lengthconverter();
		convert.kmToMile(-1);
	}
	
	// Invalid input
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeMile() {
		Lengthconverter convert = new Lengthconverter();
		convert.mileToKm(-1);
	}
	
	// valid input
	@Test
	public void testConvertKmtoMile(){
		double mile,mileCalculated;
		Lengthconverter convert = new Lengthconverter();
		for(int i = 0; i < 10; i++){
			mile = convert.kmToMile(i);
			mileCalculated = i * 0.621371192;
			assertTrue(Math.abs(mile - mileCalculated) < 0.0001);
		}
	}
	
	// valid input
	@Test
	public void testConvertMiletoKm(){
		double km, kmCalculated;
		Lengthconverter convert = new Lengthconverter();
		for(int i = 0; i < 10; i++){
			km = convert.mileToKm(i);
			kmCalculated = i * 1.60934400061;
			assertTrue(Math.abs(km - kmCalculated) < 0.0001);
		}
	}
	

}
