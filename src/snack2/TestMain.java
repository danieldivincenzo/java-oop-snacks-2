package snack2;

public class TestMain {
    public static void main(String[] args) {
        /* ContoBancario c1 = new ContoBancario("123456789");
        System.out.println(c1.getSaldo());
        c1.deposita(100.00);
        System.out.println(c1.getSaldo());
        c1.preleva(50.00);
        System.out.println(c1.getSaldo()); */

        ContoRisparmio cr1 = new ContoRisparmio("123456789", 10);

        System.out.println(cr1.getSaldo());

        cr1.deposita(1000);

        System.out.println(cr1.getSaldo());

        cr1.applicaInteressi();

        System.out.println(cr1.getSaldo());
        
    }
}
