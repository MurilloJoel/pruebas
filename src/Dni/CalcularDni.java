package Dni;

public class CalcularDni {
   private int numDni;
   private static final String LETRAS_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";

   public int getDni() {
      return this.numDni;
   }

   public String getNIF() {
      char letraNIF = calcularLetraNIF(this.numDni);
      String var10000 = Integer.toString(this.numDni);
      String cadenaNIF = var10000 + String.valueOf(letraNIF);
      return cadenaNIF;
   }

   public void setNumDni(int numDni) {
      this.numDni = numDni;
   }

   private static char calcularLetraNIF(int dni) {
      char letra = "TRWAGMYFPDXBNJZSQVHLCKE".charAt(dni % 23);
      return letra;
   }

   private static char extraerLetraNIF(String nif) {
      char letra = nif.charAt(nif.length() - 1);
      return letra;
   }

   private static int extraerNumeroNIF(String nif) {
      int numero = Integer.parseInt(nif.substring(0, nif.length() - 1));
      return numero;
   }

   private static boolean validarNIF(String nif) {
      boolean valido = true;
      if (nif == null) {
         valido = false;
      } else if (nif.length() >= 8 && nif.length() <= 9) {
         char letra_leida = extraerLetraNIF(nif);
         int dni_leido = extraerNumeroNIF(nif);
         char letra_calculada = calcularLetraNIF(dni_leido);
         if (letra_leida == letra_calculada) {
            valido = true;
         } else {
            valido = false;
         }
      } else {
         valido = false;
      }

      return valido;
   }

   public void set(String nif) throws Exception {
      if (validarNIF(nif)) {
         this.numDni = extraerNumeroNIF(nif);
      } else {
         throw new Exception("NIF Invalido: " + nif);
      }
   }

   public void set(int dni) throws Exception {
      if (dni > 0 && dni < 999999999) {
         this.numDni = dni;
      } else {
         throw new Exception("DNI invalido: " + String.valueOf(dni));
      }
   }
}
