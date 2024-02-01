package EjemploInstituto;

import java.time.LocalDate;

public class Persona {
   protected String nombre;
   protected String apellidos;
   protected LocalDate fechaNac;

   public Persona(String nombre, String apellidos, LocalDate fechaNac) {
      this.nombre = nombre;
      this.apellidos = apellidos;
      this.fechaNac = fechaNac;
   }

   public void mostrar() {
      System.out.printf("Nombre: %s\n", this.nombre);
      System.out.printf("Apellidos: %s\n", this.apellidos);
      System.out.printf("Fecha de nacimiento: %s\n", this.fechaNac);
   }

   public String getNombre() {
      return this.nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getApellidos() {
      return this.apellidos;
   }

   public void setApellidos(String apellidos) {
      this.apellidos = apellidos;
   }

   public LocalDate getFechaNac() {
      return this.fechaNac;
   }

   public void setFechaNac(LocalDate fechaNac) {
      this.fechaNac = fechaNac;
   }
}
