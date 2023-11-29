import java.util.*;
public class Gradecalculator{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of subjects marks you want to find the average");
int n=sc.nextInt();
float s=0,avg;
System.out.println("Enter the Marks of the subject (out of 100)");
for (int i=0;i<n;i++)
{
float r=sc.nextFloat();
s=s+r;
}
avg=s/n;
System.out.println("The Total Marks obtained are "+s);
System.out.println("The Average of the Marks is "+avg);
if(avg>100 || avg <0){
System.out.println("Enter Correct Marks");
}
else if(avg>=90 && avg<100){
   System.out.println("Grade = O");  
}
else if(avg>=70 && avg<90){
    System.out.println("Grade = A");
}
else if(avg>=60 && avg<70){
    System.out.println("Grade = B");
}
else if(avg>=50 && avg<60){
    System.out.println("Grade = C");
}
else if(avg>=40 && avg<50){
    System.out.println("Grade = D");
}
else
{
    System.out.println("Fail");
}
}
}