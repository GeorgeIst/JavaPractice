package project.arrayOfIntegers;

public class ArrayOfIntegers {
    public static void main(String[] args) {
        int[] arrayInt = {22, 33, 44, 55, 66, 77, 88, 99, 11, 18, 1, 2};

        forward(arrayInt);
        backwards(arrayInt);
        evenIntegers(arrayInt);
        divisibleByThreeIntegers(arrayInt);
        sumOfAll(arrayInt);
        firstFourInt(arrayInt);
        sumOfTheLastFife(arrayInt);
    }

    public static void forward(int[] ascendet) {
        System.out.println("Forward: ");
        for (int i = 0; i < ascendet.length; i++) {
            System.out.print(ascendet[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void backwards(int[] descendent) {
        System.out.println("Backwards: ");
        for (int i = descendent.length - 1; i >= 0; i--) {
            System.out.print(descendent[i]);
            System.out.print(" ");
        }
        System.out.println();

    }

    public static void evenIntegers(int[] nrPare) {
        System.out.println("Odd number:");
        for (int i = 0; i < nrPare.length; i++) {
            if (nrPare[i] % 2 == 0) {
                System.out.print(nrPare[i]);
                System.out.print(" ");
            }
        }
        System.out.println();

    }

    public static void divisibleByThreeIntegers(int[] nrImpare) {
        System.out.println("Divisible by 3: ");
        for (int i = 0; i < nrImpare.length; i++) {
            if (nrImpare[i] % 3 == 0) {
                System.out.print(nrImpare[i]);
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static void sumOfAll(int[] sum) {
        int suma = 0;
        System.out.println("The sum is: ");
        for (int i = 0; i < sum.length; i++) {
            suma += sum[i];
        }
        System.out.print(suma);
        System.out.println();

    }

    public static void firstFourInt(int[] firstFour) {
        System.out.println("The sum of the first four: ");
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += firstFour[i];
        }
        System.out.println(sum);
    }

    public static void sumOfTheLastFife(int[] lastFive) {
        System.out.println("Sum of the last five bigger than 2: ");
        int sum = 0;
        int counter = 0;
        for (int i = lastFive.length - 1; i >= 0; i--) {
            if(counter>4) break;
            if(lastFive[i] >= 3){
                sum += lastFive[i];
                counter++;
            }


        }
        System.out.println(sum);
    }
}

