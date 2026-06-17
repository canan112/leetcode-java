//Problem:
//Bir tamsayı dizisi (nums) ve bir hedef değer (target) veriliyor. Dizideki iki sayının toplamı hedef değere eşit olacak şekilde iki indeks bulman gerekiyor.

class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
    
        for(int i=0; i<nums.length-1; i++)
        {
            for(int j=nums.length-1; j>-1; j--)
            {
                
            
                    if(nums[i]+nums[j]==target)
                    {
                        return new int[]{i, j};
                    }
                
            }
            
          
                



        }
          return new int[]{};
      
    }
}  
            


