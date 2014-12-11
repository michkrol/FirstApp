package pl.edu.ug.aib.firstApp;

import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.RootContext;
import org.androidannotations.annotations.UiThread;

@EBean
public class MyBackgroundTask {

    @RootContext
    FirstActivity activity;

    @Background
    void doInBackground(int millis) {
        try {
            Thread.sleep(millis);
            publishResult();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @UiThread
    void publishResult() {
        activity.goToSecondActivity();
    }

}
