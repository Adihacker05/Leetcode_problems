class Solution {
    public static void swap(int arr[], int ind , int i)
    {
        int temp;
        temp=arr[i];
        arr[i]=arr[ind];
        arr[ind]=temp;
    }
    public static void rev(int arr[],int ind, int i)
    {
        int temp;
        while(ind<i)
        {
            temp=arr[ind];
            arr[ind]=arr[i];
            arr[i]=temp;
            ind++;
            i--;
        }
    }
    public void nextPermutation(int[] nums) {
        int l=nums.length;
        int ind=0;
        for(int i=l-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                ind=i;
                break;
            }
        }
        if(ind==0)
        {
            rev(nums,ind,l-1);
            for(int k=0;k<l;k++)
        {
            System.out.println(nums[k]);
        }
        }
        else
        {for(int i=l-1;i>=0;i--)
        {
            if(nums[ind]<nums[i])
            {
                swap(nums,ind,i);
                break;
            }
        }
        rev(nums,ind+1,l-1);
        for(int k=0;k<l;k++)
        {
            System.out.println(nums[k]);
        }}
        
    }
}