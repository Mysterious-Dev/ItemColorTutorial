package fr.lmf.item_color_tutorial;

import fr.lmf.item_color_tutorial.init.ItemInit;
import net.minecraft.client.Minecraft;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod(Main.MODID)
public class Main {

    public static final String MODID = "item_color_tutorial";

    public Main() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.ITEMS.register(bus);

    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        Minecraft.getInstance().getItemColors().register((stack, color) -> {
            return stack.getTag() != null && stack.getTag().contains("color", 99) ? stack.getTag().getInt("color") : 0x13421772;
        }, ItemInit.COLOR_ITEM.get());
    }
}
