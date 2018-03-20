import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class MyListener extends RunListener {

    public void testFailure(Failure failure) {
        System.out.println("XXXXX");
        String trace = failure.getTrace();
        System.out.println(trace);
    }

    public static void main(String[] args) {
        JUnitCore jUnitCore = new JUnitCore();
        jUnitCore.addListener(new MyListener());
        jUnitCore.run(EasyCase.class);
    }

}
