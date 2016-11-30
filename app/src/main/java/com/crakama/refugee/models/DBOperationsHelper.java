package com.crakama.refugee.models;

import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;

/**
 * Created by crakama on 11/30/2016.
 */
public class DBOperationsHelper {
    DatabaseReference dbref;
    Boolean savednews, savednotice;
    ArrayList<NoticeBoardModel> newsArraylist = new ArrayList<>();

    /**
     * NoticeBoardModel REFERENCE
     */

    public DBOperationsHelper(DatabaseReference db){
        this.dbref = db;
    }

    public Boolean saveNotice(NoticeBoardModel notice){
        if(notice == null){
            savednotice = false;
        }else{
            try {
                dbref.child("NoticeBoardModel").push().setValue(notice);
                savednotice = true;
            } catch (DatabaseException e) {

                e.printStackTrace();
                savednotice = false;
            }
        }
        return savednotice;
    }

    public Boolean saveNews(NewsModel news){
        if(news == null){
            savednews = false;
        }else{
            try {
                dbref.child("NewsModel").push().setValue(news);
                savednews = true;
            } catch (DatabaseException e) {

                e.printStackTrace();
                savednews = false;
            }
        }
        return savednews;
    }
}
