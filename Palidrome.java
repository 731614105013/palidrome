# palidrome
import java.io.*;
import java.util.*;
import java.lang.*;
public class Palidrome
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a=sc .nextInt();
    int x,y,z=0;
    y=a;
    while(a!=0)
    {
      x=a%10;
      a=a/10;
      z=z*10+x;
    }
    if(z==y)
    System.out.println("Palidrome ");
    else
    System.out.println("Not a Palidrome "); 
          }
          }
