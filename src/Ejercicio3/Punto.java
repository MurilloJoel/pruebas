package Ejercicio3;

public class Punto {
   private double x;
   private double y;
   public static int cantidadPuntos = 0;
   public static String nombre = "Punto";

   public Punto(double x, double y) {
      this.x = x;
      this.y = y;
      ++cantidadPuntos;
   }

   public Punto(Punto p) {
      this.x = p.x;
      this.y = p.y;
      ++cantidadPuntos;
   }

   public double getX() {
      return this.x;
   }

   public void setX(double x) {
      this.x = x;
   }

   public double getY() {
      return this.y;
   }

   public void setY(double y) {
      this.y = y;
   }

   public String toString() {
      return "Punto{x=" + this.x + ", y=" + this.y + "}";
   }
}
