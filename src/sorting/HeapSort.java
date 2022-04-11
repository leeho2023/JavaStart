package sorting;

public class HeapSort implements Sort{

	@Override
	public void ascending(int[] asc) {

		System.out.println("HeapSort ascending");
		
	}

	@Override
	public void descending(int[] desc) {

		System.out.println("HeapSort descending");
		
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("HeapSort입니다.");
	}

	@Override
	public String toString() {
		return "HeapSort []";
	}
	

	

}
