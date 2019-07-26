package com.austinadams.fethinfo.TH_Playthrough;

import com.austinadams.fethinfo.TH_Info.Character;
import com.austinadams.fethinfo.TH_Info.Classes;
import com.austinadams.fethinfo.TH_Info.Proficiency;

public class My_Character extends Character {

    private String description;
    private Proficiency[] current_proficiencies;
    private Classes goal_class;
    private Classes next_step_class;
    private Classes current_class;
    private Proficiency[] next_class_proficiency_requirements;

    public My_Character(String description, Proficiency[] current_proficiencies, Classes goal_class, Classes next_step_class, Classes current_class, Proficiency[] next_class_proficiency_requirements) {
        this.description = description;
        this.current_proficiencies = current_proficiencies;
        this.goal_class = goal_class;
        this.next_step_class = next_step_class;
        this.current_class = current_class;
        this.next_class_proficiency_requirements = next_class_proficiency_requirements;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Proficiency[] getCurrent_proficiencies() {
        return current_proficiencies;
    }

    public void setCurrent_proficiencies(Proficiency[] current_proficiencies) {
        this.current_proficiencies = current_proficiencies;
    }

    public Classes getGoal_class() {
        return goal_class;
    }

    public void setGoal_class(Classes goal_class) {
        this.goal_class = goal_class;
    }

    public Classes getNext_step_class() {
        return next_step_class;
    }

    public void setNext_step_class(Classes next_step_class) {
        this.next_step_class = next_step_class;
    }

    public Classes getCurrent_class() {
        return current_class;
    }

    public void setCurrent_class(Classes current_class) {
        this.current_class = current_class;
    }

    public Proficiency[] getNext_class_proficiency_requirements() {
        return next_class_proficiency_requirements;
    }

    public void setNext_class_proficiency_requirements(Proficiency[] next_class_proficiency_requirements) {
        this.next_class_proficiency_requirements = next_class_proficiency_requirements;
    }



}
