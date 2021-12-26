package entities;


public class ContaCorrente {

    private int numero;
    private String titular;
    private double saldo;
    static int qtdcontas = 0;

    public ContaCorrente(String titular) {
        this.titular = titular;
        qtdcontas++;
        this.numero = qtdcontas;
        this.saldo = 0;
    }


    public void DadosBancarios(){
        System.out.println("");
        System.out.println("-- Dados Bancários --");
        System.out.println("- Números: "+ this.numero);
        System.out.println("- Titular: "+ this.titular);
        System.out.println("- Saldo: "  + this.saldo);
        System.out.println(" ---Fim Dados Bancários ---");
        System.out.println("");
    }

    
    public void Depositar(double Valor){
        System.out.println("");
        System.out.println("--- Realizando Depósito ---");
        System.out.println("- Saldo Anterior: "+ this.saldo);

        this.saldo+= Valor;

        System.out.println("--Saldo Posterior: "+ this.saldo);
        System.out.println("--- Fim do Depósito ---");
        System.out.println("");

    }

    public void Sacar(double Valor){
        System.out.println("");
        System.out.println("--- Realizando Saque ---");
        System.out.println("- Saldo Anterior: "+ this.saldo);

        if(Valor <= this.saldo){
            this.saldo -= Valor;
            System.out.println("- Saldo Posterior: "+ this.saldo);
        }
        else {
            System.out.println("-- Saldo Insuficiente --");
        }
        System.out.println("--- Fim Saque ---");
    }

    public void Mostrar(){
        System.out.println("");
        System.out.println("--- Saldo Atualizado---");
        System.out.println("- R$ "+ this.saldo);
    }

}
