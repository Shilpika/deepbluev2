package com.example.imagepicker;

/**
 * Created by Shilpika on 24/11/18.
 */

import com.google.gson.annotations.SerializedName;

public class Img_Pojo {

    @SerializedName("image")
    private String Image;

    @SerializedName("longitude")
    private String Longitude;

    @SerializedName("latitude")
    private String Latitude;

    @SerializedName("response")
    private String Response;

    public String getResponse() {
        return Response;
    }
}

