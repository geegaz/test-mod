package test;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestModInitializer implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "testmod";
    public static final String MOD_NAME = "Test Mod";

    // Instance Items
    public static final Item FABRIC_ITEM = new Item(new Item.Settings().group(ItemGroup.MISC));

    @Override
    public void onInitialize() {
        log(Level.INFO, "Initializing");

        // Register Items
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "orb"), FABRIC_ITEM);
    }

    public static void log(Level level, String message) {
        LOGGER.log(level, "[" + MOD_NAME + "] " + message);
    }
}