package huntereye.rxjavatest.Contants;

import android.content.Context;
import android.content.SharedPreferences;

import huntereye.rxjavatest.UniversalApplicantion;

/**
 * Created by Administrator on 2016/9/5.
 */
public class Constants {
    public SharedPreferences LoginToken = UniversalApplicantion.getContext()
                                            .getSharedPreferences("token", Context.MODE_PRIVATE);
    public static final String BASEURL = "";
    public static final String RELATIVEURL = "";
}
