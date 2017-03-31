import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;
import com.udacity.gradle.builditbigger.MainActivity;


import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static junit.framework.Assert.assertEquals;

/**
 * Created by tonyn on 3/31/2017.
 */

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {

    private EndpointsAsyncTask endpointsAsyncTask;

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(
            MainActivity.class);

    @Before
    public void initiateAsyncTask(){
        endpointsAsyncTask = new EndpointsAsyncTask();
    }

    @Test
    public void testAsyncTask() throws ExecutionException, InterruptedException {
        String result = endpointsAsyncTask.execute(activityTestRule.getActivity()).get();
        boolean validResult = result.length() > 0;
        assertEquals(validResult, true);
    }
}



