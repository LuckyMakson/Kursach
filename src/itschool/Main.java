package itschool;

import itschool.classes.*;
import itschool.classes.Process;

public class Main {

    public static void main(String[] args) {
        /*
        Process process = new Process(1, 20);
        System.out.println(process);

        Queue queue = new Queue();

        Clock.incTime();
        queue.add();

        Clock.incTime();
        queue.add();

        Clock.incTime();
        queue.add();

        System.out.println(queue);
*/
        Memory memory = new Memory(2048);
        System.out.println(Memory.showMemory());

        int blockStart = Memory.findBlock(100);
        if (blockStart >= 0) {
            memory.add(blockStart, 100);
        }
        System.out.println(Memory.showMemory());
    }
}
