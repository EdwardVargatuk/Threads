package Second_task;
//class belong to Task №2

class Printer implements Runnable {
    private Memory memory;
    private int existNum;

    Printer(Memory memory, int existNum) {
        this.memory = memory;
        this.existNum = existNum;
    }

    @Override
    public void run() {
        for (int i = 0; i < existNum; i++) {
            memory.prints();
        }
    }
}