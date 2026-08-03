package me.nik.qualitycombat.api;

import java.util.UUID;

public interface QualityCombatAPI {
    long getRemainingCombatLogTime(UUID uuid);
    void registerDeathAnimation(DeathAnimation deathAnimation);
}