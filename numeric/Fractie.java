package numeric;

public class Fractie implements Numeric {

    private int numarator;

    private int numitor;

    Fractie(int x,int y)
    {
        this.numarator=x;
        this.numitor=y;
    }

    public int getNumarator() {
        return numarator;
    }

    public void setNumarator(int numarator) {
        this.numarator = numarator;
    }

    public int getNumitor() {
        return numitor;
    }

    public void setNumitor(int numitor) {
        this.numitor = numitor;
    }

    public Numeric adunare(Numeric a)
    {
        Fractie f=(Fractie) a;
        return new Fractie(this.getNumarator() * f.getNumitor() + this.getNumitor() * f.getNumarator(),this.getNumitor() * f.getNumitor());
    }

    public Numeric scadere(Numeric a)
    {
        Fractie f=(Fractie) a;
        return new Fractie(this.getNumarator() * f.getNumitor() - this.getNumitor() * f.getNumarator(),this.getNumitor() * f.getNumitor());
    }

    public Numeric inmultire(Numeric a)
    {
        Fractie f=(Fractie) a;
        return new Fractie(this.getNumarator() * f.getNumarator(),this.getNumitor() * f.getNumitor());
    }

    public Fractie inmultireCuScalar(int a)
    {
        return new Fractie(this.getNumarator() * a, this.getNumitor());
    }
}
