public class MainPersonaje {
    public static void main(String[] args) {

        Personaje personaje1 = new Personaje("Reaper", 200);

        personaje1.mostrarEstado();

        personaje1.recibirDanho(50);

        personaje1.mostrarEstado();

        personaje1.curarse(25);

        personaje1.mostrarEstado();

    }
}
