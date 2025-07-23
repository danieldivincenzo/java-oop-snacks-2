package snack4;

public class Rettangolo extends Figura {

    private double base;

    private double altezza;

    public Rettangolo(double altezza, double base) {
        this.altezza = altezza;
        this.base = base;
    }

    @Override
    public double calcolaArea(){
        return base * altezza;
    }

    public final void stampaTipo(){
        System.out.println("Sono un rettangolo");
    }
}
