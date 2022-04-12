package mypack1;
import java.util.*;
import java.util.*;
public class CompareNums {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter 3 Nums ");
int a= sc.nextInt();
int b= sc.nextInt();
int c= sc.nextInt();


if(a==b && b==c && c==a) {
System.out.println("All Numbers are equal");
}
else if(a!=b && b!=c && c!=a) {
System.out.println("All Numbers are different");
}
else {
System.out.println("Neither all are equal or different");
}
}
}
