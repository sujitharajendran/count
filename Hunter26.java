package guviproject;
import java.util.*;
public class Hunter26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the k");
int k=sc.nextInt();
System.out.println("enter the size of element");
int n=sc.nextInt();
int sum;
int count=0;
int a[]=new int[n];
for(int i=0;i<n;i++){
	a[i]=sc.nextInt();
}
for(int i=0;i<n;i++){
	for(int j=0;j<n;j++){
		sum=a[j]-a[i];
	
	if(sum==k){
		count++;
	}
}
}
System.out.println(count);
	}

}
