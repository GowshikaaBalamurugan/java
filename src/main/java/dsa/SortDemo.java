package dsa;

public class SortDemo {
    public static void main(String[] args) {
        //int arr[]=new int[6];
        int arr[]= new int[]{90, 15, 3, 200, 67};
      // int result[]= sortByBubbleSort(arr);
        int result[]= sortBySelectionSort(arr);
        System.out.println("Final Result:");
       for(int num:result){
           System.out.print(" "+num);
       }
    }

    private static int[] sortBySelectionSort(int[] arr) {
        int minIndex;
        int temp=0;
        int size= arr.length;
        for(int i=0;i<size-1;i++){
            minIndex=i;
            for(int j=i+1;j<size;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;

            for(int num:arr){
                System.out.print(" "+num);
            }
            System.out.println();
        }
            return arr;
    }

    private static int[] sortByBubbleSort(int[] arr) {
        int size= arr.length;
        int temp=0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                for(int num:arr){
                    System.out.print(" "+num);
                }
                System.out.println();

            }
        }
        return arr;
    }

}
