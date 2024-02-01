package PruebasInput;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Banco {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      ArrayList<Cuenta> cuentas = new ArrayList();
      int opcion = -1;

      do {
         try {
            menu();
            System.out.println("Elija una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            long numCuenta;
            switch(opcion) {
            case 0:
               System.out.println("Adios, tenga un buen día");
               break;
            case 1:
               try {
                  System.out.print("Escriba un nº de cuenta: ");
                  numCuenta = sc.nextLong();
                  sc.nextLine();
                  Iterator var25 = cuentas.iterator();

                  Cuenta c;
                  while(var25.hasNext()) {
                     c = (Cuenta)var25.next();
                     if (c.getNumCuenta() == numCuenta) {
                        throw new ExcepcionPropia("Este número de cuenta ya existe");
                     }
                  }

                  System.out.print("\nTitular? ");
                  String titular = sc.nextLine();
                  System.out.print("\nSaldo inicial? ");
                  double saldo = sc.nextDouble();
                  sc.nextLine();
                  c = new Cuenta(numCuenta, saldo, titular);
                  cuentas.add(c);
               } catch (InputMismatchException var22) {
                  System.out.println("El número de cuenta o el saldo tiene caracteres no válidos");
                  sc.nextLine();
               } catch (ExcepcionPropia var23) {
                  System.out.println(var23.getMessage());
                  sc.nextLine();
               }
               break;
            case 2:
               try {
                  System.out.print("Escriba un nº de cuenta: ");
                  numCuenta = sc.nextLong();
                  sc.nextLine();
                  System.out.print("\nSaldo a ingresar? ");
                  double dinero = sc.nextDouble();
                  sc.nextLine();
                  ((Cuenta)cuentas.get(0)).ingresar(dinero);
                  System.out.println(cuentas.toString());
                  Iterator var10 = cuentas.iterator();

                  while(var10.hasNext()) {
                     Cuenta c = (Cuenta)var10.next();
                     if (c.getNumCuenta() != numCuenta) {
                        throw new ExcepcionPropia("Este número de cuenta no existe");
                     }

                     if (dinero <= 0.0D) {
                        throw new ExcepcionPropia("Introduce un valor valido campeon");
                     }
                  }
               } catch (InputMismatchException var19) {
                  System.out.println("El número de cuenta o el saldo tiene caracteres no válidos");
                  sc.nextLine();
               } catch (ExcepcionPropia var20) {
                  System.out.println(var20.getMessage());
               } finally {
                  sc.nextLine();
               }
            case 3:
            case 4:
            case 5:
            case 6:
               break;
            default:
               System.out.println("Opción no contemplada");
            }
         } catch (InputMismatchException var24) {
            System.out.println("La opción de menú no es un número");
            sc.nextLine();
         }
      } while(opcion != 0);

   }

   public static void menu() {
      System.out.println("1. Crear cuenta\n2. Ingresar dinero\n3. Sacar dinero\n4. Transferencia entre dos cuentas\n5. Imprimir el saldo\n6. Imprimir datos\n0. Salir");
   }
}
