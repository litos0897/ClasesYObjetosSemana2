import java.lang.foreign.PaddingLayout;

public class Ascensor {
    private int plantaActual;

    public Ascensor(int plantaInicial){
        this.plantaActual=plantaInicial;
        this.plantaActual=0;
        System.out.println("La planta inicial es la planta "+plantaInicial);
    }

    public void subir(){
        plantaActual++;
        System.out.println("Sube 1 planta");
        if(plantaActual>10){
            plantaActual=10;
        }
    }
    public void bajar(){
        plantaActual--;
        System.out.println("Baja 1 planta");
        if (plantaActual<0){
            plantaActual=0;
        }
    }

    public void mostrarPlanta(){
        System.out.println("El ascensor está en la planta "+plantaActual);
    }


}

