package com.duckcreeper.landscapemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Landmain {
	
	@Instance(Reference.MODID)
	public static Landmain instance;
	
	public static final CreativeTabs modTab = new CreativeTabs(Reference.MODID) {
		public Item getTabIconItem() {
			return Items.CHORUS_FRUIT;
		}
	};
	
	 @EventHandler
	 public void preInit(FMLPreInitializationEvent event) {
		 
	 }
	
    @EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}
