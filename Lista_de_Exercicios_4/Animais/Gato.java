package Lista_de_Exercicios_4.Animais;

import Lista_de_Exercicios_4.Abstracts.AnimalTerrestreAB;

import java.util.Scanner;

public class Gato extends AnimalTerrestreAB {


    public Gato(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int qtdPatas) {
        super(nome, tipoAnimal, idade, habitat, altura, peso, qtdPatas);
    }

    public Gato(String nome){
        this.nome = nome;
    }

    @Override
    public void comer() {
        System.out.println("Quanto de sua refeição o "+ nome +" comeu em gramas?");
        qtdComida = new Scanner(System.in).nextDouble();
        System.out.println("O " + nome + " comeu " + qtdComida + " gramas de sua refeição");

    }


}
