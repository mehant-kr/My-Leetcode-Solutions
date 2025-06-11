class Solution {
    public boolean isPalindrome(String s) {
        return checkPalindrome(s);
    }
    private boolean checkPalindrome(String s) {
        s = cleanString(s);
        System.out.println(s);
        int l = s.length();
        for (int i=0; i < l/2; i++) {
            if (s.charAt(i) != s.charAt(l-i-1)) return false;
        } return true;
    }
    // abcdefedcba
    // 

    private String cleanString(String s) {
        int l = s.length();
        String str = "";
        for (int i=0; i < l; i++) {
            if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
                str += Character.toLowerCase(s.charAt(i));

            }
        }
        return str;
    }
}