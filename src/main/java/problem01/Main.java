package problem01;

public class Main {
	public static void main(String[] args) {
		int[] arr = { -10, -3, 5, 6, -20 };
		findMaxProduct(arr);
	}

	public static void findMaxProduct(int[] arr) {
		//배열 중 2개의 곱의 최대값을 찾아라
		int Max = arr[0]*arr[1];
		int arr1 = arr[0];
		int arr2 = arr[1];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(i==j) { //중복 방지
					continue;
				}
				
				if(Max < arr[i]*arr[j]) {
					Max = arr[i]*arr[j];
					arr1 = arr[i];
					arr2 = arr[j];
				}
				
				
			}
		}
				
		System.out.print(arr1);
		System.out.print(arr2);
		
	}
	
}
