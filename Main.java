public class Main {
    private static boolean Even = true;
    private static boolean Odd = false;

    public static void main(String[] args) {

        // para utilizar a solução 2 descrita no pdf deve modificar para:
        // Dropbox dropbox = new DequeDropbox();
        Dropbox dropbox = new Dropbox();
        (new Thread(new Consumer(Even, dropbox))).start();
        (new Thread(new Consumer(Odd, dropbox))).start();
        (new Thread(new Producer(dropbox))).start();
    }

}
