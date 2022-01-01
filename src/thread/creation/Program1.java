package thread.creation;

public class Program1 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println("We are now in "+ Thread.currentThread().getName());
                System.out.printf("Priority of the current thread is :"+Thread.currentThread().getPriority());
            }
        });

        thread.setName("New Worker Thread");

        thread.setPriority(Thread.MAX_PRIORITY);

        System.out.println("Running thread "+ Thread.currentThread().getName()+" before starting new Thread");
        thread.start();
        System.out.println("Running thread "+ Thread.currentThread().getName()+" after starting new Thread");

        Thread.sleep(1000);
    }

}
