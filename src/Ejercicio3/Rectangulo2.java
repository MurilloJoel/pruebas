package Ejercicio3;

public class Rectangulo2 {
   private Punto vertice1;
   private Punto vertice2;
   private String nombre;
   private static int numRectangulos = 0;

   private Rectangulo2() {
      this.vertice1 = new Punto(0.0D, 0.0D);
      this.vertice2 = new Punto(1.0D, 1.0D);
      ++numRectangulos;
      this.nombre = "Rectangulo " + numRectangulos;
   }

   public Rectangulo2(Punto vertice1, Punto vertice2, String nombre) {
      this.vertice1 = new Punto(vertice1);
      this.vertice2 = new Punto(vertice2);
      this.nombre = nombre;
      ++numRectangulos;
   }

   public Rectangulo2(double base, double altura) {
      this.vertice1 = new Punto(0.0D, 0.0D);
      this.vertice2 = new Punto(base, altura);
      ++numRectangulos;
      this.nombre = "Rectangulo " + numRectangulos;
   }

   public Rectangulo2(Rectangulo2 r) {
      Punto v1 = new Punto(r.getVertice1());
      this.setVertice1(v1);
      Punto v2 = new Punto(r.getVertice2());
      this.setVertice2(v2);
      this.nombre = r.getNombre();
      ++numRectangulos;
   }

   public Rectangulo2(double x1, double y1, double x2, double y2, String nombre) {
      this.vertice1 = new Punto(x1, y1);
      this.vertice2 = new Punto(x2, y2);
      this.nombre = nombre;
      ++numRectangulos;
   }

   public double base() {
      double x2 = this.getVertice2().getX();
      double x1 = this.getVertice1().getX();
      return Math.abs(x2 - x1);
   }

   public double altura() {
      double y2 = this.getVertice2().getY();
      double y1 = this.getVertice1().getY();
      return Math.abs(y2 - y1);
   }

   public double calcularSuperficie() {
      double area = this.base() * this.altura();
      return area;
   }

   public double calcularPerimetro() {
      double perimetro = 2.0D * (this.base() + this.altura());
      return perimetro;
   }

   public void desplazar(double x, double y) {
      this.vertice1.setX(this.vertice1.getX() + x);
      this.vertice1.setY(this.vertice1.getY() + y);
      this.vertice2.setX(this.vertice2.getX() + x);
      this.vertice2.setY(this.vertice2.getY() + y);
   }

   public Punto getVertice1() {
      return new Punto(this.vertice1);
   }

   public void setVertice1(Punto vertice1) {
      vertice1.setX(vertice1.getX());
      vertice1.setY(vertice1.getY());
   }

   public Punto getVertice2() {
      return new Punto(this.vertice2);
   }

   public void setVertice2(Punto vertice2) {
      vertice2.setX(vertice2.getX());
      vertice2.setY(vertice2.getY());
   }

   public String getNombre() {
      return new String(this.nombre);
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public static int getNumRectangulos() {
      return numRectangulos;
   }

   public String toString() {
      String var10000 = String.valueOf(this.vertice1);
      return "Rectangulo2{vertice1=" + var10000 + ", vertice2=" + String.valueOf(this.vertice2) + ", nombre=" + this.nombre + "}";
   }
}
