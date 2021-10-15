package com.example.metartaf.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class METAR {

    @SerializedName("raw")
    @Expose
    private String raw;

    @SerializedName("clouds")
    @Expose
    private float clouds;

    @SerializedName("altimeter")
    @Expose
    private float altimeterPressure;

    @SerializedName("visibility")
    @Expose
    private float visibility;

    @SerializedName("dewpoint")
    @Expose
    private int dewpoint;

    @SerializedName("temperature")
    @Expose
    private int temperature;


}
