class Solution {
    public int lengthOfLastWord(String s) {
        int lastLen=0;
        int spaceNum = 0;
        if (s.length() == 0) {return 0;}
        int index = s.length()-1;
        while (index >= 0 && s.charAt(index) == ' ') {
            spaceNum++;
            lastLen++;
            index--;
        }
        while (index >= 0 && s.charAt(index) != ' ') {
            lastLen++;
            index--;
        }
        return lastLen - spaceNum;
    }
}
