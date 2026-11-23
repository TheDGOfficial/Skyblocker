package de.hysky.skyblocker.mixins;

import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.item.component.DyedItemColor;


@Mixin(DyedItemColor.class)
public class DyedItemColorMixin {

	/*@ModifyReturnValue(method = "getOrDefault", at = @At("RETURN"))
	private static int skyblocker$customDyeColor(int originalColor, @Local(name = "itemStack") ItemStack stack) {
		if (Utils.isOnSkyblock()) {
			String itemUuid = stack.getUuid();

			if (SkyblockerConfigManager.get().general.customAnimatedDyes.containsKey(itemUuid)) {
				return ARGB.opaque(CustomArmorAnimatedDyes.animateColorTransition(SkyblockerConfigManager.get().general.customAnimatedDyes.get(itemUuid)));
			}

			if (SkyblockerConfigManager.get().general.customDyeColors.containsKey(itemUuid)) {
				return ARGB.opaque(SkyblockerConfigManager.get().general.customDyeColors.getInt(itemUuid));
			}
		}

		return originalColor;
	}*/
}
