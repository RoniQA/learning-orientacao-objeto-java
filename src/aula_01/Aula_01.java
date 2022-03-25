package aula_01;

public class Aula_01 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();

        c1.modelo = "esferográfica";
        c1.cor = "azul";
        c1.ponta= 0.5f;
        c1.destampar();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();

        c2.modelo = "tinteiro";
        c2.cor = "preto";
        c2.ponta = 1.0f;
        c2.tampar();
        c2.status();
        c2.rabiscar();

    }
}

