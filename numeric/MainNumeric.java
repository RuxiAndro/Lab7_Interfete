package numeric;

public class MainNumeric {
    public static void main(String[] args) {
        Matrice a = new Matrice(2, 2 );
        a.setComplex(0, 0, new Complex(1, 1));
        a.setComplex(0, 1, new Complex(2, 5));
        a.setComplex(1, 0, new Complex(5, 7));
        a.setComplex(1, 1, new Complex(3, 1));

        Matrice b = new Matrice(2, 2 );

        b.setComplex(0, 0, new Complex(1, 1));
        b.setComplex(0, 1, new Complex(2, 5));
        b.setComplex(1, 0, new Complex(3, 7));
        b.setComplex(1, 1, new Complex(4, 1));

      /*  a.printMatriceComplexe();
        System.out.println("\n");
        b.printMatriceComplexe();
        System.out.println("\n");
        a.adunareMatriceComplexe(b);
        a.printMatriceComplexe();*/

        Matrice x = new Matrice(2, 2 );
        x.setFractie(0, 0, new Fractie(1, 1));
        x.setFractie(0, 1, new Fractie(2, 5));
        x.setFractie(1, 0, new Fractie(5, 7));
        x.setFractie(1, 1, new Fractie(3, 1));

        Matrice y = new Matrice(2, 2 );

        y.setFractie(0, 0, new Fractie(1, 1));
        y.setFractie(0, 1, new Fractie(2, 5));
        y.setFractie(1, 0, new Fractie(3, 7));
        y.setFractie(1, 1, new Fractie(4, 1));

        x.printMatriceFractie();
        System.out.println("\n");
        y.printMatriceFractie();
        System.out.println("\n");
       // x.adunareMatriceFractie(y);
        //x.scadereMatriceFractie(y);
       // x.inmultireMatriceFractie(y);
        x.inmultireCuScalarMatriceFrcactie(2);
        x.printMatriceFractie();

}
}
