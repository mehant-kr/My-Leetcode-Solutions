class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        // prefix = flower
        // i = 1
        // strs.length = 3
        for (int i = 1; i < strs.length; i++) { 
            // i = 2
            // While current string doesn't start with the prefix
            // strs[1] = flight
            while (!strs[i].startsWith(prefix)) { // true
                // Remove last character from prefix
                prefix = prefix.substring(0, prefix.length() - 1);
                // prefix = fl
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}