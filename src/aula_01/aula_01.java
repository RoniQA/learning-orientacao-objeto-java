package aula_01;

public class aula_01 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();

        c1.modelo = "esferográfica";
        c1.cor = "azul";
        c1.ponta= 0.5f;
        c1.destampar();
        c1.status();
        c1.rabiscar();

    }
}

