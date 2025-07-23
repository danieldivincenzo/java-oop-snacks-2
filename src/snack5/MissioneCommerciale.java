package snack5;

public class MissioneCommerciale extends MissioneSpaziale {

    private String aziendaPartner;

    public MissioneCommerciale(String nomeMissione, String aziendaPartner) {
        super(nomeMissione);
        this.aziendaPartner = aziendaPartner;
    }
    
    @Override
    public void stampaDettagli(){
        System.out.println("Il nome della missione è: " + getNomeMissione());
        System.out.println("L'id della missione è: " + getIdMissione());
        System.out.println("L'azienda partner della missione è: " + aziendaPartner);
    }
}
