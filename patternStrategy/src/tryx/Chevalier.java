package tryx;

public class Chevalier extends Personnage{
    public Chevalier(){
        setArme(new ComportementArcEtfleches());
    }
    @Override
    public void Combattre(){
         ComporetementArme.utiliserArme();
    }
}
