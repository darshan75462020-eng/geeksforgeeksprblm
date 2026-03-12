public class Consecutive_ones {
    public static void main(String[] args) {
        Consecutive_ones co = new Consecutive_ones();
        int[] nums={1,1,0,1,1,1};
        System.out.println(co.findMaxConsecutiveOnes(nums));
    }
    
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int n=nums.length;
        int i=0;
        int max=0;
       while(i<n)
       {
         if(nums[i]==1){
            count++;
         if(count>max)
         {
            max=count;
         }
         }else{
            count=0;
         }
         i++;
       }
        return max;
    }
}

