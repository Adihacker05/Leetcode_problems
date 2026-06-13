class Solution {
    public String reverseWords(String s) {
        // Step 1: trim and normalize spaces
        String str = s.trim().replaceAll("\\s+", " ");
        
        // Step 2: split into words
        String[] words = str.split(" ");
        
        // Step 3: reverse words
        StringBuilder sb = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if(i != 0) sb.append(" ");
        }
        
        return sb.toString();
    }
}
