class Solution {
    public boolean isPalindrome(String s) {
        // StringBuilder s1 = new StringBuilder();
        String s1 = (s.replaceAll("[^A-Za-z0-9]","")).toLowerCase();
        int low = 0;
        int high = s1.length()-1;
        while(low < high){
            if(s1.charAt(low) != s1.charAt(high)) return false;
            low++;
            high--;
        }
        return true;
    }
}
