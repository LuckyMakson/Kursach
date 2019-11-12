package itschool.classes;

import java.util.ArrayList;

import itschool.classes.Process;

public class Queue {
    private ArrayList<Process> queue;
    private int counter;

    public Queue() {
        this.queue = new ArrayList<>();
        this.counter = 0;
    }

    public void add() {
        MemoryBlock mb;
        Process process = new Process(this.counter++, Clock.getTime());
    //    if ((mb = Memory.findBlock(process.getMemory())) != null)
        {
      //      process.setMemoryBlock(mb);
            this.queue.add(process);
        }
    }

    @Override
    public String toString() {
        return counter + ": " + queue;
    }
}
