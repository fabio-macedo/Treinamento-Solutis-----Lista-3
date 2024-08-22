package Lista_de_Exercicios_4.Abstracts;

public abstract class AnimalTerrestreAB extends AnimalAB{
    protected int qtdPatas;
    protected int qtdHorasDormidas = 6;

    public AnimalTerrestreAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int qtdPatas) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
        this.qtdPatas = qtdPatas;
    }
    public AnimalTerrestreAB(){}

    @Override
    public void moverse() {
        super.moverse();
        System.out.println("O animal percorreu " + distanciaPercorrida + " metros");
    }

    @Override
    public void dormir() {
        System.out.println("O animal dormiu " + qtdHorasDormidas + " horas");
    }
}
