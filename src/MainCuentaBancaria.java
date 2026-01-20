public class MainCuentaBancaria {
    public static void main(String[] args) {

    CuentaBancaria cuenta1=new CuentaBancaria("Pepe García",1000);

    cuenta1.mostrarEstado();

    cuenta1.ingresar(200);

    cuenta1.mostrarEstado();

    cuenta1.retirar(100);

    cuenta1.mostrarEstado();

    cuenta1.retirar(200.80);

    cuenta1.mostrarEstado();

    }
}