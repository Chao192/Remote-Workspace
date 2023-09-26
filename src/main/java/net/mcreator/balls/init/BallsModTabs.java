
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.balls.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.balls.BallsMod;

public class BallsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BallsMod.MODID);
	public static final RegistryObject<CreativeModeTab> NEW_WEAPONS = REGISTRY.register("new_weapons",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.balls.new_weapons")).icon(() -> new ItemStack(BallsModItems.EMERALD_HAMMER.get())).displayItems((parameters, tabData) -> {
				tabData.accept(BallsModItems.EMERALD_HAMMER.get());
				tabData.accept(BallsModItems.GLAIVETOOL.get());
			}).withSearchBar().build());
}
