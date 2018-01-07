package pl.java.iterator;

public class IteratorMain {

	public static void main(String[] args) {

		IteratorManager mainObject = new IteratorManager();

		IteratorData nowak = new IteratorData("Anna", "Nowak", 56);
		IteratorData anusiak = new IteratorData("Anna", "Anusiak", 45);
		IteratorData cebula = new IteratorData("Adam", "Cebula", 17);
		IteratorData bomba = new IteratorData("Julia", "Bomba", 58);
		IteratorData calka = new IteratorData("Czesik", "Ca³ka", 89);

		mainObject.addData(nowak);
		mainObject.addData(anusiak);
		mainObject.addData(cebula);
		mainObject.addData(bomba);
		mainObject.addData(calka);
		
		mainObject.printIterator();

	}

}
