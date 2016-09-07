package huntereye.rxjavatest.Http;

import huntereye.rxjavatest.Contants.Constants;
import huntereye.rxjavatest.LoginModule.LoginModel.LoginBean;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2016/9/7.
 */
public interface UserQueryService {
    @GET(Constants.RELATIVEURL)
    Observable<LoginBean> LoginQuery(@Query("user") String user,@Query("code") String code);
}
