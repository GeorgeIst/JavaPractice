package project.testFormaGeometrica;

public class Generic <T> {
    T data1;
    T data2;

    @Override
    public String toString() {
        return "Generic{" +
                "data1=" + data1 +
                ", data2=" + data2 +
                '}';
    }

    public Generic(T data1, T data2) {
        this.data1 = data1;
        this.data2 = data2;
    }
    public void something(){
        System.out.println(data1 + "---" + data2);
    }
}
