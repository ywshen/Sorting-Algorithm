package SortingAlgorithm;

public class QuickSort {
	
	public void quickSort(int[]arr, int low, int high) {
		if (low<high) {
			int pi = partition(arr, low, high);
			
			quickSort(arr, low, pi-1);
			quickSort(arr, pi+1, high);
		}
	}
	
	public int partition(int[]arr, int low, int high) {
		int index = low-1;
		int pivot = arr[high];
		for(int i=low; i<high; i++) {
			if (arr[i]<pivot) {
				index++;
				int temp = arr[index]; 
				arr[index] = arr[i]; 
				arr[i] = temp; 
			}
		}
		int temp = arr[index+1]; 
        arr[index+1] = arr[high]; 
        arr[high] = temp; 
        
        return index+1;
	}

}
