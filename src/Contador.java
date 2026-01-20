public class Contador {
    private int valor;


    public Contador(int valorInicial){
        if(valorInicial<0){
            this.valor=0;
            System.out.println("El valor inicial no puede ser negativo");
        }
        this.valor=valorInicial;
    }

    public void aumentarValor() {
        this.valor++;
        System.out.println("Contador incrementado");

    }public void diminuirValor (){
        if (this.valor>0){
            this.valor--;
            System.out.println("Contador decrementado");
        }else{
            System.out.println("Introduczca un valor positivo");
        }
    }public void reiniciar(){
        this.valor=0;
        System.out.println("Contador reiniciado a 0");

    }
    public void mostrarValor(){
        System.out.println("El valor actual del contador es "+this.valor);
    }


}
