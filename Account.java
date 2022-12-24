public class Account {
    private Integer numero;
    private String Correntista;
    private Double saldo;

    public Account(){

    }
    

    public Account(Integer numero, String correntista) {
        this.numero = numero;
        Correntista = correntista;
    }


    public Account(Integer numero, String correntista, Double saldo) {
        this.numero = numero;
        Correntista = correntista;
        this.saldo = saldo;
    }


    public Integer getNumero() {
        return numero;
    }


    public void setNumero(Integer numero) {
        this.numero = numero;
    }


    public String getCorrentista() {
        return Correntista;
    }


    public void setCorrentista(String correntista) {
        Correntista = correntista;
    }


    public Double getSaldo() {
        return saldo;
    }


    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public void deposit(Double deposito){
        saldo += deposito;
    }
    public void saque(Double deposito){
        saldo -= deposito;
    }


    @Override
    public String toString() {
        return "Conta Corrente \nNumero: " + numero + " \nCorrentista: " + Correntista + " \nSaldo:" + saldo;
    }
    
    
}
