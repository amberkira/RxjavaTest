package huntereye.rxjavatest.LoginModule.LoginView;

/**
 * Created by Administrator on 2016/9/5.
 */
public interface ILoginView {
    public void showProgress();
    public void hideProgress();
    public void LodingSucceed();
    public void LodingFailed();
    public void getAccount();
    public void getCode();
    public void setCodeNull();
}
