package programs;


/*
This program explains how to catch an exception occurred in a particular thread.
If the exception is not caught anywhere in the program, it results in stopping the entire program.
 */
public class Program2 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                throw new RuntimeException();
            }
        });


        thread.setName("Misbehaving Thread");
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("unexpected exception occurred!");
            }
        });

        thread.start();
    }
}
