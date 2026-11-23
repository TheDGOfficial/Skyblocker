package de.hysky.skyblocker.mixins;

import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.client.renderer.entity.EntityRenderer;

@Mixin(EntityRenderer.class)
public class EntityRendererMixin {

	/*@Inject(method = "extractRenderState", at = @At("TAIL"))
	private void skyblocker$customGlow(CallbackInfo ci, @Local(name = "entity") Entity entity, @Local(name = "state") EntityRenderState state) {
		boolean allowGlowInLivid = LividColor.allowGlow();
		boolean customGlow = MobGlow.hasOrComputeMobGlow(entity);
		boolean allowGlow = allowGlowInLivid && state.appearsGlowing() || customGlow;

		if (allowGlow && customGlow) {
			// Only use custom colour flag if the entity has no vanilla glow (so we can change Hypixel's glow colours without changing the glow's visibility)
			// NB: Custom glow needs to be separate to avoid weird rendering bugs.
			if (!entity.isCurrentlyGlowing()) {
				state.setData(MobGlow.ENTITY_CUSTOM_GLOW_COLOUR, ARGB.opaque(MobGlow.getMobGlow(entity)));
			} else {
				state.outlineColor = ARGB.opaque(MobGlow.getMobGlow(entity));
			}
		} else if (!allowGlow) {
			state.outlineColor = EntityRenderState.NO_OUTLINE;
		}
	}*/

	// This is meant to be separate from the previous injection for organizational purposes.
	/*@Inject(method = "extractRenderState", at = @At(value = "TAIL"))
	private void skyblocker$mobBoundingBox(CallbackInfo ci, @Local(name = "entity") Entity entity, @Local(name = "partialTicks") float partialTicks) {
		if (MobBoundingBoxes.shouldDrawMobBoundingBox(entity)) {
			MobBoundingBoxes.submitBox2BeRendered(Boxes.lerpEntityBoundingBox(entity, partialTicks), MobBoundingBoxes.getBoxColor(entity));
			return;
		}

		if (SlayerManager.shouldGlow(entity, SlayersConfig.HighlightSlayerEntities.HITBOX)) {
			float[] color = ColorUtils.getFloatComponents(SkyblockerConfigManager.get().slayers.highlightColor.getRGB());
			MobBoundingBoxes.submitBox2BeRendered(Boxes.lerpEntityBoundingBox(entity, partialTicks), color);
		}
	}

	// This is meant to be separate from the previous injection for organizational purposes.
	@Inject(method = "extractRenderState", at = @At(value = "TAIL"))
	private void skyblocker$movePlayerRenderPos(CallbackInfo ci, @Local(name = "entity") Entity entity, @Local(name = "state") EntityRenderState state, @Local(name = "partialTicks") float partialTicks) {
		Minecraft client = Minecraft.getInstance();

		if (entity == client.player && !client.options.getCameraType().isFirstPerson()) {
			Vec3 pos;
			if (SkyblockerConfigManager.get().uiAndVisuals.smoothAOTE.predictive) {
				pos = PredictiveSmoothAOTE.getInterpolatedPlayerPos();

			} else {
				pos = ResponsiveSmoothAOTE.getInterpolatedPlayerPos(partialTicks);
			}
			if (pos != null)
			{
				state.x = pos.x;
				state.y = pos.y;
				state.z = pos.z;
			}
		}
	}

	@ModifyReturnValue(method = "getNameTag", at = @At("RETURN"))
	private <T extends Entity> @Nullable Component skyblocker$applyCustomName(@Nullable Component original, T entity) {
		Component customName = entity.skyblocker$getCustomName();
		return customName != null ? customName : original;
	}*/
}
