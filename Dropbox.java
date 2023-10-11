public class Dropbox {
    private int number;
    private boolean evenNumber = false;
    private boolean taken = true;
    public int take(final boolean even) {

        if(evenNumber == even && !taken){
            System.out.format("%s CONSUMIDOR obtem %d.%n", even ? "PAR" : "IMPAR", number);
            taken = true;
            return number;
        }

        return -1;
    }

    public void put(int number) {
        if (taken){
            System.out.format("PRODUTOR gera %d.%n", number);
            this.number = number;
            this.evenNumber = number % 2 == 0;
            this.taken = false;
        }

    }

}
