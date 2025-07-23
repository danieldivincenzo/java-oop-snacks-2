package snack5;

public class MissioneScientifica extends MissioneSpaziale{

    private String obiettivo;

    public MissioneScientifica(String nomeMissione, String obiettivo) {
        super(nomeMissione);
        this.obiettivo = obiettivo;
    }
    
    @Override
    public void stampaDettagli(){
        System.out.println("Il nome della missione è: " + getNomeMissione());
        System.out.println("L'id della missione è: " + getIdMissione());
        System.out.println("L'obiettivo della missione è: " + obiettivo);
    }
}
