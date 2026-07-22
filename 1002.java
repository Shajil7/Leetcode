import java.util.*;

class Solution {
    public List<String> commonChars(String[] words) {
        List<String> ans = new ArrayList<>();

        for (char c = 'a'; c <= 'z'; c++) {
            int min = 100;
            for (String w : words) {
                int cnt = 0;
                for (char ch : w.toCharArray())
                    if (ch == c) cnt++;
                min = Math.min(min, cnt);
            }
            while (min-- > 0)
                ans.add("" + c);
        }

        return ans;
    }
}