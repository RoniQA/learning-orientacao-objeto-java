package aula_09_polimorfismo;

public class Goldfish extends Peixe{
    public String nome;

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
}
