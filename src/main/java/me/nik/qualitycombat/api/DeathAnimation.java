package me.nik.qualitycombat.api;

import org.bukkit.entity.Player;

public abstract class DeathAnimation {

    private final String name;

    public DeathAnimation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void execute(Player player);
}