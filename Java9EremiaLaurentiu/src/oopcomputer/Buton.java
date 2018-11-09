/*
 * Clasa buton din care vom creea butoanele
 */
package oopcomputer;

/**
 *
 * @author gheor
 */
public class Buton {
    
    private Character simbol;
    private Carcasa stapana;
    
    public Buton(Character noulSimbol){
        simbol = noulSimbol;
    }
    public Buton(Character noulSimbol, Carcasa nouaCarcasa){
        simbol = noulSimbol;
        stapana = nouaCarcasa;
    }

    public Character getSimbol() {
        return simbol;
    }

    public void setSimbol(Character simbol) {
        this.simbol = simbol;
    }

    public Carcasa getStapana() {
        return stapana;
    }

    public void setStapana(Carcasa stapana) {
        this.stapana = stapana;
    }

    public void apasa(){
    System.out.println("A fost apasat: " + simbol);
    stapana.getEcran().setAfisaj(simbol.toString());
    }
}
