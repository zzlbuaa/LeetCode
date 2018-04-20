class Solution {
    public char findTheDifference(String s, String t) {
        int sum_asc_s = 0;
        int sum_asc_t = 0;
        for(int i=0; i<s.length(); i++) {
            sum_asc_s += (int)s.charAt(i);
        }
        for(int i=0; i<t.length(); i++) {
            sum_asc_t += (int)t.charAt(i);
        }
        return (char)(sum_asc_t - sum_asc_s);
    }
}
