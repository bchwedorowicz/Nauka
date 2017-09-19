package pl.java.order;

public class Main {

	//public static void main(String[] args) {
		//Position x = new Position("kawa", 2, 12);
	
		
		public static void main(String [] args){
			Position p1 = new Position("Chleb", 1, 3.5);
			System.out.println(p1);
			Position p2 = new Position("Cukier", 3, 4.0);
			System.out.println(p2);
			Order z = new Order(20);
			z.addPosition(p1);
			z.addPosition(p2);
			System.out.println(z);

	}

}
