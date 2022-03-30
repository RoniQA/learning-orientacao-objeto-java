package aula_09_polimorfismo;

public class Cobra extends Reptil{
    public String nome;

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public void alimentar() {

        System.out.println("Comendo pequenos animais");
    }
}
