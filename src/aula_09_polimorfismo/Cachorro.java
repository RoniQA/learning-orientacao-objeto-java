package aula_09_polimorfismo;

public class Cachorro extends Mamifero{
    public String nome;
    @Override
    public void locomover(){
        System.out.println("Andando");
    }
    @Override
    public void emitirsom() {
        System.out.println("Latindo...Au! Au! Au!");
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
