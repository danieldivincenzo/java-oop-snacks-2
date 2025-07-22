package snack2;

public class ContoBancario {
    private double saldo;

    private String numeroConto;

    public ContoBancario(String numeroConto) {
        this.saldo = 0;
        this.numeroConto = numeroConto;
    }

    public void deposita(double importo){
        if (importo > 0){
            this.saldo += importo;
        }else {
            System.out.println("Non puoi depositare un importo negativo o uguale a 0");
        }
    }

    public void preleva(double importo){
        if (importo > 0 && importo <= saldo){
            this.saldo -= importo;
        }else {
            System.out.println("Non puoi prelevare un importo negativo o maggiore del saldo");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
