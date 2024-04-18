package me.kbrewster.hypixelapi.player.stats.arcade;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import me.kbrewster.hypixelapi.player.stats.BasicStats;

import java.util.Arrays;
import java.util.List;

/**
 * JSON Class to parse Arcade Stats
 */

/*
"Arcade": {
                "coins": 3316741.0,
                "weekly_coins_b": 76675,
                "monthly_coins_a": 57823,
                "monthly_coins_b": 62839,
                "stamp_level": 359,
                "time_stamp": 1523324295487,
                "weekly_coins_a": 43987,
                "miniwalls_activeKit": "soldier",
                "arrows_hit_mini_walls": 1809,
                "final_kills_mini_walls": 1341,
                "kills_mini_walls": 2710,
                "wither_kills_mini_walls": 341,
                "deaths_mini_walls": 2522,
                "arrows_shot_mini_walls": 4660,
                "wither_damage_mini_walls": 19101,
                "dec2016_achievements": true,
                "dec2016_achievements2": true,
                "wins_mini_walls": 365,
                "headshots_dayone": 5501,
                "kills_dayone": 8864,
                "wins_dayone": 102,
                "hitw_record_q": 217,
                "rounds_hole_in_the_wall": 4813,
                "music": false,
                "hitw_record_f": 185,
                "rounds_simon_says": 4139,
                "wins_oneinthequiver": 124,
                "kills_oneinthequiver": 2142,
                "bounty_kills_oneinthequiver": 912,
                "deaths_oneinthequiver": 2329,
                "poop_collected": 105,
                "powerkicks_soccer": 1072,
                "goals_soccer": 504,
                "wins_soccer": 116,
                "wins_farm_hunt": 266,
                "kills_throw_out": 2838,
                "deaths_throw_out": 876,
                "wins_ender": 121,
                "wins_party_3": 1,
                "wins_party": 5969,
                "best_round_zombies_deadend_normal": 30,
                "fastest_time_10_zombies_deadend_normal": 431,
                "best_round_zombies_deadend": 30,
                "fastest_time_20_zombies": 1591,
                "best_round_zombies": 30,
                "fastest_time_20_zombies_deadend_normal": 1034,
                "fastest_time_10_zombies": 498,
                "times_knocked_down_zombies": 491,
                "total_rounds_survived_zombies_deadend_normal": 699,
                "magma_cube_zombie_kills_zombies": 1251,
                "skelefish_zombie_kills_zombies": 409,
                "zombie_kills_zombies": 63003,
                "zombie_kills_zombies_deadend_normal": 9998,
                "guardian_zombie_kills_zombies": 1292,
                "deaths_zombies_deadend": 26,
                "times_knocked_down_zombies_deadend_normal": 51,
                "deaths_zombies_deadend_normal": 18,
                "bullets_shot_zombies": 166950,
                "basic_zombie_kills_zombies": 16104,
                "windows_repaired_zombies_deadend": 1106,
                "tnt_baby_zombie_kills_zombies": 279,
                "doors_opened_zombies_deadend_normal": 56,
                "bullets_hit_zombies": 134556,
                "zombie_kills_zombies_deadend": 11011,
                "headshots_zombies": 85302,
                "magma_zombie_kills_zombies": 621,
                "total_rounds_survived_zombies_deadend": 777,
                "fire_zombie_kills_zombies": 709,
                "deaths_zombies": 182,
                "doors_opened_zombies": 401,
                "total_rounds_survived_zombies": 5460,
                "windows_repaired_zombies": 3594,
                "wolf_zombie_kills_zombies": 4643,
                "pig_zombie_zombie_kills_zombies": 2186,
                "windows_repaired_zombies_deadend_normal": 1024,
                "empowered_zombie_kills_zombies": 385,
                "doors_opened_zombies_deadend": 62,
                "silverfish_zombie_kills_zombies": 57,
                "times_knocked_down_zombies_deadend": 56,
                "kicks_soccer": 910,
                "wins_draw_their_thing": 113,
                "sw_deaths": 864,
                "sw_kills": 2716,
                "sw_rebel_kills": 542,
                "sw_shots_fired": 57337,
                "sw_empire_kills": 2174,
                "sw_game_wins": 132,
                "max_wave": 183,
                "wins_throw_out": 102,
                "wins_simon_says": 112,
                "prop_hunt_seeker_wins_hide_and_seek": 1,
                "seeker_wins_hide_and_seek": 146,
                "hider_wins_hide_and_seek": 102,
                "prop_hunt_hider_wins_hide_and_seek": 32,
                "wins_hole_in_the_wall": 101,
                "blaze_zombie_kills_zombies": 55,
                "tnt_zombie_kills_zombies": 13,
                "party_pooper_hider_wins_hide_and_seek": 70,
                "party_pooper_seeker_wins_hide_and_seek": 145,
                "showinfobook": false,
                "deaths_zombies_alienarcadium": 15,
                "skeleton_zombie_kills_zombies": 81,
                "total_rounds_survived_zombies_alienarcadium": 286,
                "zombie_kills_zombies_alienarcadium": 3660,
                "ender_zombie_kills_zombies": 892,
                "endermite_zombie_kills_zombies": 788,
                "players_revived_zombies": 527,
                "players_revived_zombies_deadend": 84,
                "players_revived_zombies_deadend_normal": 76,
                "best_round_zombies_alienarcadium": 49,
                "best_round_zombies_alienarcadium_normal": 49,
                "blob_zombie_kills_zombies": 412,
                "chgluglu_zombie_kills_zombies": 119,
                "clown_zombie_kills_zombies": 115,
                "deaths_zombies_alienarcadium_normal": 7,
                "doors_opened_zombies_alienarcadium": 8,
                "doors_opened_zombies_alienarcadium_normal": 7,
                "fastest_time_10_zombies_alienarcadium_normal": 378,
                "fastest_time_20_zombies_alienarcadium_normal": 936,
                "ghast_zombie_kills_zombies": 110,
                "giant_zombie_kills_zombies": 58,
                "players_revived_zombies_alienarcadium": 45,
                "players_revived_zombies_alienarcadium_normal": 41,
                "rainbow_zombie_kills_zombies": 258,
                "sentinel_zombie_kills_zombies": 312,
                "space_blaster_zombie_kills_zombies": 192,
                "space_grunt_zombie_kills_zombies": 219,
                "times_knocked_down_zombies_alienarcadium": 24,
                "times_knocked_down_zombies_alienarcadium_normal": 24,
                "total_rounds_survived_zombies_alienarcadium_normal": 228,
                "windows_repaired_zombies_alienarcadium": 324,
                "windows_repaired_zombies_alienarcadium_normal": 263,
                "worm_small_zombie_kills_zombies": 334,
                "worm_zombie_kills_zombies": 408,
                "zombie_kills_zombies_alienarcadium_normal": 3435,
                "iron_golem_zombie_kills_zombies": 75,
                "mega_blob_zombie_kills_zombies": 74,
                "mega_magma_zombie_kills_zombies": 127,
                "items_found_scuba_simulator": 4778,
                "total_points_scuba_simulator": 10000,
                "wins_scuba_simulator": 91,
                "candy_found_halloween_simulator": 883,
                "fastest_time_30_zombies": 2479,
                "fastest_time_30_zombies_deadend_normal": 1707,
                "wins_zombies": 111,
                "wins_zombies_deadend": 12,
                "wins_zombies_deadend_normal": 11,
                "gifts_grinch_simulator_v2": 33,
                "lastTourneyAd": 1660458480893,
                "best_round_zombies_badblood": 30,
                "best_round_zombies_badblood_normal": 30,
                "cave_spider_zombie_kills_zombies": 645,
                "deaths_zombies_badblood": 141,
                "deaths_zombies_badblood_normal": 120,
                "doors_opened_zombies_badblood": 331,
                "doors_opened_zombies_badblood_normal": 331,
                "fastest_time_10_zombies_badblood_normal": 378,
                "slime_zombie_kills_zombies": 1736,
                "slime_zombie_zombie_kills_zombies": 2211,
                "times_knocked_down_zombies_badblood": 411,
                "times_knocked_down_zombies_badblood_normal": 408,
                "total_rounds_survived_zombies_badblood": 4397,
                "total_rounds_survived_zombies_badblood_normal": 4259,
                "werewolf_zombie_kills_zombies": 966,
                "windows_repaired_zombies_badblood": 2164,
                "windows_repaired_zombies_badblood_normal": 2110,
                "witch_zombie_kills_zombies": 2721,
                "wither_skeleton_zombie_kills_zombies": 5068,
                "wither_zombie_zombie_kills_zombies": 3759,
                "zombie_kills_zombies_badblood": 48332,
                "zombie_kills_zombies_badblood_normal": 48122,
                "charged_creeper_zombie_kills_zombies": 1791,
                "creeper_zombie_kills_zombies": 719,
                "family_twin_blue_zombie_kills_zombies": 81,
                "fastest_time_20_zombies_badblood_normal": 916,
                "fastest_time_30_zombies_badblood_normal": 1468,
                "herobrine_minion_zombie_kills_zombies": 5363,
                "invisible_zombie_kills_zombies": 4847,
                "players_revived_zombies_badblood": 398,
                "players_revived_zombies_badblood_normal": 397,
                "wins_zombies_badblood": 99,
                "wins_zombies_badblood_normal": 99,
                "broodmother_zombie_kills_zombies": 3,
                "inferno_zombie_kills_zombies": 8,
                "the_old_one_zombie_kills_zombies": 6,
                "kills_dragonwars2": 3466,
                "wins_dragonwars2": 127,
                "family_daughter_zombie_kills_zombies": 65,
                "wolf_pet_zombie_kills_zombies": 87,
                "family_father_zombie_kills_zombies": 51,
                "family_twin_red_zombie_kills_zombies": 88,
                "herobrine_zombie_kills_zombies": 49,
                "king_slime_zombie_kills_zombies": 79,
                "packages": [
                    "emotion_trail",
                    "rainbow_trail",
                    "machete_melee",
                    "combat_knife_melee",
                    "projectile_trail_jack_o_lantern_trail",
                    "victory_dance_twerk_apocalypse",
                    "movement_trail_green_star",
                    "victory_dance_chicken_rider"
                ],
                "bounty_head": "EMOTION",
                "enderspleef_trail": "RAINBOW",
                "eggs_found_easter_simulator": 302,
                "wither_zombie_kills_zombies": 38,
                "zombies_hideTutorials": true,
                "wins_easter_simulator": 1,
                "melee_weapon": "COMBAT_KNIFE",
                "hints": false,
                "family_mother_zombie_kills_zombies": 44,
                "wins_halloween_simulator": 11,
                "avalanche_round_wins_party": 33,
                "chicken_rings_best_time_party": 36200,
                "chicken_rings_round_wins_party": 614,
                "jigsaw_rush_best_time_party": 2101,
                "round_wins_party": 11528,
                "spider_maze_best_time_party": 13307,
                "total_stars_party": 45259,
                "trampolinio_round_wins_party": 576,
                "volcano_round_wins_party": 445,
                "bow_kills_oneinthequiver": 121,
                "sword_kills_oneinthequiver": 51,
                "animal_slaughter_best_score_party": 216,
                "animal_slaughter_kills_party": 25681,
                "animal_slaughter_round_wins_party": 480,
                "anvil_spleef_best_time_party": 123409,
                "anvil_spleef_round_wins_party": 188,
                "cannon_painting_round_wins_party": 543,
                "dive_best_score_party": 21,
                "dive_round_wins_party": 469,
                "dive_total_score_party": 11231,
                "high_ground_best_score_party": 59,
                "high_ground_total_score_party": 13524,
                "minecart_racing_best_time_party": 17106,
                "minecart_racing_round_wins_party": 658,
                "active_projectile_trail": "projectile_trail_none",
                "bigshot_powerup_activations_ender": 132,
                "blocks_destroyed_ender": 63050,
                "powerup_activations_ender": 324,
                "tripleshot_powerup_activations_ender": 192,
                "round_wins_simon_says": 323,
                "top_score_simon_says": 31,
                "super_sheep_round_wins_party": 183,
                "fire_leapers_round_wins_party": 360,
                "pig_jousting_round_wins_party": 359,
                "rpg_16_kills_best_score_party": 12,
                "rpg_16_kills_party": 3219,
                "rpg_16_round_wins_party": 518,
                "workshop_round_wins_party": 758,
                "lab_escape_best_time_party": 43465,
                "lab_escape_round_wins_party": 741,
                "shooting_range_round_wins_party": 703,
                "high_ground_round_wins_party": 99,
                "the_floor_is_lava_best_time_party": 12952,
                "the_floor_is_lava_round_wins_party": 596,
                "jungle_jump_best_time_party": 13653,
                "jungle_jump_round_wins_party": 564,
                "lawn_moower_mowed_best_score_party": 568,
                "lawn_moower_mowed_total_score_party": 281611,
                "lawn_moower_round_wins_party": 529,
                "hoe_hoe_hoe_best_score_party": 465,
                "hoe_hoe_hoe_total_score_party": 125524,
                "bombardment_best_time_party": 950930,
                "bombardment_round_wins_party": 622,
                "frozen_floor_round_wins_party": 354,
                "pig_fishing_round_wins_party": 516,
                "hoe_hoe_hoe_round_wins_party": 483,
                "active_victory_dance": "victory_dance_twerk_apocalypse",
                "active_movement_trail": "movement_trail_none",
                "round_wins_santa_says": 2,
                "dangerous_taunts_used_farm_hunt": 6,
                "safe_taunts_used_farm_hunt": 6,
                "taunts_used_farm_hunt": 13,
                "bow_kills_farm_hunt": 14,
                "hunter_bow_kills_farm_hunt": 1,
                "hunter_kills_farm_hunt": 2,
                "hunters_bow_kills_farm_hunt": 1,
                "kills_farm_hunt": 8,
                "poop_collected_farm_hunt": 16,
                "best_round_zombies_deadend_hard": 30,
                "deaths_zombies_deadend_hard": 3,
                "players_revived_zombies_deadend_hard": 6,
                "total_rounds_survived_zombies_deadend_hard": 45,
                "windows_repaired_zombies_deadend_hard": 40,
                "zombie_kills_zombies_deadend_hard": 790,
                "times_knocked_down_zombies_deadend_hard": 3,
                "doors_opened_zombies_deadend_hard": 4,
                "fastest_time_10_zombies_deadend_hard": 498,
                "fastest_time_20_zombies_deadend_hard": 1591,
                "fastest_time_30_zombies_deadend_hard": 2479,
                "wins_zombies_deadend_hard": 1,
                "animal_bow_kills_farm_hunt": 6,
                "animal_kills_farm_hunt": 6,
                "animals_bow_kills_farm_hunt": 6,
                "risky_taunts_used_farm_hunt": 1,
                "pixel_party": {
                    "games_played": 6,
                    "games_played_normal": 5,
                    "highest_round": 21,
                    "rounds_completed": 69,
                    "rounds_completed_normal": 59,
                    "games_played_hyper": 1,
                    "rounds_completed_hyper": 10
                },
                "pixel_party_music_volume": 0.0,
                "leaderboardSettings": {
                    "mode": "PARTY",
                    "resetType": "NEVER"
                },
                "jigsaw_rush_round_wins_party": 85,
                "spider_maze_round_wins_party": 52,
                "animal_wins_farm_hunt": 1,
                "option_show_tutorial_book": "off",
                "woolhunt_assists": 554,
                "woolhunt_deaths": 5060,
                "woolhunt_deaths_to_woolholder": 55,
                "woolhunt_deaths_with_wool": 565,
                "woolhunt_experienced_losses": 491,
                "woolhunt_experienced_wins": 601,
                "woolhunt_fastest_win": 72,
                "woolhunt_fastest_wool_capture": 66,
                "woolhunt_gold_earned": 171570,
                "woolhunt_gold_spent": -33110,
                "woolhunt_inventorylayout": {
                    "0": 0,
                    "1": 1,
                    "2": 2,
                    "3": 3,
                    "4": 4,
                    "5": 5,
                    "6": 8,
                    "7": 7,
                    "8": 6
                },
                "woolhunt_kills": 1987,
                "woolhunt_kills_on_woolholder": 120,
                "woolhunt_kills_with_wool": 340,
                "woolhunt_longest_game": 1965,
                "woolhunt_most_gold_earned": 800,
                "woolhunt_most_kills_and_assists": 25,
                "woolhunt_participated_losses": 410,
                "woolhunt_participated_wins": 590,
                "woolhunt_wools_captured": 341,
                "woolhunt_wools_stolen": 1250,
                "dropper": {
                    "fastest_game": 143035,
                    "games_played": 1,
                    "maps_completed": 5,
                    "fails": 16,
                    "games_finished": 1
                }
            },
 */

@Getter
public class Arcade implements BasicStats {
    @SerializedName("coins")
    @Expose
    private long coins;
    @SerializedName("weekly_coins_b")
    @Expose
    private long weeklyCoinsB;
    @SerializedName("monthly_coins_a")
    @Expose
    private long monthlyCoinsA;
    @SerializedName("monthly_coins_b")
    @Expose
    private long monthlyCoinsB;
    @SerializedName("stamp_level")
    @Expose
    private long stampLevel;
    @SerializedName("time_stamp")
    @Expose
    private long timeStamp;
    @SerializedName("weekly_coins_a")
    @Expose
    private long weeklyCoinsA;
    @SerializedName("arrows_hit_mini_walls")
    @Expose
    private long arrowsHitMiniWalls;
    @SerializedName("final_kills_mini_walls")
    @Expose
    private long finalKillsMiniWalls;
    @SerializedName("kills_mini_walls")
    @Expose
    private long killsMiniWalls;
    @SerializedName("wither_kills_mini_walls")
    @Expose
    private long witherKillsMiniWalls;
    @SerializedName("deaths_mini_walls")
    @Expose
    private long deathsMiniWalls;
    @SerializedName("arrows_shot_mini_walls")
    @Expose
    private long arrowsShotMiniWalls;
    @SerializedName("wither_damage_mini_walls")
    @Expose
    private long witherDamageMiniWalls;
    @SerializedName("wins_mini_walls")
    @Expose
    private long winsMiniWalls;
    @SerializedName("headshots_dayone")
    @Expose
    private long headshotsDayone;
    @SerializedName("kills_dayone")
    @Expose
    private long killsDayone;
    @SerializedName("wins_dayone")
    @Expose
    private long winsDayone;
    @SerializedName("hitw_record_q")
    @Expose
    private long hitwRecordQ;
    @SerializedName("rounds_hole_in_the_wall")
    @Expose
    private long roundsHoleInTheWall;
    @SerializedName("hitw_record_f")
    @Expose
    private long hitwRecordF;
    @SerializedName("rounds_simon_says")
    @Expose
    private long roundsSimonSays;
    @SerializedName("wins_oneinthequiver")
    @Expose
    private long winsOneinthequiver;
    @SerializedName("kills_oneinthequiver")
    @Expose
    private long killsOneinthequiver;
    @SerializedName("bounty_kills_oneinthequiver")
    @Expose
    private long bountyKillsOneinthequiver;
    @SerializedName("deaths_oneinthequiver")
    @Expose
    private long deathsOneinthequiver;
    @SerializedName("poop_collected")
    @Expose
    private long poopCollected;
    @SerializedName("powerkicks_soccer")
    @Expose
    private long powerkicksSoccer;
    @SerializedName("goals_soccer")
    @Expose
    private long goalsSoccer;
    @SerializedName("wins_soccer")
    @Expose
    private long winsSoccer;
    @SerializedName("wins_farm_hunt")
    @Expose
    private long winsFarmHunt;
    @SerializedName("kills_throw_out")
    @Expose
    private long killsThrowOut;
    @SerializedName("deaths_throw_out")
    @Expose
    private long deathsThrowOut;
    @SerializedName("wins_ender")
    @Expose
    private long winsEnder;
    @SerializedName("wins_party_3")
    @Expose
    private long winsParty3;
    @SerializedName("wins_party")
    @Expose
    private long winsParty;
    @SerializedName("best_round_zombies_deadend_normal")
    @Expose
    private long bestRoundZombiesDeadendNormal;
    @SerializedName("fastest_time_10_zombies_deadend_normal")
    @Expose
    private long fastestTime10ZombiesDeadendNormal;
    @SerializedName("best_round_zombies_deadend")
    @Expose
    private long bestRoundZombiesDeadend;
    @SerializedName("fastest_time_20_zombies")
    @Expose
    private long fastestTime20Zombies;
    @SerializedName("best_round_zombies")
    @Expose
    private long bestRoundZombies;
    @SerializedName("fastest_time_20_zombies_deadend_normal")
    @Expose
    private long fastestTime20ZombiesDeadendNormal;
    @SerializedName("fastest_time_10_zombies")
    @Expose
    private long fastestTime10Zombies;
    @SerializedName("times_knocked_down_zombies")
    @Expose
    private long timesKnockedDownZombies;
    @SerializedName("total_rounds_survived_zombies_deadend_normal")
    @Expose
    private long totalRoundsSurvivedZombiesDeadendNormal;
    @SerializedName("magma_cube_zombie_kills_zombies")
    @Expose
    private long magmaCubeZombieKillsZombies;
    @SerializedName("skelefish_zombie_kills_zombies")
    @Expose
    private long skelefishZombieKillsZombies;
    @SerializedName("zombie_kills_zombies")
    @Expose
    private long zombieKillsZombies;
    @SerializedName("zombie_kills_zombies_deadend_normal")
    @Expose
    private long zombieKillsZombiesDeadendNormal;
    @SerializedName("guardian_zombie_kills_zombies")
    @Expose
    private long guardianZombieKillsZombies;
    @SerializedName("deaths_zombies_deadend")
    @Expose
    private long deathsZombiesDeadend;
    @SerializedName("times_knocked_down_zombies_deadend_normal")
    @Expose
    private long timesKnockedDownZombiesDeadendNormal;
    @SerializedName("deaths_zombies_deadend_normal")
    @Expose
    private long deathsZombiesDeadendNormal;
    @SerializedName("bullets_shot_zombies")
    @Expose
    private long bulletsShotZombies;
    @SerializedName("basic_zombie_kills_zombies")
    @Expose
    private long basicZombieKillsZombies;
    @SerializedName("windows_repaired_zombies_deadend")
    @Expose
    private long windowsRepairedZombiesDeadend;
    @SerializedName("tnt_baby_zombie_kills_zombies")
    @Expose
    private long tntBabyZombieKillsZombies;
    @SerializedName("doors_opened_zombies_deadend_normal")
    @Expose
    private long doorsOpenedZombiesDeadendNormal;
    @SerializedName("bullets_hit_zombies")
    @Expose
    private long bulletsHitZombies;
    @SerializedName("zombie_kills_zombies_deadend")
    @Expose
    private long zombieKillsZombiesDeadend;
    @SerializedName("headshots_zombies")
    @Expose
    private long headshotsZombies;
    @SerializedName("magma_zombie_kills_zombies")
    @Expose
    private long magmaZombieKillsZombies;
    @SerializedName("total_rounds_survived_zombies_deadend")
    @Expose
    private long totalRoundsSurvivedZombiesDeadend;
    @SerializedName("fire_zombie_kills_zombies")
    @Expose
    private long fireZombieKillsZombies;
    @SerializedName("deaths_zombies")
    @Expose
    private long deathsZombies;
    @SerializedName("doors_opened_zombies")
    @Expose
    private long doorsOpenedZombies;
    @SerializedName("total_rounds_survived_zombies")
    @Expose
    private long totalRoundsSurvivedZombies;
    @SerializedName("windows_repaired_zombies")
    @Expose
    private long windowsRepairedZombies;
    @SerializedName("wolf_zombie_kills_zombies")
    @Expose
    private long wolfZombieKillsZombies;
    @SerializedName("pig_zombie_zombie_kills_zombies")
    @Expose
    private long pigZombieZombieKillsZombies;
    @SerializedName("windows_repaired_zombies_deadend_normal")
    @Expose
    private long windowsRepairedZombiesDeadendNormal;
    @SerializedName("empowered_zombie_kills_zombies")
    @Expose
    private long empoweredZombieKillsZombies;
    @SerializedName("doors_opened_zombies_deadend")
    @Expose
    private long doorsOpenedZombiesDeadend;
    @SerializedName("silverfish_zombie_kills_zombies")
    @Expose
    private long silverfishZombieKillsZombies;
    @SerializedName("times_knocked_down_zombies_deadend")
    @Expose
    private long timesKnockedDownZombiesDeadend;
    @SerializedName("kicks_soccer")
    @Expose
    private long kicksSoccer;
    @SerializedName("wins_draw_their_thing")
    @Expose
    private long winsDrawTheirThing;
    @SerializedName("sw_deaths")
    @Expose
    private long swDeaths;
    @SerializedName("sw_kills")
    @Expose
    private long swKills;
    @SerializedName("sw_rebel_kills")
    @Expose
    private long swRebelKills;
    @SerializedName("sw_shots_fired")
    @Expose
    private long swShotsFired;
    @SerializedName("sw_empire_kills")
    @Expose
    private long swEmpireKills;
    @SerializedName("sw_game_wins")
    @Expose
    private long swGameWins;
    @SerializedName("max_wave")
    @Expose
    private long maxWave;
    @SerializedName("wins_throw_out")
    @Expose
    private long winsThrowOut;
    @SerializedName("wins_simon_says")
    @Expose
    private long winsSimonSays;
    @SerializedName("prop_hunt_seeker_wins_hide_and_seek")
    @Expose
    private long propHuntSeekerWinsHideAndSeek;
    @SerializedName("seeker_wins_hide_and_seek")
    @Expose
    private long seekerWinsHideAndSeek;
    @SerializedName("hider_wins_hide_and_seek")
    @Expose
    private long hiderWinsHideAndSeek;
    @SerializedName("prop_hunt_hider_wins_hide_and_seek")
    @Expose
    private long propHuntHiderWinsHideAndSeek;
    @SerializedName("wins_hole_in_the_wall")
    @Expose
    private long winsHoleInTheWall;
    @SerializedName("blaze_zombie_kills_zombies")
    @Expose
    private long blazeZombieKillsZombies;
    @SerializedName("tnt_zombie_kills_zombies")
    @Expose
    private long tntZombieKillsZombies;
    @SerializedName("party_pooper_hider_wins_hide_and_seek")
    @Expose
    private long partyPooperHiderWinsHideAndSeek;
    @SerializedName("party_pooper_seeker_wins_hide_and_seek")
    @Expose
    private long partyPooperSeekerWinsHideAndSeek;
    @SerializedName("deaths_zombies_alienarcadium")
    @Expose
    private long deathsZombiesAlienarcadium;
    @SerializedName("skeleton_zombie_kills_zombies")
    @Expose
    private long skeletonZombieKillsZombies;
    @SerializedName("total_rounds_survived_zombies_alienarcadium")
    @Expose
    private long totalRoundsSurvivedZombiesAlienarcadium;
    @SerializedName("zombie_kills_zombies_alienarcadium")
    @Expose
    private long zombieKillsZombiesAlienarcadium;
    @SerializedName("ender_zombie_kills_zombies")
    @Expose
    private long enderZombieKillsZombies;
    @SerializedName("endermite_zombie_kills_zombies")
    @Expose
    private long endermiteZombieKillsZombies;
    @SerializedName("players_revived_zombies")
    @Expose
    private long playersRevivedZombies;
    @SerializedName("players_revived_zombies_deadend")
    @Expose
    private long playersRevivedZombiesDeadend;
    @SerializedName("players_revived_zombies_deadend_normal")
    @Expose
    private long playersRevivedZombiesDeadendNormal;
    @SerializedName("best_round_zombies_alienarcadium")
    @Expose
    private long bestRoundZombiesAlienarcadium;
    @SerializedName("best_round_zombies_alienarcadium_normal")
    @Expose
    private long bestRoundZombiesAlienarcadiumNormal;
    @SerializedName("blob_zombie_kills_zombies")
    @Expose
    private long blobZombieKillsZombies;
    @SerializedName("chgluglu_zombie_kills_zombies")
    @Expose
    private long chglugluZombieKillsZombies;
    @SerializedName("clown_zombie_kills_zombies")
    @Expose
    private long clownZombieKillsZombies;
    @SerializedName("deaths_zombies_alienarcadium_normal")
    @Expose
    private long deathsZombiesAlienarcadiumNormal;
    @SerializedName("doors_opened_zombies_alienarcadium")
    @Expose
    private long doorsOpenedZombiesAlienarcadium;
    @SerializedName("doors_opened_zombies_alienarcadium_normal")
    @Expose
    private long doorsOpenedZombiesAlienarcadiumNormal;
    @SerializedName("fastest_time_10_zombies_alienarcadium_normal")
    @Expose
    private long fastestTime10ZombiesAlienarcadiumNormal;
    @SerializedName("fastest_time_20_zombies_alienarcadium_normal")
    @Expose
    private long fastestTime20ZombiesAlienarcadiumNormal;
    @SerializedName("ghast_zombie_kills_zombies")
    @Expose
    private long ghastZombieKillsZombies;
    @SerializedName("giant_zombie_kills_zombies")
    @Expose
    private long giantZombieKillsZombies;
    @SerializedName("players_revived_zombies_alienarcadium")
    @Expose
    private long playersRevivedZombiesAlienarcadium;
    @SerializedName("players_revived_zombies_alienarcadium_normal")
    @Expose
    private long playersRevivedZombiesAlienarcadiumNormal;
    @SerializedName("rainbow_zombie_kills_zombies")
    @Expose
    private long rainbowZombieKillsZombies;
    @SerializedName("sentinel_zombie_kills_zombies")
    @Expose
    private long sentinelZombieKillsZombies;
    @SerializedName("space_blaster_zombie_kills_zombies")
    @Expose
    private long spaceBlasterZombieKillsZombies;
    @SerializedName("space_grunt_zombie_kills_zombies")
    @Expose
    private long spaceGruntZombieKillsZombies;
    @SerializedName("times_knocked_down_zombies_alienarcadium")
    @Expose
    private long timesKnockedDownZombiesAlienarcadium;
    @SerializedName("times_knocked_down_zombies_alienarcadium_normal")
    @Expose
    private long timesKnockedDownZombiesAlienarcadiumNormal;
    @SerializedName("total_rounds_survived_zombies_alienarcadium_normal")
    @Expose
    private long totalRoundsSurvivedZombiesAlienarcadiumNormal;
    @SerializedName("windows_repaired_zombies_alienarcadium")
    @Expose
    private long windowsRepairedZombiesAlienarcadium;
    @SerializedName("windows_repaired_zombies_alienarcadium_normal")
    @Expose
    private long windowsRepairedZombiesAlienarcadiumNormal;
    @SerializedName("worm_small_zombie_kills_zombies")
    @Expose
    private long wormSmallZombieKillsZombies;
    @SerializedName("worm_zombie_kills_zombies")
    @Expose
    private long wormZombieKillsZombies;
    @SerializedName("zombie_kills_zombies_alienarcadium_normal")
    @Expose
    private long zombieKillsZombiesAlienarcadiumNormal;
    @SerializedName("iron_golem_zombie_kills_zombies")
    @Expose
    private long ironGolemZombieKillsZombies;
    @SerializedName("mega_blob_zombie_kills_zombies")
    @Expose
    private long megaBlobZombieKillsZombies;
    @SerializedName("mega_magma_zombie_kills_zombies")
    @Expose
    private long megaMagmaZombieKillsZombies;
    @SerializedName("items_found_scuba_simulator")
    @Expose
    private long itemsFoundScubaSimulator;
    @SerializedName("total_points_scuba_simulator")
    @Expose
    private long totalPointsScubaSimulator;
    @SerializedName("wins_scuba_simulator")
    @Expose
    private long winsScubaSimulator;
    @SerializedName("candy_found_halloween_simulator")
    @Expose
    private long candyFoundHalloweenSimulator;
    @SerializedName("fastest_time_30_zombies")
    @Expose
    private long fastestTime30Zombies;
    @SerializedName("fastest_time_30_zombies_deadend_normal")
    @Expose
    private long fastestTime30ZombiesDeadendNormal;
    @SerializedName("wins_zombies")
    @Expose
    private long winsZombies;
    @SerializedName("wins_zombies_deadend")
    @Expose
    private long winsZombiesDeadend;
    @SerializedName("wins_zombies_deadend_normal")
    @Expose
    private long winsZombiesDeadendNormal;
    @SerializedName("gifts_grinch_simulator_v2")
    @Expose
    private long giftsGrinchSimulatorV2;
    @SerializedName("lastTourneyAd")
    @Expose
    private long lastTourneyAd;
    @SerializedName("best_round_zombies_badblood")
    @Expose
    private long bestRoundZombiesBadblood;
    @SerializedName("best_round_zombies_badblood_normal")
    @Expose
    private long bestRoundZombiesBadbloodNormal;
    @SerializedName("cave_spider_zombie_kills_zombies")
    @Expose
    private long caveSpiderZombieKillsZombies;
    @SerializedName("deaths_zombies_badblood")
    @Expose
    private long deathsZombiesBadblood;
    @SerializedName("deaths_zombies_badblood_normal")
    @Expose
    private long deathsZombiesBadbloodNormal;
    @SerializedName("doors_opened_zombies_badblood")
    @Expose
    private long doorsOpenedZombiesBadblood;
    @SerializedName("doors_opened_zombies_badblood_normal")
    @Expose
    private long doorsOpenedZombiesBadbloodNormal;
    @SerializedName("fastest_time_10_zombies_badblood_normal")
    @Expose
    private long fastestTime10ZombiesBadbloodNormal;
    @SerializedName("slime_zombie_kills_zombies")
    @Expose
    private long slimeZombieKillsZombies;
    @SerializedName("slime_zombie_zombie_kills_zombies")
    @Expose
    private long slimeZombieZombieKillsZombies;
    @SerializedName("times_knocked_down_zombies_badblood")
    @Expose
    private long timesKnockedDownZombiesBadblood;
    @SerializedName("times_knocked_down_zombies_badblood_normal")
    @Expose
    private long timesKnockedDownZombiesBadbloodNormal;
    @SerializedName("total_rounds_survived_zombies_badblood")
    @Expose
    private long totalRoundsSurvivedZombiesBadblood;
    @SerializedName("total_rounds_survived_zombies_badblood_normal")
    @Expose
    private long totalRoundsSurvivedZombiesBadbloodNormal;
    @SerializedName("werewolf_zombie_kills_zombies")
    @Expose
    private long werewolfZombieKillsZombies;
    @SerializedName("windows_repaired_zombies_badblood")
    @Expose
    private long windowsRepairedZombiesBadblood;
    @SerializedName("windows_repaired_zombies_badblood_normal")
    @Expose
    private long windowsRepairedZombiesBadbloodNormal;
    @SerializedName("witch_zombie_kills_zombies")
    @Expose
    private long witchZombieKillsZombies;
    @SerializedName("wither_skeleton_zombie_kills_zombies")
    @Expose
    private long witherSkeletonZombieKillsZombies;
    @SerializedName("wither_zombie_zombie_kills_zombies")
    @Expose
    private long witherZombieZombieKillsZombies;
    @SerializedName("zombie_kills_zombies_badblood")
    @Expose
    private long zombieKillsZombiesBadblood;
    @SerializedName("zombie_kills_zombies_badblood_normal")
    @Expose
    private long zombieKillsZombiesBadbloodNormal;
    @SerializedName("charged_creeper_zombie_kills_zombies")
    @Expose
    private long chargedCreeperZombieKillsZombies;
    @SerializedName("creeper_zombie_kills_zombies")
    @Expose
    private long creeperZombieKillsZombies;
    @SerializedName("family_twin_blue_zombie_kills_zombies")
    @Expose
    private long familyTwinBlueZombieKillsZombies;
    @SerializedName("fastest_time_20_zombies_badblood_normal")
    @Expose
    private long fastestTime20ZombiesBadbloodNormal;
    @SerializedName("fastest_time_30_zombies_badblood_normal")
    @Expose
    private long fastestTime30ZombiesBadbloodNormal;
    @SerializedName("herobrine_minion_zombie_kills_zombies")
    @Expose
    private long herobrineMinionZombieKillsZombies;
    @SerializedName("invisible_zombie_kills_zombies")
    @Expose
    private long invisibleZombieKillsZombies;
    @SerializedName("players_revived_zombies_badblood")
    @Expose
    private long playersRevivedZombiesBadblood;
    @SerializedName("players_revived_zombies_badblood_normal")
    @Expose
    private long playersRevivedZombiesBadbloodNormal;
    @SerializedName("wins_zombies_badblood")
    @Expose
    private long winsZombiesBadblood;
    @SerializedName("wins_zombies_badblood_normal")
    @Expose
    private long winsZombiesBadbloodNormal;
    @SerializedName("broodmother_zombie_kills_zombies")
    @Expose
    private long broodmotherZombieKillsZombies;
    @SerializedName("inferno_zombie_kills_zombies")
    @Expose
    private long infernoZombieKillsZombies;
    @SerializedName("the_old_one_zombie_kills_zombies")
    @Expose
    private long theOldOneZombieKillsZombies;
    @SerializedName("kills_dragonwars2")
    @Expose
    private long killsDragonwars2;
    @SerializedName("wins_dragonwars2")
    @Expose
    private long winsDragonwars2;
    @SerializedName("family_daughter_zombie_kills_zombies")
    @Expose
    private long familyDaughterZombieKillsZombies;
    @SerializedName("wolf_pet_zombie_kills_zombies")
    @Expose
    private long wolfPetZombieKillsZombies;
    @SerializedName("family_father_zombie_kills_zombies")
    @Expose
    private long familyFatherZombieKillsZombies;
    @SerializedName("family_twin_red_zombie_kills_zombies")
    @Expose
    private long familyTwinRedZombieKillsZombies;
    @SerializedName("herobrine_zombie_kills_zombies")
    @Expose
    private long herobrineZombieKillsZombies;
    @SerializedName("king_slime_zombie_kills_zombies")
    @Expose
    private long kingSlimeZombieKillsZombies;
    @SerializedName("eggs_found_easter_simulator")
    @Expose
    private long eggsFoundEasterSimulator;
    @SerializedName("wither_zombie_kills_zombies")
    @Expose
    private long witherZombieKillsZombies;
    @SerializedName("wins_easter_simulator")
    @Expose
    private long winsEasterSimulator;
    @SerializedName("family_mother_zombie_kills_zombies")
    @Expose
    private long familyMotherZombieKillsZombies;
    @SerializedName("wins_halloween_simulator")
    @Expose
    private long winsHalloweenSimulator;
    @SerializedName("avalanche_round_wins_party")
    @Expose
    private long avalancheRoundWinsParty;
    @SerializedName("chicken_rings_best_time_party")
    @Expose
    private long chickenRingsBestTimeParty;
    @SerializedName("chicken_rings_round_wins_party")
    @Expose
    private long chickenRingsRoundWinsParty;
    @SerializedName("jigsaw_rush_best_time_party")
    @Expose
    private long jigsawRushBestTimeParty;
    @SerializedName("round_wins_party")
    @Expose
    private long roundWinsParty;
    @SerializedName("spider_maze_best_time_party")
    @Expose
    private long spiderMazeBestTimeParty;
    @SerializedName("total_stars_party")
    @Expose
    private long totalStarsParty;
    @SerializedName("trampolinio_round_wins_party")
    @Expose
    private long trampolinioRoundWinsParty;
    @SerializedName("volcano_round_wins_party")
    @Expose
    private long volcanoRoundWinsParty;
    @SerializedName("bow_kills_oneinthequiver")
    @Expose
    private long bowKillsOneinthequiver;
    @SerializedName("sword_kills_oneinthequiver")
    @Expose
    private long swordKillsOneinthequiver;
    @SerializedName("animal_slaughter_best_score_party")
    @Expose
    private long animalSlaughterBestScoreParty;
    @SerializedName("animal_slaughter_kills_party")
    @Expose
    private long animalSlaughterKillsParty;
    @SerializedName("animal_slaughter_round_wins_party")
    @Expose
    private long animalSlaughterRoundWinsParty;
    @SerializedName("anvil_spleef_best_time_party")
    @Expose
    private long anvilSpleefBestTimeParty;
    @SerializedName("anvil_spleef_round_wins_party")
    @Expose
    private long anvilSpleefRoundWinsParty;
    @SerializedName("cannon_painting_round_wins_party")
    @Expose
    private long cannonPaintingRoundWinsParty;
    @SerializedName("dive_best_score_party")
    @Expose
    private long diveBestScoreParty;
    @SerializedName("dive_round_wins_party")
    @Expose
    private long diveRoundWinsParty;
    @SerializedName("dive_total_score_party")
    @Expose
    private long diveTotalScoreParty;
    @SerializedName("high_ground_best_score_party")
    @Expose
    private long highGroundBestScoreParty;
    @SerializedName("high_ground_total_score_party")
    @Expose
    private long highGroundTotalScoreParty;
    @SerializedName("minecart_racing_best_time_party")
    @Expose
    private long minecartRacingBestTimeParty;
    @SerializedName("minecart_racing_round_wins_party")
    @Expose
    private long minecartRacingRoundWinsParty;
    @SerializedName("bigshot_powerup_activations_ender")
    @Expose
    private long bigshotPowerupActivationsEnder;
    @SerializedName("blocks_destroyed_ender")
    @Expose
    private long blocksDestroyedEnder;
    @SerializedName("powerup_activations_ender")
    @Expose
    private long powerupActivationsEnder;
    @SerializedName("tripleshot_powerup_activations_ender")
    @Expose
    private long tripleshotPowerupActivationsEnder;
    @SerializedName("round_wins_simon_says")
    @Expose
    private long roundWinsSimonSays;
    @SerializedName("top_score_simon_says")
    @Expose
    private long topScoreSimonSays;
    @SerializedName("super_sheep_round_wins_party")
    @Expose
    private long superSheepRoundWinsParty;
    @SerializedName("fire_leapers_round_wins_party")
    @Expose
    private long fireLeapersRoundWinsParty;
    @SerializedName("pig_jousting_round_wins_party")
    @Expose
    private long pigJoustingRoundWinsParty;
    @SerializedName("rpg_16_kills_best_score_party")
    @Expose
    private long rpg16KillsBestScoreParty;
    @SerializedName("rpg_16_kills_party")
    @Expose
    private long rpg16KillsParty;
    @SerializedName("rpg_16_round_wins_party")
    @Expose
    private long rpg16RoundWinsParty;
    @SerializedName("workshop_round_wins_party")
    @Expose
    private long workshopRoundWinsParty;
    @SerializedName("lab_escape_best_time_party")
    @Expose
    private long labEscapeBestTimeParty;
    @SerializedName("lab_escape_round_wins_party")
    @Expose
    private long labEscapeRoundWinsParty;
    @SerializedName("shooting_range_round_wins_party")
    @Expose
    private long shootingRangeRoundWinsParty;
    @SerializedName("high_ground_round_wins_party")
    @Expose
    private long highGroundRoundWinsParty;
    @SerializedName("the_floor_is_lava_best_time_party")
    @Expose
    private long theFloorIsLavaBestTimeParty;
    @SerializedName("the_floor_is_lava_round_wins_party")
    @Expose
    private long theFloorIsLavaRoundWinsParty;
    @SerializedName("jungle_jump_best_time_party")
    @Expose
    private long jungleJumpBestTimeParty;
    @SerializedName("jungle_jump_round_wins_party")
    @Expose
    private long jungleJumpRoundWinsParty;
    @SerializedName("lawn_moower_mowed_best_score_party")
    @Expose
    private long lawnMoowerMowedBestScoreParty;
    @SerializedName("lawn_moower_mowed_total_score_party")
    @Expose
    private long lawnMoowerMowedTotalScoreParty;
    @SerializedName("lawn_moower_round_wins_party")
    @Expose
    private long lawnMoowerRoundWinsParty;
    @SerializedName("hoe_hoe_hoe_best_score_party")
    @Expose
    private long hoeHoeHoeBestScoreParty;
    @SerializedName("hoe_hoe_hoe_total_score_party")
    @Expose
    private long hoeHoeHoeTotalScoreParty;
    @SerializedName("bombardment_best_time_party")
    @Expose
    private long bombardmentBestTimeParty;
    @SerializedName("bombardment_round_wins_party")
    @Expose
    private long bombardmentRoundWinsParty;
    @SerializedName("frozen_floor_round_wins_party")
    @Expose
    private long frozenFloorRoundWinsParty;
    @SerializedName("pig_fishing_round_wins_party")
    @Expose
    private long pigFishingRoundWinsParty;
    @SerializedName("hoe_hoe_hoe_round_wins_party")
    @Expose
    private long hoeHoeHoeRoundWinsParty;
    @SerializedName("round_wins_santa_says")
    @Expose
    private long roundWinsSantaSays;
    @SerializedName("dangerous_taunts_used_farm_hunt")
    @Expose
    private long dangerousTauntsUsedFarmHunt;
    @SerializedName("safe_taunts_used_farm_hunt")
    @Expose
    private long safeTauntsUsedFarmHunt;
    @SerializedName("taunts_used_farm_hunt")
    @Expose
    private long tauntsUsedFarmHunt;
    @SerializedName("bow_kills_farm_hunt")
    @Expose
    private long bowKillsFarmHunt;
    @SerializedName("hunter_bow_kills_farm_hunt")
    @Expose
    private long hunterBowKillsFarmHunt;
    @SerializedName("hunter_kills_farm_hunt")
    @Expose
    private long hunterKillsFarmHunt;
    @SerializedName("hunters_bow_kills_farm_hunt")
    @Expose
    private long huntersBowKillsFarmHunt;
    @SerializedName("kills_farm_hunt")
    @Expose
    private long killsFarmHunt;
    @SerializedName("poop_collected_farm_hunt")
    @Expose
    private long poopCollectedFarmHunt;
    @SerializedName("best_round_zombies_deadend_hard")
    @Expose
    private long bestRoundZombiesDeadendHard;
    @SerializedName("deaths_zombies_deadend_hard")
    @Expose
    private long deathsZombiesDeadendHard;
    @SerializedName("players_revived_zombies_deadend_hard")
    @Expose
    private long playersRevivedZombiesDeadendHard;
    @SerializedName("total_rounds_survived_zombies_deadend_hard")
    @Expose
    private long totalRoundsSurvivedZombiesDeadendHard;
    @SerializedName("windows_repaired_zombies_deadend_hard")
    @Expose
    private long windowsRepairedZombiesDeadendHard;
    @SerializedName("zombie_kills_zombies_deadend_hard")
    @Expose
    private long zombieKillsZombiesDeadendHard;
    @SerializedName("times_knocked_down_zombies_deadend_hard")
    @Expose
    private long timesKnockedDownZombiesDeadendHard;
    @SerializedName("doors_opened_zombies_deadend_hard")
    @Expose
    private long doorsOpenedZombiesDeadendHard;
    @SerializedName("fastest_time_10_zombies_deadend_hard")
    @Expose
    private long fastestTime10ZombiesDeadendHard;
    @SerializedName("fastest_time_20_zombies_deadend_hard")
    @Expose
    private long fastestTime20ZombiesDeadendHard;
    @SerializedName("fastest_time_30_zombies_deadend_hard")
    @Expose
    private long fastestTime30ZombiesDeadendHard;
    @SerializedName("wins_zombies_deadend_hard")
    @Expose
    private long winsZombiesDeadendHard;
    @SerializedName("animal_bow_kills_farm_hunt")
    @Expose
    private long animalBowKillsFarmHunt;
    @SerializedName("animal_kills_farm_hunt")
    @Expose
    private long animalKillsFarmHunt;
    @SerializedName("animals_bow_kills_farm_hunt")
    @Expose
    private long animalsBowKillsFarmHunt;
    @SerializedName("risky_taunts_used_farm_hunt")
    @Expose
    private long riskyTauntsUsedFarmHunt;
    @SerializedName("pixel_party_music_volume")
    @Expose
    private long pixelPartyMusicVolume;
    @SerializedName("jigsaw_rush_round_wins_party")
    @Expose
    private long jigsawRushRoundWinsParty;
    @SerializedName("spider_maze_round_wins_party")
    @Expose
    private long spiderMazeRoundWinsParty;
    @SerializedName("animal_wins_farm_hunt")
    @Expose
    private long animalWinsFarmHunt;
    @SerializedName("woolhunt_assists")
    @Expose
    private long woolhuntAssists;
    @SerializedName("woolhunt_deaths")
    @Expose
    private long woolhuntDeaths;
    @SerializedName("woolhunt_deaths_to_woolholder")
    @Expose
    private long woolhuntDeathsToWoolholder;
    @SerializedName("woolhunt_deaths_with_wool")
    @Expose
    private long woolhuntDeathsWithWool;
    @SerializedName("woolhunt_experienced_losses")
    @Expose
    private long woolhuntExperiencedLosses;
    @SerializedName("woolhunt_experienced_wins")
    @Expose
    private long woolhuntExperiencedWins;
    @SerializedName("woolhunt_fastest_win")
    @Expose
    private long woolhuntFastestWin;
    @SerializedName("woolhunt_fastest_wool_capture")
    @Expose
    private long woolhuntFastestWoolCapture;
    @SerializedName("woolhunt_gold_earned")
    @Expose
    private long woolhuntGoldEarned;
    @SerializedName("woolhunt_gold_spent")
    @Expose
    private long woolhuntGoldSpent;
    @SerializedName("woolhunt_kills")
    @Expose
    private long woolhuntKills;
    @SerializedName("woolhunt_kills_on_woolholder")
    @Expose
    private long woolhuntKillsOnWoolholder;
    @SerializedName("woolhunt_kills_with_wool")
    @Expose
    private long woolhuntKillsWithWool;
    @SerializedName("woolhunt_longest_game")
    @Expose
    private long woolhuntLongestGame;
    @SerializedName("woolhunt_most_gold_earned")
    @Expose
    private long woolhuntMostGoldEarned;
    @SerializedName("woolhunt_most_kills_and_assists")
    @Expose
    private long woolhuntMostKillsAndAssists;
    @SerializedName("woolhunt_participated_losses")
    @Expose
    private long woolhuntParticipatedLosses;
    @SerializedName("woolhunt_participated_wins")
    @Expose
    private long woolhuntParticipatedWins;
    @SerializedName("woolhunt_wools_captured")
    @Expose
    private long woolhuntWoolsCaptured;
    @SerializedName("woolhunt_wools_stolen")
    @Expose
    private long woolhuntWoolsStolen;

    @Override
    public long getCoins() {
        return coins;
    }

    @Override
    public long getGamesPlayed() {
        return 0; //Not much in the api
    }

    @Override
    public long getWins() {
        return winsDragonwars2 + winsDayone + winsEnder + winsFarmHunt + winsHoleInTheWall + winsOneinthequiver + winsParty + winsParty3 + winsScubaSimulator + winsSoccer + winsZombies + winsZombiesDeadend + winsZombiesDeadendNormal + winsZombiesBadblood + winsZombiesBadbloodNormal + winsEasterSimulator + winsHalloweenSimulator;
    }

    @Override
    public long getKills() {
        return killsDragonwars2 + killsDayone + killsFarmHunt + killsOneinthequiver + killsThrowOut + killsMiniWalls;
    }

    @Override
    public long getDeaths() {
        return deathsMiniWalls + deathsOneinthequiver + deathsThrowOut + deathsZombies + deathsZombiesDeadend + deathsZombiesDeadendNormal + deathsZombiesBadblood;
    }
}
