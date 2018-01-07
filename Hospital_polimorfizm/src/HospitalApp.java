
public class HospitalApp {

	public static void main(String[] args) {
		
		Hospital hospital = new Hospital();
		
		Person doc = new Doctor("Jan", "Nowak", 3000, 500);
		Person pie1 = new Nurse("Anna", "Kowalska", 1500, 5);
		Person pie2 = new Nurse("Kasia", "Kowalska", 1600, 10);
		hospital.add(doc);
		hospital.add(pie1);
		hospital.add(pie2);
		
		System.out.println(hospital);
		hospital.printDOctors();
		
	}

}
