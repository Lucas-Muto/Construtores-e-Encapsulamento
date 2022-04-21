package Questao3.Questao8;

public class Celular {
    int bateriaTotal=100;
    int nivelBateria;

    Celular(int bateriaTotal, int nivelBateria){
        this.bateriaTotal=bateriaTotal;
        this.nivelBateria=nivelBateria;
    }

    Celular(int nivelBateria){

        this.nivelBateria=nivelBateria;

    }
    public void enviarMsg(){
        nivelBateria=nivelBateria-1;

    }
    
    public void imprimirBateria(){

        System.out.println(nivelBateria+"/"+bateriaTotal);
    }

    public void fazerLig(){
        new java.util.Timer().schedule(
        new java.util.TimerTask() {
            @Override
            public void run() {
                if(nivelBateria<=0){
                    System.out.println("Celular descarregou!");
                    System.exit(1);
                }
                nivelBateria=nivelBateria-5;
                imprimirBateria();
                
            }
        },
        5000,5000);
    }
    public static void main(String[] args){
        
        Celular c1=new Celular(90);
        c1.imprimirBateria();

        c1.enviarMsg();
        c1.enviarMsg();
        c1.enviarMsg();
        c1.enviarMsg();
        c1.imprimirBateria();
        c1.fazerLig();
        


    }
    
}
