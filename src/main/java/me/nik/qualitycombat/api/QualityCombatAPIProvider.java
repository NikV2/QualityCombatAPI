package me.nik.qualitycombat.api;

public class QualityCombatAPIProvider {

    private static QualityCombatAPI API = null;

    public QualityCombatAPIProvider() {
    }

    public static QualityCombatAPI getAPI() {
        return API;
    }

    /**
     * Internal use by QualityCombat only!
     *
     * @param api QualityCombatAPI
     */
    @Deprecated
    public static void register(QualityCombatAPI api) {
        API = api;
    }
}