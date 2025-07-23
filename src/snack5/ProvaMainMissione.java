package snack5;

import static snack5.MissioneSpaziale.getIdMissione;

public class ProvaMainMissione {

    public static void main(String[] args) {
        MissioneSpaziale mSpaziale1 = new MissioneSpaziale("Apollo 1");
        mSpaziale1.stampaDettagli();

        System.out.println(" ");

        MissioneScientifica mScientifica1 = new MissioneScientifica("Space X", "Esplorare la superficie di venere");
        mScientifica1.stampaDettagli();

        System.out.println(" ");

        MissioneCommerciale mCommerciale1 = new MissioneCommerciale("Space Trade", "Nasa");
        mCommerciale1.stampaDettagli();

        System.out.println(" ");

        MissioneScientifica mScientifica2 = new MissioneScientifica("Space Y", "Esplorare i satelliti di Giove");
        mScientifica2.stampaDettagli();

        System.out.println(" ");

        MissioneSpaziale mSpaziale2 = new MissioneSpaziale("Apollo 2");
        mSpaziale2.stampaDettagli();

        System.out.println(" ");

        MissioneCommerciale mCommerciale2 = new MissioneCommerciale("Scambi Galattici", "Tesla");
        mCommerciale2.stampaDettagli();

        System.out.println(" ");

        System.out.println("Il numero totale di missioni è: " + getIdMissione());
    }
}
