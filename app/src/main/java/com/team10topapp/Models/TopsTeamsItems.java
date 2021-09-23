package com.team10topapp.Models;

public class TopsTeamsItems {
    int id;
    int serialno;
    int category_id;
    int team_image;
    String title;
    String countryname;
    String coach,captain;
    String descriptions;
    String sincedate;
    String country_images;

    public TopsTeamsItems(int id, int serialno, int category_id, int team_image, String title, String countryname, String coach, String captain, String descriptions, String sincedate, String country_images) {
        this.id = id;
        this.serialno = serialno;
        this.category_id = category_id;
        this.team_image = team_image;
        this.title = title;
        this.countryname = countryname;
        this.coach = coach;
        this.captain = captain;
        this.descriptions = descriptions;
        this.sincedate = sincedate;
        this.country_images = country_images;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSerialno() {
        return serialno;
    }

    public void setSerialno(int serialno) {
        this.serialno = serialno;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public int getTeam_image() {
        return team_image;
    }

    public void setTeam_image(int team_image) {
        this.team_image = team_image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public String getCaptain() {
        return captain;
    }

    public void setCaptain(String captain) {
        this.captain = captain;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public String getSincedate() {
        return sincedate;
    }

    public void setSincedate(String sincedate) {
        this.sincedate = sincedate;
    }

    public String getCountry_images() {
        return country_images;
    }

    public void setCountry_images(String country_images) {
        this.country_images = country_images;
    }
}