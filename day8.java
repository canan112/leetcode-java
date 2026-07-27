class Solution {
    public int reverse(int x) {

          int ters = 0;

        while (x != 0) {

            int sonBasamak = x % 10;

            // Pozitif overflow kontrolü
            if (ters > Integer.MAX_VALUE / 10 ||
               (ters == Integer.MAX_VALUE / 10 && sonBasamak > 7)) {
                return 0;
            }

            // Negatif overflow kontrolü
            if (ters < Integer.MIN_VALUE / 10 ||
               (ters == Integer.MIN_VALUE / 10 && sonBasamak < -8)) {
                return 0;
            }

            ters = ters * 10 + sonBasamak;
            x /= 10;
        }

        return ters;
        
    }
}