public class MainContador {
    public static void main(String[] args) {
        Contador contador1 = new Contador(2);
        contador1.mostrarValor();

        contador1.aumentarValor();
        contador1.aumentarValor();
        contador1.mostrarValor();

        contador1.diminuirValor();
        contador1.mostrarValor();

        contador1.reiniciar();
        contador1.mostrarValor();

        contador1.diminuirValor();
        contador1.mostrarValor();
    }
}



