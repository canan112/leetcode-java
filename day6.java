/*PROBLEM:## Longest Palindromic Substring

Verilen bir karakter dizisi (`String`) içerisinde yer alan **en uzun palindromik alt diziyi (substring)** bulan ve döndüren algoritmanın geliştirilmesi amaçlanmıştır.

**Örnek:**

* Girdi: `"babad"`
* Çıktı: `"bab"` veya `"aba"`
*/


class Solution {
    public String longestPalindrome(String s) 
    {
        int maxLength=0;
        int start= 0;

        
         for(int i = 0; i < s.length(); i++)
            {
                
           
                int len1 = expand(s, i, i);       // tek uzunluk
                int len2 = expand(s, i, i + 1);   // çift uzunluk
                int len = Math.max(len1, len2);
                if (len > maxLength)
                {
                    maxLength = len;
                    start = i - (len - 1) / 2;
                }
                
            }  
            String indexs=s.substring(start, start+maxLength);  
            return  indexs ;
    }

        private int expand(String s, int left, int right)
        {
        
                while(left >= 0 && right < s.length() &&
                    s.charAt(left) == s.charAt(right))
                    {
                            left--;
                            right++;
                    }  

            int length = right - left - 1;

            return length;
          
        }
}        
