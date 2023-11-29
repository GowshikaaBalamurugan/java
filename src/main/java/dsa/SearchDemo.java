package dsa;

public class SearchDemo {
    static int stepForLS=0;
    static int stepForBS=0;
    public static void main(String[] args) {
        int arr[]=new int[]{4,6,7,8,89,90};
        int target=89;
        int resultForLS=findByLinearSearch(arr,target);
        int resultForBS=findByBinarySearch(arr,target);
        if(resultForLS!=-1 || resultForBS!=-1 ){
            System.out.println("element found at Index->"+resultForLS+"in LS and at->"+resultForBS+" in BS");
            System.out.println(stepForLS==stepForBS?"Both takes same number of steps in this case":stepForLS<stepForBS?"LS is better":"BS is better");
        }
        else{
            System.out.println("Not Found");
        }

    }


    private static int findByBinarySearchRecursive(int[] arr, int start, int end, int target) {
        int left = start;
        int right = end;
        while (left <= right) {
            int mid = (right - left)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
          //       findByBinarySearch(arr,mid+1,right,target);
            }
            else{
           //      findByBinarySearch(arr,left,mid-1,target);

            }

        }
        return -1;
    }
    private static int findByBinarySearch(int[] arr,int target) {
        int left = 0;
        int right = arr.length;
        while (left <= right) {
            stepForBS++;
            System.out.println("BS:Step->"+stepForBS);
            int mid = (right +left)/2;

            if(arr[mid]==target){
                System.out.println("BS:Found at Step->"+stepForBS);
                return mid;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
               right=mid-1;
            }

        }
        return -1;
    }

    private static int findByLinearSearch(int[] arr, int target) {
        for(int i=0;i<arr.length;i++){
            stepForLS++;
            System.out.println("LS:Step->"+stepForLS);
            if(arr[i]==target){
                System.out.println("LS:Found at Step->"+stepForLS);
                return i;
            }
        }
        return -1;
    }


}
