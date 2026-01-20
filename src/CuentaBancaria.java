public class CuentaBancaria {
    private String nombreTitular;
    private double saldo;

    public CuentaBancaria(String nombreTitular, double saldo){
        this.nombreTitular=nombreTitular;
        this.saldo=saldo;
    }

    public void ingresar(double cantidad){
        if (cantidad>0){
            saldo+=cantidad;
            System.out.println("Ingreso de "+cantidad+" €");
        }else{
            System.out.println("Debe ser una cantidad positiva");
        }
    }

    public void retirar (double cantidad){
        if (cantidad<=saldo){
            saldo-=cantidad;
            System.out.println("Retirada de "+cantidad+" €");
        }
    }

    public void mostrarEstado(){
        System.out.println("Estado de la cuenta:");
        System.out.println("Titular: " + nombreTitular);
        System.out.println("Saldo actual: " + saldo + "€");
    }
}
