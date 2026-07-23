class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiopQWERTYUIOP";
        String row2 = "asdfghjklASDFGHJKL";
        String row3 = "zxcvbnmZXCVBNM";

        List<String> ans = new ArrayList<>();

        for (String word : words) {
            String row;
            char c = word.charAt(0);

            if (row1.indexOf(c) != -1)
                row = row1;
            else if (row2.indexOf(c) != -1)
                row = row2;
            else
                row = row3;

            boolean ok = true;
            for (char ch : word.toCharArray()) {
                if (row.indexOf(ch) == -1) {
                    ok = false;
                    break;
                }
            }

            if (ok)
                ans.add(word);
        }

        return ans.toArray(new String[0]);
    }
}