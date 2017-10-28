package ch.hsr.mge.gadgeothek;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import ch.hsr.mge.gadgeothek.ui.RegisterActivity;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by stahel-1 on 21.10.2017.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class RegisterTest {

    @Rule
    public ActivityTestRule<RegisterActivity> activityTestRule = new ActivityTestRule<RegisterActivity>(RegisterActivity.class);

    @Test
    public void showsRegisterActivity()
    {

        onView(withId(R.id.name)).perform(typeText("Reto Stahel"));
        onView(withId(R.id.email)).perform(typeText("reto@stahel.com"));
        onView(withId(R.id.matrikelnr)).perform(typeText("123445"));
        onView(withId(R.id.password)).perform(typeText("12345"));
        onView(withId(R.id.password)).perform(closeSoftKeyboard());
        onView(withId(R.id.registerButton)).check(matches(isDisplayed()));
        onView(withId(R.id.registerButton)).perform(click());
    }
}
