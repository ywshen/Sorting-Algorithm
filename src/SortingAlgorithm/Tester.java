package SortingAlgorithm;

public class Tester {

	public static void main(String[] args) {
		BubbleSort b = new BubbleSort();
		MergeSort m = new MergeSort();
		QuickSort q = new QuickSort();
		int[] arr = {89, 45, 68, 90, 29, 34,  17};
		//b.BubbleSort(arr);
		//m.Sort(arr);
		q.quickSort(arr, 0, arr.length-1);
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
