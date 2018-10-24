import java.util.Scanner;
public class bisiesto{
  public static void main (String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Ingresa el año: ");
  int a = sc.nextInt();
  if(a%4==0 && a%100!=0 || a%400==0){
      System.out.println("El año SÍ es bisiesto");
    }else{
        System.out.println("El año NO es bisiesto");
    }
  }
}
