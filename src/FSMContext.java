/*
 * participant: Context
 */

public class FSMContext {

    private int input;
    private State state;

    int[][] transitionAndOutput = {
        // present, next(x=0), next(x=1), output(x=0), output(x=1)
        {0, 0, 1, 0, 0},
        {1, 0, 3, 1, 0},
        {2, 0, 2, 1, 0},
        {3, 0, 2, 1, 0}
    };
    
    public State getNextState(int presentState) {
        int nextState = transitionAndOutput[presentState][input+1];
        State s = null;
        switch (nextState) {
            case 0: s = new State00(); break;
            case 1: s = new State01(); break;
            case 2: s = new State10(); break;
            case 3: s = new State11(); break;
        }
        return s;
    }
    
    public int getOutput(int presentState) {
        return transitionAndOutput[presentState][input+3];
}

    public FSMContext() {
        input = 0;
        state = new State00();
    }

    public void clock() { // go next state
        state.goNext(this);
    }

    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }

    public State getState() {
        return state;
    }
    
    public void setState(int nextState) {
        switch (nextState) {
            case 0:
                this.state = new State00();
                break;
            case 1:
                this.state = new State01();
                break;
            case 2:
                this.state = new State10();
                break;
            case 3:
                this.state = new State11();
                break;
        }
    }

}
