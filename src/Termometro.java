public class Termometro {
    private double temperatura;

    public Termometro(int temperatura){
        this.temperatura=0;
    }

    public void subir (int aumentar){
        if (aumentar>0){
            temperatura+=aumentar;
        }
        if (temperatura>50){
            temperatura=50;
        }
    }

    public void bajar (int reducir){
        if (reducir>0){
            temperatura-=reducir;
        }
        if (temperatura<-50){
            temperatura=-50;
        }
    }

    public void mostrarTemperatura(){
        System.out.println("La temperatura actual es de "+temperatura+" grados");
    }


}
