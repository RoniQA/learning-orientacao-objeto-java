package aula_06_relacionamento_entre_classes;

public class Lutador {
    //atributos
    private String name;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    //Métodos
    public void apresentar(){
        System.out.println("CHEGOU A HORA! apresentamos o lutador " + this.getName());
        System.out.println("Lutador: " + this.getName());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " anos");
        System.out.println(this.getAltura() + " m de altura");
        System.out.println("Pesando: " + this.getPeso() + "kg");
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
    }
    public void Status(){
        System.out.println(getName());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());

    }
    public void ganharluta(){
        setVitorias(getVitorias() + 1);
    }
    public void perderluta(){
        setDerrotas(getDerrotas() + 1);
    }
    public void empatarluta(){
        setEmpates(getEmpates() + 1);
    }

    //Métodos Especiais

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();

    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if(peso<52.2){
            this.categoria = "inválido";
        }else if (peso<=70.3){
            this.categoria = "Leve";
        }else if(peso>=83.9){
            this.categoria = "Médio";
        }else if (peso<=120.2){
            this.categoria = "Pesado";
        }else {
            this.categoria = "Invalido";
        }

    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public Lutador(String name, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.name = name;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;


    }

}
