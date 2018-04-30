class Solution {
    public int[] plusOne(int[] digits) {
        int add = 1;
        int resizing_flag = 0;
        for(int i=digits.length-1; i>=0; i--) {
            digits[i] += add;
            if (digits[i] == 10) {
                digits[i] = 0;
                add = 1;
                if (i == 0) { resizing_flag = 1;}
            }
            else {
                add = 0;
                break;
            }
        }
        if (resizing_flag == 1) {
            int[] newDigits = new int[digits.length+1];
            for(int i=digits.length-1; i>0; i--) {
                newDigits[i+1] = digits[i];
            }
            newDigits[1] = 0;
            newDigits[0] = 1;
            return newDigits;
        }
        return digits;
    }
}
