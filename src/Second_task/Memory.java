package Second_task;

//class belong to Task №2
//main methods
class Memory {
    private int var = 0;
    private boolean valueSet = false;

    synchronized void prints() {

        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("catch");
            }
        }
        //if need
        //System.out.println("Prints  number :" + var + "\n");
        valueSet = false;
        notify();
    }


    synchronized void count() {

        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("catch");
            }
        }
        System.out.println(var);
        var++;
        valueSet = true;
        notify();

    }
}