import java.util.Scanner;
import java.lang.Math;
public class circular{
  public static void main (String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Ingresa el número: ");
  int N = sc.nextInt();
  String resultado ="";
  int length = Length(N);
    for(int a=0;a<length; a++){
      for(int i=2; i<N && a<length; i++){
        if (N%i!=0){
          N = Cambio(N);
     }else{
       a=length+1;
       resultado= "no";
       break;
     }
     if(a==(length-1)){
       resultado="si";
     }
   }
   }
   System.out.println(resultado);
  }


public static int Cambio(int numero){
  int length = Length(numero);
  int digito= numero%10;
  numero= numero/10;
  numero= numero+(digito*(int)Math.pow(10,length-1));
  return numero;
}
public static int Length(int numero){
  int i=1;
  for(i=1; numero>=10;i++){
    numero=numero/10;
  }
    return i;
}

}
