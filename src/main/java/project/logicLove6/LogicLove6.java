package project.logicLove6;

public class LogicLove6 {
    public boolean love6(int a, int b) {
        boolean result = false;
        if (a == 6 || b == 6) {
            result = true;

        } if (a - b == 6 || b - a == 6) {
            result = true;

        } if(6==a+b){
            result = true;

        }
        return result;


    }

}

