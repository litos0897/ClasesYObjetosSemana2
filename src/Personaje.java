public class Personaje {
    private String nombre;
    private int vida;

    public Personaje(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    public void recibirDanho(int cantidad) {
        if (cantidad > 0) {
            vida -= cantidad;
            System.out.println("Daño recibido de " + cantidad + " puntos");

        } else {
            System.out.println("Debe ser una cantidad positiva");
        }
    }

    public void curarse(int cantidad) {
        this.vida += cantidad;
        if (this.vida > 100) {
            this.vida = 100;
        }
        System.out.println("Vida recuperada de " + cantidad + " puntos");
    }

    public void mostrarEstado() {
        System.out.println("Estado del personaje:");
        System.out.println("Personaje: " + nombre);
        System.out.println("Vida actual: " + vida + " puntos");
    }
}
