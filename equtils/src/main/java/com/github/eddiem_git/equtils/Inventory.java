package com.github.eddiem_git.equtils;

public class Inventory {
    Slots slot;

    public Inventory(Slots slot) {
        this.slot = slot;
    }

    public Slots getSlot() {
        return slot;
    }

    public void setSlot(Slots slot) {
        this.slot = slot;
    }
}
