package huntereye.rxjavatest.LoginModule.LoginPresenter;


import huntereye.rxjavatest.Contants.*;
import huntereye.rxjavatest.Http.HttpUtil;
import huntereye.rxjavatest.Http.UserQueryService;
import huntereye.rxjavatest.LoginModule.LoginModel.LoginBean;
import huntereye.rxjavatest.LoginModule.LoginModel.LoginModel;
import huntereye.rxjavatest.LoginModule.LoginView.ILoginView;
import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;


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
            mSubscription = HttpUtil.creatUtil(Constants.BASEURL, UserQueryService.class)
                    .LoginQuery(mLoginModel.getBean().getLoginName()
                            ,mLoginModel.getBean().getLoginCode())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .map(new Func1<LoginBean, String>() {
                        @Override
                        public String call(LoginBean loginBean) {
                            return loginBean.getLoginToken();
                        }
                    })
                    .subscribe(new Observer<String>() {
                        @Override
                        public void onCompleted() {

                        }

                        @Override
                        public void onError(Throwable e) {

                        }

                        @Override
                        public void onNext(String token) {

                        }
                    });
        }
        return false;
    }


    public void detachView() {
        mSubscription.unsubscribe();
        mSubscription = null;
    }
}
