package Lec35_23_Mar;

public class Number_of_Good_Pairs_1512 {
	
	public static void main(String[] args) {
		int count=0;
		int[] nums= {1,2,3,1,1,3};
	      for(int i=0;i<nums.length-1;i++)
	      {
	          for(int j=i+1;j<nums.length;j++)
	          {
	              if(nums[i]==nums[j])
	              {
	                  count++;
	              }
	          }
	      }
	      System.out.println(count);
	}

}
