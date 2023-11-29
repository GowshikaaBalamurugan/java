package multithreading;
class Q{
    int num;
    public synchronized void put(int num){
        this.num=num;
        System.out.println("put:"+num);
    }
    public synchronized void get(){
        System.out.println("get:"+num);
    }
}
class Producer implements Runnable{
    Q q;
    public Producer(Q q){
        this.q=q;
        Thread t1=new Thread(this,"Producer");
        t1.start();
    }
    public void run(){
        int i=0;
        while(true){
            q.put(i++);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
class Consumer implements Runnable{
    Q q;
    public Consumer(Q q){
        this.q=q;
        Thread t1=new Thread(this,"Consumer");
        t1.start();
    }
    public void run(){
        while(true){
            q.get();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
public class InterThread {
    public static void main(String[] args) {
        Q q=new Q();
        new Producer(q);
        new Consumer(q);
    }
}
