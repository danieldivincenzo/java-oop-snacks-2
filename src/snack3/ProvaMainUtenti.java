package snack3;

public class ProvaMainUtenti {
    public static void main(String[] args) {
        Utente u1 = new Utente("Giorgio");
        System.out.println(Utente.getNumeroUtenti());

        Utente u2 = new Utente("Marco");
        System.out.println(Utente.getNumeroUtenti());

        Utente u3 = new Utente("Sara");
        System.out.println(Utente.getNumeroUtenti());
    }
}
