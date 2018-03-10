package com.example.shobhit.visionai;

/**
 * Created by shobhit on 10/3/18.
 */
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;


/**
 * Created by shobhit on 27/1/18.
 */

public interface Apiservice {
    @FormUrlEncoded
    @POST("/firebase/index.php")
    Call<ResponseBody> insertData(@Field("token") String token);

}