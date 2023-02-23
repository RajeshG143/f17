import java.util.*;
public class A3
{
public static void main (String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the length of an array");
int length = sc.nextInt();
int a[]= new int[length];
//adding element in an array
System.out.println("add integer elements in an array");
for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
//sort the elements in an array
for (int i=0;i<a.length;i++)
{
int temp=0;
for(int j=i+1;j<a.length;j++)
{
    if(a[i]<a[j])
    {
    temp=a[i];
    a[i]=a[j];
    a[j]= temp;
    }
}
}


int secondmax=a[1];
System.out.print("Second max element in an array is "+ secondMax);


}
}
