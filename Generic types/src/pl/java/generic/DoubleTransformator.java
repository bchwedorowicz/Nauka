package pl.java.generic;

public class DoubleTransformator implements Transformator<Integer> {

	@Override
	public void transform(Box<Integer> box) {
		int content = box.get();
		box.put(content*2);
	}
	

}
