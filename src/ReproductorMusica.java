public class ReproductorMusica {
    private int volumen;

    public ReproductorMusica (int volumenInicial){
        this.volumen=volumenInicial;
        volumenInicial=50;
        System.out.println("El volumen inicial es "+volumenInicial);
    }
    public void subirVolumen (){
        volumen++;
        System.out.println("Se sube el volumen");
        if(volumen>100) {
            volumen = 100;
        }
    }

    public void bajarVolumen(){
        volumen--;
        System.out.println("Se baja el volumen");
        if(volumen<0) {
            volumen = 0;
        }
    }

    public void mostrarVolumen(){
        System.out.println("El volumen es "+volumen);
    }
}
