class Solution {
    public int reverse(int x) {
        int abs = Math.abs(x);
        String int_string = Integer.toString(abs);
        int result = 0;
        for(int i=int_string.length()-1; i>=0; i--) {
            int last_result = result;
            result = result * 10 + int_string.charAt(i) - '0';
            if ((result - int_string.charAt(i) + '0') / 10 != last_result) { return 0;} 
        }
        if(result < 0) { return 0;}
        if(x < 0) { return 0-result;}
        else { return result;}
    }
}
