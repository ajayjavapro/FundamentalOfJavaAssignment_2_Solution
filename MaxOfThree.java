
import java.util.Scanner;
public class MaxOfThree
{
public static void main(String[] args) {
int a,b,c;
System.out.println("enter the first number");  
Scanner r=new Scanner(System.in);   
a=r.nextInt();
System.out.println("enter the second number");
b=r.nextInt();
System.out.println("enter the third number");
c=r.nextInt();
if(a>b)
{
if(a>c)
{
 System.out.println("the maximum number is:" + a);   
}
else
{
 System.out.println("the maximum number is" + c);   
}


}
else
{
if(b>c)
{
System.out.println("the maximum number is" + b);
}
else{

System.out.println("the maximum number is" + c);    
}

r.close();

}

System.out.println("thanks for see");

}


}