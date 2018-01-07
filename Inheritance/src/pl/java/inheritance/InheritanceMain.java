package pl.java.inheritance;

public class InheritanceMain {
	
//	Stwórz projekt, w którym wykorzystuj¹c dziedziczenie stworzysz prost¹ hierarchiê klas odwzorowuj¹cych czêœci w hurtowni 
//	motoryzacyjnej zgodnie z poni¿sz¹ specyfikacj¹:
//
//		Ka¿da czêœæ w hurtowni (Part) posiada swój unikalny numer identyfikacyjny, przechowuje nazwê producenta, model i seriê produktu
//		Czêœci takie jak Opony (Tire) i Felgi (Wheel) posiadaj¹ dodatkowo informacjê o rozmiarze i szerokoœci
//		Czêœci (ExhaustPart) uk³adu wydechowego posiadaj¹ dodatkow¹ informacjê, czy jest ona zgodna z europejskim standardem emisji spalin
//		Dopisz krótk¹ klasê testow¹, w której utworzysz kilka obiektów reprezentuj¹cych czêœci i wyœwietl informacje o nich.

	public static void main(String[] args) {
		
		ExhaustPart s = new ExhaustPart(456, "Amica", "s-line", 456, true);
		
		System.out.println(s.getIdNumber() + " " + s.getModel() + " " + s.getProducer() + " " + s.getSeries() + " " + s.getClass());

	}

}
