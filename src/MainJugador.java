public class MainJugador {
    public static void main(String[] args) {
        Jugador jugador1=new Jugador ("Lucas", 0);

        jugador1.ganarExperiencia(200);

        jugador1.ganarExperiencia(2);

        jugador1.mostrarNivel();
    }
}
