package com.example.raund.retrofit;

import com.example.raund.model.AuthClass;
import com.example.raund.model.DeliveryResponse;
import com.example.raund.model.OngoingResponse;
import com.example.raund.model.RegisClass;
import com.example.raund.model.TravelListResponse;
import com.example.raund.model.TravelResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

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

    @GET("myongoing")
    Call<OngoingResponse> getMyOngoing(@Header("Authorization") String token);

    @FormUrlEncoded
    @POST("adddelivery")
        Call<DeliveryResponse> deliveryResponse(
            @Header("Authorization") String token,
            @Field("nim") String nim,
            @Field("id_mobil") String sid_mobil,
            @Field("id_travel_agent") String sid_travel_agent,
            @Field("jam_departure") String sjam_departure,
            @Field("status") int istatus,
            @Field("current_loc") String locSender,
            @Field("current_lat") String latSender,
            @Field("current_long") String longSender,
            @Field("nama_sender") String namasender,
            @Field("no_sender") String nosender,
            @Field("destination") String locReceiver,
            @Field("destination_lat") String latReceiver,
            @Field("destination_long") String longReceiver,
            @Field("nama_receiver") String namaReceiver,
            @Field("no_receiver") String noReceiver,
            @Field("berat_paket") String berat_paket,
            @Field("departure") String stgl_berangkat,
            @Field("total") String hargatotal);

    @FormUrlEncoded
    @POST("addtravel")
    Call<TravelResponse> travelResponse(
        @Header("Authorization") String token,
        @Field("nim") String nim,
        @Field("id_mobil") String sid_mobil,
        @Field("id_travel_agent") String sid_travel_agent,
        @Field("jam_departure") String sjam_departure,
        @Field("status") int istatus,
        @Field("current_loc") String currentLoc,
        @Field("current_lat") String currentLat,
        @Field("current_long") String currentLong,
        @Field("destination") String destLoc,
        @Field("destination_lat") String destLat,
        @Field("destination_long") String destLong,
        @Field("jumlah_passanger") String spassanger,
        @Field("departure") String tglGo,
        @Field("total") String hargatotal);
}
