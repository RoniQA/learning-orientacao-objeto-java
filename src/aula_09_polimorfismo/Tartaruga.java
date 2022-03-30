package aula_09_polimorfismo;

public class Tartaruga extends Reptil{
    public String nome;
    @Override
    public void locomover() {

        System.out.println("Andando lentamente");
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
}
