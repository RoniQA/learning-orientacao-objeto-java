package aula_04;

public class Aula_04 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1234);
        p1.setDono("Episcopaldo");
        p1.abirConta("CC");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(4321);
        p2.setDono("Vladiscova");
        p2.abirConta("CP");

        p1.depositar(300);
        p2.depositar(500);

        p1.sacar(350);
        p2.sacar(100);

        p1.fecharConta();

        p1.estadoAtual();
        p2.estadoAtual();

    }
}
