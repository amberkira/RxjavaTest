package huntereye.rxjavatest.LoginModule.LoginModel;

import android.content.SharedPreferences;

import java.security.MessageDigest;
import java.security.Timestamp;

/**
 * Created by Administrator on 2016/9/5.
 */
public class LoginBean {
    private String LoginName;
    private String LoginCode;
    private String LoginToken;
    private long LoginTime;

    public LoginBean(String name,String code){
        LoginName = name;
        LoginCode = toMD5(code);
        LoginTime = System.currentTimeMillis()/1000;
        LoginToken = toMD5(LoginName+LoginTime);

    }

    public String toMD5(String inStr){
        MessageDigest md5 = null;
        try{
            md5 = MessageDigest.getInstance("MD5");
        }catch (Exception e){
            e.printStackTrace();
            return "";
        }
        char[] charArray = inStr.toCharArray();
        byte[] byteArray = new byte[charArray.length];

        for (int i = 0; i < charArray.length; i++)
            byteArray[i] = (byte) charArray[i];
        byte[] md5Bytes = md5.digest(byteArray);
        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++){
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16)
                hexValue.append("0");
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();
    }

    public String getLoginName() {
        return LoginName;
    }

    public String getLoginCode() {
        return LoginCode;
    }

    public String getLoginToken() {
        return LoginToken;
    }

    public long getLoginTime() {
        return LoginTime;
    }

    public void setLoginName(String loginName) {
        LoginName = loginName;
    }

    public void setLoginCode(String loginCode) {
        LoginCode = loginCode;
    }

    public void setLoginTaken(String loginToken) {
        LoginToken = loginToken;
    }

    public void setLoginTime(long loginTime) {
        LoginTime = loginTime;
    }
}
