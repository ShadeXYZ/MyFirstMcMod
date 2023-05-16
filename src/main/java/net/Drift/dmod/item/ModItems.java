package net.Drift.dmod.item;

import net.Drift.dmod.Dmod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Dmod.MOD_ID);

    public  static  final RegistryObject<Item> CRYPTON = ITEMS.register("crypton",
            () -> new Item (new Item.Properties().tab(ModCreativeModeTab.DMOD_TAB)));
    public  static  final RegistryObject<Item> RAW_CRYPTON = ITEMS.register("raw_crypton",
            () -> new Item (new Item.Properties().tab(ModCreativeModeTab.DMOD_TAB)));


    public static  void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
