package huntereye.rxjavatest;

import android.app.Application;
import android.test.ApplicationTestCase;

import junit.framework.Test;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    public void  Test() throws Exception{
        final int expected = 1;
        final int reality = -1;
        assertEquals(expected,reality);
    }
}