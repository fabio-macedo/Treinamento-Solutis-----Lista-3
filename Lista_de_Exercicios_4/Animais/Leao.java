package Lista_de_Exercicios_4.Animais;

import Lista_de_Exercicios_4.Abstracts.AnimalTerrestreAB;

import java.util.Scanner;

public class Leao extends AnimalTerrestreAB {


    public Leao(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int qtdPatas) {
        super(nome, tipoAnimal, idade, habitat, altura, peso, qtdPatas);
    }
    public Leao(String tipoAnimal){
        this.tipoAnimal = tipoAnimal;
    }

    @Override
    public void comer() {
        System.out.println("Quanto de refeição o "+ tipoAnimal +" comeu em Quilos?");
        qtdComida = new Scanner(System.in).nextDouble();
    }

}
