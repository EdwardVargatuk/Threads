package Second_task;

//class belong to Task №2
class Counter implements Runnable {
    private Memory memory;
    private int needNum;

    Counter(Memory memory, int needNum) {
        this.memory = memory;
        this.needNum = needNum;
    }

    @Override
    public void run() {
        for (int i = 0; i < needNum; i++) {
            memory.count();
        }
    }
}