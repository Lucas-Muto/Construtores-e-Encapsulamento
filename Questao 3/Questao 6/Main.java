package Questao3.Questao6;

public class Main {
    public static void main(String[] args){
        Baralho bar1=new Baralho();
        for(int i=0;i<52;i++){
            bar1.deck[i]=new Carta();
        }

        bar1.setNaipes();
        bar1.setValores();
        bar1.imprimir();

    }
}
