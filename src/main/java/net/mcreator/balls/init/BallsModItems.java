
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.balls.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.balls.item.GlaivetoolItem;
import net.mcreator.balls.item.EmeraldhammerweaponItem;
import net.mcreator.balls.BallsMod;

public class BallsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BallsMod.MODID);
	public static final RegistryObject<Item> EMERALD_HAMMER = REGISTRY.register("emerald_hammer", () -> new EmeraldhammerweaponItem());
	public static final RegistryObject<Item> GLAIVETOOL = REGISTRY.register("glaivetool", () -> new GlaivetoolItem());
}
