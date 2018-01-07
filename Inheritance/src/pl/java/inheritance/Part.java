package pl.java.inheritance;

public class Part {

	private int IdNumber;
	private String producer;
	private String model;
	private int series;

	public Part(int idNumber, String producer, String model, int series) {
		IdNumber = idNumber;
		this.producer = producer;
		this.model = model;
		this.series = series;
	}

	public int getIdNumber() {
		return IdNumber;
	}

	public String getProducer() {
		return producer;
	}

	public String getModel() {
		return model;
	}

	public int getSeries() {
		return series;
	}

	public void setIdNumber(int idNumber) {
		IdNumber = idNumber;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setSeries(int series) {
		this.series = series;
	}

}
