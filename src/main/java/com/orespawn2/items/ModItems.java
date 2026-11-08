package com.orespawn2.items;

import com.orespawn2.OreSpawn2;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = OreSpawn2.MODID)
public class ModItems {

    public static Item TITANIUM_INGOT;

    @SubscribeEvent
    public static void registerItems(
        RegistryEvent.Register<Item> event) {

        TITANIUM_INGOT = new Item()
            .setRegistryName(
                new ResourceLocation(
                    OreSpawn2.MODID,
                    "titanium_ingot"
                )
            )
            .setUnlocalizedName(
                OreSpawn2.MODID + ".titanium_ingot"
            )
            .setCreativeTab(CreativeTabs.MATERIALS);

        event.getRegistry().register(TITANIUM_INGOT);
    }
}
