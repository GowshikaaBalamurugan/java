package dsa;

public class SortDemo {
    public static void main(String[] args) {
        //int arr[]=new int[6];
        int arr[] = new int[]{90, 15, 3, 200, 67};
        // int result[]= sortByBubbleSort(arr);
        //int result[]= sortBySelectionSortWithMinVal(arr);
        // int result[]= sortBySelectionSortWithMaxVal(arr);
        //int result[]= sortByInsertionSort(arr);
        int result[] = sortByMergeSort(arr, 0, arr.length - 1);

        System.out.println("Final Result:");
        for (int num : result) {
            System.out.print(" " + num);
        }
    }

    private static int[] sortByMergeSort(int[] arr, int l, int r) {
        //  int mid;
        if (l < r) {
            int mid = (l + r) / 2;
            sortByMergeSort(arr, l, mid);
            sortByMergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);

        }
        return arr;
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int karr[] = new int[arr.length];
        int larr[] = new int[n1];
        int rarr[] = new int[n2];
        for (int x = 0; x < n1; x++) {
            larr[x] = arr[l + x];
        }
        for (int x = 0; x < n2; x++) {
            rarr[x] = arr[mid + 1 + x];
        }
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (larr[i] <= rarr[j]) {
                arr[k] = larr[i];
                i++;
            } else {
                arr[k] = rarr[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = larr[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rarr[j];
            j++;
            k++;
        }
    }

    private static int[] sortByInsertionSort(int[] arr) {
        int key, j;
        for (int i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;

            }
            arr[j + 1] = key;
            for (int num : arr) {
                System.out.print(" " + num);
            }

            System.out.println();
        }
        return arr;
    }

    private static int[] sortBySelectionSortWithMaxVal(int[] arr) {
        int maxIndex = 0;
        int size = arr.length;
        int temp = 0;
        int swapIndex = 0;
        for (int i = size - 1; i >= 0; i--) {
            maxIndex = i;
            //swapIndex = i;
            for (int j = 0; j < i; j++) {
                if (arr[maxIndex] < arr[j]) {
                    maxIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
            for (int num : arr) {
                System.out.print(" " + num);
            }

            System.out.println();
        }

        return arr;
    }

    private static int[] sortBySelectionSortWithMinVal(int[] arr) {
        int minIndex;
        int temp = 0;
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

            for (int num : arr) {
                System.out.print(" " + num);
            }
            System.out.println();
        }
        return arr;
    }

    private static int[] sortByBubbleSort(int[] arr) {
        int size = arr.length;
        int temp = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                for (int num : arr) {
                    System.out.print(" " + num);
                }
                System.out.println();

            }
        }
        return arr;
    }

}
