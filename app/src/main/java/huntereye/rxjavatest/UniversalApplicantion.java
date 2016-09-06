package huntereye.rxjavatest;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2016/9/5.
 */
public class UniversalApplicantion extends Application{
    private static Context mContext;
    @Override
    public void onCreate() {
        mContext = getApplicationContext();
    }

    public static Context getContext() {
        return (mContext==null)?null:mContext;
    }
}
