package de.hysky.skyblocker.mixins;


import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.inventory.AbstractContainerMenu;


@Mixin(AbstractContainerMenu.class)
public class AbstractContainerMenuMixin {
	/*@Inject(method = "setItem", at = @At("HEAD"))
	private void onSetStackInSlot(int slot, int revision, ItemStack stack, CallbackInfo ci) {
		ContainerSolverManager.markHighlightsDirty();
		if (InventorySearch.isSearching()) {
			InventorySearch.refreshSlot(slot);
		}
		ItemPickupWidget.getInstance().onItemPickup(slot, stack);
	}*/
}
