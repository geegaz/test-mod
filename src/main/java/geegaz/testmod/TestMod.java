package geegaz.testmod;

import net.fabricmc.api.ModInitializer;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import geegaz.testmod.registry.ItemRegistry;

public class TestMod implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "testmod";
    public static final String MOD_NAME = "Test Mod";

    @Override
    public void onInitialize() {
        log(Level.INFO, "Initializing");
        
        // Initialize every Registry
        ItemRegistry.init();
    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }
}