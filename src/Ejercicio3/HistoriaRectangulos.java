package Ejercicio3;

public class HistoriaRectangulos {
   public static void main(String[] args) {
      Rectangulo r1 = new Rectangulo(1.0D, 3.0D, 1.0D, 3.0D, "Rectangulo 1");
      System.out.println(r1.toString());
      System.out.println(r1.calcularPerimetro() + " --> Perimetro");
      System.out.println(r1.calcularSuperficie() + " --> Area");
      System.out.println("---------------------------------------------------");
      System.out.println("                R1 desplazado");
      r1.desplazar(1.0D, 2.0D);
      System.out.println(r1.toString());
      System.out.println(r1.calcularPerimetro() + " --> Perimetro");
      System.out.println(r1.calcularSuperficie() + " --> Area");
      System.out.println("---------------------------------------------------\n");
      System.out.println("---------------------------------------------------");
      Rectangulo r2 = new Rectangulo();
      System.out.println(r2.toString());
      System.out.println(r2.calcularPerimetro() + " --> Perimetro");
      System.out.println(r2.calcularSuperficie() + " --> Area");
      System.out.println("---------------------------------------------------");
      System.out.println("                R2 desplazado");
      r2.desplazar(1.0D, 2.0D);
      System.out.println(r2.toString());
      System.out.println(r2.calcularPerimetro() + " --> Perimetro");
      System.out.println(r2.calcularSuperficie() + " --> Area");
      System.out.println("---------------------------------------------------\n");
      System.out.println("---------------------------------------------------");
      Rectangulo r3 = new Rectangulo(1.5D, 2.0D);
      System.out.println(r3.toString());
      System.out.println(r3.calcularPerimetro() + " --> Perimetro");
      System.out.println(r3.calcularSuperficie() + " --> Area");
      System.out.println("---------------------------------------------------");
      System.out.println("                R3 desplazado");
      r3.desplazar(1.0D, 2.0D);
      System.out.println(r3.toString());
      System.out.println(r3.calcularPerimetro() + " --> Perimetro");
      System.out.println(r3.calcularSuperficie() + " --> Area");
      System.out.println("---------------------------------------------------\n");
      System.out.println("---------------------------------------------------");
      Rectangulo r4 = new Rectangulo(r3);
      System.out.println(r4.toString());
      System.out.println(r4.calcularPerimetro() + " --> Perimetro");
      System.out.println(r4.calcularSuperficie() + " --> Area");
      System.out.println("---------------------------------------------------");
      System.out.println("                R4 desplazado");
      r3.desplazar(1.0D, 2.0D);
      System.out.println(r4.toString());
      System.out.println(r4.calcularPerimetro() + " --> Perimetro");
      System.out.println(r4.calcularSuperficie() + " --> Area");
      System.out.println("---------------------------------------------------\n");
      System.out.println("---------------------------------------------------");
      System.out.println(r4.toString());
      System.out.println(r4.calcularPerimetro() + " --> Perimetro");
      System.out.println(r4.calcularSuperficie() + " --> Area");
      System.out.println("---------------------------------------------------");
      System.out.println("                R5 desplazado");
      r4.desplazar(1.0D, 2.0D);
      System.out.println(r4.toString());
      System.out.println(r4.calcularPerimetro() + " --> Perimetro");
      System.out.println(r4.calcularSuperficie() + " --> Area");
      if (r3 == r4) {
         System.out.println("r3 y r4 son la misma referencia");
      } else {
         System.out.println("r3 y r4 no son la misma referencia");
      }

      if (r4 == r4) {
         System.out.println("r4 y r5 son la misma referencia");
      } else {
         System.out.println("r4 y r5 no son la misma referencia");
      }

   }
}
