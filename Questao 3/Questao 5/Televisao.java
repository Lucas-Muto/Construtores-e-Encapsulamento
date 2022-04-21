package Questao3.Questao5;
import java.util.Scanner;
public class Televisao {
    boolean estado;
    int volume;
    int canal;
    boolean mute;


    Televisao(int canal,int volume, boolean mute, boolean estado){
        this.canal=canal;
        this.volume=volume;
        this.mute=mute;
        this.estado=estado;
    }

    public void mudarCanal(){
        System.out.println("1=Avançar 2=Voltar 3=Insira o Canal");
        Scanner teclado = new Scanner(System.in);
        int n;
        int k;
        n=teclado.nextInt();
        if(n==1){
            canal=canal+1;
        }
        else if(n==2){
            canal=canal-1;
        }
        else if(n==3){
            k=teclado.nextInt();
            canal=k;   
        }
    }

    public void ligarDesligar(){
        estado= !estado;
    }

    public void muteTV(){
       mute=!mute;
    }

    public void imprimir(){
        System.out.println("Ligado:"+estado);
        System.out.println("Volume:"+volume);
        System.out.println("Canal:"+canal);
        System.out.println("Silencioso:"+mute);
    }


}
