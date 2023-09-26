
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.balls.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.balls.BallsMod;

public class BallsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, BallsMod.MODID);
	public static final RegistryObject<SoundEvent> HENTAI = REGISTRY.register("hentai", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("balls", "hentai")));
}
