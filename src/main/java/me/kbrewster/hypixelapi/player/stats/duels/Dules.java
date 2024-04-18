package me.kbrewster.hypixelapi.player.stats.duels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import me.kbrewster.hypixelapi.player.stats.BasicStats;

import java.lang.reflect.Field;

@Getter
public class Dules implements BasicStats {
    @SerializedName("games_played_duels")
    @Expose
    private long gamesPlayedDuels;
    @SerializedName("duels_winstreak_mw_four")
    @Expose
    private long duelsWinstreakMwFour;
    @SerializedName("duels_winstreak_best_mw_four")
    @Expose
    private long duelsWinstreakBestMwFour;
    @SerializedName("melee_swings")
    @Expose
    private long meleeSwings;
    @SerializedName("uhc_duel_health_regenerated")
    @Expose
    private long uhcDuelHealthRegenerated;
    @SerializedName("melee_hits")
    @Expose
    private long meleeHits;
    @SerializedName("uhc_duel_bow_shots")
    @Expose
    private long uhcDuelBowShots;
    @SerializedName("rounds_played")
    @Expose
    private long roundsPlayed;
    @SerializedName("uhc_duel_melee_swings")
    @Expose
    private long uhcDuelMeleeSwings;
    @SerializedName("bow_shots")
    @Expose
    private long bowShots;
    @SerializedName("uhc_duel_bow_hits")
    @Expose
    private long uhcDuelBowHits;
    @SerializedName("uhc_duel_rounds_played")
    @Expose
    private long uhcDuelRoundsPlayed;
    @SerializedName("bow_hits")
    @Expose
    private long bowHits;
    @SerializedName("uhc_duel_damage_dealt")
    @Expose
    private long uhcDuelDamageDealt;
    @SerializedName("health_regenerated")
    @Expose
    private long healthRegenerated;
    @SerializedName("damage_dealt")
    @Expose
    private long damageDealt;
    @SerializedName("uhc_duel_melee_hits")
    @Expose
    private long uhcDuelMeleeHits;
    @SerializedName("current_winstreak")
    @Expose
    private long currentWinstreak;
    @SerializedName("current_uhc_winstreak")
    @Expose
    private long currentUhcWinstreak;
    @SerializedName("best_overall_winstreak")
    @Expose
    private long bestOverallWinstreak;
    @SerializedName("best_uhc_winstreak")
    @Expose
    private long bestUhcWinstreak;
    @SerializedName("duels_winstreak_best_uhc_four")
    @Expose
    private long duelsWinstreakBestUhcFour;
    @SerializedName("uhc_four_health_regenerated")
    @Expose
    private long uhcFourHealthRegenerated;
    @SerializedName("uhc_four_melee_swings")
    @Expose
    private long uhcFourMeleeSwings;
    @SerializedName("uhc_four_bow_hits")
    @Expose
    private long uhcFourBowHits;
    @SerializedName("wins")
    @Expose
    private long wins;
    @SerializedName("uhc_four_melee_hits")
    @Expose
    private long uhcFourMeleeHits;
    @SerializedName("uhc_four_wins")
    @Expose
    private long uhcFourWins;
    @SerializedName("uhc_four_rounds_played")
    @Expose
    private long uhcFourRoundsPlayed;
    @SerializedName("uhc_four_damage_dealt")
    @Expose
    private long uhcFourDamageDealt;
    @SerializedName("uhc_four_bow_shots")
    @Expose
    private long uhcFourBowShots;
    @SerializedName("uhc_tournament_deaths")
    @Expose
    private long uhcTournamentDeaths;
    @SerializedName("uhc_tournament_melee_swings")
    @Expose
    private long uhcTournamentMeleeSwings;
    @SerializedName("deaths")
    @Expose
    private long deaths;
    @SerializedName("uhc_tournament_rounds_played")
    @Expose
    private long uhcTournamentRoundsPlayed;
    @SerializedName("uhc_tournament_melee_hits")
    @Expose
    private long uhcTournamentMeleeHits;
    @SerializedName("uhc_tournament_health_regenerated")
    @Expose
    private long uhcTournamentHealthRegenerated;
    @SerializedName("uhc_tournament_damage_dealt")
    @Expose
    private long uhcTournamentDamageDealt;
    @SerializedName("current_mega_walls_winstreak")
    @Expose
    private long currentMegaWallsWinstreak;
    @SerializedName("best_mega_walls_winstreak")
    @Expose
    private long bestMegaWallsWinstreak;
    @SerializedName("duels_winstreak_best_mw_doubles")
    @Expose
    private long duelsWinstreakBestMwDoubles;
    @SerializedName("mw_doubles_melee_hits")
    @Expose
    private long mwDoublesMeleeHits;
    @SerializedName("mw_doubles_health_regenerated")
    @Expose
    private long mwDoublesHealthRegenerated;
    @SerializedName("mw_doubles_kills")
    @Expose
    private long mwDoublesKills;
    @SerializedName("mw_doubles_damage_dealt")
    @Expose
    private long mwDoublesDamageDealt;
    @SerializedName("dreadlord_kit_wins")
    @Expose
    private long dreadlordKitWins;
    @SerializedName("mw_doubles_wins")
    @Expose
    private long mwDoublesWins;
    @SerializedName("mw_doubles_rounds_played")
    @Expose
    private long mwDoublesRoundsPlayed;
    @SerializedName("mw_doubles_kit_wins")
    @Expose
    private long mwDoublesKitWins;
    @SerializedName("kit_wins")
    @Expose
    private long kitWins;
    @SerializedName("kills")
    @Expose
    private long kills;
    @SerializedName("mw_doubles_dreadlord_kit_wins")
    @Expose
    private long mwDoublesDreadlordKitWins;
    @SerializedName("mw_doubles_melee_swings")
    @Expose
    private long mwDoublesMeleeSwings;
    @SerializedName("uhc_four_kills")
    @Expose
    private long uhcFourKills;
    @SerializedName("sw_duel_damage_dealt")
    @Expose
    private long swDuelDamageDealt;
    @SerializedName("sw_duel_rounds_played")
    @Expose
    private long swDuelRoundsPlayed;
    @SerializedName("sw_duel_health_regenerated")
    @Expose
    private long swDuelHealthRegenerated;
    @SerializedName("sw_duel_melee_hits")
    @Expose
    private long swDuelMeleeHits;
    @SerializedName("sw_duel_melee_swings")
    @Expose
    private long swDuelMeleeSwings;
    @SerializedName("bridge_four_goals")
    @Expose
    private long bridgeFourGoals;
    @SerializedName("bridge_doubles_wins")
    @Expose
    private long bridgeDoublesWins;
    @SerializedName("bridge_four_wins")
    @Expose
    private long bridgeFourWins;
    @SerializedName("bridge_duel_wins")
    @Expose
    private long bridgeDuelWins;
    @SerializedName("bridge_duel_deaths")
    @Expose
    private long bridgeDuelDeaths;
    @SerializedName("bridge_doubles_deaths")
    @Expose
    private long bridgeDoublesDeaths;
    @SerializedName("bridge_four_deaths")
    @Expose
    private long bridgeFourDeaths;
    @SerializedName("goals")
    @Expose
    private long goals;
    @SerializedName("bridge_duel_goals")
    @Expose
    private long bridgeDuelGoals;
    @SerializedName("bridge_doubles_goals")
    @Expose
    private long bridgeDoublesGoals;
    @SerializedName("bridge_four_rounds_played")
    @Expose
    private long bridgeFourRoundsPlayed;
    @SerializedName("bridge_four_kills")
    @Expose
    private long bridgeFourKills;
    @SerializedName("bridge_doubles_rounds_played")
    @Expose
    private long bridgeDoublesRoundsPlayed;
    @SerializedName("bridge_doubles_kills")
    @Expose
    private long bridgeDoublesKills;
    @SerializedName("bridge_doubles_losses")
    @Expose
    private long bridgeDoublesLosses;
    @SerializedName("losses")
    @Expose
    private long losses;
    @SerializedName("bridge_duel_kills")
    @Expose
    private long bridgeDuelKills;
    @SerializedName("bridge_four_losses")
    @Expose
    private long bridgeFourLosses;
    @SerializedName("bridge_duel_losses")
    @Expose
    private long bridgeDuelLosses;
    @SerializedName("bridge_duel_rounds_played")
    @Expose
    private long bridgeDuelRoundsPlayed;
    @SerializedName("bridge_rookie_title_prestige")
    @Expose
    private long bridgeRookieTitlePrestige;
    @SerializedName("op_rookie_title_prestige")
    @Expose
    private long opRookieTitlePrestige;
    @SerializedName("bow_rookie_title_prestige")
    @Expose
    private long bowRookieTitlePrestige;
    @SerializedName("sumo_rookie_title_prestige")
    @Expose
    private long sumoRookieTitlePrestige;
    @SerializedName("tournament_rookie_title_prestige")
    @Expose
    private long tournamentRookieTitlePrestige;
    @SerializedName("combo_rookie_title_prestige")
    @Expose
    private long comboRookieTitlePrestige;
    @SerializedName("blitz_rookie_title_prestige")
    @Expose
    private long blitzRookieTitlePrestige;
    @SerializedName("uhc_rookie_title_prestige")
    @Expose
    private long uhcRookieTitlePrestige;
    @SerializedName("all_modes_rookie_title_prestige")
    @Expose
    private long allModesRookieTitlePrestige;
    @SerializedName("tnt_games_rookie_title_prestige")
    @Expose
    private long tntGamesRookieTitlePrestige;
    @SerializedName("no_debuff_rookie_title_prestige")
    @Expose
    private long noDebuffRookieTitlePrestige;
    @SerializedName("mega_walls_rookie_title_prestige")
    @Expose
    private long megaWallsRookieTitlePrestige;
    @SerializedName("classic_rookie_title_prestige")
    @Expose
    private long classicRookieTitlePrestige;
    @SerializedName("skywars_rookie_title_prestige")
    @Expose
    private long skywarsRookieTitlePrestige;
    @SerializedName("current_bridge_winstreak")
    @Expose
    private long currentBridgeWinstreak;
    @SerializedName("current_winstreak_mode_bridge_doubles")
    @Expose
    private long currentWinstreakModeBridgeDoubles;
    @SerializedName("bridge_doubles_bridge_deaths")
    @Expose
    private long bridgeDoublesBridgeDeaths;
    @SerializedName("blocks_placed")
    @Expose
    private long blocksPlaced;
    @SerializedName("bridge_doubles_bridge_kills")
    @Expose
    private long bridgeDoublesBridgeKills;
    @SerializedName("bridge_doubles_damage_dealt")
    @Expose
    private long bridgeDoublesDamageDealt;
    @SerializedName("bridge_doubles_health_regenerated")
    @Expose
    private long bridgeDoublesHealthRegenerated;
    @SerializedName("bridge_doubles_blocks_placed")
    @Expose
    private long bridgeDoublesBlocksPlaced;
    @SerializedName("bridge_doubles_bow_shots")
    @Expose
    private long bridgeDoublesBowShots;
    @SerializedName("bridge_doubles_melee_swings")
    @Expose
    private long bridgeDoublesMeleeSwings;
    @SerializedName("coins")
    @Expose
    private long coins;
    @SerializedName("bridge_doubles_melee_hits")
    @Expose
    private long bridgeDoublesMeleeHits;
    @SerializedName("bridge_kills")
    @Expose
    private long bridgeKills;
    @SerializedName("bridge_deaths")
    @Expose
    private long bridgeDeaths;
    @SerializedName("leaderboardPage_goals")
    @Expose
    private long leaderboardPageGoals;
    @SerializedName("bridge_doubles_bow_hits")
    @Expose
    private long bridgeDoublesBowHits;
    @SerializedName("best_bridge_winstreak")
    @Expose
    private long bestBridgeWinstreak;
    @SerializedName("best_winstreak_mode_bridge_doubles")
    @Expose
    private long bestWinstreakModeBridgeDoubles;
    @SerializedName("leaderboardPage_wins")
    @Expose
    private long leaderboardPageWins;
    @SerializedName("duels_winstreak_best_bridge_doubles")
    @Expose
    private long duelsWinstreakBestBridgeDoubles;
    @SerializedName("sw_doubles_melee_hits")
    @Expose
    private long swDoublesMeleeHits;
    @SerializedName("sw_doubles_melee_swings")
    @Expose
    private long swDoublesMeleeSwings;
    @SerializedName("sw_doubles_rounds_played")
    @Expose
    private long swDoublesRoundsPlayed;
    @SerializedName("sw_doubles_blocks_placed")
    @Expose
    private long swDoublesBlocksPlaced;
    @SerializedName("sw_doubles_health_regenerated")
    @Expose
    private long swDoublesHealthRegenerated;
    @SerializedName("sw_doubles_damage_dealt")
    @Expose
    private long swDoublesDamageDealt;
    @SerializedName("current_skywars_winstreak")
    @Expose
    private long currentSkywarsWinstreak;
    @SerializedName("best_skywars_winstreak")
    @Expose
    private long bestSkywarsWinstreak;
    @SerializedName("current_winstreak_mode_sw_doubles")
    @Expose
    private long currentWinstreakModeSwDoubles;
    @SerializedName("best_winstreak_mode_sw_doubles")
    @Expose
    private long bestWinstreakModeSwDoubles;
    @SerializedName("duels_chests")
    @Expose
    private long duelsChests;
    @SerializedName("armorer_kit_wins")
    @Expose
    private long armorerKitWins;
    @SerializedName("sw_doubles_armorer_kit_wins")
    @Expose
    private long swDoublesArmorerKitWins;
    @SerializedName("sw_doubles_kit_wins")
    @Expose
    private long swDoublesKitWins;
    @SerializedName("sw_doubles_wins")
    @Expose
    private long swDoublesWins;
    @SerializedName("current_winstreak_mode_uhc_duel")
    @Expose
    private long currentWinstreakModeUhcDuel;
    @SerializedName("golden_apples_eaten")
    @Expose
    private long goldenApplesEaten;
    @SerializedName("uhc_duel_deaths")
    @Expose
    private long uhcDuelDeaths;
    @SerializedName("uhc_duel_golden_apples_eaten")
    @Expose
    private long uhcDuelGoldenApplesEaten;
    @SerializedName("uhc_duel_losses")
    @Expose
    private long uhcDuelLosses;
    @SerializedName("best_winstreak_mode_uhc_duel")
    @Expose
    private long bestWinstreakModeUhcDuel;
    @SerializedName("uhc_duel_kills")
    @Expose
    private long uhcDuelKills;
    @SerializedName("uhc_duel_wins")
    @Expose
    private long uhcDuelWins;
    @SerializedName("best_winstreak_mode_sw_duel")
    @Expose
    private long bestWinstreakModeSwDuel;
    @SerializedName("current_winstreak_mode_sw_duel")
    @Expose
    private long currentWinstreakModeSwDuel;
    @SerializedName("champion_kit_wins")
    @Expose
    private long championKitWins;
    @SerializedName("sw_duel_blocks_placed")
    @Expose
    private long swDuelBlocksPlaced;
    @SerializedName("sw_duel_champion_kit_wins")
    @Expose
    private long swDuelChampionKitWins;
    @SerializedName("sw_duel_kills")
    @Expose
    private long swDuelKills;
    @SerializedName("sw_duel_kit_wins")
    @Expose
    private long swDuelKitWins;
    @SerializedName("sw_duel_wins")
    @Expose
    private long swDuelWins;
    @SerializedName("sw_doubles_champion_kit_wins")
    @Expose
    private long swDoublesChampionKitWins;
    @SerializedName("sw_doubles_kills")
    @Expose
    private long swDoublesKills;
    @SerializedName("current_winstreak_mode_uhc_meetup")
    @Expose
    private long currentWinstreakModeUhcMeetup;
    @SerializedName("uhc_meetup_blocks_placed")
    @Expose
    private long uhcMeetupBlocksPlaced;
    @SerializedName("uhc_meetup_bow_hits")
    @Expose
    private long uhcMeetupBowHits;
    @SerializedName("uhc_meetup_bow_shots")
    @Expose
    private long uhcMeetupBowShots;
    @SerializedName("uhc_meetup_damage_dealt")
    @Expose
    private long uhcMeetupDamageDealt;
    @SerializedName("uhc_meetup_deaths")
    @Expose
    private long uhcMeetupDeaths;
    @SerializedName("uhc_meetup_health_regenerated")
    @Expose
    private long uhcMeetupHealthRegenerated;
    @SerializedName("uhc_meetup_kills")
    @Expose
    private long uhcMeetupKills;
    @SerializedName("uhc_meetup_losses")
    @Expose
    private long uhcMeetupLosses;
    @SerializedName("uhc_meetup_melee_hits")
    @Expose
    private long uhcMeetupMeleeHits;
    @SerializedName("uhc_meetup_melee_swings")
    @Expose
    private long uhcMeetupMeleeSwings;
    @SerializedName("uhc_meetup_rounds_played")
    @Expose
    private long uhcMeetupRoundsPlayed;
    @SerializedName("current_winstreak_mode_mw_duel")
    @Expose
    private long currentWinstreakModeMwDuel;
    @SerializedName("mw_duel_bow_hits")
    @Expose
    private long mwDuelBowHits;
    @SerializedName("mw_duel_bow_shots")
    @Expose
    private long mwDuelBowShots;
    @SerializedName("mw_duel_damage_dealt")
    @Expose
    private long mwDuelDamageDealt;
    @SerializedName("mw_duel_deaths")
    @Expose
    private long mwDuelDeaths;
    @SerializedName("mw_duel_health_regenerated")
    @Expose
    private long mwDuelHealthRegenerated;
    @SerializedName("mw_duel_losses")
    @Expose
    private long mwDuelLosses;
    @SerializedName("mw_duel_melee_hits")
    @Expose
    private long mwDuelMeleeHits;
    @SerializedName("mw_duel_melee_swings")
    @Expose
    private long mwDuelMeleeSwings;
    @SerializedName("mw_duel_rounds_played")
    @Expose
    private long mwDuelRoundsPlayed;
    @SerializedName("current_winstreak_mode_bridge_duel")
    @Expose
    private long currentWinstreakModeBridgeDuel;
    @SerializedName("best_winstreak_mode_bridge_duel")
    @Expose
    private long bestWinstreakModeBridgeDuel;
    @SerializedName("bridge_duel_blocks_placed")
    @Expose
    private long bridgeDuelBlocksPlaced;
    @SerializedName("bridge_duel_bow_hits")
    @Expose
    private long bridgeDuelBowHits;
    @SerializedName("bridge_duel_bow_shots")
    @Expose
    private long bridgeDuelBowShots;
    @SerializedName("bridge_duel_bridge_deaths")
    @Expose
    private long bridgeDuelBridgeDeaths;
    @SerializedName("bridge_duel_bridge_kills")
    @Expose
    private long bridgeDuelBridgeKills;
    @SerializedName("bridge_duel_damage_dealt")
    @Expose
    private long bridgeDuelDamageDealt;
    @SerializedName("bridge_duel_health_regenerated")
    @Expose
    private long bridgeDuelHealthRegenerated;
    @SerializedName("bridge_duel_melee_hits")
    @Expose
    private long bridgeDuelMeleeHits;
    @SerializedName("bridge_duel_melee_swings")
    @Expose
    private long bridgeDuelMeleeSwings;
    @SerializedName("current_winstreak_mode_bridge_four")
    @Expose
    private long currentWinstreakModeBridgeFour;
    @SerializedName("best_winstreak_mode_bridge_four")
    @Expose
    private long bestWinstreakModeBridgeFour;
    @SerializedName("bridge_four_blocks_placed")
    @Expose
    private long bridgeFourBlocksPlaced;
    @SerializedName("bridge_four_bridge_deaths")
    @Expose
    private long bridgeFourBridgeDeaths;
    @SerializedName("bridge_four_bridge_kills")
    @Expose
    private long bridgeFourBridgeKills;
    @SerializedName("bridge_four_damage_dealt")
    @Expose
    private long bridgeFourDamageDealt;
    @SerializedName("bridge_four_health_regenerated")
    @Expose
    private long bridgeFourHealthRegenerated;
    @SerializedName("bridge_four_melee_hits")
    @Expose
    private long bridgeFourMeleeHits;
    @SerializedName("bridge_four_melee_swings")
    @Expose
    private long bridgeFourMeleeSwings;
    @SerializedName("best_winstreak_mode_uhc_meetup")
    @Expose
    private long bestWinstreakModeUhcMeetup;
    @SerializedName("uhc_meetup_wins")
    @Expose
    private long uhcMeetupWins;
    @SerializedName("current_winstreak_mode_sumo_duel")
    @Expose
    private long currentWinstreakModeSumoDuel;
    @SerializedName("current_sumo_winstreak")
    @Expose
    private long currentSumoWinstreak;
    @SerializedName("sumo_duel_deaths")
    @Expose
    private long sumoDuelDeaths;
    @SerializedName("sumo_duel_losses")
    @Expose
    private long sumoDuelLosses;
    @SerializedName("sumo_duel_melee_swings")
    @Expose
    private long sumoDuelMeleeSwings;
    @SerializedName("sumo_duel_rounds_played")
    @Expose
    private long sumoDuelRoundsPlayed;
    @SerializedName("best_sumo_winstreak")
    @Expose
    private long bestSumoWinstreak;
    @SerializedName("best_winstreak_mode_sumo_duel")
    @Expose
    private long bestWinstreakModeSumoDuel;
    @SerializedName("sumo_duel_kills")
    @Expose
    private long sumoDuelKills;
    @SerializedName("sumo_duel_melee_hits")
    @Expose
    private long sumoDuelMeleeHits;
    @SerializedName("sumo_duel_wins")
    @Expose
    private long sumoDuelWins;
    @SerializedName("best_classic_winstreak")
    @Expose
    private long bestClassicWinstreak;
    @SerializedName("current_classic_winstreak")
    @Expose
    private long currentClassicWinstreak;
    @SerializedName("current_winstreak_mode_classic_duel")
    @Expose
    private long currentWinstreakModeClassicDuel;
    @SerializedName("best_winstreak_mode_classic_duel")
    @Expose
    private long bestWinstreakModeClassicDuel;
    @SerializedName("classic_duel_bow_hits")
    @Expose
    private long classicDuelBowHits;
    @SerializedName("classic_duel_bow_shots")
    @Expose
    private long classicDuelBowShots;
    @SerializedName("classic_duel_damage_dealt")
    @Expose
    private long classicDuelDamageDealt;
    @SerializedName("classic_duel_health_regenerated")
    @Expose
    private long classicDuelHealthRegenerated;
    @SerializedName("classic_duel_kills")
    @Expose
    private long classicDuelKills;
    @SerializedName("classic_duel_melee_hits")
    @Expose
    private long classicDuelMeleeHits;
    @SerializedName("classic_duel_melee_swings")
    @Expose
    private long classicDuelMeleeSwings;
    @SerializedName("classic_duel_rounds_played")
    @Expose
    private long classicDuelRoundsPlayed;
    @SerializedName("classic_duel_wins")
    @Expose
    private long classicDuelWins;
    @SerializedName("best_winstreak_mode_op_duel")
    @Expose
    private long bestWinstreakModeOpDuel;
    @SerializedName("current_winstreak_mode_op_duel")
    @Expose
    private long currentWinstreakModeOpDuel;
    @SerializedName("current_op_winstreak")
    @Expose
    private long currentOpWinstreak;
    @SerializedName("best_op_winstreak")
    @Expose
    private long bestOpWinstreak;
    @SerializedName("op_duel_damage_dealt")
    @Expose
    private long opDuelDamageDealt;
    @SerializedName("op_duel_health_regenerated")
    @Expose
    private long opDuelHealthRegenerated;
    @SerializedName("op_duel_kills")
    @Expose
    private long opDuelKills;
    @SerializedName("op_duel_melee_hits")
    @Expose
    private long opDuelMeleeHits;
    @SerializedName("op_duel_melee_swings")
    @Expose
    private long opDuelMeleeSwings;
    @SerializedName("op_duel_rounds_played")
    @Expose
    private long opDuelRoundsPlayed;
    @SerializedName("op_duel_wins")
    @Expose
    private long opDuelWins;
    @SerializedName("duels_winstreak_best_op_duel")
    @Expose
    private long duelsWinstreakBestOpDuel;
    @SerializedName("current_winstreak_mode_op_doubles")
    @Expose
    private long currentWinstreakModeOpDoubles;
    @SerializedName("best_winstreak_mode_op_doubles")
    @Expose
    private long bestWinstreakModeOpDoubles;
    @SerializedName("op_doubles_damage_dealt")
    @Expose
    private long opDoublesDamageDealt;
    @SerializedName("op_doubles_health_regenerated")
    @Expose
    private long opDoublesHealthRegenerated;
    @SerializedName("op_doubles_kills")
    @Expose
    private long opDoublesKills;
    @SerializedName("op_doubles_melee_hits")
    @Expose
    private long opDoublesMeleeHits;
    @SerializedName("op_doubles_melee_swings")
    @Expose
    private long opDoublesMeleeSwings;
    @SerializedName("op_doubles_rounds_played")
    @Expose
    private long opDoublesRoundsPlayed;
    @SerializedName("op_doubles_wins")
    @Expose
    private long opDoublesWins;
    @SerializedName("current_winstreak_mode_uhc_doubles")
    @Expose
    private long currentWinstreakModeUhcDoubles;
    @SerializedName("uhc_doubles_blocks_placed")
    @Expose
    private long uhcDoublesBlocksPlaced;
    @SerializedName("uhc_doubles_bow_hits")
    @Expose
    private long uhcDoublesBowHits;
    @SerializedName("uhc_doubles_bow_shots")
    @Expose
    private long uhcDoublesBowShots;
    @SerializedName("uhc_doubles_damage_dealt")
    @Expose
    private long uhcDoublesDamageDealt;
    @SerializedName("uhc_doubles_deaths")
    @Expose
    private long uhcDoublesDeaths;
    @SerializedName("uhc_doubles_golden_apples_eaten")
    @Expose
    private long uhcDoublesGoldenApplesEaten;
    @SerializedName("uhc_doubles_health_regenerated")
    @Expose
    private long uhcDoublesHealthRegenerated;
    @SerializedName("uhc_doubles_kills")
    @Expose
    private long uhcDoublesKills;
    @SerializedName("uhc_doubles_losses")
    @Expose
    private long uhcDoublesLosses;
    @SerializedName("uhc_doubles_melee_hits")
    @Expose
    private long uhcDoublesMeleeHits;
    @SerializedName("uhc_doubles_melee_swings")
    @Expose
    private long uhcDoublesMeleeSwings;
    @SerializedName("uhc_doubles_rounds_played")
    @Expose
    private long uhcDoublesRoundsPlayed;
    @SerializedName("duels_winstreak_best_bridge_duel")
    @Expose
    private long duelsWinstreakBestBridgeDuel;
    @SerializedName("best_winstreak_mode_uhc_doubles")
    @Expose
    private long bestWinstreakModeUhcDoubles;
    @SerializedName("uhc_doubles_wins")
    @Expose
    private long uhcDoublesWins;
    @SerializedName("bridge_four_bow_shots")
    @Expose
    private long bridgeFourBowShots;
    @SerializedName("uhc_duel_blocks_placed")
    @Expose
    private long uhcDuelBlocksPlaced;
    @SerializedName("duels_winstreak_best_uhc_duel")
    @Expose
    private long duelsWinstreakBestUhcDuel;
    @SerializedName("heal_pots_used")
    @Expose
    private long healPotsUsed;
    @SerializedName("potion_duel_damage_dealt")
    @Expose
    private long potionDuelDamageDealt;
    @SerializedName("potion_duel_heal_pots_used")
    @Expose
    private long potionDuelHealPotsUsed;
    @SerializedName("potion_duel_health_regenerated")
    @Expose
    private long potionDuelHealthRegenerated;
    @SerializedName("potion_duel_melee_hits")
    @Expose
    private long potionDuelMeleeHits;
    @SerializedName("potion_duel_melee_swings")
    @Expose
    private long potionDuelMeleeSwings;
    @SerializedName("potion_duel_rounds_played")
    @Expose
    private long potionDuelRoundsPlayed;
    @SerializedName("combo_duel_golden_apples_eaten")
    @Expose
    private long comboDuelGoldenApplesEaten;
    @SerializedName("combo_duel_health_regenerated")
    @Expose
    private long comboDuelHealthRegenerated;
    @SerializedName("combo_duel_melee_hits")
    @Expose
    private long comboDuelMeleeHits;
    @SerializedName("combo_duel_melee_swings")
    @Expose
    private long comboDuelMeleeSwings;
    @SerializedName("combo_duel_rounds_played")
    @Expose
    private long comboDuelRoundsPlayed;
    @SerializedName("equipped_ranked_titles")
    @Expose
    private long equippedRankedTitles;
    @SerializedName("sw_duel_bow_hits")
    @Expose
    private long swDuelBowHits;
    @SerializedName("sw_duel_bow_shots")
    @Expose
    private long swDuelBowShots;
    @SerializedName("bridge_four_bow_hits")
    @Expose
    private long bridgeFourBowHits;
    @SerializedName("bridge_2v2v2v2_blocks_placed")
    @Expose
    private long bridge2v2v2v2BlocksPlaced;
    @SerializedName("bridge_2v2v2v2_bow_hits")
    @Expose
    private long bridge2v2v2v2BowHits;
    @SerializedName("bridge_2v2v2v2_bow_shots")
    @Expose
    private long bridge2v2v2v2BowShots;
    @SerializedName("bridge_2v2v2v2_damage_dealt")
    @Expose
    private long bridge2v2v2v2DamageDealt;
    @SerializedName("bridge_2v2v2v2_health_regenerated")
    @Expose
    private long bridge2v2v2v2HealthRegenerated;
    @SerializedName("bridge_2v2v2v2_melee_hits")
    @Expose
    private long bridge2v2v2v2MeleeHits;
    @SerializedName("bridge_2v2v2v2_melee_swings")
    @Expose
    private long bridge2v2v2v2MeleeSwings;
    @SerializedName("bridge_2v2v2v2_rounds_played")
    @Expose
    private long bridge2v2v2v2RoundsPlayed;
    @SerializedName("duels_winstreak_best_classic_duel")
    @Expose
    private long duelsWinstreakBestClassicDuel;
    @SerializedName("classic_duel_deaths")
    @Expose
    private long classicDuelDeaths;
    @SerializedName("classic_duel_losses")
    @Expose
    private long classicDuelLosses;
    @SerializedName("leaderboardPage_win_streak")
    @Expose
    private long leaderboardPageWinStreak;
    @SerializedName("current_winstreak_mode_uhc_four")
    @Expose
    private long currentWinstreakModeUhcFour;
    @SerializedName("best_winstreak_mode_uhc_four")
    @Expose
    private long bestWinstreakModeUhcFour;
    @SerializedName("uhc_four_blocks_placed")
    @Expose
    private long uhcFourBlocksPlaced;
    @SerializedName("bowspleef_duel_bow_shots")
    @Expose
    private long bowspleefDuelBowShots;
    @SerializedName("bowspleef_duel_rounds_played")
    @Expose
    private long bowspleefDuelRoundsPlayed;
    @SerializedName("mw_doubles_bow_hits")
    @Expose
    private long mwDoublesBowHits;
    @SerializedName("mw_doubles_bow_shots")
    @Expose
    private long mwDoublesBowShots;
    @SerializedName("current_winstreak_mode_bridge_3v3v3v3")
    @Expose
    private long currentWinstreakModeBridge3v3v3v3;
    @SerializedName("bridge_3v3v3v3_bow_shots")
    @Expose
    private long bridge3v3v3v3BowShots;
    @SerializedName("bridge_3v3v3v3_bridge_deaths")
    @Expose
    private long bridge3v3v3v3BridgeDeaths;
    @SerializedName("bridge_3v3v3v3_bridge_kills")
    @Expose
    private long bridge3v3v3v3BridgeKills;
    @SerializedName("bridge_3v3v3v3_damage_dealt")
    @Expose
    private long bridge3v3v3v3DamageDealt;
    @SerializedName("bridge_3v3v3v3_losses")
    @Expose
    private long bridge3v3v3v3Losses;
    @SerializedName("bridge_3v3v3v3_melee_hits")
    @Expose
    private long bridge3v3v3v3MeleeHits;
    @SerializedName("bridge_3v3v3v3_melee_swings")
    @Expose
    private long bridge3v3v3v3MeleeSwings;
    @SerializedName("bridge_3v3v3v3_rounds_played")
    @Expose
    private long bridge3v3v3v3RoundsPlayed;
    @SerializedName("best_winstreak_mode_bridge_3v3v3v3")
    @Expose
    private long bestWinstreakModeBridge3v3v3v3;
    @SerializedName("bridge_3v3v3v3_blocks_placed")
    @Expose
    private long bridge3v3v3v3BlocksPlaced;
    @SerializedName("bridge_3v3v3v3_bow_hits")
    @Expose
    private long bridge3v3v3v3BowHits;
    @SerializedName("bridge_3v3v3v3_goals")
    @Expose
    private long bridge3v3v3v3Goals;
    @SerializedName("bridge_3v3v3v3_health_regenerated")
    @Expose
    private long bridge3v3v3v3HealthRegenerated;
    @SerializedName("bridge_3v3v3v3_wins")
    @Expose
    private long bridge3v3v3v3Wins;
    @SerializedName("duels_winstreak_best_bridge_3v3v3v3")
    @Expose
    private long duelsWinstreakBestBridge3v3v3v3;
    @SerializedName("duels_winstreak_best_bridge_four")
    @Expose
    private long duelsWinstreakBestBridgeFour;
    @SerializedName("bow_duel_bow_hits")
    @Expose
    private long bowDuelBowHits;
    @SerializedName("bow_duel_bow_shots")
    @Expose
    private long bowDuelBowShots;
    @SerializedName("bow_duel_damage_dealt")
    @Expose
    private long bowDuelDamageDealt;
    @SerializedName("bow_duel_health_regenerated")
    @Expose
    private long bowDuelHealthRegenerated;
    @SerializedName("bow_duel_rounds_played")
    @Expose
    private long bowDuelRoundsPlayed;
    @SerializedName("bridge_iron_title_prestige")
    @Expose
    private long bridgeIronTitlePrestige;
    @SerializedName("op_duel_deaths")
    @Expose
    private long opDuelDeaths;
    @SerializedName("op_duel_losses")
    @Expose
    private long opDuelLosses;
    @SerializedName("blitz_duel_blocks_placed")
    @Expose
    private long blitzDuelBlocksPlaced;
    @SerializedName("blitz_duel_damage_dealt")
    @Expose
    private long blitzDuelDamageDealt;
    @SerializedName("blitz_duel_health_regenerated")
    @Expose
    private long blitzDuelHealthRegenerated;
    @SerializedName("blitz_duel_melee_hits")
    @Expose
    private long blitzDuelMeleeHits;
    @SerializedName("blitz_duel_melee_swings")
    @Expose
    private long blitzDuelMeleeSwings;
    @SerializedName("blitz_duel_rounds_played")
    @Expose
    private long blitzDuelRoundsPlayed;
    @Expose
    @SerializedName("blitz_duel_wins")
    private long blitzDuelWins;
    @Expose
    @SerializedName("blitz_duels_kit")
    private String blitzDuelsKit;
    @SerializedName("all_modes_iron_title_prestige")
    @Expose
    private long allModesIronTitlePrestige;
    @SerializedName("duels_winstreak_best_sumo_duel")
    @Expose
    private long duelsWinstreakBestSumoDuel;
    @SerializedName("current_winstreak_mode_bridge_2v2v2v2")
    @Expose
    private long currentWinstreakModeBridge2v2v2v2;
    @SerializedName("bridge_2v2v2v2_bridge_deaths")
    @Expose
    private long bridge2v2v2v2BridgeDeaths;
    @SerializedName("bridge_2v2v2v2_goals")
    @Expose
    private long bridge2v2v2v2Goals;
    @SerializedName("bridge_2v2v2v2_losses")
    @Expose
    private long bridge2v2v2v2Losses;
    @SerializedName("pyromancer_kit_wins")
    @Expose
    private long pyromancerKitWins;
    @SerializedName("sw_duel_pyromancer_kit_wins")
    @Expose
    private long swDuelPyromancerKitWins;
    @SerializedName("duels_winstreak_best_sw_duel")
    @Expose
    private long duelsWinstreakBestSwDuel;
    @SerializedName("sw_duel_deaths")
    @Expose
    private long swDuelDeaths;
    @SerializedName("sw_duel_losses")
    @Expose
    private long swDuelLosses;
    @SerializedName("boxing_rookie_title_prestige")
    @Expose
    private long boxingRookieTitlePrestige;
    @SerializedName("parkour_rookie_title_prestige")
    @Expose
    private long parkourRookieTitlePrestige;
    @SerializedName("paladin_kit_wins")
    @Expose
    private long paladinKitWins;
    @SerializedName("sw_doubles_paladin_kit_wins")
    @Expose
    private long swDoublesPaladinKitWins;
    @SerializedName("scout_kit_wins")
    @Expose
    private long scoutKitWins;
    @SerializedName("sw_doubles_scout_kit_wins")
    @Expose
    private long swDoublesScoutKitWins;
    @SerializedName("sw_doubles_deaths")
    @Expose
    private long swDoublesDeaths;
    @SerializedName("sw_doubles_losses")
    @Expose
    private long swDoublesLosses;
    @SerializedName("sw_doubles_bow_hits")
    @Expose
    private long swDoublesBowHits;
    @SerializedName("sw_doubles_bow_shots")
    @Expose
    private long swDoublesBowShots;
    @SerializedName("skywars_iron_title_prestige")
    @Expose
    private long skywarsIronTitlePrestige;
    @SerializedName("bridge_duel_golden_apples_eaten")
    @Expose
    private long bridgeDuelGoldenApplesEaten;
    @SerializedName("best_blitz_winstreak")
    @Expose
    private long bestBlitzWinstreak;
    @SerializedName("best_no_debuff_winstreak")
    @Expose
    private long bestNoDebuffWinstreak;
    @SerializedName("best_all_modes_winstreak")
    @Expose
    private long bestAllModesWinstreak;
    @SerializedName("best_tnt_games_winstreak")
    @Expose
    private long bestTntGamesWinstreak;
    @SerializedName("best_boxing_winstreak")
    @Expose
    private long bestBoxingWinstreak;
    @SerializedName("best_arena_winstreak")
    @Expose
    private long bestArenaWinstreak;
    @SerializedName("best_combo_winstreak")
    @Expose
    private long bestComboWinstreak;
    @SerializedName("best_parkour_winstreak")
    @Expose
    private long bestParkourWinstreak;
    @SerializedName("best_bow_winstreak")
    @Expose
    private long bestBowWinstreak;
    @SerializedName("best_winstreak_mode_bow_duel")
    @Expose
    private long bestWinstreakModeBowDuel;
    @SerializedName("best_winstreak_mode_combo_duel")
    @Expose
    private long bestWinstreakModeComboDuel;
    @SerializedName("best_winstreak_mode_mw_duel")
    @Expose
    private long bestWinstreakModeMwDuel;
    @SerializedName("best_winstreak_mode_boxing_duel")
    @Expose
    private long bestWinstreakModeBoxingDuel;
    @SerializedName("best_winstreak_mode_bowspleef_duel")
    @Expose
    private long bestWinstreakModeBowspleefDuel;
    @SerializedName("best_winstreak_mode_blitz_duel")
    @Expose
    private long bestWinstreakModeBlitzDuel;
    @SerializedName("best_winstreak_mode_potion_duel")
    @Expose
    private long bestWinstreakModePotionDuel;
    @SerializedName("best_winstreak_mode_parkour_eight")
    @Expose
    private long bestWinstreakModeParkourEight;
    @SerializedName("best_winstreak_mode_duel_arena")
    @Expose
    private long bestWinstreakModeDuelArena;
    @SerializedName("best_winstreak_mode_bridge_threes")
    @Expose
    private long bestWinstreakModeBridgeThrees;
    @SerializedName("best_winstreak_mode_mw_doubles")
    @Expose
    private long bestWinstreakModeMwDoubles;
    @SerializedName("best_winstreak_mode_bridge_2v2v2v2")
    @Expose
    private long bestWinstreakModeBridge2v2v2v2;
    @SerializedName("best_winstreak_mode_capture_threes")
    @Expose
    private long bestWinstreakModeCaptureThrees;
    @SerializedName("parkour_eight_losses")
    @Expose
    private long parkourEightLosses;
    @SerializedName("parkour_eight_rounds_played")
    @Expose
    private long parkourEightRoundsPlayed;
    @SerializedName("duel_arena_rounds_played")
    @Expose
    private long duelArenaRoundsPlayed;
    @SerializedName("current_winstreak_mode_boxing_duel")
    @Expose
    private long currentWinstreakModeBoxingDuel;
    @SerializedName("current_boxing_winstreak")
    @Expose
    private long currentBoxingWinstreak;
    @SerializedName("boxing_duel_melee_hits")
    @Expose
    private long boxingDuelMeleeHits;
    @SerializedName("boxing_duel_melee_swings")
    @Expose
    private long boxingDuelMeleeSwings;
    @SerializedName("boxing_duel_rounds_played")
    @Expose
    private long boxingDuelRoundsPlayed;
    @SerializedName("boxing_duel_wins")
    @Expose
    private long boxingDuelWins;
    @SerializedName("bridge_doubles_golden_apples_eaten")
    @Expose
    private long bridgeDoublesGoldenApplesEaten;
    @SerializedName("uhc_four_golden_apples_eaten")
    @Expose
    private long uhcFourGoldenApplesEaten;
    @SerializedName("bridge_four_golden_apples_eaten")
    @Expose
    private long bridgeFourGoldenApplesEaten;
    @SerializedName("bridge_threes_blocks_placed")
    @Expose
    private long bridgeThreesBlocksPlaced;
    @SerializedName("bridge_threes_bow_hits")
    @Expose
    private long bridgeThreesBowHits;
    @SerializedName("bridge_threes_bow_shots")
    @Expose
    private long bridgeThreesBowShots;
    @SerializedName("bridge_threes_bridge_deaths")
    @Expose
    private long bridgeThreesBridgeDeaths;
    @SerializedName("bridge_threes_bridge_kills")
    @Expose
    private long bridgeThreesBridgeKills;
    @SerializedName("bridge_threes_damage_dealt")
    @Expose
    private long bridgeThreesDamageDealt;
    @SerializedName("bridge_threes_goals")
    @Expose
    private long bridgeThreesGoals;
    @SerializedName("bridge_threes_golden_apples_eaten")
    @Expose
    private long bridgeThreesGoldenApplesEaten;
    @SerializedName("bridge_threes_losses")
    @Expose
    private long bridgeThreesLosses;
    @SerializedName("bridge_threes_melee_hits")
    @Expose
    private long bridgeThreesMeleeHits;
    @SerializedName("bridge_threes_melee_swings")
    @Expose
    private long bridgeThreesMeleeSwings;
    @SerializedName("bridge_threes_rounds_played")
    @Expose
    private long bridgeThreesRoundsPlayed;
    @SerializedName("sw_doubles_pyromancer_kit_wins")
    @Expose
    private long swDoublesPyromancerKitWins;
    @SerializedName("all_modes_gold_title_prestige")
    @Expose
    private long allModesGoldTitlePrestige;

    public long getLong(String key) {
        try {
            return (long) getClass().getDeclaredField(key).get(this);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public long getLongOfSerializedName(String key) {
        try {
            for (Field field : getClass().getDeclaredFields()) {
                if (field.isAnnotationPresent(SerializedName.class)) {
                    if (field.getAnnotation(SerializedName.class).value().equals(key)) {
                        return (long) field.get(this);
                    }
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public long getGamesPlayed() {
        return gamesPlayedDuels;
    }
}
