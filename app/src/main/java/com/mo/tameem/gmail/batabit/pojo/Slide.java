package com.mo.tameem.gmail.batabit.pojo;

public class Slide {

    private String title;
    private String desc;
    private int drawable;
    private String imgURl;

    public Slide(String title, String desc, int drawable) {
        this.title = title;
        this.desc = desc;
        this.drawable = drawable;
    }

    public Slide(String title, int drawable) {
        this.title = title;
        this.drawable = drawable;
    }

    public Slide(String title, String desc, String imgURl) {
        this.title = title;
        this.desc = desc;
        this.imgURl = imgURl;
    }

    public Slide(int drawable) {
        this.drawable = drawable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }
}
