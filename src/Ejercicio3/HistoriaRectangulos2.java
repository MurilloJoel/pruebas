package Ejercicio3;

public class HistoriaRectangulos2 {
   public static void main(String[] args) {
      Punto p1 = new Punto(0.0D, 0.0D);
      Punto p2 = new Punto(10.0D, 5.0D);
      Rectangulo2 r1 = new Rectangulo2(p1, p2, "Mi rectangulo");
      System.out.println("El punto 1: " + p1.toString());
      System.out.println("El punto 2: " + p2.toString());
      System.out.println("El rectangulo: " + r1.toString());
      System.out.println("---------------------------------------------------");
      System.out.println("                R1 desplazado");
      r1.desplazar(2.0D, 2.0D);
      System.out.println("El punto 1: " + p1.toString());
      System.out.println("El punto 2: " + p2.toString());
      System.out.println("El rectangulo: " + r1.toString());
   }
}
