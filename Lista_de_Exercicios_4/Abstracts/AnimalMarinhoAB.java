package Lista_de_Exercicios_4.Abstracts;

public abstract class AnimalMarinhoAB extends AnimalAB{
    protected int qtdHorasDormidas = 1;
    protected double qtdComida = 15;

    public AnimalMarinhoAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
    }

    public AnimalMarinhoAB(){}

    @Override
    public void moverse() {
        super.moverse();
        System.out.println("O " + nome+  " nadou " + distanciaPercorrida + " metros!");
    }

    @Override
    public void comer() {
        System.out.println("O "+ nome + " comeu " + qtdComida + " gramas de sua refeição!");
    }

    @Override
    public void dormir() {
        System.out.println("O " + nome+ " dormiu "+ qtdHorasDormidas + " hora");
    }
}
