import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of stars");	
		int n=sc.nextInt();
		for(int i=0;i<=n/2;i++){
			for(int j=0;j<=n/2;j++){
				if(i==j){
					System.out.print(" *");
				}
				
				else{
					System.out.print("  ");	
					}
				}
			for(int j=n/2-1;j>=0;j--){
				if(i==j){
					System.out.print(" *");
				}else{
					System.out.print("  ");	
					}
				}
					System.out.println();
			}
		for(int i=n/2-1;i>=0;i--){
			for(int j=0;j<=n/2;j++){
				if(i==j){
					System.out.print(" *");
				}else{
					System.out.print("  ");	
					}
				}
			for(int j=n/2-1;j>=0;j--){
				if(i==j){
					System.out.print(" *");
				}else{
					System.out.print("  ");	
					}
				}
					System.out.println();
			}
		}
	}