package aula_09_polimorfismo;

public class Arara extends Ave{
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
