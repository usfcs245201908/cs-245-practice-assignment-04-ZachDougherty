

public class SelectionSort implements SortingAlgorithm {
    
    private int findMin(int[] arr, int start) {
        int min = start;
        for (int i=start+1; i<arr.length; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            } 
        }
        return min;
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void sort(int[] a) {
        int min;
        for (int i=0; i<a.length-1; i++) {
            min = findMin(a, i);
            swap(a, min, i);
        }
    }
}