//QusNo2. Write a program to test if an array contains a specific value.
import java.util.Scanner;
class QusNo2{
	public static void main(String[] arg){
	int size;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Size");
	size = sc.nextInt();
	System.out.println("Enter Element of Array");
	int[] arr = new int[size];
	for(int i =0;i<size;i++){
		arr[i]= sc.nextInt();
	}
	System.out.println("Enter Specific Value for checking");
	int sv = sc.nextInt();
	for(int i=0;i<size;i++){
		if(arr[i]==sv)
		{
			System.out.println(sv+" Specific value is Contain array index of "+ i);
		}
		
	}
}
}