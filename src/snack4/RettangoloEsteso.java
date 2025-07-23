package snack4;

public class RettangoloEsteso extends Rettangolo {

    public RettangoloEsteso(double altezza, double base) {
        super(altezza, base);
    }

    @Override
    public void stampaTipo(){
        System.out.println("Sono un rettangolo");
    }
}
