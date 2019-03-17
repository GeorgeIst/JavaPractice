package project.testFormaGeometrica;

public class MagazinDeVopsea  {

    public double cantitateTotalaDeVopsea(FormaGeometrica[] formeGeometrice){
        double suma= 0;
        for(FormaGeometrica x : formeGeometrice){
            suma = suma+x.getAria();

        }return suma;


    }
}
