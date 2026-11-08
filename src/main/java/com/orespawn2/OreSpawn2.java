package com.orespawn2;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
    modid = OreSpawn2.MODID,
    name = OreSpawn2.NAME,
    version = OreSpawn2.VERSION,
    acceptedMinecraftVersions = "[1.12.2]"
)
public class OreSpawn2 {

    public static final String MODID = "orespawn2";
    public static final String NAME = "OreSpawn 2";
    public static final String VERSION = "1.0.0";

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        event.getModLog().info("OreSpawn 2 iniciado!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        event.getModLog().info("OreSpawn 2 carregado!");
    }
}
