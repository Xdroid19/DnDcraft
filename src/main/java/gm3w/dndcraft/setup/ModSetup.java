package gm3w.dndcraft.setup;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModSetup {

    public static final String TAB_NAME = "dndcraft";

    public static final CreativeModeTab ITEM_GROUP = new CreativeModeTab(TAB_NAME) {
        @Override
        public ItemStack makeIcon() { return new ItemStack(Items.DIAMOND); }
    };
}
