package Lista_de_Exercicios_4;

import Lista_de_Exercicios_4.Animais.Cachorro;
import Lista_de_Exercicios_4.Animais.Leao;
import Lista_de_Exercicios_4.Animais.Pombo;

public class Application {
    public static void main(String[] args) {

        Pombo pombo = new Pombo("jose", "AVE", "AR", 0.25, 2, 2);
        Cachorro cao = new Cachorro("Cachorro");
        Leao leao = new Leao("Leão");

        leao.comer();

        cao.comer();
    }
}
