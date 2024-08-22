package Lista_de_Exercicios_4.Animais;

import Lista_de_Exercicios_4.Abstracts.AnimalVoadorAB;

public class Pombo extends AnimalVoadorAB {

    public Pombo(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int qtdAsas, double envergaduraAsas, int qtdPatas) {
        super(nome, tipoAnimal, idade, habitat, altura, peso, qtdAsas, envergaduraAsas, qtdPatas);
    }

    public Pombo(String nome, String tipoAnimal, String habitat, double altura, double peso, int qtdPatas) {
        super(nome, tipoAnimal, habitat, altura, peso, qtdPatas);
    }

    public Pombo(String nome){
        this.nome = nome;
    }


}
