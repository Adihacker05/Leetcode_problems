class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> li= new ArrayList<>();
        int el1 =Integer.MIN_VALUE;
        int count1=0;
        int el2=Integer.MIN_VALUE;
        int count2=0;
        int n= nums.length;
        int min=(n/3)+1;
        for(int i=0;i<n;i++)
        {
            if(count1==0 && el2!=nums[i])
            {
                count1 ++;
                el1=nums[i];
            }
            else if(count2==0 && el1!=nums[i])
            {
                count2 ++;
                el2=nums[i];
            }
            else if( el1==nums[i])
            {
                count1 ++;
            }
            else if( el2==nums[i])
            {
                count2 ++;
            }
            else
            {
                count1 --;
                count2 --;
            }
        }
        count1=0;
        count2=0;
        for(int j=0;j<n;j++)
        {
            if(el1==nums[j])
            {
                count1++;
            }
              if(el2==nums[j])
            {
                count2++;
            }
        }
        if(count1>=min)
        {
            li.add(el1);
        }
        if(count2>=min)
        {
            li.add(el2);
        }
        return li;
    }
}