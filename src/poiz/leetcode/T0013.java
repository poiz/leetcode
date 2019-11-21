package poiz.leetcode;

public class T0013 {
    public static void main(String[] args) {
        System.out.println(new Solution().romanToInt("MCMXCIV"));
    }

    static class Solution {
        public int romanToInt(String s) {
            int result = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                switch (c) {
                    case 'I':
                        result += 1 * ((i + 1 < s.length() &&
                                (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) ? -1 : 1);
                        break;
                    case 'V':
                        result += 5;
                        break;
                    case 'X':
                        result += 10 * ((i + 1 < s.length() &&
                            (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) ? -1 : 1);
                        break;
                    case 'L':
                        result += 50;
                        break;
                    case 'C':
                        result += 100 * ((i + 1 < s.length() &&
                                (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) ? -1 : 1);
                        break;
                    case 'D':
                        result += 500;
                        break;
                    case 'M':
                        result += 1000;
                        break;
                }
            }
            return result;
        }
    }
}
