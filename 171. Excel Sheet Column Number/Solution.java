class Solution {
    public int titleToNumber(String s) {
        int len = s.length();
        int result = 0;
        int base_val = 'A' - 1;
        for (int i=0; i<len; i++) {
            int char_val = s.charAt(len-1-i) - base_val;
            result += char_val * Math.pow(26,i);
        }
        return result;
    }
}
