import java.util.*;

public class LeftRotation {

	public static void main(String[] args) {
		int n = 0;  
		int d = 0;  
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements present in array: ");
		n = sc.nextInt();                                                                                          
		int arr[] = new int[n];
		int nos = n;
		System.out.println("Enter the number of times left rotation is to be performed on array: ");
		d = sc.nextInt();                                                                                          
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();	
		}
		System.out.println("Array is:");
		for(int i=0;i<n;i++){
			System.out.print(" "+arr[i]+ " ");                                                              
		}
		int temp = 0;
		for(int i=0;i<d;i++) {
			temp = arr[0];
			for(int j=0;j<n-1;j++) {
				arr[j] = arr[j+1];
			}
			arr[n-1] = temp;
		}	
		System.out.println("\nFinal array is: ");
		for(int i=0;i<nos;i++){
			System.out.print(" "+arr[i]+" ");                                                   
		}
	}

}