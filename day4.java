/*PROBLEM:Verilen bir dizenin en uzuns telinin uzunluğunu bulun. 
alt dizeTekrarlanan karakterler olmadan.

*/


class Solution {
    public int lengthOfLongestSubstring(String s) {

        int adet = 0;

        for (int i = 0; i < s.length(); i++) {

            String alt = "";

            for (int j = i; j < s.length(); j++) {

                char c = s.charAt(j);

                if (alt.contains(String.valueOf(c))) {// alt içinde c değeri var ise dögüden çık
                    break;
                }

                alt += c; // alt içinde c değeri yoksa ekle

                if (alt.length() > adet) {
                    adet = alt.length();
                }
            }
        }

        return adet;
    }
}