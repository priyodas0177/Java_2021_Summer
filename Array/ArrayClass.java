import java.lang.*;
public class ArrayClass{
	 public static void main(String[] args) {
		 int arr[]=new int[]{10,44,32,97,2};
		 
		 int max=arr[0];
		 int ind=0;
		 for(int i=0;i<5;i++){
			 if(arr[i]>max)
				 max=arr[i];
				ind=i;
		 }	
		 System.out.println("Largest Element" +max);
		 System.out.println("Array Index" + ind);
		 int sum=0;
		 for(int i=0;i<5;i++){
		 
			 sum=sum+arr[i];
		}
		System.out.println("sum= "+sum);
		 
	}
	 
	 
}