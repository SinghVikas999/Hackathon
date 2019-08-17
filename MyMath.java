import java.util.Scanner;
public class MyMath
{
public static void main(String[] args)
{
int min,count=0;
int div[]=new int[10];
Scanner sc=new Scanner(System.in);
System.out.print("Enter First Number ");
int a=sc.nextInt();
System.out.print("Enter Second Number ");
int b=sc.nextInt();
if(a<b)
min=a;
else
min=b;
int k=0;
for(int i=1;i<=min;i++)
{
if(a%i==0 && b%i==0)
{
count++;
div[k]=i;
k++;
}
}
if(count>=2)
{
int width=div[count-1];
int height=div[count-2];

for(int i=1;i<=height;i++)
{
for(int j=1;j<=width;j++)
{
System.out.print("*");
}
System.out.print("\n");
}
}
if(count<2)
{
int average=(a+b)/2;
for(int i=1;i<=average;i++)
System.out.print("*");
}
}
}