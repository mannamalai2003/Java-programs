import java.util.Scanner;
public class Move_zero{
	public static void main(String args[]){
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println("Enter the elements one by one:");
		for(int i=0;i<num;i++){
			arr[i] = sc.nextInt();
		}
		int left = 0; int right = num-1;
		int temp = 0;
		while(left<right){
			if(arr[left]!=0){
				left++;
			}
			else if(arr[left]==0){
				temp = arr[right];	
				arr[right] = arr[left];
				arr[left]=temp;
				right--;
			}
		}
		System.out.println("Moving the zeros to right:");
		for(int i=0;i<num;i++){
			System.out.print(arr[i]+ " ");
		}
	}
}
		
		