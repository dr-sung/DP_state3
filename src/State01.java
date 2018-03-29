/*
 * participant: ConcreteState
 */

public class State01 implements State {

    public State01() {
    }

    @Override
    public void goNext(FSMContext context) {
        int input = context.getInput();
        int nextState = context.transitionAndOutput[1][input + 1];
        int output = context.transitionAndOutput[1][input + 3];
        context.setState(nextState);
        System.out.println("State01: when in(" + input + "), out(" + output + ") Next State:=>");
    }

}
