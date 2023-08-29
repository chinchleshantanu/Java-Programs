/* Accept a number and Display its square*/

import java.util.*;
class Square{
	public static void main(String[] args) {
		int i,res;
		Scanner sc=new Scanner(System.in);
		System.out.print("\n Enter a number");
		i=sc.nextInt();
		res=i*i;
		System.out.println("\n the square is"+res);
	}
}