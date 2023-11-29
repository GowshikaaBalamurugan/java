package dsa;

public class SearchDemo {
    public static void main(String[] args) {
        int arr[]=new int[]{4,6,7,8,89};
        int target=7;
        int resultForLS=findByLinearSearch(arr,target);
        int resultForBS=findByBinarySearch(arr,0,arr.length,target);
        if(resultForLS!=-1 || resultForBS!=-1 ){
            System.out.printf("element found at Index->"+resultForLS+"BS->"+resultForBS);
        }
        else{
            System.out.println("Not Found");
        }

    }


    private static int findByBinarySearch(int[] arr, int start, int end, int target) {
        int left = start;
        int right = end;
        while (left < right) {
            int mid = (right - left)/2;

            if(mid==target){
                return mid;
            }
            else if(mid<target){
                 findByBinarySearch(arr,mid+1,right,target);
            }
            else{
                 findByBinarySearch(arr,left,mid-1,target);

            }

        }
        return -1;
    }

    private static int findByLinearSearch(int[] arr, int target) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }


}
