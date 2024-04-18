package me.kbrewster.hypixelapi.player.stats.tnt;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import me.kbrewster.hypixelapi.player.stats.BasicStats;

import java.util.List;

@Getter
public class TNTGames implements BasicStats {

    @Getter
    @SerializedName("coins")
    @Expose
    private long coins;
    @SerializedName("deaths_bowspleef")
    @Expose
    private long deathsBowspleef;
    @SerializedName("deaths_capture")
    @Expose
    private long deathsCapture;
    @SerializedName("doublejump_tntrun")
    @Expose
    private long doublejumpTntrun;
    @SerializedName("firewizard_explode")
    @Expose
    private long firewizardExplode;
    @SerializedName("firewizard_regen")
    @Expose
    private long firewizardRegen;
    @SerializedName("icewizard_explode")
    @Expose
    private long icewizardExplode;
    @SerializedName("icewizard_regen")
    @Expose
    private long icewizardRegen;
    @SerializedName("kills_capture")
    @Expose
    private long killsCapture;
    @SerializedName("kineticwizard_explode")
    @Expose
    private long kineticwizardExplode;
    @SerializedName("kineticwizard_regen")
    @Expose
    private long kineticwizardRegen;
    @SerializedName("spleef_doublejump")
    @Expose
    private long spleefDoublejump;
    @SerializedName("spleef_repulse")
    @Expose
    private long spleefRepulse;
    @SerializedName("spleef_triple")
    @Expose
    private long spleefTriple;
    @SerializedName("tags_bowspleef")
    @Expose
    private long tagsBowspleef;
    @SerializedName("wins_capture")
    @Expose
    private long winsCapture;
    @SerializedName("wins_tntag")
    @Expose
    private long winsTntag;
    @SerializedName("witherwizard_explode")
    @Expose
    private long witherwizardExplode;
    @SerializedName("witherwizard_regen")
    @Expose
    private long witherwizardRegen;
    @SerializedName("record_tntrun")
    @Expose
    private long recordTntrun;
    @SerializedName("packages")
    @Expose
    private List<String> packages = null;
    @SerializedName("selected_hat")
    @Expose
    private String selectedHat;
    @SerializedName("record_pvprun")
    @Expose
    private long recordPvprun;
    @SerializedName("kills_pvprun")
    @Expose
    private long killsPvprun;
    @SerializedName("kills_tntag")
    @Expose
    private long killsTntag;
    @SerializedName("votes_Forgotten Planet")
    @Expose
    private long votesForgottenPlanet;
    @SerializedName("assists_capture")
    @Expose
    private long assistsCapture;
    @SerializedName("votes_Twinspire")
    @Expose
    private long votesTwinspire;
    @SerializedName("votes_Quadral")
    @Expose
    private long votesQuadral;
    @SerializedName("votes_Tombed")
    @Expose
    private long votesTombed;
    @SerializedName("capture_class")
    @Expose
    private String captureClass;
    @SerializedName("votes_Totum")
    @Expose
    private long votesTotum;
    @SerializedName("votes_Crucible")
    @Expose
    private long votesCrucible;
    @SerializedName("votes_Dread Pit")
    @Expose
    private long votesDreadPit;
    @SerializedName("wins_pvprun")
    @Expose
    private long winsPvprun;
    @SerializedName("votes_Crystalline")
    @Expose
    private long votesCrystalline;
    @SerializedName("votes_Firefall")
    @Expose
    private long votesFirefall;
    @SerializedName("bloodwizard_regen")
    @Expose
    private long bloodwizardRegen;
    @SerializedName("active_death_effect")
    @Expose
    private String activeDeathEffect;
    @SerializedName("bloodwizard_explode")
    @Expose
    private long bloodwizardExplode;
    @SerializedName("tag_speed")
    @Expose
    private long tagSpeed;
    @SerializedName("active_particle_effect")
    @Expose
    private String activeParticleEffect;
    @SerializedName("votes_Heather")
    @Expose
    private long votesHeather;
    @SerializedName("votes_Greenbelt")
    @Expose
    private long votesGreenbelt;
    @SerializedName("wins_tntrun")
    @Expose
    private long winsTntrun;
    @SerializedName("new_kineticwizard_explode")
    @Expose
    private long newKineticwizardExplode;
    @SerializedName("new_bloodwizard_explode")
    @Expose
    private long newBloodwizardExplode;
    @SerializedName("new_pvprun_double_jumps")
    @Expose
    private long newPvprunDoubleJumps;
    @SerializedName("new_witherwizard_regen")
    @Expose
    private long newWitherwizardRegen;
    @SerializedName("new_firewizard_regen")
    @Expose
    private long newFirewizardRegen;
    @SerializedName("new_bloodwizard_regen")
    @Expose
    private long newBloodwizardRegen;
    @SerializedName("new_spleef_repulsor")
    @Expose
    private long newSpleefRepulsor;
    @SerializedName("new_icewizard_explode")
    @Expose
    private long newIcewizardExplode;
    @SerializedName("new_tntag_speedy")
    @Expose
    private long newTntagSpeedy;
    @SerializedName("new_kineticwizard_regen")
    @Expose
    private long newKineticwizardRegen;
    @SerializedName("new_witherwizard_explode")
    @Expose
    private long newWitherwizardExplode;
    @SerializedName("new_firewizard_explode")
    @Expose
    private long newFirewizardExplode;
    @SerializedName("new_spleef_tripleshot")
    @Expose
    private long newSpleefTripleshot;
    @SerializedName("new_icewizard_regen")
    @Expose
    private long newIcewizardRegen;
    @SerializedName("new_tntrun_double_jumps")
    @Expose
    private long newTntrunDoubleJumps;
    @SerializedName("new_spleef_double_jumps")
    @Expose
    private long newSpleefDoubleJumps;
    @SerializedName("new_tntrun_speed_potions")
    @Expose
    private long newTntrunSpeedPotions;
    @SerializedName("new_tntrun_slowness_potions")
    @Expose
    private long newTntrunSlownessPotions;
    @SerializedName("new_pvprun_regeneration")
    @Expose
    private long newPvprunRegeneration;
    @SerializedName("new_pvprun_notoriety")
    @Expose
    private long newPvprunNotoriety;
    @SerializedName("new_pvprun_fortitude")
    @Expose
    private long newPvprunFortitude;
    @SerializedName("new_spleef_arrowtrail")
    @Expose
    private String newSpleefArrowtrail;
    @SerializedName("tag_blastprotection")
    @Expose
    private long tagBlastprotection;
    @SerializedName("new_tag_suit")
    @Expose
    private String newTagSuit;
    @SerializedName("tag_speeditup")
    @Expose
    private long tagSpeeditup;
    @SerializedName("tag_slowitdown")
    @Expose
    private long tagSlowitdown;
    @SerializedName("new_toxicwizard_explode")
    @Expose
    private long newToxicwizardExplode;
    @SerializedName("new_toxicwizard_regen")
    @Expose
    private long newToxicwizardRegen;
    @SerializedName("new_double_jump_effect")
    @Expose
    private String newDoubleJumpEffect;
    @SerializedName("new_active_particle_effect")
    @Expose
    private String newActiveParticleEffect;
    @SerializedName("winstreak")
    @Expose
    private long winstreak;
    @SerializedName("run_potions_splashed_on_players")
    @Expose
    private long runPotionsSplashedOnPlayers;
    @SerializedName("deaths_tntrun")
    @Expose
    private long deathsTntrun;
    @SerializedName("new_selected_hat")
    @Expose
    private String newSelectedHat;
    @SerializedName("deaths_pvprun")
    @Expose
    private long deathsPvprun;
    @SerializedName("wizards_selected_class")
    @Expose
    private String wizardsSelectedClass;
    @SerializedName("new_witherwizard_assists")
    @Expose
    private long newWitherwizardAssists;
    @SerializedName("new_witherwizard_kills")
    @Expose
    private long newWitherwizardKills;
    @SerializedName("new_witherwizard_deaths")
    @Expose
    private long newWitherwizardDeaths;
    @SerializedName("new_toxicwizard_kills")
    @Expose
    private long newToxicwizardKills;
    @Getter
    @SerializedName("wins")
    @Expose
    private long wins;

    @Override
    public long getKills() {
        return wins;
    }

    @Override
    public long getDeaths() {
        return deathsBowspleef + deathsCapture + deathsTntrun + deathsPvprun;
    }

    @Override
    public long getGamesPlayed() {
        return wins + getDeaths();
    }

    public void setWins(long wins) {
        this.wins = wins;
    }

}
