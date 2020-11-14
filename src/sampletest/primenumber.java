package sampletest;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
	//	int i,j,s;
		
	//	for(i=2;i<100;i++){
		//	s=0;
		//	for(j=2;j<i;j++){
		//		if(i%j==0)
		//			s=1;
		///			break;
		//	}
		//	if(s==0)
		//	System.out.println("is prime number"+i);
		//}
       int a,b,sum;
       float avg;
       Scanner input =new Scanner(System.in);
		a=input.nextInt();
		b=input.nextInt();
		sum=a+b;
		avg=(float)((a+b)/2);
		System.out.print("sum:"+sum+"\naverage:"+avg);
		
	}

}
