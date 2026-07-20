class Solution {
    public boolean isNumber(String s) {
        s = s.trim();
        boolean d = false, dot = false, e = false, afterE = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) d = afterE = true;
            else if (c == '+' || c == '-') {
                if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') return false;
            } else if (c == '.') {
                if (dot || e) return false;
                dot = true;
            } else if (c == 'e' || c == 'E') {
                if (e || !d) return false;
                e = true;
                afterE = false;
            } else return false;
        }
        return d && afterE;
    }
}
