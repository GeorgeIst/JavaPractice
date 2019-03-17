package project.testFormaGeometrica;

public class Cerc extends FormaGeometrica {

    static final double PI = Math.PI;
    double raza;

    @Override
    public String toString() {
        return "Cerc{" +
                "raza=" + raza +
                '}';
    }

    public Cerc(double raza) {
        this.raza = raza;
    }
  @Override
    public int getAria(){
        if(raza == 0){
            this.raza = PI * raza * raza;
        }return (int) raza;

    }

}
