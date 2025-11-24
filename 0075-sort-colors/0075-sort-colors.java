class Solution {
    public static void swap(int arr[],int l,int r)
    {
        int temp=0;
        temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
    public void sortColors(int[] nums) {
        int low=0,mid=0,high=nums.length-1;
        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1)
            {
                mid++;
            }
            else
            {
                swap(nums,mid,high);
                high--;
            }
        }
    }
}