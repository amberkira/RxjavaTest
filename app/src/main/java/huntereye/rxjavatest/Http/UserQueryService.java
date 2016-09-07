package huntereye.rxjavatest.Http;

import huntereye.rxjavatest.LoginModule.LoginModel.LoginBean;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2016/9/7.
 */
public interface UserQueryService {
    @GET("users/{user}/repos")
    Observable<LoginBean> LoginQuery(@Query("user") String user,@Query("code") String code);
}
