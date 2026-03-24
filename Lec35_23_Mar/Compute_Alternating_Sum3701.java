package Lec35_23_Mar;

public class Compute_Alternating_Sum3701 {
	public static void main(String[] args) {
		
		int[] nums= {1,3,5,7};
		int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                sum=sum+nums[i];
            }
            else
            sum=sum-nums[i];
        }
        System.out.println(sum);
	}

}
