// Hacer un programa que nos muestre los números del 0-0-0 al 9-9-9, sustituyendo cada dígito "3" por la letra "E"

public class odometroEbis { 

 public static void main(String[] args){

  int cont1 = 0;
  int cont2 = 0;
  int cont3 = 0; 
  
  String resultado;



  for ( cont1 = 0; cont1 <= 9 ; cont1++){
   for ( cont2 = 0 ; cont2 <=9 ; cont2++){
    for ( cont3 = 0 ; cont3 <=9; cont3++){
      resultado = "";
      if (cont1 == 3) {
        resultado += "E";
      } else {
        resultado += cont1;
      }
      if (cont2 == 3) {
        resultado += "-E";
      } else {
        resultado += "-"+cont2;
      }
      if (cont3 == 3) {
        resultado += "-E";
      } else {
        resultado += "-"+cont3;
      }

      System.out.print(resultado+"   ");

    } 
    System.out.println("");
   }
  }
 }

}   

