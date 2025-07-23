package snack3;

public class Utente {

    private String nome;

    private static int numeroUtenti;

    public Utente(String nome) {
        this.nome = nome;
        numeroUtenti++;
    }

    public static int getNumeroUtenti() {
        return numeroUtenti;
    }
    
}
