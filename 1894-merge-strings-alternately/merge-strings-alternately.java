class Solution {
    public String mergeAlternately(String word1, String word2) {

        int lengthWord1 = word1.length();
        int lengthWord2 = word2.length();
        int lengthLower = 0;
        String remainder = "";

        if (lengthWord1 < lengthWord2) {
            lengthLower = lengthWord1;
            remainder += word2.substring(lengthLower);
        } else {
            lengthLower = lengthWord2;
            remainder += word1.substring(lengthLower);
        }

        String result = "";

        int j = 0;

        for (int i = 0; i < (lengthLower * 2); i++) {
            if (i % 2 == 0) {
                result += word1.charAt(j);
            } else {
                result += word2.charAt(j);
            }

            if (result.length() != 0 && result.length() % 2 == 0) {
                j++;
            }
        }

        result += remainder;

        return result;
    }
}