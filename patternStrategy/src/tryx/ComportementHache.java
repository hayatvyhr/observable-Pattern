package tryx;

public abstract class ComportementHache implements comportementArme {
    @Override
    public void utiliserArme() {
        System.out.println("methode utiliser comportement 1");
    }
}
