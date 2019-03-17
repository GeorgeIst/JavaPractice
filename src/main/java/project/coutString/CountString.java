package project.coutString;

public class CountString {
    public static void main(String[] args) {
        String numarCuvinte = "Mama are mere";
        numarCaracter(numarCuvinte);
        System.out.println(numarCaracter(numarCuvinte));


    }

    private static int numarCaracter(String numar) {
        int count = 1;
        for (int i = 0; i < numar.length(); i++) {
            if (" ".equals(String.valueOf(numar.charAt(i)))){

                count++;

            }


        }return count;


    }

}
