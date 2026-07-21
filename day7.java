// PROBLEM:Bu soruda verilen metindeki karakterleri, belirtilen satır 
// sayısına göre **zikzak (aşağı ve yukarı) şeklinde satırlara yerleştirmen*
// * istenir. Ardından bu satırlardaki karakterleri **üstten alta doğru sırayla
//  birleştirerek** oluşan yeni metni döndürmen beklenir.



class Solution {
    public String convert(String s, int numRows) {
            // Tek satır varsa zikzak oluşmaz.
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];

        // Her satır için ayrı bir StringBuilder oluşturuyoruz.
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        // Metindeki karakterleri tek tek geziyoruz.
        for (int i = 0; i < s.length(); i++) {

            char character = s.charAt(i);

            // Karakteri bulunduğumuz satıra ekliyoruz.
            rows[currentRow].append(character);

            // En üst veya en alt satıra geldiysek yön değiştiriyoruz.
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            // Yöne göre satır numarasını değiştiriyoruz.
            if (goingDown==true) {
                currentRow++;
            } else {
                currentRow--;
            }
        }

        StringBuilder result = new StringBuilder();

        // Bütün satırları sırayla birleştiriyoruz.
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}
        
  