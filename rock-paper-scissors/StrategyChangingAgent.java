import java.util.concurrent.*;

public class StrategyChangingAgent implements IAgent {
    private ThreadLocalRandom random;
    private IAgent agent;

    public StrategyChangingAgent() {
        this.random = ThreadLocalRandom.current();
        this.agent = new RandomAgent();
    }

    public HandShape nextMove() {
        return this.agent.nextMove();
    }
}
