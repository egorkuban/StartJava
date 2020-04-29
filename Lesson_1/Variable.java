public class Variable {
    public static void main(String[] args) {
        byte numberCpu = 2;
        short ramMb = 8192;
        int graphicsCardMsiMb = 2048;
        long hardDiskMemoryKb = 1_038_090_240L;
        float cpuChz = 3.4f;
        double processorSpeed = 2.07;
        char motherBoard = 'M';
        boolean notebook = false;
        String cpu = "Intel (R) Core (TM) i3-3240";

        System.out.println("Number CPU " + numberCpu);
        System.out.println("RAM Mb " + ramMb);
        System.out.println("graphics card Mb " + graphicsCardMsiMb);
        System.out.println("The average processor speed " + processorSpeed);
        System.out.println("CPU frequency " + cpuChz);
        System.out.println("Hard Disk Memory Kb " + hardDiskMemoryKb);
        System.out.println("MSI mother Board " + motherBoard);
        System.out.println("notebook " + notebook);
        System.out.println("The processor name " + cpu);
    }
    
}