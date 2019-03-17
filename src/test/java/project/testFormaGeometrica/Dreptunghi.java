package project.testFormaGeometrica;

public class Dreptunghi extends FormaGeometrica {

    private int lungime;
    private int latime;

    public Dreptunghi(int lungime, int latime) {
        this.lungime = lungime;
        this.latime = latime;
    }
@Override
    public int getAria() {
        int aria = 0;
        if (aria == 0) {
            aria = latime * lungime;

        }return aria;
    }
}
