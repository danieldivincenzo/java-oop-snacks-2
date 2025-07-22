package snack2;

public class ContoRisparmio extends ContoBancario {
    public double tassoInteresse;

    
    public ContoRisparmio(String numeroConto, double tassoInteresse) {
        super(numeroConto);
        this.tassoInteresse = tassoInteresse;
    }

    public void applicaInteressi(){
        double interessi = getSaldo() * tassoInteresse / 100;
        deposita(interessi);
    }
}
