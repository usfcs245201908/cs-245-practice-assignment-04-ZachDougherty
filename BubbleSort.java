

public class BubbleSort implements SortingAlgorithm {

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    public void sort(int[] a) {
        for (int i=0; i<a.length-1; i++) {
            for (int j=0; j<a.length-1-i; j++) {
                if (a[j] > a[j+1]) {
                    swap(a, j, j+1);
                }
            }
        }
    }
}