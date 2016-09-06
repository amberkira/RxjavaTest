package huntereye.rxjavatest;

import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import huntereye.rxjavatest.LoginModule.LoginPresenter.LoginPresenter;
import huntereye.rxjavatest.LoginModule.LoginView.ILoginView;


public class MainActivity extends ActionBarActivity implements ILoginView,View.OnClickListener {

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
        mPresenter = new LoginPresenter(this);
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
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
    public void getAccount() {

    }

    @Override
    public void getCode() {

    }

    @Override
    public void setCodeNull() {

    }

    @Override
    public void onClick(View view) {
        mPresenter.InternetAccess();
    }
}
