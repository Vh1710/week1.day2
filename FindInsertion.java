package week1.day2;

public class FindInsertion {
	public static void main(String[] args) {
		int nums[]= {3,2,11,4,6,7};
		int nums1[]= {1,2,8,4,9,7};
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
			for (int j = 0; j < nums1.length; j++) {
				System.out.println(nums1[j]);
				if(nums[i]==nums1[j]) {
					System.out.println("same");
				}else
						System.out.println("not same");
				
		
				}
			
		}
		
			
		
	}

}
