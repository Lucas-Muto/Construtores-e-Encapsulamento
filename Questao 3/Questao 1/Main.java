package Questao3.Questao1;

public class Main {
    public static void main(String[] args){

        Contato contato1=new Contato("999000000","carla","carla@gmail.com");
        Contato contato2=new Contato("999000001","lucas","lucasmuto@id.uff.br");
        Agenda agenda1=new Agenda();


        agenda1.adicionarContato(contato1);
        agenda1.imprimir();
        System.out.println();

        agenda1.adicionarContato(contato2);
        agenda1.imprimir();
        System.out.println();

        agenda1.removerContato(contato1);
        agenda1.imprimir();





    }
}
