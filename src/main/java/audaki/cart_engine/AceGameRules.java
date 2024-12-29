package audaki.cart_engine;

import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.fabricmc.fabric.api.gamerule.v1.rule.DoubleRule;
import net.minecraft.world.level.GameRules;

public class AceGameRules {
    // All speeds in blocks per second
    public static GameRules.Key<GameRules.IntegerValue> MINECART_MAX_SPEED_PLAYER_RIDER;
    public static GameRules.Key<GameRules.IntegerValue> MINECART_MAX_SPEED_OTHER_RIDER;
    public static GameRules.Key<GameRules.IntegerValue> MINECART_MAX_SPEED_EMPTY_RIDER;
    public static GameRules.Key<DoubleRule> MINECART_BONUS_SPEED_RAIL_MULTIPLIER;

    public static void register() {
        MINECART_MAX_SPEED_PLAYER_RIDER = GameRuleRegistry.register("minecartMaxSpeedPlayerRider",
                GameRules.Category.PLAYER,
                GameRuleFactory.createIntRule(20));
        MINECART_MAX_SPEED_OTHER_RIDER = GameRuleRegistry.register("minecartMaxSpeedOtherRider",
                GameRules.Category.PLAYER,
                GameRuleFactory.createIntRule(0));
        MINECART_MAX_SPEED_EMPTY_RIDER = GameRuleRegistry.register("minecartMaxSpeedEmptyRider",
                GameRules.Category.PLAYER,
                GameRuleFactory.createIntRule(0));
        MINECART_BONUS_SPEED_RAIL_MULTIPLIER = GameRuleRegistry.register("minecartBonusSpeedRailMultiplier",
                GameRules.Category.PLAYER,
                GameRuleFactory.createDoubleRule(0.0, 0.0));
    }
}
