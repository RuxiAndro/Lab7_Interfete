package numeric;

public class Complex implements Numeric{
    private int re;
    private int im;

    Complex(int i, int j)
    {
        this.re = i;
        this.im = j;
    }

    public void setReal(int x)
    {
        this.re = x;
    }
    public void setImaginar(int x)
    {
        this.im = x;
    }
    public int getReal()
    {
        return re;
    }
    public int getImaginar()
    {
        return im;
    }

    public Numeric adunare(Numeric a)
    {
        Complex c=(Complex)a;
        return new Complex(this.getReal() + c.getReal(), this.getImaginar() + c.getImaginar());
    }

    public Numeric scadere(Numeric a)
    {
        Complex c=(Complex)a;
        return new Complex(this.getReal() - c.getReal(),this.getImaginar()-c.getImaginar());
    }

    public Numeric inmultire(Numeric a)
    {
        Complex c=(Complex)a;
        return new Complex(this.getReal() * c.getReal() - this.getImaginar() * c.getImaginar(), this.getReal() * c.getImaginar() + this.getImaginar() * c.getReal());
    }
}
