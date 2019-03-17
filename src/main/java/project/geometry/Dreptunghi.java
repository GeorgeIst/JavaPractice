package project.geometry;

public class Dreptunghi {
    private int lungime;
    private int latime;

    public Dreptunghi(int lungime, int latime) {
        this.lungime = lungime;
        this.latime = latime;
    }

    public int getLungime() {
        return lungime;
    }

    public void setLungime(int lungime) {
        this.lungime = lungime;
    }

    public int getLatime() {
        return latime;
    }

    public void setLatime(int latime) {
        this.latime = latime;
    }

    public int calculeazaArie(){
        int arie = 0;
        if(arie == 0){
            arie = lungime * latime;

        }return arie;
    }
    public int calculeazaPerimetru(){
        int perimetru = 0;
        if(perimetru == 0){
            perimetru = 2 *(lungime + latime);
        }return  perimetru;
    }
}
