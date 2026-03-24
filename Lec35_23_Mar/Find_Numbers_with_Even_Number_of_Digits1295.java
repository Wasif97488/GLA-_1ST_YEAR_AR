package Lec35_23_Mar;

public class Find_Numbers_with_Even_Number_of_Digits1295 {
	public static void main(String[] args) {
		int[] nums = {12,345,2,6,7896};
		int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            while(nums[i]!=0)
            {
                count++;
                nums[i]=nums[i]/10;
            }
            if(count%2==0)
            {
                ans++;
            }
        }
        System.out.println(ans);
	}

}
