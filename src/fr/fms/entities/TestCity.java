package fr.fms.entities; 

public class TestCity {
	
	public static void main(String[] args) {
			
		City city2 = new City("Toulouse", "France", 450000);
		City city3 = new City("Rome", "Italy", 450000);
		City city4 = new City("Madrid", "Espagne", 450000);
		
		city2.habitants = city2.habitants + 20000;
		
		System.out.println(city2.ville + "\t" + city2.pays + "\t " + city2.habitants);
		System.out.println(city3.ville + "\t" + city3.pays + "\t " + city3.habitants);
		System.out.println(city4.ville + "\t" + city4.pays + "\t " + city4.habitants);
}
}