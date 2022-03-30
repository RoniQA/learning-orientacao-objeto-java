package aula_09_polimorfismo;

public class Aula_09 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setPeso(85.3f);
        m.setIdade(2);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirsom();

        r.setPeso(0.84f);
        r.setIdade(3);
        r.setMembros(4);
        r.locomover();
        r.alimentar();
        r.emitirsom();

        p.setPeso(0.35f);
        p.setIdade(1);
        p.setMembros(0);
        p.locomover();
        p.alimentar();
        p.emitirsom();
        p.soltarBolha();

        a.setPeso(0.53f);
        a.setIdade(1);
        a.setMembros(2);
        a.locomover();
        a.alimentar();
        a.emitirsom();
        a.fazerNinho();


    }
}
