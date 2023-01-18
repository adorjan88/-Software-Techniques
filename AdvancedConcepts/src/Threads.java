
public class Threads extends Thread{

    synchronized public static void multiply(int n){
        for(int i = 1; i<10;i++){
            System.out.print(i*n+" ");
        }
        System.out.println();
    }

    public void run(int n) {
        multiply(n);
    }
}
