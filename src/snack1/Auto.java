package snack1;

public class Auto extends Veicolo {
    private int numeroPorte;

    /* Costruttore */
    public Auto(String marca, int anno, int numeroPorte) {
        super(marca, anno);
        this.numeroPorte = numeroPorte;
    }

    /* Getter */
    public int getNumeroPorte() {
        return numeroPorte;
    }

    /* Setter */
    public void setNumeroPorte(int numeroPorte) {
        this.numeroPorte = numeroPorte;
    }

    public void stampaInfo(){
        System.out.println(getMarca() + " " + getAnno() + " " + getNumeroPorte());
    }

}

