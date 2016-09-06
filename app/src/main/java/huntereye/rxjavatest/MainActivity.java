package huntereye.rxjavatest;

import android.app.PendingIntent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import huntereye.rxjavatest.Base.BaseMvpActivity;
import huntereye.rxjavatest.LoginModule.LoginPresenter.LoginPresenter;
import huntereye.rxjavatest.LoginModule.LoginView.ILoginView;


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
    public String getAccount() {
        return accountTx.getText().toString();

    }

    @Override
    public String getCode() {
        return codeTx.getText().toString();
    }

    @Override
    public void setCodeNull() {
        codeTx.setText("");
    }

    @Override
    public void onClick(View view) {
        mPresenter.InternetAccess();
    }


}
