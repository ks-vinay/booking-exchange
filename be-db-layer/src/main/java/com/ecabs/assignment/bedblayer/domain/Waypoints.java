package com.ecabs.assignment.bedblayer.domain;

import javax.persistence.*;


@Entity
public class Waypoints {

    @Id
    @Column(name = "booking_id")
    private int id;

    @Column(name = "locality")
    private String locality;

    @Column(name = "latitude")
    private long latitude;

    @Column(name = "longitude")
    private long longitude;

    @OneToOne
    @MapsId
    @JoinColumn(name = "booking_id")
    private Booking booking;


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
     * @return Booking
     */
    public Booking getBooking() {
        return booking;
    }

    public Waypoints setBooking(Booking booking) {
        this.booking = booking;
        return this;
    }
}
