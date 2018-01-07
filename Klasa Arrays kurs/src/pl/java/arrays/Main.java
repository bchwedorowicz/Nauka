package pl.java.arrays;

public class Main {

	public static void main(String[] args) {
		
		PersonDatabase pD = new PersonDatabase();
		Person p0 = new Person("Ania", "Bania", "154");
		Person p1 = new Person("Kasia", "Srasia", "365");
		Person p2 = new Person("Jacek", "Placek", "789");
		
		pD.add(p0);
		pD.add(p1);
		pD.add(p2);
		
		System.out.println("Add: " + pD);
		Person p4 = new Person("Kasia", "Srasia", "365");
		pD.remove(p4);
		
		System.out.println("Remove: " + pD);
		
		System.out.println("Index: " + pD.get(1));
		
		
		
	}

}
