package fr.lmf.item_color_tutorial.init;

import fr.lmf.item_color_tutorial.Main;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);
    public static final RegistryObject<Item> COLOR_ITEM = ITEMS.register("item_color" , () -> new Item((new Item.Properties()).tab(CreativeModeTab.TAB_MISC)));

}
