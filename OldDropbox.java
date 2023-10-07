import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class OldDropbox {
    private Deque<Integer> dequeOfNumbers = new LinkedList<>();

    public int take(final boolean even) {
        Stack<Integer> temporaryStack = new Stack<>();

        while (!dequeOfNumbers.isEmpty()) {
            int newNumber = dequeOfNumbers.removeFirst();
            if ((newNumber % 2 == 0) == even) {
                System.out.format("%s CONSUMIDOR obtem %d.%n", even ? "PAR" : "IMPAR", newNumber);
                return newNumber; // Retorna o número encontrado
            } else {
                temporaryStack.add(newNumber);
            }
        }

        while (!temporaryStack.isEmpty()) {
            int oldNumber = temporaryStack.pop();
            dequeOfNumbers.addFirst(oldNumber);
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
