public class Luchador {
    private String nombre;
    private int vida;
    private int ataque;
    private int defensa;

    public Luchador(String nombre, int vida, int ataque, int defensa) {
       this.nombre=nombre;
       this.vida=vida;
       this.ataque=ataque;
       this.defensa=defensa;
    }

    public String getNombre(){return nombre;}
    public int getVida(){return vida;}
    public int getAtaque(){return ataque;}
    public int getDefensa(){return defensa;}


    public int ataca(){
        return this.ataque;
    }

    public boolean recibeDanho(int danhoRecibido) {
        int danhoFinal=danhoRecibido-this.defensa;
        if (danhoFinal<0) {
            danhoFinal=0;
        }

        this.vida-=danhoFinal;
        if (this.vida<0){
            this.vida=0;
        }

        System.out.println(this.nombre+" recibe "+danhoFinal+" de daño. Vida restante: "+this.vida);

        return this.vida<=0;
    }
}