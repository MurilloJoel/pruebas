package PruebasInput;

public class Cuenta {
   private long numCuenta;
   private double saldo;
   private String titular;
   private static double MAXIMO_DESCUBIERTO = 0.0D;
   private static double MAXIMO_RETIRO = 600.0D;

   public Cuenta(long numCuenta, double saldo, String titular) {
      this.numCuenta = numCuenta;
      this.saldo = saldo;
      this.titular = titular;
   }

   public Cuenta(long numCuenta, double saldo, String titular, double cmd, double cmc) {
      this.numCuenta = numCuenta;
      this.saldo = saldo;
      this.titular = titular;
      MAXIMO_DESCUBIERTO = cmd;
      MAXIMO_RETIRO = cmc;
   }

   public String getTitular() {
      return this.titular;
   }

   public void setTitular(String titular) {
      this.titular = titular;
   }

   public long getNumCuenta() {
      return this.numCuenta;
   }

   public void setNumCuenta(long numCuenta) {
      this.numCuenta = numCuenta;
   }

   public double getSaldo() {
      return this.saldo;
   }

   public void setSaldo(double saldo) {
      this.saldo = saldo;
   }

   public double getMAXIMO_DESCUBIERTO() {
      return MAXIMO_DESCUBIERTO;
   }

   public void setCantidaMaxDescubierto(int cantidaMaxDescubierto) {
      MAXIMO_DESCUBIERTO = (double)cantidaMaxDescubierto;
   }

   public double getMAXIMO_RETIRO() {
      return MAXIMO_RETIRO;
   }

   public void setCantidadMaxCajero(int cantidadMaxCajero) {
      MAXIMO_RETIRO = (double)cantidadMaxCajero;
   }

   public String toString() {
      return "Cuenta{numCuenta=" + this.numCuenta + ", saldo=" + this.saldo + ", titular=" + this.titular + ", cantidaMaxDescubierto=" + MAXIMO_DESCUBIERTO + ", cantidadMaxCajero=" + MAXIMO_RETIRO + "}";
   }

   public boolean retirar(double retiro) {
      if (retiro <= 0.0D) {
         throw new ExcepcionPropia("Cantodad invalida");
      } else {
         if (retiro > MAXIMO_RETIRO) {
         }

         return true;
      }
   }

   public void ingresar(double cantidadNueva) {
      if (cantidadNueva > 0.0D) {
         this.saldo += cantidadNueva;
      }

   }

   public boolean transferir(double cantidad, Cuenta origen, Cuenta destino) {
      return true;
   }
}
