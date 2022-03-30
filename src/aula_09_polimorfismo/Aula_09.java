package aula_09_polimorfismo;

public class Aula_09 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro ca = new Cachorro();
        Cobra co   = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara arara = new Arara();

        System.out.println("================");
        m.setNome("Mamífero");
        m.setPeso(85.3f);
        m.setIdade(2);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirsom();

        System.out.println("================");
        r.setNome("Réptil");
        r.setPeso(0.84f);
        r.setIdade(3);
        r.setMembros(4);
        r.locomover();
        r.alimentar();
        r.emitirsom();

        System.out.println("===============");
        p.setNome("Peixe");
        p.setPeso(0.35f);
        p.setIdade(1);
        p.setMembros(0);
        p.locomover();
        p.alimentar();
        p.emitirsom();
        p.soltarBolha();

        System.out.println("===============");
        a.setNome("Ave");
        a.setPeso(0.53f);
        a.setIdade(1);
        a.setMembros(2);
        a.locomover();
        a.alimentar();
        a.emitirsom();
        a.fazerNinho();

        System.out.println("===============");
        c.setNome("Canguru");
        c.setPeso(114.4f);
        c.setMembros(5);
        c.locomover();
        c.alimentar();
        c.emitirsom();
        c.usarBolsa();

        System.out.println("===============");
        ca.setNome("Cachorro");
        ca.setPeso(8.5f);
        ca.setMembros(5);
        ca.locomover();
        ca.alimentar();
        ca.emitirsom();

        System.out.println("===============");
        co.setNome("Cobra");
        co.setPeso(3.7f);
        co.setMembros(0);
        co.locomover();
        co.alimentar();
        co.emitirsom();

        System.out.println("===============");
        t.setNome("Tartaruga");
        t.setPeso(2.8f);
        t.setMembros(5);
        t.locomover();
        t.alimentar();
        t.emitirsom();

        System.out.println("================");
        g.setNome("Goldfish");
        g.setPeso(0.1f);
        g.setMembros(3);
        g.locomover();
        g.alimentar();
        g.emitirsom();

        System.out.println("===============");
        arara.setNome("Arara");
        arara.setPeso(2.3f);
        arara.setMembros(5);
        arara.locomover();
        arara.alimentar();
        arara.emitirsom();



    }
}
