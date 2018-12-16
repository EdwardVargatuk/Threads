package First;

//Напишите консольное приложение, которое:
//- описывает простой поток для отсчета и вывода в консоль чисел от 10 до
//нуля с задержкой в 1 секунду, в конце выводит строку "Bomb";
//- создает и запускает описанный поток на исполнение.
public class First  {

    public static void main(String[] args) {

        Runnable runnable = ()->{
            int count=10;
            for (int i = 11; i >0; i--) {
                System.out.println(count);
                count--;
                try {
                    Thread.sleep(500);

                } catch (InterruptedException e) {
                    System.out.println("catch");
                }
            }
            System.out.println("Bomb");
        };

        Thread myThread = new Thread(runnable);
        myThread.start();
    }
}
