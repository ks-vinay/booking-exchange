package com.ecabs.assignment.bedblayer.domain;


import javax.persistence.*;


@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "passangerName")
    private String passangerName;

    @Column(name = "passangerContactNumber")
    private long passangerContactNumber;

    @Column(name = "pickUpTime")
    private String pickUpTime;

    @Column(name = "asap")
    private boolean asap;

    @Column(name = "waitingTime")
    private int waitingTime;

    @Column(name = "numberOfPassangers")
    private int numberOfPassangers;

    @Column(name = "price")
    private double price;

    @Column(name = "rating")
    private double rating;

    @Column(name = "createdOn")
    private String createdOn;

    @Column(name = "modifiedOn")
    private String modifiedOn;

    @OneToOne(mappedBy = "booking", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Waypoints waypoints;


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
     * @return double
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
     * @return
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
     * @return Waypoints
     */
    public Waypoints getWaypoints() {
        return waypoints;
    }

    public Booking setWaypoints(Waypoints waypoints) {
        this.waypoints = waypoints;
        return this;
    }
}
