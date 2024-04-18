package me.kbrewster.hypixelapi.player.stats;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import me.kbrewster.hypixelapi.player.stats.arena.Arena;
import me.kbrewster.hypixelapi.player.stats.battlegrounds.BattleGrounds;
import me.kbrewster.hypixelapi.player.stats.duels.Dules;
import me.kbrewster.hypixelapi.player.stats.megawalls.Walls3;
import me.kbrewster.hypixelapi.player.stats.mm.MurderMystery;
import me.kbrewster.hypixelapi.player.stats.skyclash.SkyClash;
import me.kbrewster.hypixelapi.player.stats.skywars.Skywars;
import me.kbrewster.hypixelapi.player.stats.speeduhc.SpeedUHC;
import me.kbrewster.hypixelapi.player.stats.tnt.TNTGames;
import me.kbrewster.hypixelapi.player.stats.uhc.UHC;
import me.kbrewster.hypixelapi.player.stats.vampz.VampireZ;
import me.kbrewster.hypixelapi.player.stats.walls.Walls;

@Getter
public class Stats {

    @Expose
    private me.kbrewster.hypixelapi.player.stats.arcade.Arcade Arcade;
    @Expose
    private Arena Arena;
    @Expose
    private BattleGrounds Battleground;
    @Expose
    private me.kbrewster.hypixelapi.player.stats.hg.HungerGames HungerGames;
    @Expose
    private me.kbrewster.hypixelapi.player.stats.mcgo.MCGO MCGO;
    @Expose
    private me.kbrewster.hypixelapi.player.stats.quake.Quake Quake;
    @Expose
    private TNTGames TNTGames;
    @Expose
    private UHC UHC;
    @Expose
    private Skywars SkyWars;
    @Expose
    private me.kbrewster.hypixelapi.player.stats.gingerbread.GingerBread GingerBread;
    @Expose
    private me.kbrewster.hypixelapi.player.stats.smash.SuperSmash SuperSmash;
    @Expose
    private Walls Walls;
    @Expose
    private Walls3 Walls3;
    @Expose
    private MurderMystery MurderMystery;
    @Expose
    private Dules Duels;
    @Expose
    private me.kbrewster.hypixelapi.player.stats.bedwars.Bedwars Bedwars;
    @Expose
    private me.kbrewster.hypixelapi.player.stats.paintball.Paintball Paintball;
    @Expose
    private VampireZ VampireZ;
    @Expose
    private SpeedUHC SpeedUHC;
    @Expose
    private SkyClash SkyClash;

    public BasicStats getGame(String game) {
        switch (game.toLowerCase()) {
            case "arcade":
                return Arcade;
            case "arena":
                return Arena;
            case "battleground":
                return Battleground;
            case "hungergames":
                return HungerGames;
            case "mcgo":
                return MCGO;
            case "quake":
                return Quake;
            case "tntgames":
                return TNTGames;
            case "uhc":
                return UHC;
            case "skywars":
                return SkyWars;
            case "gingerbread":
                return GingerBread;
            case "supersmash":
                return SuperSmash;
            case "walls":
                return Walls;
            case "walls3":
                return Walls3;
            case "murdermystery":
                return MurderMystery;
            case "duels":
                return Duels;
            case "bedwars":
                return Bedwars;
            case "paintball":
                return Paintball;
            case "vampirez":
                return VampireZ;
            case "speeduhc":
                return SpeedUHC;
            case "skyclash":
                return SkyClash;
            default:
                return null;
        }
    }
}
