package Questao1.CarroLoc;

public class CarroLoc{
    private String placa;
    private int ano;
    private String marca;
    private String modelo;
    private double precoDiaria;
    private float seguro;



    public CarroLoc(int ano, String marca,String modelo){
        this.ano=ano;
        this.marca=marca;
        this.modelo=modelo;

    }
    //Verifica se o carro esta disponivel
    public void dispinibilidade(){};


    //Calcula preço final do carro
    public double calcularPreco(int dias){

        return precoDiaria*dias+seguro;
    };


    //Mostra a lista de carros da locadora
    public void catalogo(){};


