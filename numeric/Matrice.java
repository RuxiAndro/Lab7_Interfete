package numeric;

public class Matrice {

    private Complex[][] a;

    private Fractie[][] b;

    private int rows;

    private int cols;

    Matrice(int i,int j)
    {
        a=new Complex[i][j];
        b=new Fractie[i][j];
        rows=i;
        cols=j;
    }

    public void setComplex(int i,int j,Complex x)
    {
        this.a[i][j]=x;
    }

    public void setFractie(int i,int j,Fractie x)
    {
        this.b[i][j]=x;
    }

    public void printMatriceComplexe()
    {
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++) {
                System.out.print(a[i][j].getReal());
                System.out.print(" + ");
                if(a[i][j].getImaginar() != 1)
                    System.out.print(a[i][j].getImaginar());
                System.out.print("j");
                System.out.print(", ");
            }
            System.out.println();
        }
    }

    public void adunareMatriceComplexe(Matrice a)
    {

        if(this.rows != a.rows || this.cols != a.cols)
        {
            System.out.println("Nu se poate");
            System.exit(1);
        }
        for(int i = 0; i < rows; i++)
            for(int j = 0; j < cols; j++)
                this.a[i][j]  = (Complex) this.a[i][j].adunare(a.a[i][j]);

    }

    public void scadereMatriceComplexe(Matrice a)
    {

        if(this.rows != a.rows || this.cols != a.cols)
        {
            System.out.println("Nu se poate");
            System.exit(1);
        }
        for(int i = 0; i < rows; i++)
            for(int j = 0; j < cols; j++)
                this.a[i][j]  = (Complex) this.a[i][j].scadere(a.a[i][j]);

    }

    public void inmultireMatriceComplexe(Matrice a)
    {

        if(this.rows != a.rows || this.cols != a.cols)
        {
            System.out.println("Nu se poate");
            System.exit(1);
        }
        for(int i = 0; i < rows; i++)
            for(int j = 0; j < cols; j++)
                this.a[i][j]  = (Complex) this.a[i][j].inmultire(a.a[i][j]);

    }

    public void adunareMatriceFractie(Matrice a)
    {
        if(this.rows != a.rows || this.cols != a.cols)
        {
            System.out.println("Nu se poate");
            System.exit(1);
        }
        for(int i = 0; i < rows; i++)
            for(int j = 0; j < cols; j++)
            {

                this.b[i][j]= (Fractie) this.b[i][j].adunare(a.b[i][j]);
            }
    }

    public void scadereMatriceFractie(Matrice a)
    {
        if(this.rows != a.rows || this.cols != a.cols)
        {
            System.out.println("Nu se poate");
            System.exit(1);
        }
        for(int i = 0; i < rows; i++)
            for(int j = 0; j < cols; j++)
            {

                this.b[i][j]= (Fractie) this.b[i][j].scadere(a.b[i][j]);
            }
    }

    public void inmultireMatriceFractie(Matrice a)
    {
        if(this.rows != a.rows || this.cols != a.cols)
        {
            System.out.println("Nu se poate");
            System.exit(1);
        }
        for(int i = 0; i < rows; i++)
            for(int j = 0; j < cols; j++)
            {

                this.b[i][j]= (Fractie) this.b[i][j].inmultire(a.b[i][j]);
            }
    }

    public void inmultireCuScalarMatriceFrcactie(int a)
    {
        for(int i = 0; i < rows; i++)
            for(int j = 0; j < cols; j++)
            {

                this.b[i][j]= this.b[i][j].inmultireCuScalar(a);
            }
    }

    public void printMatriceFractie()
    {
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++) {
                System.out.print(b[i][j].getNumarator());
                System.out.print(" / ");
                System.out.print(b[i][j].getNumitor());
                System.out.print("  ");
            }
            System.out.println();
        }
    }

}
