class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";

        int n = s.length();
        StringBuilder temp = new StringBuilder(); 
        StringBuilder sb = new StringBuilder();   

        for (int i = 0; i < n; i++) {

   
            int left = i;
            int right = i;

            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }

            sb.setLength(0);
            for (int k = left + 1; k <= right - 1; k++) {
                sb.append(s.charAt(k));
            }

            if (sb.length() > temp.length()) {
                temp.setLength(0);
                temp.append(sb);
            }

            left = i;
            right = i + 1;

            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }

            sb.setLength(0);
            for (int k = left + 1; k <= right - 1; k++) {
                sb.append(s.charAt(k));
            }

            if (sb.length() > temp.length()) {
                temp.setLength(0);
                temp.append(sb);
            }
        }

        return temp.toString();
    }
}
