package SortingAlgorithm;

public class Tester {

	public static void main(String[] args) {
		BubbleSort b = new BubbleSort();
		int[] arr = {89, 45, 68, 90, 29, 34,  17};
		b.BubbleSort(arr);
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
