package itschool.classes;

public class Process {
    int id;
    String name;
    int priority;
    int memory;
    int time;
    int timeIn;
    int burstTime;
    MemoryBlock memoryBlock;


    public void setMemoryBlock(MemoryBlock memoryBlock) {
        this.memoryBlock = memoryBlock;
    }

    State state;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public int getTime() {
        return time;
    }

    public int getTimeIn() {
        return timeIn;
    }

    public int getBurstTime() {
        return burstTime;
    }

    public void setBurstTime(int burstTime) {
        this.burstTime = burstTime;
    }

    public int getMemory() {
        return memory;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Process(int id, int timeIn) {
        String processName = "";
        for (int i = 0; i < 10; i++) {
            processName += (char)(Utils.getRandomInteger(97, 123));
        }

        this.id = id;
        this.name = processName+".exe";
        this.priority = Utils.getRandomInteger(17);
        this.memory = Utils.getRandomInteger(1, 1024);
        this.time = Utils.getRandomInteger(5, 30);
        this.timeIn = timeIn;
        this.state = State.Ready;
    }

    @Override
    public String toString() {
        return "Process{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", priority=" + priority +
                ", time=" + time +
                ", timeIn=" + timeIn +
                ", burstTime=" + burstTime +
                ", state=" + state +
                '}';
    }
}
