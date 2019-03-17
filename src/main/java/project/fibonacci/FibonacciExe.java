package project.fibonacci;

public class FibonacciExe {
    public static void main(String[] args){

    }

    public int fibonaci(int nPosition) {
        if(nPosition == 0 || nPosition == 1){
            return nPosition;
        }
        return fibonaci(nPosition-1)+(fibonaci(nPosition-2));



    }
}
