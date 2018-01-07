package pl.java.kolejki;

public class Task implements Comparable<Task> {

	private String name;
	private String description;
	private Priority pr;

	public Task(String name, String description, Priority pr) {
		this.name = name;
		this.description = description;
		this.pr = pr;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Priority getPr() {
		return pr;
	}

	@Override
	public int compareTo(Task o) {
		return Integer.compare(o.pr.getValue(), this.pr.getValue());
		
//		if (this.pr.equals(o.pr)) {
//			return 0;
//		}
//		if (this.pr.equals(Priority.LOW)) {
//			return 1;
//		}
//		if (o.pr.equals(Priority.LOW)) {
//			return -1;
//		}
//		if (this.pr.equals(Priority.MODERATE)) {
//			return 1;
//		} else {
//			return -1;
//		}

	}

	@Override
	public String toString() {
		return description;
	}
}
