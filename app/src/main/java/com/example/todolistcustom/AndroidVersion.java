package com.example.todolistcustom;

public class AndroidVersion {
    private String item;
    private String date;

    public AndroidVersion(String item, String date){
        this.item = item;
        this. date = date;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return item + ":" + date;
    }
}
