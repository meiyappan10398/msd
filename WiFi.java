package javabasic;
import java.util.*;
public class WiFi {
static int t=0;
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int m=N;
int n=N/10;
n=n%10;
sc.nextLine();
String s=sc.nextLine();
char c=s.charAt(s.length()-1);
t=sumOfDigits(m)
if(m>100&&m<999)
{
Display(n,c);
}
else if(m>999&&m<1999)
 if(t==1)
{
rt=2;Display(n,c);
}else
{if(t%2!=0)
{t=t-1;
Display(n,c);
}else
{Display(n,c);   
}
}
}

public static int sumOfDigits(int m)
{ 
int sum=0;
while(m>0)
{
sum+=m%10;
m=m/10;
}
sum=(sum<10)?sum:sumOfDigits(sum);  
return sum;
}
public static void Display( int n,char c) {
if(n==0)&&(n==9)
{
System.out.println(t+")"+c+n);   
}
else if(n==1)
{
System.out.println(t+"!"+c+n);     
}
else if(n==2)
{
System.out.println(t+"@"+c+n);     
}
else if(n==3)
System.out.println(t+"#"+c+n);     
}
else if(n==4)
{
int c;
int n;
System.out.println(t+"$"+c+n);    
}
else if(n==5)

System.out.println(t+"%"+c+n);     
}
 else if(n==6)
 {
System.out.println(t+"^"+c+n);     
}
else if(n==7)
{
System.out.println(t+"&"+c+n);     
}
else if(n==8)
{
System.out.println(t+"*"+c+n);     
}
else if(n==9)

System.out.println(t+"("+c+n);     
}
}







