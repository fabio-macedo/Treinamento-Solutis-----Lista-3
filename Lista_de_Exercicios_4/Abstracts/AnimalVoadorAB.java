package Lista_de_Exercicios_4.Abstracts;

import java.util.Scanner;

public abstract class AnimalVoadorAB extends AnimalAB{
    protected int qtdAsas;
    protected double envergaduraAsas;
    protected int qtdPatas;
    protected int qtdHorasDormidas = 10;

    public AnimalVoadorAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int qtdAsas, double envergaduraAsas, int qtdPatas) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
        this.qtdAsas = qtdAsas;
        this.envergaduraAsas = envergaduraAsas;
        this.qtdPatas = qtdPatas;
    }

    public AnimalVoadorAB(String nome, String tipoAnimal, String habitat, double altura, double peso, int qtdPatas) {
        super(nome, tipoAnimal, habitat, altura, peso);
        this.qtdPatas = qtdPatas;
    }
    public AnimalVoadorAB(){}

    @Override
    public void moverse() {
        super.moverse();
        System.out.println("O animal voou " + distanciaPercorrida + " metros!");
    }

    @Override
    public void comer() {
    }

    @Override
    public void dormir() {
        System.out.println("A ave dormiu " + qtdHorasDormidas + " horas");
    }
}
