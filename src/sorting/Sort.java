package sorting;

public interface Sort {
	
	void ascending(int[] asc);
	void descending(int[] desc);
	default void description() {
		System.out.println("숫자를 정렬하는 알고리즘입니다");
	};
	
}
