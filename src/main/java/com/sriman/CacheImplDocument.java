package com.sriman;

public class CacheImplDocument
{

    String id;

    String userID;

    String itineraryNumber;

    Integer expUserId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getItineraryNumber() {
        return itineraryNumber;
    }

    public void setItineraryNumber(String itineraryNumber) {
        this.itineraryNumber = itineraryNumber;
    }

    public Integer getExpUserId() {
        return expUserId;
    }

    public void setExpUserId(Integer expUserId) {
        this.expUserId = expUserId;
    }



    @Override
    public String toString() {
        return "CacheImplDocument{" +
                "id='" + id + '\'' +
                ", userID='" + userID + '\'' +
                ", itineraryNumber='" + itineraryNumber + '\'' +
                ", expUserId=" + expUserId +
                '}';
    }
}
