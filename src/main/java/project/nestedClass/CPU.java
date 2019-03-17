package project.nestedClass;

public class CPU {
    private int price;

    public CPU(int price) {
        this.price = price;
    }

    public class Processor {
        private double cores;
        private String manufacture;

        public Processor(double cores, String manufacture) {
            this.cores = cores;
            this.manufacture = manufacture;
        }

        public void getCache() {
            System.out.println("Cache");

        }
    }

    public static  class RAM {
        private double memory;
        private String manufacturer;

        public RAM(double memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        public void getClockSpeed() {
            System.out.println("Clock Speed");

        }
    }


}
