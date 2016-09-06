package huntereye.rxjavatest.Base;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Administrator on 2016/9/6.
 */
public  class BaseActivity extends Activity {
    /******************************************
     *
     * BaseActivity is focused on Logging to  reflect lifeCircle
     *
     ******************************************/
    String Activityname = getClass().getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(Activityname,"------------------>onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Activityname, "------------------>onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Activityname, "------------------>onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Activityname, "------------------>onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Activityname, "------------------>onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Activityname, "------------------>onPause");
    }
}
