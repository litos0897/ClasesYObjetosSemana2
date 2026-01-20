public class MainTermometro {
    public static void main(String[] args) {

        Termometro termometro1=new Termometro(0);

        termometro1.subir(12);
        termometro1.mostrarTemperatura();
        termometro1.subir(20);
        termometro1.mostrarTemperatura();
        termometro1.bajar(15);
        termometro1.mostrarTemperatura();
    }
}
