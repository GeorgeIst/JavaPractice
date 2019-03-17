package project.concurrency;

public class StopWatchThread implements Runnable {

//    private String prefix;
//
//    public StopWatchThread(String prefix){
//        this.prefix = prefix;
//    }

    @Override
    public void run(){
        for(int i = 0; i <= 10; i++){
            System.out.println("Stop Watch" + ": " + i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }


}
