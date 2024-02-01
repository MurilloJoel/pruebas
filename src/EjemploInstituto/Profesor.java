package EjemploInstituto;

import java.time.LocalDate;

public class Profesor extends Persona {
   String especialidad;
   double salario;

   public Profesor(String nombre, String apellidos, LocalDate fechaNac, String especialidad, double salario) {
      super(nombre, apellidos, fechaNac);
      this.especialidad = especialidad;
      this.salario = salario;
   }

   public void mostrar() {
      super.mostrar();
      System.out.printf("Especialidad: %s\n", this.especialidad);
      System.out.printf("Salario: %7.2f euros\n", this.salario);
   }

   public String getEspecialidad() {
      return this.especialidad;
   }

   public void setEspecialidad(String especialidad) {
      this.especialidad = especialidad;
   }

   public double getSalario() {
      return this.salario;
   }

   public void setSalario(double salario) {
      this.salario = salario;
   }

   public String getNombre() {
      return "Profesor: " + this.nombre;
   }
}
