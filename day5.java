/*PROBLEM:nums1Boyutları sırasıyla ve nums2olan m, sıralı iki dizi verildiğinde , bu iki sıralı dizinin medyanının döndürün .

Genel çalışma zamanı karmaşıklığı şu şekilde olmalıdır O(log (m+n)): .*/

 class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int m=nums1.length;
      int n=nums2.length;
      int[] merged = new int[m + n];  // Toplam uzunlukta yeni dizi
     System.arraycopy(nums1, 0, merged, 0 ,m);
     System.arraycopy(nums2, 0, merged, m ,n);
     Arrays.sort(merged); 
     
     
      double sayi1=0.0;
      double sayi2=0.0;
      if((m+n)%2==0)
        {
            int a1=(m+n)/2;
            int b=merged[a1-1];
            int b1=merged[a1];

            sayi1=(b+b1)/2.0;
             return  sayi1;

        }
        else
        {
            int a2=((m+n)-1)/2;
            int b=merged[a2];
                sayi2=b;
                 return  sayi2;
        }
            
    }
}