class Solution {
    public boolean isPalindrome(String s) {
        // return checkPalindrome(s);
        int first = 0;
        int last = s.length()-1;

        // a_bcdefedcba
        while (first <= last) {
            if (!Character.isLetterOrDigit(s.charAt(first))) {
                first++;
            }
            else if (!Character.isLetterOrDigit(s.charAt(last))) {
                last--;
            }
            // System.out.println(first);
            // System.out.println(last);
            else {
                if (Character.toLowerCase(s.charAt(first)) != Character.toLowerCase(s.charAt(last))) return false;
                first++; last--;
            }
            
        }
        return true;
    }


    // private boolean checkPalindrome(String s) {
    //     s = cleanString(s);
    //     System.out.println(s);
    //     int l = s.length();
    //     for (int i=0; i < l/2; i++) {
    //         if (s.charAt(i) != s.charAt(l-i-1)) return false;
    //     } return true;
    // }
    // 
    // // 

    // private String cleanString(String s) {
    //     int l = s.length();
    //     String str = "";
    //     for (int i=0; i < l; i++) {
    //         if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
    //             str += Character.toLowerCase(s.charAt(i));

    //         }
    //     }
    //     return str;
    // }
}