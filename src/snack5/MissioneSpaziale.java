package snack5;

public class MissioneSpaziale {

    private String nomeMissione;

    private static int idMissione = 0;

    public MissioneSpaziale(String nomeMissione) {
        this.nomeMissione = nomeMissione;
        idMissione++;
    }

    public void stampaDettagli(){
        System.out.println("Il nome della missione è: " + nomeMissione);
        System.out.println("L'id della missione è: " + idMissione);
    }

    public String getNomeMissione() {
        return nomeMissione;
    }

    public static int getIdMissione() {
        return idMissione;
    }
}
