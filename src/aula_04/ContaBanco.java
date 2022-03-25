package aula_04;

public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    //Métodos personalizados
    public void estadoAtual(){
        System.out.println("---------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Usuáario: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("---------------------------------");

    }
    public void abirConta(String t){
       this.setTipo(t);
       this.setStatus(true);
       if (t=="CC"){
            this.setSaldo(50);
       }else if(t=="CP"){
           this.setSaldo(150);
       }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta(){
        if(this.getSaldo()>0){
            System.out.println("A conta não pode ser fechada poque ainda tem saldo");
        }else if (this.getSaldo()<0){
            System.out.println("A conta não pode ser fechada porque possui débitos");
        }else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositar(float v){
        if (this.getStatus()==true){
            this.setSaldo(getSaldo()+v);
            System.out.println("Depósito realizado com sucesso na conta de "+getDono());
        }else {
            System.out.println("Impossível depositar em uma conta fecchada!");
        }
    }
    public void sacar(float v){
        if (this.getStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + getDono());
            }
            else {
                System.out.println("Saldo insuficiente para saque");
            }

            }
        else{
            System.out.println("Ipossível efetuar saque em uma conta fechada!");
        }
    }
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC"){
            v = 12;
        }
        else if(this.getTipo() == "CP") {
            v = 20;
        }
        if (getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso!");
        }
        else {
            System.out.println("Impossível pagar uma conta fechada!");
        }
    }

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
