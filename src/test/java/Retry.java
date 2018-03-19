import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class Retry implements TestRule {

    public int run_times;

    public Retry(int run_times) {
        this.run_times = run_times;
    }

    public Statement apply(final Statement statement, final Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                Throwable throwable = null;
                for (int i = 0; i < run_times; i++) {
                    try {
                        statement.evaluate();
                        return;
                    } catch (Throwable e) {
                        throwable = e;
                    }
                }
                throw throwable;
            }
        };
    }


}
