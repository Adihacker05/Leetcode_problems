class Solution {
    public static void reverse(int []nums, int i , int j)
    {
        int temp=0;
        while(i<j)
        {
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        k=k%len;
        reverse(nums,0,len-1);
        reverse(nums,0,k-1);
        reverse(nums,k,len-1);
        
    }
}