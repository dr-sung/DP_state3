/*
 * participant: State
 */

public interface State {

    int STATE00 = 0;
    int STATE01 = 1;
    int STATE10 = 2;
    int STATE11 = 3;

    void goNext(FSMContext context);

}
