package aula_08_heranca_01;

public class aula_08_pessoas {
    public static void main(String[] args) {
        //Pessoa p1 =new Pessoa();
        Visitantes v1 = new Visitantes();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        Bolsista b1 = new Bolsista();


        //p1.setNome("Pedro");
        v1.setNome("Juvenal");

        p3.setNome("Cláudio");
        p4.setNome("Fabiana");

        //p1.setSexo("Masculino");
        v1.setSexo("Masculino");

        p3.setSexo("Masculino");
        p4.setSexo("Feminino");

        //p1.setIdade(20);
        v1.setIdade(22);

        p3.setIdade(40);
        p4.setIdade(34);

        p2.setNome("Maria");
        p2.setIdade(18);
        p2.setSexo("Feminino");
        p2.setMat(1234);
        p2.setCurso("Informática");
        p2.pagarMensal();

        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("Masculino");
        b1.pagarMensal();

        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");


        System.out.println(v1.toString());
        System.out.println(b1.toString());
        //System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
