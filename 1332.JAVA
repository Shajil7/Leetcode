class Solution {
    public int removePalindromeSub(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j)
            if (s.charAt(i++) != s.charAt(j--)) return 2;
        return s.isEmpty() ? 0 : 1;
    }
}

