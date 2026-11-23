package de.hysky.skyblocker.mixins;

import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.network.chat.MutableComponent;

@Mixin(MutableComponent.class)
public abstract class MutableComponentMixin {
	/*@Shadow
	public abstract ComponentContents getContents();

	@WrapOperation(method = "getVisualOrderText", at = @At(value = "INVOKE", target = "Lnet/minecraft/locale/Language;getVisualOrder(Lnet/minecraft/network/chat/FormattedText;)Lnet/minecraft/util/FormattedCharSequence;"))
	public FormattedCharSequence getVisualOrderText(Language instance, FormattedText formattedText, Operation<FormattedCharSequence> original) {
		if (getContents() instanceof GridComponent.Contents gridContents)
			return new GridFormattedCharSequence(gridContents);
		return original.call(instance, formattedText);
	}*/
}
