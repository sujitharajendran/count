package guviproject;
import java.util.*;
public class huterzero {

	public static void main(String[] args) {
		int sum;
		int mini;
		int m1=0;
		int m2=1;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
	a[i]=sc.nextInt();
}

mini=Math.abs(a[3]+a[4]);
for(int i=0;i<n;i++){
	for(int j=0;j<n;j++){
		sum=Math.abs(a[i]+a[j]);
		if(sum<mini){
		 m1=i;
		m2=j;
		mini=sum;
		}
	}
}
	System.out.println(a[m1]);
	System.out.println(a[m2]);
}


}

		
	     /*int n, min1 = 0, min2 = 1, sum, minimum;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the number of elements you want:");
	        n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter all the numbers:");
	        for(int i = 0; i < n; i++)
	        {
	            a[i] = s.nextInt();
	        }
	        minimum=Math.abs(a[0] + a[1]);
	        for(int i = 0; i < n; i++)
	        {
	            for(int j = i + 1; j < n; j++)
	            {
	                sum = Math.abs(a[i] + a[j]);
	                if(sum < minimum)
	                {
	                    min1 = i;
	                   min2 = j;5
	                    minimum = sum;
	                }
	            }
	        }

	        System.out.println("Element 1:"+a[min1]); 
	        System.out.println("Element 2:"+a[min2]);
	    }
	}
*/