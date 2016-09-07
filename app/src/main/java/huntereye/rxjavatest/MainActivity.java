package huntereye.rxjavatest;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import huntereye.rxjavatest.Base.BaseMvpActivity;
import huntereye.rxjavatest.Http.*;
import huntereye.rxjavatest.LoginModule.LoginModel.LoginBean;
import huntereye.rxjavatest.LoginModule.LoginPresenter.LoginPresenter;
import huntereye.rxjavatest.LoginModule.LoginView.ILoginView;

import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;


public class MainActivity extends BaseMvpActivity implements ILoginView,View.OnClickListener {

    private SharedPreferences LoginTaken;
    private TextView accountTx;
    private TextView codeTx;
    private Button comfirmBtn;
    private LoginPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidget();
        HttpUtil.creatUtil("",UserQueryService.class)
                .LoginQuery("","")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map(new Func1<LoginBean, String>() {
                    @Override
                    public String call(LoginBean loginBean) {
                        return loginBean.getLoginToken();
                    }
                }).subscribe(new Action1<String>() {
            @Override
            public void call(String s) {
                Log.i("dd", s);
            }
        });
    }

    private void initWidget(){
        accountTx = (TextView) findViewById(R.id.account);
        codeTx = (TextView) findViewById(R.id.code);
        comfirmBtn = (Button) findViewById(R.id.btn_login_comfirm);
        comfirmBtn.setOnClickListener(this);

    }

    @Override
    public void initPresenter() {
        mPresenter = new LoginPresenter(this);
    }


    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void LodingSucceed() {

    }

    @Override
    public void LodingFailed() {

    }

    @Override
    public String getAccount() {return accountTx.getText().toString();}

    @Override
    public String getCode() {return codeTx.getText().toString();}

    @Override
    public void setCodeNull() {codeTx.setText(""); }

    @Override
    public void unSubscribe(Subscription subscription) {

    }

    @Override
    public void onClick(View view) {
        mPresenter.InternetAccess();
    }

    @Override
    protected void onDestroy() {
        mPresenter.detachView();
        super.onDestroy();


    }
}
