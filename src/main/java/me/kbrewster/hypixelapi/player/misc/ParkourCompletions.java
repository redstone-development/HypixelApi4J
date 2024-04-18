package me.kbrewster.hypixelapi.player.misc;

import com.google.gson.annotations.Expose;
import lombok.Getter;

import java.util.List;

@Getter
public class ParkourCompletions {
    @Expose
    private List<Parkour> Skywars;
    @Expose
    private List<Parkour> Prototype;
    @Expose
    private List<Parkour> ArcadeGames;
    @Expose
    private List<Parkour> BuildBattle;
    @Expose
    private List<Parkour> uhc;
    @Expose
    private List<Parkour> Bedwars;
    @Expose
    private List<Parkour> SkywarsAug2017;
    @Expose
    private List<Parkour> BlitzLobby;
    @Expose
    private List<Parkour> TNT;
    @Expose
    private List<Parkour> MurderMystery;
    @Expose
    private List<Parkour> Housing;
    @Expose
    private List<Parkour> Duels;

    public List<Parkour> getParkour(String game) {
        switch (game.toLowerCase()) {
            case "skywars":
                return Skywars;
            case "prototype":
                return Prototype;
            case "arcadegames":
                return ArcadeGames;
            case "buildbattle":
                return BuildBattle;
            case "uhc":
                return uhc;
            case "bedwars":
                return Bedwars;
            case "skywarsaug2017":
                return SkywarsAug2017;
            case "blitzlobby":
                return BlitzLobby;
            case "tnt":
                return TNT;
            case "murdermystery":
                return MurderMystery;
            case "housing":
                return Housing;
            case "duels":
                return Duels;
            default:
                return null;
        }
    }

    public static class Parkour {
        @Expose
        private long timeStart;
        @Expose
        private long timeTook;
    }
}
