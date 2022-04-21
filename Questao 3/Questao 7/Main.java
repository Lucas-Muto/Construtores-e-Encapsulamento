package Questao3.Questao7;

public class Main {
    public static void main(String[] args){
        Pedido p1=new Pedido("cheque");

        p1.item[0]=new Produto("alimento",3.10,3);
        p1.item[1]=new Produto();
        p1.imprimir();
    }
}
