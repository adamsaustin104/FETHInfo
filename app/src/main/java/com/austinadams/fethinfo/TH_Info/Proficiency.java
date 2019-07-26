package com.austinadams.fethinfo.TH_Info;

import android.widget.ImageView;

public class Proficiency {
    private ImageView weapon_icon;
    private String letter_grade;

    public Proficiency(ImageView weapon_icon, String letter_grade) {
        this.weapon_icon = weapon_icon;
        this.letter_grade = letter_grade;
    }

    public ImageView getWeapon_icon() {
        return weapon_icon;
    }

    public void setWeapon_icon(ImageView weapon_icon) {
        this.weapon_icon = weapon_icon;
    }

    public String getLetter_grade() {
        return letter_grade;
    }

    public void setLetter_grade(String letter_grade) {
        this.letter_grade = letter_grade;
    }
}
