package com.team10topapp.Models;

public class SportsItems {
    int ids;
    String sports_title;
    int sports_images;
    public SportsItems(int ids, String sports_title, int sports_images) {
        this.ids = ids;
        this.sports_title = sports_title;
        this.sports_images = sports_images;
    }

    public int getIds() {
        return ids;
    }

    public void setIds(int ids) {
        this.ids = ids;
    }

    public String getSports_title() {
        return sports_title;
    }

    public void setSports_title(String sports_title) {
        this.sports_title = sports_title;
    }

    public int getSports_images() {
        return sports_images;
    }

    public void setSports_images(int sports_images) {
        this.sports_images = sports_images;
    }
}
