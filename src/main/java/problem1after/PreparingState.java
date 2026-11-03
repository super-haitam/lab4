package problem1after;

public class PreparingState extends AbstractState {
    public PreparingState() {
        super("PREPARING");
    }

    @Override
    public void markReady(Order o) {
        o.setState(new ReadyState());
    }
}
