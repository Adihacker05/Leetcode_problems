import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sval = s.charAt(i);
            char tval = t.charAt(i);

            // Check mapping from s → t
            if (mapST.containsKey(sval)) {
                if (mapST.get(sval) != tval) return false;
            } else {
                mapST.put(sval, tval);
            }

            // Check mapping from t → s
            if (mapTS.containsKey(tval)) {
                if (mapTS.get(tval) != sval) return false;
            } else {
                mapTS.put(tval, sval);
            }
        }
        return true;
    }
}
