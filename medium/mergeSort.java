class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums , 0 , nums.length-1);
        return nums;
    }

    public void mergeSort(int[] nums , int low , int high){
        if(low>=high){
            return;
        }
        int mid = low + (high-low)/2;
        mergeSort(nums , 0 , mid);
        mergeSort(nums , mid+1 , high);
        merge(nums , 0 , mid , high);
    }

    public void merge(int[] nums , int low , int mid , int high){
        int size1=mid-low+1;
        int size2=high-mid;
        int[] arr1=new int[size1];
        int[] arr2=new int[size2];

        System.arraycopy(nums , low , arr1 , 0 ,size1);
        System.arraycopy(nums , mid+1 , arr2 , 0 , size2);

        int p1=0;
        int p2=0;
        int writeInd = low;

        while(p1<size1 && p2<size2){
            if(arr1[p1]<=arr2[p2]){
                nums[writeInd++] = arr1[p1++];
            }
            else{
                nums[writeInd++] = arr2[p2++];
            }
        }

        while(p1<size1){
            nums[writeInd++] = arr1[p1++];
        }

        while(p2<size2){
            nums[writeInd++] = arr2[p2++];
        }
    }
}