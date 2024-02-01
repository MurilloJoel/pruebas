package EjemploInstituto;

import java.time.LocalDate;

public class Alumno extends Persona {
   String grupo;
   double notaMedia;

   public Alumno(String nombre, String apellidos, LocalDate fechaNac, String grupo, double notaMedia) {
      super(nombre, apellidos, fechaNac);
      this.grupo = grupo;
      this.notaMedia = notaMedia;
   }

   public void mostrar() {
      super.mostrar();
      System.out.printf("Grupo: %s\n", this.grupo);
      System.out.printf("Nota media: %5.2f\n", this.notaMedia);
   }

   public String getGrupo() {
      return this.grupo;
   }

   public void setGrupo(String grupo) {
      this.grupo = grupo;
   }

   public double getNotaMedia() {
      return this.notaMedia;
   }

   public void setNotaMedia(double notaMedia) {
      this.notaMedia = notaMedia;
   }

   public String getNombre() {
      return "Alumno: " + this.nombre;
   }
}
