package snack1;

public class Veicolo {
    private String marca;

    private int anno;

    /* Costruttore */
    public Veicolo(String marca, int anno) {
        this.marca = marca;
        this.anno = anno;
    }

    /* Getters */
    public String getMarca() {
        return marca;
    }

    public int getAnno() {
        return anno;
    }

    /* Setters */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public void stampaInfo(){
        System.out.println(getMarca() + " " + getAnno());
    }
    
}
