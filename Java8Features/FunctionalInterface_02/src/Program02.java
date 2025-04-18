//class MyRunnable implements Runnable{
//
//    @Override
//    public void run(){
//        for(int i=0;i<10;i++){
//            System.out.println("In child thread");
//        }
//    }
//}
public class Program02 {
    public static void main(String[] args) throws InterruptedException{
        //Traditional approach (2.class files) MyRunnable & Program02
//        Runnable r = new MyRunnable();
//        Thread t1 = new Thread(r);
//        t1.start();
//
//        for (int i=0;i<10;i++){
//            Thread.sleep(1000);
//            System.out.println("In main thread");
//        }
        //By using Lambda expression No need to create class MyRunnable we can give body
        //to run method directly by using lambda expression

        Runnable r1 = ()->{
            for (int i = 0;  i<10 ; i++) {
                System.out.println("In child thread");
            }
        };

        new Thread(r1).start();

    }
}
