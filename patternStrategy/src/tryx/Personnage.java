package tryx;

public abstract class Personnage {
    public comportementArme ComporetementArme;

    public abstract void Combattre() ;



    public void setArme(comportementArme comportementArme) {
        this.ComporetementArme = comportementArme;
    }
}