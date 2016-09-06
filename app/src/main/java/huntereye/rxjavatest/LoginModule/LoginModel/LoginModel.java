package huntereye.rxjavatest.LoginModule.LoginModel;

import huntereye.rxjavatest.LoginModule.LoginView.ILoginView;

/**
 * Created by Administrator on 2016/9/5.
 */
public class LoginModel implements ILoginModel{
    private LoginBean mBean;

    public LoginModel(){
    }

    @Override
    public void setBean(String name,String code) {
        mBean = new LoginBean(name,code);
    }


    @Override
    public LoginBean getBean() {
        return (mBean==null)?null:mBean;
    }
}
