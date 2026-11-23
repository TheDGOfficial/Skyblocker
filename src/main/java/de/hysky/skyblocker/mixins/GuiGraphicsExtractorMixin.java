package de.hysky.skyblocker.mixins;


import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.client.gui.GuiGraphicsExtractor;


@Mixin(GuiGraphicsExtractor.class)
public abstract class GuiGraphicsExtractorMixin {
	/*@ModifyExpressionValue(method = "itemCooldown", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemCooldowns;getCooldownPercent(Lnet/minecraft/world/item/ItemStack;F)F"))
	private float skyblocker$modifyItemCooldown(float cooldownProgress, @Local(name = "itemStack") ItemStack stack) {
		return Utils.isOnSkyblock() && ItemCooldowns.isOnCooldown(stack) ? ItemCooldowns.getItemCooldownEntry(stack).getRemainingCooldownPercent() : cooldownProgress;
	}*/
}
