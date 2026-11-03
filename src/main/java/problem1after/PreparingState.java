package problem1after;

public class PreparingState extends AbstractState {
    public PreparingState() {
        super("PREPARING");
    }

    @Override
    public void deliver(Order o) {
        o.setState(new DeliveredState());
    }
}
