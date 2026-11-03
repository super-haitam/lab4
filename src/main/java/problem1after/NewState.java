package problem1after;

public class NewState extends AbstractState {
    public NewState() {
        super("NEW");
    }

    @Override
    public void pay(Order o) {
        o.setState(new PaidState());
    }

    @Override
    public void cancel(Order o) {
        o.setState(new CancelledState());
    }
}
