package project.testFormaGeometrica;

public class Patrat extends  FormaGeometrica {
    private int lungime1;
    private int lungime;

    public Patrat(int latime, int lungime) {
        this.lungime1 = latime;
        this.lungime = lungime;
    }
@Override
    public int getAria(){
        int aria= 0;
        if(aria == 0){
            aria = lungime1 * lungime;

        }return aria;

    }
}
