package pl.java.notebook_shop;

public class Computer {

	private String producer;
	private int model;

	public Computer(String producer, int model) {
		super();
		this.producer = producer;
		this.model = model;
	}

	public String getProducer() {
		return producer;
	}

	public int getModel() {
		return model;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public void setModel(int model) {
		this.model = model;
	}
	
	@Override
	public boolean equals(Object comp) {
		if (this == comp) {
			return true;
		}
		if (comp instanceof Computer) {
			Computer c = (Computer) comp;
			if (c.getProducer().equals(this.getProducer()) && c.getModel()==this.getModel()) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return producer + " " + model;
	}

}
