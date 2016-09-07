package huntereye.rxjavatest.LoginModule.LoginPresenter;


import huntereye.rxjavatest.LoginModule.LoginModel.LoginModel;
import huntereye.rxjavatest.LoginModule.LoginView.ILoginView;
import rx.Subscription;
import rx.functions.Func1;

/**
 * Created by Administrator on 2016/9/5.
 */
public class LoginPresenter {
    public ILoginView mILoginView;
    public LoginModel mLoginModel;
    private boolean isBeanSetUp;
    private Subscription mSubscription;

    public LoginPresenter(ILoginView iLoginView){
        mILoginView = iLoginView;
        mLoginModel = new LoginModel();
        isBeanSetUp = false;
    }

    public void saveUserBean(String name,String code){
        mLoginModel.setBean(name,code);
        isBeanSetUp = true;

    }

    public boolean InternetAccess(){
        if(isBeanSetUp){
            //网络组建部分联网
        }
        return false;
    }


    public void detachView() {
        mSubscription.unsubscribe();
        mSubscription = null;
    }
}
