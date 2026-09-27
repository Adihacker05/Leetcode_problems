class Solution {
    public String defangIPaddr(String add) {
        String s="";
        for(int i=0;i<add.length();i++)
        {
            char ch=add.charAt(i);
            if(ch=='.')
            {
                s=s+"[.]";
            }
            else
            s=s+add.charAt(i);
        }
        return s;
        
    }
}