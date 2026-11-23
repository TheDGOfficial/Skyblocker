package de.hysky.skyblocker.mixins;

import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.client.renderer.item.ItemModelResolver;

//@Debug(export = true)
@Mixin(ItemModelResolver.class)
public class ItemModelResolverMixin {
	/*@ModifyExpressionValue(
			method = {"appendItemLayers", "shouldPlaySwapAnimation"},
			at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;"),
			order = 900
	)
	private Object modifyModel(Object o, @Local(argsOnly = true) ItemStack stack) {
		if (o instanceof Identifier && !stack.getUuid().isEmpty() && SkyblockerConfigManager.get().general.customItemModel.containsKey(stack.getUuid())) {
			return SkyblockerConfigManager.get().general.customItemModel.get(stack.getUuid());
		}
		return o;
	}*/
}
