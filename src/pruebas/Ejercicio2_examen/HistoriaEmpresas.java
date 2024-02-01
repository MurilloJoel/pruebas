package pruebas.Ejercicio2_examen;

import java.time.LocalDate;
import java.util.Scanner;

public class HistoriaEmpresas {
   public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      LocalDate fecha = LocalDate.now();
      System.out.println("Fecha de hoy: " + String.valueOf(fecha));
      System.out.print("Ingrese el número de empresas a crear: ");
      int n = teclado.nextInt();
      Empresa[] empresas = new Empresa[n];

      int opcion;
      for(opcion = 0; opcion < n; ++opcion) {
         System.out.println("Ingrese los datos de la empresa " + (opcion + 1) + ":");
         System.out.print("Nombre: ");
         String nombre = teclado.next();
         int numEmpleados = 1 + (int)(Math.random() * 49.0D);
         System.out.print("Número de empleados (1-50): " + numEmpleados + "\n");
         System.out.print("Beneficios: ");

         double beneficios;
         try {
            beneficios = teclado.nextDouble();
         } catch (Exception var11) {
            System.out.println("No es un número");
            return;
         }

         empresas[opcion] = new Empresa(nombre, numEmpleados, beneficios);
      }

      do {
         System.out.println("\nMenú:");
         System.out.println("1. Mostrar empresas (todas)");
         System.out.println("2. Mostrar empresa/s con más beneficios");
         System.out.println("3. Mostrar el número medio de empleados de las empresas introducidas.");
         System.out.println("0. Salir");
         System.out.print("Seleccione una opción: ");
         opcion = teclado.nextInt();
         switch(opcion) {
         case 0:
            System.out.println("Saliendo del programa...");
            break;
         case 1:
            mostrarEmpresas(empresas);
            break;
         case 2:
            mostrarEmpresasConMasBeneficios(empresas);
            break;
         case 3:
            mostrarNumMedioEmpleados(empresas);
            break;
         default:
            System.out.println("Opción inválida");
         }
      } while(opcion != 0);

      teclado.close();
   }

   public static void mostrarEmpresas(Empresa[] empresas) {
      System.out.println("\nEmpresas:");
      Empresa[] var1 = empresas;
      int var2 = empresas.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         Empresa empresa = var1[var3];
         System.out.println(empresa.toString());
      }

   }

   public static void mostrarEmpresasConMasBeneficios(Empresa[] empresas) {
      double maxBeneficios = Double.MIN_VALUE;
      System.out.println("\nEmpresa/s con más beneficios:");
      Empresa[] var3 = empresas;
      int var4 = empresas.length;

      int var5;
      Empresa empresa;
      for(var5 = 0; var5 < var4; ++var5) {
         empresa = var3[var5];
         if (empresa.getBeneficios() > maxBeneficios) {
            maxBeneficios = empresa.getBeneficios();
         }
      }

      var3 = empresas;
      var4 = empresas.length;

      for(var5 = 0; var5 < var4; ++var5) {
         empresa = var3[var5];
         if (empresa.getBeneficios() == maxBeneficios) {
            System.out.println(empresa.toString());
         }
      }

   }

   public static void mostrarNumMedioEmpleados(Empresa[] empresas) {
      int totalEmpleados = 0;
      Empresa[] var2 = empresas;
      int var3 = empresas.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         Empresa empresa = var2[var4];
         totalEmpleados += empresa.getNumEmpleados();
      }

      double numMedioEmpleados = (double)totalEmpleados / (double)empresas.length;
      System.out.println("\nNúmero medio de empleados: " + numMedioEmpleados);
   }
}
