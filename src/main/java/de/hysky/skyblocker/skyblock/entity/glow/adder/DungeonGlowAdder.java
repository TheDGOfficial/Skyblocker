package de.hysky.skyblocker.skyblock.entity.glow.adder;


import net.minecraft.world.entity.Entity;

import de.hysky.skyblocker.annotations.Init;
import de.hysky.skyblocker.skyblock.entity.MobGlowAdder;
import de.hysky.skyblocker.utils.Utils;

public class DungeonGlowAdder extends MobGlowAdder {
	public static final DungeonGlowAdder INSTANCE = new DungeonGlowAdder();
	protected static final int STARRED_COLOUR = 0xF57738;
	private static final int LOST_ADVENTURER_COLOUR = 0xFEE15C;
	private static final int SHADOW_ASSASSIN_COLOUR = 0x5B2CB2;
	private static final int ANGRY_ARCHAEOLOGIST_COLOUR = 0x57C2F7;
	private static final int ENDERMAN_EYE_COLOUR = 0xCC00FA;

	@Init
	public static void init() {}

	@Override
	public int computeColour(Entity entity) {
		return NO_GLOW;
		// Lazy-once getName and getString call to skip Text processing unless the value is actually used
		/*Supplier<String> name = Suppliers.memoize(() -> entity.getName().getString());

		return switch (entity) {
			// Minibosses
			case Player _ when SkyblockerConfigManager.get().dungeons.starredMobGlow && !DungeonManager.getBoss().isFloor(4) && name.equals("Lost Adventurer") -> LOST_ADVENTURER_COLOUR;
			case Player _ when SkyblockerConfigManager.get().dungeons.starredMobGlow && !DungeonManager.getBoss().isFloor(4) && name.equals("Shadow Assassin") -> SHADOW_ASSASSIN_COLOUR;
			case Player _ when SkyblockerConfigManager.get().dungeons.starredMobGlow && !DungeonManager.getBoss().isFloor(4) && name.equals("Diamond Guy") -> ANGRY_ARCHAEOLOGIST_COLOUR;
			case Player _ when entity.getId() == LividColor.getCorrectLividId() && LividColor.shouldGlow(name) -> LividColor.getGlowColor(name);

			// Bats
			case Bat _ when SkyblockerConfigManager.get().dungeons.starredMobGlow -> STARRED_COLOUR;

			// Fel Heads
			case ArmorStand as when SkyblockerConfigManager.get().dungeons.starredMobGlow && as.isMarker() && as.hasItemInSlot(EquipmentSlot.HEAD) && ItemUtils.getHeadTexture(as.getItemBySlot(EquipmentSlot.HEAD)).equals(HeadTextures.FEL) -> ENDERMAN_EYE_COLOUR;

			// Wither & Blood Keys
			case ArmorStand as when SkyblockerConfigManager.get().dungeons.highlightDoorKeys && as.hasItemInSlot(EquipmentSlot.HEAD) -> {
				yield switch (ItemUtils.getHeadTexture(as.getItemBySlot(EquipmentSlot.HEAD))) {
					case String s when s.equals(HeadTextures.WITHER_KEY) -> DyeColor.CYAN.getTextColor();
					case String s when s.equals(HeadTextures.BLOOD_KEY) -> DyeColor.CYAN.getTextColor();
					default -> NO_GLOW;
				};
			}

			// Armor Stands
			case ArmorStand _ -> 0;

			// Regular Mobs
			case Entity _ when SkyblockerConfigManager.get().dungeons.starredMobGlow && isStarred(entity) -> STARRED_COLOUR;

			//Class-based glow
			//This goes after regular mobs to ensure starred player entities like dreadlords have the glow applied
			case Player p when SkyblockerConfigManager.get().dungeons.classBasedPlayerGlow && DungeonScore.isDungeonStarted() -> DungeonPlayerManager.getClassFromPlayer(p).glowColor();

			default -> NO_GLOW;
		};*/
	}

	@Override
	public boolean isEnabled() {
		return Utils.isInDungeons();
	}

	/**
	 * Checks if an entity is starred by checking if its armor stand contains a star in its name.
	 *
	 * @param entity the entity to check.
	 * @return true if the entity is starred, false otherwise
	 */
	public static boolean isStarred(Entity entity) {
		return false;
		/*List<ArmorStand> armorStands = MobGlow.getArmorStands(entity);
		return !armorStands.isEmpty() && armorStands.getFirst().getName().getString().contains("✯");*/
	}
}
