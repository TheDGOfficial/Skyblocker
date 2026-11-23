package de.hysky.skyblocker.mixins;

import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.core.component.DataComponentHolder;


@Mixin(DataComponentHolder.class)
public interface DataComponentHolderMixin {

	/*@SuppressWarnings("unchecked")
	@ModifyReturnValue(method = "get", at = @At("RETURN"))
	private <T> T skyblocker$customComponents(T original, DataComponentType<? extends T> dataComponentType) {
		if (Utils.isOnSkyblock() && (Object) this instanceof ItemStack stack) {
			String itemUuid = stack.getUuid();
			if (dataComponentType == DataComponents.TRIM) {
				CustomArmorTrims.ArmorTrimId trimKey = SkyblockerConfigManager.get().general.customArmorTrims.get(itemUuid);

				if (trimKey != null) {
					return (T) CustomArmorTrims.TRIMS_CACHE.getOrDefault(trimKey, (ArmorTrim) original);
				}
			} else if (dataComponentType == DataComponents.PROFILE && stack.is(Items.PLAYER_HEAD)) {
				// Normal head textures
				String tex = SkyblockerConfigManager.get().general.customHelmetTextures.get(itemUuid);

				if (tex != null) {
					return (T) CustomHelmetTextures.getProfile(tex);
				}

				// Animated heads
				String animatedTexId = SkyblockerConfigManager.get().general.customAnimatedHelmetTextures.get(itemUuid);
				ResolvableProfile frame = animatedTexId != null ? CustomAnimatedHelmetTextures.animateHeadTexture(animatedTexId) : null;

				if (frame != null) {
					return (T) frame;
				}
			} else if (dataComponentType == DataComponents.ENCHANTMENT_GLINT_OVERRIDE) {
				@SuppressWarnings("deprecation")
				Boolean glint = SkyblockerConfigManager.get().general.customGlint.get(itemUuid); // sorry fastutil :(

				if (glint != null) {
					return (T) glint;
				}
			}
		}
		return original;
	}*/
}
