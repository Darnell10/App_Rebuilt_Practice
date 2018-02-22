package c4q.com.app_rebuild_practice;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by D on 2/22/18.
 */

public interface NetworkService {

    @GET("api/?nat=us&inc=name,location,cell,email,dob,picture&results=20")
    Call<User> getUser();
}
