package me.kbrewster.hypixelapi.player.stats.gingerbread;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import me.kbrewster.hypixelapi.player.stats.BasicStats;

import java.util.List;

@Getter
public class GingerBread implements BasicStats {

    @SerializedName("coins")
    @Expose 
    private long coins;
    @SerializedName("booster_active")
    @Expose 
    private String boosterActive;
    @SerializedName("engine_active")
    @Expose 
    private String engineActive;
    @SerializedName("frame_active")
    @Expose 
    private String frameActive;
    @SerializedName("packages")
    @Expose 
    private List<String> packages = null;
    @SerializedName("helmet_active")
    @Expose 
    private String helmetActive;
    @SerializedName("jacket_active")
    @Expose 
    private String jacketActive;
    @SerializedName("shoes_active")
    @Expose 
    private String shoesActive;
    @SerializedName("skin_active")
    @Expose 
    private String skinActive;
    @SerializedName("pants_active")
    @Expose 
    private String pantsActive;
    @SerializedName("horn")
    @Expose 
    private String horn;
    @SerializedName("box_pickups")
    @Expose 
    private long boxPickups;
    @SerializedName("laps_completed")
    @Expose 
    private long lapsCompleted;
    @SerializedName("banana_hits_received")
    @Expose 
    private long bananaHitsReceived;
    @SerializedName("coins_picked_up")
    @Expose 
    private long coinsPickedUp;
    @SerializedName("parts")
    @Expose 
    private String parts;
    @SerializedName("banana_hits_sent")
    @Expose 
    private long bananaHitsSent;
    @SerializedName("silver_trophy")
    @Expose 
    private long silverTrophy;
    @SerializedName("wins")
    @Expose 
    private long wins;
    @SerializedName("blue_torpedo_hit")
    @Expose 
    private long blueTorpedoHit;
    @SerializedName("bronze_trophy")
    @Expose 
    private long bronzeTrophy;
    @SerializedName("gold_trophy")
    @Expose 
    private long goldTrophy;
    @SerializedName("gold_trophy_olympus")
    @Expose 
    private long goldTrophyOlympus;
    @SerializedName("gold_trophy_junglerush")
    @Expose 
    private long goldTrophyJunglerush;
    @SerializedName("silver_trophy_weekly_b")
    @Expose 
    private long silverTrophyWeeklyB;
    @SerializedName("silver_trophy_monthly_b")
    @Expose 
    private long silverTrophyMonthlyB;
    @SerializedName("silver_trophy_olympus")
    @Expose 
    private long silverTrophyOlympus;
    @SerializedName("silver_trophy_junglerush")
    @Expose 
    private long silverTrophyJunglerush;
    @SerializedName("silver_trophy_retro")
    @Expose 
    private long silverTrophyRetro;
    @SerializedName("bronze_trophy_weekly_b")
    @Expose 
    private long bronzeTrophyWeeklyB;
    @SerializedName("bronze_trophy_monthly_b")
    @Expose 
    private long bronzeTrophyMonthlyB;
    @SerializedName("bronze_trophy_olympus")
    @Expose 
    private long bronzeTrophyOlympus;
    @SerializedName("bronze_trophy_junglerush")
    @Expose 
    private long bronzeTrophyJunglerush;
    @SerializedName("bronze_trophy_canyon")
    @Expose 
    private long bronzeTrophyCanyon;
    @SerializedName("box_pickups_weekly_b")
    @Expose 
    private long boxPickupsWeeklyB;
    @SerializedName("box_pickups_monthly_b")
    @Expose 
    private long boxPickupsMonthlyB;
    @SerializedName("box_pickups_olympus")
    @Expose 
    private long boxPickupsOlympus;
    @SerializedName("box_pickups_junglerush")
    @Expose 
    private long boxPickupsJunglerush;
    @SerializedName("box_pickups_hypixelgp")
    @Expose 
    private long boxPickupsHypixelgp;
    @SerializedName("box_pickups_retro")
    @Expose 
    private long boxPickupsRetro;
    @SerializedName("box_pickups_canyon")
    @Expose 
    private long boxPickupsCanyon;
    @SerializedName("olympus_plays")
    @Expose 
    private long olympusPlays;
    @SerializedName("junglerush_plays")
    @Expose 
    private long junglerushPlays;
    @SerializedName("hypixelgp_plays")
    @Expose 
    private long hypixelgpPlays;
    @SerializedName("retro_plays")
    @Expose 
    private long retroPlays;
    @SerializedName("canyon_plays")
    @Expose 
    private long canyonPlays;
    @SerializedName("particle_trail")
    @Expose 
    private String particleTrail;
    @SerializedName("box_pickups_monthly_a")
    @Expose 
    private long boxPickupsMonthlyA;
    @SerializedName("gold_trophy_retro")
    @Expose 
    private long goldTrophyRetro;
    @SerializedName("silver_trophy_monthly_a")
    @Expose 
    private long silverTrophyMonthlyA;
    @SerializedName("silver_trophy_hypixelgp")
    @Expose 
    private long silverTrophyHypixelgp;
    @SerializedName("silver_trophy_canyon")
    @Expose 
    private long silverTrophyCanyon;
    @SerializedName("bronze_trophy_hypixelgp")
    @Expose 
    private long bronzeTrophyHypixelgp;
    @SerializedName("bronze_trophy_monthly_a")
    @Expose 
    private long bronzeTrophyMonthlyA;
    @SerializedName("gold_trophy_canyon")
    @Expose 
    private long goldTrophyCanyon;
    @SerializedName("gold_trophy_hypixelgp")
    @Expose 
    private long goldTrophyHypixelgp;
    @SerializedName("box_pickups_weekly_a")
    @Expose 
    private long boxPickupsWeeklyA;
    @SerializedName("silver_trophy_weekly_a")
    @Expose 
    private long silverTrophyWeeklyA;
    @SerializedName("bronze_trophy_retro")
    @Expose 
    private long bronzeTrophyRetro;
    @SerializedName("bronze_trophy_weekly_a")
    @Expose 
    private long bronzeTrophyWeeklyA;
    @SerializedName("gold_trophy_monthly_b")
    @Expose 
    private long goldTrophyMonthlyB;
    @SerializedName("gold_trophy_weekly_b")
    @Expose 
    private long goldTrophyWeeklyB;
    @SerializedName("gold_trophy_weekly_a")
    @Expose 
    private long goldTrophyWeeklyA;
    @SerializedName("gold_trophy_monthly_a")
    @Expose 
    private long goldTrophyMonthlyA;

    @Override
    public long getKills() {
        return 0;
    }

    @Override
    public long getDeaths() {
        return 0;
    }

    @Override
    public long getGamesPlayed() {
        return hypixelgpPlays;
    }
}
