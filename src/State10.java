/*
 * participant: ConcreteState
 */

public class State10 implements State {

    public State10() {
    }

    @Override
    public void goNext(FSMContext context) {
        int input = context.getInput();
        int nextState = context.transitionAndOutput[2][input + 1];
        int output = context.transitionAndOutput[2][input + 3];
        context.setState(nextState);
        System.out.println("State10: when in(" + input + "), out(" + output + ") Next State:=>");
    }

}
