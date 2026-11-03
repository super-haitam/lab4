package problem1after;

public class PaidState extends AbstractState {
    public PaidState() {
        super("PAID");
    }

    @Override
    public void startPreparing(Order o) {
       o.setState(new PreparingState());
    }

    @Override
    public void cancel(Order o) {
        o.setState(new CancelledState());
    }
}
