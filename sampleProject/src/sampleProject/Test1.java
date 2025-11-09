package sampleProject;

import java.util.Scanner;

public class Test1{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the number: ");
int num = sc.nextInt();

int rev=0;

int org_num=num;
while(num!=0)
{
  rev=rev*10+num%10;
num=num/10;
}
if(org_num==num){
System.out.println("It is a Palindrom Number");
}
else{
System.out.println("It is a Palindrom Number");
}

}
}