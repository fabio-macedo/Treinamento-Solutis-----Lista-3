package Lista_de_Exercicios_4.Abstracts;

import Lista_de_Exercicios_4.Interface.AnimalIF;

import java.util.Scanner;

public abstract class AnimalAB implements AnimalIF {
    protected String nome;
    protected String tipoAnimal;
    protected int idade;
    protected String habitat;
    protected double altura;
    protected double peso;

    protected double qtdComida;
    protected double distanciaPercorrida;


    public AnimalAB(){}

    public AnimalAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.idade = idade;
        this.habitat = habitat;
        this.altura = altura;
        this.peso = peso;
    }

    public AnimalAB(String nome, String tipoAnimal, String habitat, double altura, double peso) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.habitat = habitat;
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public void moverse(){
        System.out.println("Qual a distância percorrida em metros?");
        this.distanciaPercorrida = new Scanner(System.in).nextInt();
    };

    @Override
    public abstract void comer();

    @Override
    public abstract void dormir();

    @Override
    public String toString() {
        return super.toString();
    }
}
