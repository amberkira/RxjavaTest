package huntereye.rxjavatest.LoginModule.LoginPresenter;


import huntereye.rxjavatest.LoginModule.LoginModel.LoginModel;
import huntereye.rxjavatest.LoginModule.LoginView.ILoginView;

/**
 * Created by Administrator on 2016/9/5.
 */
public class LoginPresenter {
    public ILoginView mILoginView;
    public LoginModel mLoginModel;

    public LoginPresenter(ILoginView iLoginView){
        mILoginView = iLoginView;
        mLoginModel = new LoginModel();
    }

    public void saveUserBean(String name,String code){

    }

    public boolean InternetAccess(){
        return false;
    }



}