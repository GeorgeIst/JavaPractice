package project.testFormaGeometrica;

public class Triunghi extends FormaGeometrica {

    private int lungime;
    private int latime;
    private int lungime2;

    public Triunghi(int lungime, int latime, int lungime2) {
        this.lungime = lungime;
        this.latime = latime;
        this.lungime2 = lungime2;
    }
@Override
    public int getAria(){
        int aria=0;
        if(aria==0){
            aria = lungime * latime * lungime2;
        }return aria;


    }
}
