public class Jugador {
    private String nombre;
    private int experiencia;

    public Jugador(String nombre, int experiencia){
        this.nombre=nombre;
        this.experiencia=experiencia;
    }
    public void ganarExperiencia(int puntos){
        if (puntos>0) {
            this.experiencia += puntos;
            System.out.println("Se han ganado " + puntos + " puntos de experiencia");
        }
    }
    public void mostrarNivel(){
        int nivel= this.experiencia/100;
        System.out.println("El nivel actual es "+nivel);
    }
}
