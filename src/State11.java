/*
 * participant: ConcreteState
 */

public class State11 implements State {

    public State11() {
    }

    @Override
    public void goNext(FSMContext context) {
        int input = context.getInput();
        int nextState = context.transitionAndOutput[3][input + 1];
        int output = context.transitionAndOutput[3][input + 3];
        context.setState(nextState);
        System.out.println("State11: when in(" + input + "), out(" + output + ") Next State:=>");
    }

}
