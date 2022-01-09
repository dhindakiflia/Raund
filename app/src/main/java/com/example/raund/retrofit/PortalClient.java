package com.example.raund.retrofit;

import com.example.raund.model.AuthClass;
import com.example.raund.model.ChooseTravelResponse;
import com.example.raund.model.EditProfileResponse;
import com.example.raund.model.HistoryResponse;
import com.example.raund.model.MyEditResponse;
import com.example.raund.model.MyPasswordResponse;
import com.example.raund.model.MySettingResponse;
import com.example.raund.model.OngoingResponse;
import com.example.raund.model.RegisClass;
import com.example.raund.model.TravelListResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface PortalClient {

    @FormUrlEncoded
    @POST("auth/login")
    Call<AuthClass> checkLogiin(@Field("email") String email,@Field("password") String password);

    @FormUrlEncoded
    @POST("auth/register")
    Call<RegisClass> registerResponse(
            @Field("nim") String nim,
            @Field("nama") String nama,
            @Field("email") String email,
            @Field("no_telepon") String no_telepon,
            @Field("password") String password
    );

    @GET("travel_agent")
    Call<TravelListResponse> getTravelList();

    @GET("choose_travel")
    Call<ChooseTravelResponse> getChooseTravel();

    @GET("myongoing")
    Call<OngoingResponse> getMyOngoing(@Header("Authorization") String token);

    @GET("myhistory")
    Call<HistoryResponse> getMyHistory(@Header("Authorization") String token);

//    @GET("mysetting")
//    Call<SettingResponse> getMySetting(@Header("Authorization") String token);

    @GET("mysettings")
    Call<MySettingResponse> getMySettings(@Header("Authorization") String token);

//    @GET("mysetting")
//    Call<SettingItem> getMySetting(@Header("Authorization") String token);

    @FormUrlEncoded
    @PUT("myedit")
    Call<EditProfileResponse> getMyEdit(
            @Header("Authorization") String token,
            @Field("nama") String nama,
            @Field("nim") String nim,
            @Field("email") String email,
            @Field("no_telepon") String no_telepon
    );

    @FormUrlEncoded
    @PUT("mypassword")
    Call<MyPasswordResponse> getMyPassword(
            @Header("Authorization") String token,
            @Field("passwordlama") String passwordlama,
            @Field("passwordbaru1") String passwordbaru1,
            @Field("passwordbaru2") String passwordbaru2
    );

    @FormUrlEncoded
    @PUT("myedits")
    Call<MyEditResponse> getMyEdits(
            @Header("Authorization") String token,
            @Field("nama") String nama,
            @Field("nim") String nim,
            @Field("email") String email,
            @Field("no_telepon") String no_telepon
    );

}