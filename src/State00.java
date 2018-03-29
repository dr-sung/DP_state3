/*
 * participant: ConcreteState
 */

public class State00 implements State {

    public State00() {
    }

    @Override
    public void goNext(FSMContext context) {
        int input = context.getInput();
        int nextState = context.transitionAndOutput[0][input + 1];
        int output = context.transitionAndOutput[0][input + 3];
        context.setState(nextState);
        System.out.println("State00: when in(" + input + "), out(" + output + ") Next State:=>");
    }

}
