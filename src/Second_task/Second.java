package Second_task;


//Напишите консольное приложение, которое:
//- описывает поток Counter, задача которого инкрементировать значение
//некоторой переменной от нуля до 1_000_000;
//- описывает поток Printer, задача которого выводить в консоль значение
//инкрементируемой переменной;
//- создает и запускает описанные потоки на исполнение.
public class Second {

    public static void main(String[] args)  {
        Memory memory = new Memory();
        Counter counter = new Counter(memory, 1000000);
        Printer printer = new Printer(memory, 1000000);
        Runnable runnable = () -> {
            new Thread(counter).start();
            new Thread(printer).start();
        };

        Thread myThread = new Thread(runnable);

            myThread.start();


    }
}

