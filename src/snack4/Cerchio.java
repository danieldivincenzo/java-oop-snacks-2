package snack4;

public class Cerchio extends Figura {

    private double raggio;

    public Cerchio(double raggio) {
        this.raggio = raggio;
    }

    @Override
    public double calcolaArea(){
        return raggio * raggio *PI_GRECO;
         
    }
}
