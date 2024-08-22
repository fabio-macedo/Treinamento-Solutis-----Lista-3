package Lista_de_Exercicios_4.Animais;

import Lista_de_Exercicios_4.Abstracts.AnimalTerrestreAB;

import java.util.Scanner;

public class Gato extends AnimalTerrestreAB {


    public Gato(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int qtdPatas) {
        super(nome, tipoAnimal, idade, habitat, altura, peso, qtdPatas);
    }

    @Override
    public void comer() {
        System.out.println("Quantos gramas de refeição o "+ tipoAnimal +" comeu em gramas?");
        qtdComida = new Scanner(System.in).nextDouble();
    }


}
