public class MainAscensor {
    public static void main(String[] args) {
        Ascensor ascensor1=new Ascensor(0);

        ascensor1.mostrarPlanta();

        ascensor1.subir();
        ascensor1.subir();

        ascensor1.mostrarPlanta();

        ascensor1.bajar();
        ascensor1.mostrarPlanta();
    }
}
