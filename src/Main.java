/*
 * State design pattern example 3
 */

public class Main {

    public static void main(String[] args) {

        FSMContext stateMachine = new FSMContext();

        int[] inputs = {0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0};

        for (int x : inputs) {
            stateMachine.setInput(x);
            stateMachine.clock();
        }

    }

}
