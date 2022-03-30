package aula_09_polimorfismo;

public class Canguru extends Mamifero{
    public String nome;

    @Override
    public void locomover(){
        System.out.println("Saltando");
    }
    public void usarBolsa(){
        System.out.println("Usando bolsa");
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
