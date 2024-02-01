package pruebas;

import java.util.Scanner;

public class Ejercicio1_examen {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      boolean verificador = true;
      boolean numRep = false;
      char num2 = '0';
      char valorA = 'A';
      int contador1 = 0;
      int contador2 = 0;
      int contadorSimbolos = 0;
      int contadorMayus = 0;
      String resultado = "";
      System.out.println("Introduce una contraseña");
      String contraseña = sc.nextLine();
      char[] contraseña2 = new char[contraseña.length()];
      if (contraseña.length() < 8) {
         verificador = false;
         resultado = resultado + "Tu contraseña es demasiado corta\n";
      }

      int i;
      for(i = 0; i < contraseña.length(); ++i) {
         contraseña2[i] = contraseña.charAt(i);
      }

      if (contraseña.toLowerCase() == contraseña) {
         resultado = resultado + "Falta al menos una mayuscula en tu contraseña\n";
         verificador = false;
      }

      int j;
      for(i = 0; i < 26; ++i) {
         for(j = 0; j < contraseña.length(); ++j) {
            if (contraseña2[j] == valorA) {
               ++contadorMayus;
            }
         }

         ++valorA;
      }

      if (contadorMayus < 1) {
         resultado = resultado + "Te falta una mayúscula\n";
         verificador = false;
      }

      i = 0;

      while(i < contraseña2.length) {
         switch(contraseña2[i]) {
         case '0':
         case '1':
         case '2':
         case '3':
         case '4':
         case '5':
         case '6':
         case '7':
         case '8':
         case '9':
            ++contador1;
         default:
            ++i;
         }
      }

      if (contador1 < 2) {
         resultado = resultado + "Te faltan 2 numeros titan\n";
         verificador = false;
      }

      for(i = 0; i < 10; ++i) {
         for(j = 0; j < contraseña2.length; ++j) {
            if (contraseña2[j] == num2) {
               ++contador2;
            }

            if (contador2 > 2) {
               numRep = true;
            }
         }

         ++num2;
      }

      if (numRep) {
         resultado = resultado + "Se repiten 2 numeros titan\n";
         verificador = false;
      }

      i = 0;

      while(i < contraseña2.length) {
         switch(contraseña2[i]) {
         case '$':
         case '%':
         case '&':
         case '-':
         case '/':
         case '_':
            ++contadorSimbolos;
         default:
            ++i;
         }
      }

      if (contadorSimbolos < 2) {
         resultado = resultado + "Te faltan simbolos crack\n";
         verificador = false;
      }

      if (verificador) {
         System.out.println("Contraseña bien hecha");
      } else {
         System.out.println("Contraseña mal hecha");
         System.out.print(resultado);
      }

   }
}
