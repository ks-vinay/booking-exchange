package com.ecabs.assignment.bedblayer.dto;

import org.springframework.stereotype.Component;

/**
 * @author Vinay KS
 * @created on 12/11/21
 * @project booking-exchange
 */
@Component
public class WayPointsDto {

    private int id;
    private String locality;
    private long latitude;
    private long longitude;

    /**
     * @return long
     */
    public int getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return String
     */
    public String getLocality() {
        return locality;
    }

    /**
     * @param locality
     */
    public void setLocality(String locality) {
        this.locality = locality;
    }

    /**
     * @return long
     */
    public long getLatitude() {
        return latitude;
    }

    /**
     * @param latitude
     */
    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    /**
     * @return long
     */
    public long getLongitude() {
        return longitude;
    }

    /**
     * @param longitude
     */
    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return "WayPointsDto{" +
                "id=" + id +
                ", locality='" + locality + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
