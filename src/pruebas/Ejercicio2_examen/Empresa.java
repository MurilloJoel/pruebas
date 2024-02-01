package pruebas.Ejercicio2_examen;

public class Empresa {
   private String nombre;
   private int numEmpleados;
   private double beneficios;

   public Empresa(String nombre, int numEmpleados, double beneficios) {
      this.nombre = nombre;
      this.setNumEmpleados(numEmpleados);
      this.beneficios = beneficios;
   }

   public void setNumEmpleados(int numEmpleados) {
      if (numEmpleados > 0) {
         this.numEmpleados = numEmpleados;
      }

   }

   public String toString() {
      return this.nombre + "\t" + this.numEmpleados + "\t" + this.beneficios + " euritos";
   }

   public String getNombre() {
      return this.nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public double getBeneficios() {
      return this.beneficios;
   }

   public void setBeneficios(double beneficios) {
      this.beneficios = beneficios;
   }

   public int getNumEmpleados() {
      return this.numEmpleados;
   }
}
