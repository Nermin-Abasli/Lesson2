package org.example.structural;

public class Facade {
}
class Cpu{
    void star(){
        System.out.println("Cpu start");
    }
}
class Memory{
    void load(){
        System.out.println("Memory load");
    }
}
class ComputerFacade{
    private Cpu cpu=new Cpu();
    public Memory memory=new Memory();
    public void startComputer(){
        cpu.star();
        memory.load();
        System.out.println("Computer started");
    }
    public static void  main(String[] args){
        ComputerFacade computerFacade=new ComputerFacade();
        computerFacade.startComputer();
    }
}
