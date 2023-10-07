import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class OldDropbox extends Dropbox{
    private Deque<Integer> dequeOfNumbers = new LinkedList<>();

    public int take(final boolean even) {
        Iterator<Integer> iterator = dequeOfNumbers.iterator();

        while (iterator.hasNext()) {
            int currentNumber = iterator.next();
            if ((currentNumber % 2 == 0) == even) {
                System.out.format("%s CONSUMIDOR obtem %d.%n", even ? "PAR" : "IMPAR", currentNumber);
                iterator.remove(); // Remove o número encontrado
                return currentNumber;
            }
        }

        return -1; // Retorna -1 se nenhum número adequado for encontrado
    }


    public void put(int number) {
        System.out.format("PRODUTOR gera %d.%n", number);
        dequeOfNumbers.addLast(number);
    }

    /*public void showElements() {
        System.out.print("Elementos na Deque: ");
        for (int number : dequeOfNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }*/
}
