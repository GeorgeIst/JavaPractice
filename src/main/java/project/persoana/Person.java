package project.persoana;

public class Person {
    private int varsta;
    private String nume;
    private String sex;
    private String stareCivila;

    @Override
    public String toString() {
        return "MySerialize{" +
                "varsta=" + varsta +
                ", nume='" + nume + '\'' +
                ", sex='" + sex + '\'' +
                ", stareCivila='" + stareCivila + '\'' +
                '}';
    }

    public Person(int varsta, String nume, String sex, String stareCivila) {
        this.varsta = varsta;
        this.nume = nume;
        this.sex = sex;
        this.stareCivila = stareCivila;

    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStareCivila() {
        return stareCivila;
    }

    public void setStareCivila(String stareCivila) {
        this.stareCivila = stareCivila;
    }
}
