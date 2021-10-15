package com.example.metartaf.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Aeoroport {

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("country")
    @Expose
    private String country;

    @SerializedName("city")
    @Expose
    private String city;

    @SerializedName("latitude")
    @Expose
    private float latitude;

    @SerializedName("longitude")
    @Expose
    private float longitude;

    @SerializedName("icao")
    @Expose
    private String icao;

    @SerializedName("iata")
    @Expose
    private String iata;


}
