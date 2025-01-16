class Solution {
    public int romanToInt(String s) {
        Map<String, Integer> roman = new HashMap<String, Integer>();

        roman.put("I", 1);
        roman.put("V", 5);
        roman.put("X", 10);
        roman.put("L", 50);
        roman.put("C", 100);
        roman.put("D", 500);
        roman.put("M", 1000);

        int total = 0;

        for (int i = 0; i < (s.length() - 1); i++) {

            if (roman.get(String.valueOf(s.charAt(i))) < roman.get(String.valueOf(s.charAt(i + 1)))) {
                total -= roman.get(String.valueOf(s.charAt(i)));
            } else {
                total += roman.get(String.valueOf(s.charAt(i)));
            }
        }

        return total + roman.get(String.valueOf(s.charAt(s.length() - 1)));
    }
}