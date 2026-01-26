public class Mascota {
    private String nombre;
    private int hambre;

    public Mascota (String nombre){
        this.nombre=nombre;
        this.hambre=50;
    }

    public void pasarTiempo(){
       hambre+=5;
       if(hambre>100){
           hambre=100;
       }
    }
    public void comer (){
        hambre-=25;
        if(hambre<0){
            hambre=0;
        }
        System.out.println(nombre+" está comiendo");
    }

    public void mostrarEstado(){
        System.out.println("La mascota se llama "+nombre+ " y tiene "+hambre+" de hambre sobre 100");
    }
}
