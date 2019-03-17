package project.nestedClass;

public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU(5000);
        CPU.Processor cpuProcessor = cpu.new Processor(2.3, "Intel");
        CPU.RAM ram = new CPU.RAM(16.0, "Blabla");
        cpuProcessor.getCache();
        ram.getClockSpeed();

    }




}
