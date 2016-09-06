package huntereye.rxjavatest.LoginModule.LoginView;

/**
 * Created by Administrator on 2016/9/5.
 */
public interface ILoginView {
    public void showProgress();
    public void hideProgress();
    public void LodingSucceed();
    public void LodingFailed();
    public String getAccount();
    public String getCode();
    public void setCodeNull();
}
