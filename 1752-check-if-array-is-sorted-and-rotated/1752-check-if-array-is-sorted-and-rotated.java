class Solution {
    public static boolean isSorted(int arr[], int k)
    {
        for(int i=1; i<k ; i++)
         {
            if(arr[i]>=arr[i-1])
            {
                continue;
            }
            else
            {
                return false;
            }
         }
         return true;
    }
    public boolean check(int[] nums) {
        int k=nums.length;
        int nums2[]= new int[k];
        int x=0;
        if(isSorted(nums,k))
        {
            return true;
        }
        else
        {for(int i=0; i<k-1 ; i++)
        {
            if(nums[i]>nums[i+1])
            {
                x=i;
                break;
            }
        }
        for(int i=0; i<k ; i++)
        {
            nums2[i]=nums[(i+x+1) % k];
        }
         for(int i=1; i<k ; i++)
         {
            if(nums2[i]>=nums2[i-1])
            {
                continue;
            }
            else
            {
                return false;
            }
         }
         return true;}
        
    }
}