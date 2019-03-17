package project.geometry;

public class Cerc {

    private double raza;

    public Cerc(int raza) {
        this.raza = raza;
    }

    public double getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }

    public double calculeazaAri(){
        double aria = 0;
        if(aria == 0){
            aria = Math.PI * raza * raza;
        }return  aria;

    }
    public double calculeazaCircumferinta(){
        double circumferinta = 0;
        if(circumferinta == 0){
            circumferinta = 2 * Math.PI * raza;
        }return circumferinta;

    }
}
