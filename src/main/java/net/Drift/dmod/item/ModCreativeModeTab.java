package net.Drift.dmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab DMOD_TAB = new CreativeModeTab("dmodtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CRYPTON.get());
        }
    };
}
