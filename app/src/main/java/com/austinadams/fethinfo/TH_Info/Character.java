package com.austinadams.fethinfo.TH_Info;

import android.widget.ImageView;

import com.austinadams.fethinfo.R;

public class Character {

    private String name;
    private ImageView profile_picture;
    private ImageView[] strengths;
    private ImageView[] weaknesses;
    private ImageView budding_talent;
    private Proficiency[] starting_proficiencies;

    public Character() {

    }

    public Character(String name, ImageView profile_picture, ImageView[] strengths, ImageView[] weaknesses, ImageView budding_talent, Proficiency[] starting_proficiencies) {
        this.name = name;
        this.profile_picture = profile_picture;
        this.strengths = strengths;
        this.weaknesses = weaknesses;
        this.budding_talent = budding_talent;
        this.starting_proficiencies = starting_proficiencies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImageView getProfile_picture() {
        return profile_picture;
    }

    public void setProfile_picture(ImageView profile_picture) {
        this.profile_picture = profile_picture;
    }

    public ImageView[] getStrengths() {
        return strengths;
    }

    public void setStrengths(ImageView[] strengths) {
        this.strengths = strengths;
    }

    public ImageView[] getWeaknesses() {
        return weaknesses;
    }

    public void setWeaknesses(ImageView[] weaknesses) {
        this.weaknesses = weaknesses;
    }

    public ImageView getBudding_talent() {
        return budding_talent;
    }

    public void setBudding_talent(ImageView budding_talent) {
        this.budding_talent = budding_talent;
    }

    public Proficiency[] getStarting_proficiencies() {
        return starting_proficiencies;
    }

    public void setStarting_proficiencies(Proficiency[] starting_proficiencies) {
        this.starting_proficiencies = starting_proficiencies;
    }
}
