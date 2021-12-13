package com.ecabs.assignment.bedblayer.dto;

import org.springframework.stereotype.Component;

/**
 * @author Vinay KS
 * @created on 12/11/21
 * @project booking-exchange
 */


@Component
public class BookingDto {

    private int id;
    private String passangerName;
    private long passangerContactNumber;
    private String pickUpTime;
    private boolean asap;
    private int waitingTime;
    private int numberOfPassangers;
    private double price;
    private double rating;
    private String createdOn;
    private String modifiedOn;
    private String type;

    private WayPointsDto wayPointsDto;

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
    public String getPassangerName() {
        return passangerName;
    }

    /**
     * @param passangerName
     */
    public void setPassangerName(String passangerName) {
        this.passangerName = passangerName;
    }

    /**
     * @return long
     */
    public long getPassangerContactNumber() {
        return passangerContactNumber;
    }

    /**
     * @param passangerContactNumber
     */
    public void setPassangerContactNumber(long passangerContactNumber) {
        this.passangerContactNumber = passangerContactNumber;
    }

    /**
     * @return String
     */
    public String getPickUpTime() {
        return pickUpTime;
    }

    /**
     * @param pickUpTime
     */
    public void setPickUpTime(String pickUpTime) {
        this.pickUpTime = pickUpTime;
    }

    /**
     * @return boolean
     */
    public boolean isAsap() {
        return asap;
    }

    /**
     * @param asap
     */
    public void setAsap(boolean asap) {
        this.asap = asap;
    }

    /**
     * @return int
     */
    public int getWaitingTime() {
        return waitingTime;
    }

    /**
     * @param waitingTime
     */
    public void setWaitingTime(int waitingTime) {
        this.waitingTime = waitingTime;
    }

    /**
     * @return int
     */
    public int getNumberOfPassangers() {
        return numberOfPassangers;
    }

    /**
     * @param numberOfPassangers
     */
    public void setNumberOfPassangers(int numberOfPassangers) {
        this.numberOfPassangers = numberOfPassangers;
    }

    /**
     * @return int
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return double
     */
    public double getRating() {
        return rating;
    }

    /**
     * @param rating
     */
    public void setRating(double rating) {
        this.rating = rating;
    }

    /**
     * @return String
     */
    public String getCreatedOn() {
        return createdOn;
    }

    /**
     * @param createdOn
     */
    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * @return String
     */
    public String getModifiedOn() {
        return modifiedOn;
    }

    /**
     * @param modifiedOn
     */
    public void setModifiedOn(String modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    /**
     * @return String
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return WayPointsDto
     */
    public WayPointsDto getWayPointsDto() {
        return wayPointsDto;
    }

    public void setWayPointsDto(WayPointsDto wayPointsDto) {
        this.wayPointsDto = wayPointsDto;
    }

    @Override
    public String toString() {
        return "BookingDto{" +
                "id=" + id +
                ", passangerName='" + passangerName + '\'' +
                ", passangerContactNumber=" + passangerContactNumber +
                ", pickUpTime='" + pickUpTime + '\'' +
                ", asap=" + asap +
                ", waitingTime=" + waitingTime +
                ", numberOfPassangers=" + numberOfPassangers +
                ", price=" + price +
                ", rating=" + rating +
                ", createdOn='" + createdOn + '\'' +
                ", modifiedOn='" + modifiedOn + '\'' +
                ", type='" + type + '\'' +
                ", wayPointsDto=" + wayPointsDto +
                '}';
    }
}
