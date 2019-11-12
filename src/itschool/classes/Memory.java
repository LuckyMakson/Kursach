package itschool.classes;

import java.util.ArrayList;
import java.util.Arrays;

public class Memory {
    private static  int size;
    private static ArrayList<MemoryBlock> memory;

    public Memory(int size) {
        memory = new ArrayList<>();
        this.size = (size < 1024 ? 1024 : size);
        memory.add(new MemoryBlock(500, 550));
        memory.add(new MemoryBlock(170, 300));
        memory.add(new MemoryBlock(0, 80));
    }

    public static int findBlock(int blockSize) {
        memory.sort(MemoryBlock.ByEnd);

        for (int i = 0; i < memory.size()-1; i++)
        {
            if (memory.get(i+1).getStart() - memory.get(i).getEnd() > blockSize)
                return memory.get(i).getEnd();
        }

        return -1;
    }

    public void removeBlock(MemoryBlock memoryBlock)
    {
        memory.remove(memoryBlock);
    }

    public void add(int start, int blockSize)
    {
        this.memory.add(new MemoryBlock(start+1, start+blockSize));
    }

    public static String showMemory() {
        return Arrays.toString(memory.toArray());
    }
}
