package SortingAlgorithm;

public class MergeSort {
	
	public void Sort(int[] a) {
		int n = a.length;
	    if (n < 2) {
	        return;
	    }
	    int mid = n / 2;
	    int[] l = new int[mid];
	    int[] r = new int[n - mid];
	 
	    for (int i = 0; i < mid; i++) {
	        l[i] = a[i];
	    }
	    for (int i = mid; i < n; i++) {
	        r[i - mid] = a[i];
	    }
	    Sort(l);
	    Sort(r);
	 
	    Merge(a, l, r);
	}
	
	private void Merge(int[]arr, int[]l, int[]r) {
		int left = l.length;
		int right = r.length;
		int i = 0;
		int j = 0;
		int k = 0;
		while (i<left && j<right) {
			if (l[i]<=r[j]) {
				arr[k++] = l[i++];
			}
			else {
				arr[k++] = r[j++];
			}
		}
		while (i<left) {
			arr[k++]=l[i++];
		}
		while (j<right) {
			arr[k++]=r[j++];
		}
	}

}
