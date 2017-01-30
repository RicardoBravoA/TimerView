package pe.com.orbis.timerview;

/**
 * Created by Ricardo Bravo on 30/01/17.
 */

public interface TimerInterface {

    void onTimerDown(long milliseconds);

    void onTimerFinish();
}
