class Solution {
    public int longestPalindrome(String s) {

        HashMap<Character, Integer> f = new HashMap<>();

        // Frequency Count
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            f.put(ch, f.getOrDefault(ch, 0) + 1);
        }

        boolean odd = false;
        int res = 0;

        // Add all even frequencies
        for (Map.Entry<Character, Integer> entry : f.entrySet()) {

            int val = entry.getValue();

            if (val % 2 == 0) {
                res += val;
            } else {
                odd = true;
            }
        }

        // Add (odd - 1)
        if (odd) {
            for (Map.Entry<Character, Integer> entry : f.entrySet()) {

                int val = entry.getValue();

                if (val % 2 == 1) {
                    res += val - 1;
                }
            }

            res++;
        }

        return res;
    }
}