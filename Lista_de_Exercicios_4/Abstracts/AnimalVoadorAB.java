package Lista_de_Exercicios_4.Abstracts;

public abstract class AnimalVoadorAB extends AnimalAB{
    protected int qtdAsas;
    protected double envergaduraAsas;
    protected int qtdPatas;
    protected int qtdHorasDormidas = 10;
    protected double qtdComida = 100;

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
        System.out.println("O " + nome +" voou " + distanciaPercorrida + " metros!");
    }


    @Override
    public void comer() {
        System.out.println("O "+ nome + " comeu " + qtdComida + " gramas de sua refeição!");
    }


    @Override
    public void dormir() {
        System.out.println("O " + nome + " dormiu " + qtdHorasDormidas + " horas");
    }
}
