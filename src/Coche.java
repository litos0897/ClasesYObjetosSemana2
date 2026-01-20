public class Coche {
    private String marca;
    private int velocidad;
    private int velocidadMaxima;

    public Coche(String marca, int velocidadMaxima) {
            this.marca = marca;
            this.velocidadMaxima = velocidadMaxima;
            this.velocidad = 0;
        }
        public void acelerar ( int aumento){
            if (aumento > 0) {
                velocidad += aumento;
            }
            if (velocidad > velocidadMaxima) {
                velocidad = velocidadMaxima;
                System.out.println("Alcanzada la velocidad máxima");
            }
        }
        public void frenar ( int reduccion){
            if (reduccion > 0) {
                velocidad -= reduccion;
                if (velocidad < 0) {
                    velocidad = 0;
                }
            }
        }
        public void mostrarVelocidad () {
            System.out.println("El coche " + marca + " circula a " + velocidad + " km/h.");
    }
    }

