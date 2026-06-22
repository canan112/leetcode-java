/**
  PROBLEM:negatif olmayan iki tamsayıyı temsil eden ,
   boş olmayan iki
   bağlantılı liste veriliyor . Rakamlar ters sırada saklanıyor ve her düğümde tek bir rakam bulunuyor. İki sayıyı toplayın ve toplamı bağlantılı liste olarak döndürün
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {ListNode dummy = new ListNode(0);  // Sahte başlangıç düğümü
        ListNode current = dummy;
        int carry = 0;
        
        while (l1 != null || l2 != null || carry != 0) {
        int digit1=(l1!=null)?l1.val:0;
        int digit2=(l2!=null)?l2.val:0;
        int sum=digit1+digit2+carry;
        int digit=sum%10;
        carry=sum/10;

        ListNode newNode = new ListNode(digit);
            current.next = newNode;
            current = current.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;

        }
        ListNode result = dummy.next;
     
        return result;
    }
}