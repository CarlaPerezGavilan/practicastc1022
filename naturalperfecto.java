import java.util.Scanner;
public class naturalperfecto{
  public static void main (String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Ingresa el número: ");
  int N = sc.nextInt();
  int suma =0;
  for(int i=1; i<N ;i++){
    if(N%i==0){
      suma=i+suma;
    }
  }
  if(suma==N){
    System.out.println("SÍ es un natural perfecto");
  }else{
    System.out.println("NO es un natural perfecto");
  }
   }}
