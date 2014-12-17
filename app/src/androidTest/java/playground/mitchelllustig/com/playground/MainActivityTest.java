package playground.mitchelllustig.com.playground;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by Mitch on 12/16/2014.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity activity;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        activity = getActivity();
    }

    public void testExample(){
        assertNotNull(activity);
    }

    public void testLibAdd(){
        assertEquals(7, activity.useLibAdd(6,1));
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
