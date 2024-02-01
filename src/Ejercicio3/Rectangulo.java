package Ejercicio3;

public class Rectangulo {
   private double x1;
   private double x2;
   private double y1;
   private double y2;
   private String nombre;
   private static int numRectangulos = 0;

   public Rectangulo() {
      this.x1 = 0.0D;
      this.y1 = 0.0D;
      this.x2 = 10.0D;
      this.y2 = 10.0D;
      ++numRectangulos;
      this.nombre = "Rectangulo " + numRectangulos;
   }

   public Rectangulo(double base, double altura) {
      this.x1 = 0.0D;
      this.y1 = 0.0D;
      this.x2 = base;
      this.y2 = altura;
      ++numRectangulos;
      this.nombre = "Rectangulo " + numRectangulos;
   }

   public Rectangulo(Rectangulo r) {
      this.x1 = r.getX1();
      this.x2 = r.getX2();
      this.y1 = r.y1;
      this.y2 = r.getY2();
      this.nombre = r.getNombre();
      ++numRectangulos;
   }

   public Rectangulo(double x1, double x2, double y1, double y2, String nombre) {
      this.x1 = x1;
      this.x2 = x2;
      this.y1 = y1;
      this.y2 = y2;
      this.nombre = nombre;
      ++numRectangulos;
   }

   public double calcularSuperficie() {
      double area = Math.abs(this.x2 - this.x1) * Math.abs(this.y2 - this.y1);
      return area;
   }

   public double calcularPerimetro() {
      double perimetro = Math.abs(2.0D * (this.x2 - this.x1)) + Math.abs(2.0D * (this.y2 - this.y1));
      return perimetro;
   }

   public void desplazar(double x, double y) {
      this.x1 += x;
      this.x2 += x;
      this.y1 += y;
      this.y2 += y;
   }

   public static int getNumRectangulos() {
      return numRectangulos;
   }

   public String getNombre() {
      return this.nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public double getX1() {
      return this.x1;
   }

   public void setX1(double x1) {
      this.x1 = x1;
   }

   public double getX2() {
      return this.x2;
   }

   public void setX2(double x2) {
      this.x2 = x2;
   }

   public double getY1() {
      return this.y1;
   }

   public void setY1(double y1) {
      this.y1 = y1;
   }

   public double getY2() {
      return this.y2;
   }

   public void setY2(double y2) {
      this.y2 = y2;
   }

   public String toString() {
      return "x1=" + this.x1 + ", x2=" + this.x2 + ", y1=" + this.y1 + ", y2=" + this.y2 + ", nombre=" + this.nombre;
   }
}
