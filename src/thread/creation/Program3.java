package thread.creation;



public class Program3 {
    public static void main(String[] args) {
        Thread thread= new NewThread();
        thread.start();
    }

    private static class NewThread extends Thread{ // internally Thread class implements Runnable
        @Override
        public void run(){
            System.out.printf("Inside NewThead");
        }

    }
}

