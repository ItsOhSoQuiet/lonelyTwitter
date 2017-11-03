package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;

import com.robotium.solo.Solo;

// import junit.framework.TestCase; import unused

public class LonelyTwitterActivityTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

    private Solo solo;

    public LonelyTwitterActivityTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    // Removed @throws tag, because of Analyze -> Inspect code
    /**
     * Runs at the beginning of the test
     */
    public void setUp() throws Exception {
        solo = new Solo(getInstrumentation(), getActivity());
    }

    public void testStart() throws Exception {

        // Unused assignment, taken out due to Analyze -> Inspect code
        // Activity activity = getActivity();

    }

    public void testTweet() {

        solo.assertCurrentActivity("Wrong Activity", LonelyTwitterActivity.class);
        solo.enterText((EditText) solo.getView(R.id.body), "Test Tweet!");
        solo.clickOnButton("Save");
        solo.enterText((EditText) solo.getView(R.id.body), "");

        assertTrue(solo.waitForText("Test Tweet!"));

        solo.clickOnButton("Clear");

    }

    public void testClickTweetList() {

        solo.assertCurrentActivity("Wrong Activity", LonelyTwitterActivity.class);
        solo.clickOnButton("Clear");

        solo.enterText((EditText) solo.getView(R.id.body), "Test Tweet!");
        solo.clickOnButton("Save");
        solo.waitForText("Test Tweet!");

        solo.clickInList(0);
        solo.assertCurrentActivity("Wrong Activity", EditTweetActivity.class);
    }

    public void testEditTweet() {

        solo.assertCurrentActivity("Wrong Activity", LonelyTwitterActivity.class);
        solo.clickOnButton("Clear");

        solo.enterText((EditText) solo.getView(R.id.body), "Test Tweet!");
        solo.clickOnButton("Save");
        solo.waitForText("Test Tweet!");

        solo.clickInList(0);
        solo.assertCurrentActivity("Wrong Activity", EditTweetActivity.class);

        assertTrue(solo.waitForText("Test Tweet!"));
    }

    // Remove the @throws tag, due to Analyze -> Inspect code
    /**
     * Runs at the end of the tests
     */
    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }
}