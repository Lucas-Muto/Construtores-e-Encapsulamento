package Questao3.Questao6;


public class Baralho {
    Carta deck[]=new Carta[52];
    boolean sorted;
    public void imprimir(){
        for(int i=0;i<52;i++){
            System.out.println("Valor:"+deck[i].valor);
            System.out.println("Naipe:"+deck[i].naipe);
        }
    }
    
    public void setValores(){
        int j=0;
        int k=1;
        for(int i=1;i<=4;i++){
            while(k<=13){
                deck[j].valor=k;
                k++;
                j++;
            }
            k=1;
        }
    }
    public void getValores(){

    }

    public void setNaipes(){
        for(int i=0;i<52;i++){
            if(i<13){
                deck[i].naipe="espadas";
            }
            else if(i<26){
                deck[i].naipe="copas";

            }
            else if(i<39){
                deck[i].naipe="paus";
            }
            else{
                deck[i].naipe="ouros";
            }
        }
    }

}
