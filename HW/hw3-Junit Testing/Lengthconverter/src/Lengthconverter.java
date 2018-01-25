
public class Lengthconverter {
	
	public double kmToMile(double km){
		if(km < 0){
			throw new IllegalArgumentException();
		}
		double mile = km *0.621371192;
		return mile;
	}
	
	public double mileToKm(double mile){
		if(mile < 0){
			throw new IllegalArgumentException();
		}
		double km = mile * 1.60934400061;
		return km;
	}
}
