package com.github.eddiem_git.equtils;

import Attributes.Health;
import Attributes.Mana;

public class Bard extends Class {

    private Song song;
    private Health health;
    private Mana mana;
    private Inventory slots;
    private String name = "Trumpthat";


    public Bard() {
        super();
    }

    public Bard(Health health) {
        super();
        this.health = health;
    }

    public Bard(Song song) {
        this.song = song;
    }

    public Bard(Health health, Song song, Mana mana, Inventory slots, String name) {
        this.health = health;
        this.song = song;
        this.mana = mana;
        this.slots = slots;
        this.name = name;
    }


    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public Health getHealth() {
        return health;
    }

    public void setHealth(Health health) {
        this.health = health;
    }

    public Mana getMana() {
        return mana;
    }

    public void setMana(Mana mana) {
        this.mana = mana;
    }

    public void setSlots(Inventory slots) {
        this.slots = slots;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hide() {

    }

    public void camp() {

    }
}
