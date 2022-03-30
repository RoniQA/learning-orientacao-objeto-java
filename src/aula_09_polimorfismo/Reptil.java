package aula_09_polimorfismo;

public class Reptil extends Animal{
    private String nome;
    private String corEscama;

    @Override
    public void locomover() {

        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {

        System.out.println("Comendo vegetais e insetos");
    }

    @Override
    public void emitirsom() {

        System.out.println("Som de réptil");
    }

    public String getCorEscama() {

        return corEscama;
    }

    public void setCorEscama(String corEscama) {

        this.corEscama = corEscama;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        System.out.println(getNome());
    }
}
