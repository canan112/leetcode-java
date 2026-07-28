class Solution {
    public int myAtoi(String s) {

        int i = 0;
        int isaret = 1;
        int sonuc = 0;

        // Baştaki boşlukları geç
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        // İşareti kontrol et
        if (i < s.length()) {
            if (s.charAt(i) == '-') {
                isaret = -1;
                i++;
            } else if (s.charAt(i) == '+') {
                i++;
            }
        }

        // Rakamları oku
        while (i < s.length()) {

            char c = s.charAt(i);

            // Rakam değilse işlemi bitir
            if (c < '0' || c > '9') {
                break;
            }

            // Karakteri rakama çevir
            int rakam = c - '0';

            // 32 bit sınır kontrolü
            if (sonuc > Integer.MAX_VALUE / 10 ||(sonuc == Integer.MAX_VALUE / 10 && rakam > Integer.MAX_VALUE % 10))
            {
               
                   if (isaret == 1) {
                return Integer.MAX_VALUE;
            } else
            {
                return Integer.MIN_VALUE;
}
            }

            // Sayıyı oluştur
            sonuc = sonuc * 10 + rakam;

            i++;
        }

        return sonuc * isaret;
    }
}
        

