package com.crakama.refugee.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by crakama on 11/30/2016.
 */
public class NewsModel {


    public Object getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Object dateCreated) {
        this.dateCreated = dateCreated;
    }

    @JsonProperty
    protected Object dateCreated;
    private String newsHead,newsBody,newsorganization;



    public NewsModel() {

    }

    //    public NewsModel(String newsHead, String newsBody,String newsorganization, Object timestamp) {
//        this.newsHead = newsHead;
//
//        this.newsBody = newsBody;
//        this.newsorganization = newsorganization;
//        this.dateCreated = timestamp;
//    }
    public Object getTimestamp() {
        return dateCreated;
    }
//    @JsonIgnore
//    public Long getCreatedTimestamp() {
//        if (dateCreated instanceof Long) {
//            return (Long) dateCreated;
//        }
//        else {
//            return null;
//        }
//    }


    public String getNewsHead() {
        return newsHead;
    }

    public void setNewsHead(String newsHead) {
        this.newsHead = newsHead;
    }



    public String getNewsBody() {
        return newsBody;
    }

    public void setNewsBody(String newsBody) {
        this.newsBody = newsBody;
    }

    public String getNewsorganization() {
        return newsorganization;
    }

    public void setNewsorganization(String newsorganization) {
        this.newsorganization = newsorganization;
    }


}
