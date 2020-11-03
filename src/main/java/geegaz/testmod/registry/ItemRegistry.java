package geegaz.testmod.registry;

import java.util.ArrayList;

import geegaz.testmod.TestMod;
import geegaz.testmod.item.SmallFeatherItem;
import geegaz.testmod.tab.TestModTab;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {
    public static final ArrayList<Item> ITEMS = new ArrayList<Item>();

    // Instance Items
    // public static final Item ... = register("...", new ...);
    public static final Item ORB = register("orb", new Item(defaultSettings()));
    public static final Item CLOTH = register("cloth", new Item(defaultSettings()));
    public static final Item SMALL_FEATHER = register("small_feather",
            new SmallFeatherItem(new Item.Settings().maxCount(1).rarity(Rarity.EPIC).group(TestModTab.ITEMS_TAB)));

    public static void init() {
    }

    public static Item register(String name, Item item) {
        Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, name), item);
        ITEMS.add(item);
        return item;
    }

    public static Settings defaultSettings() {
        return new Item.Settings().group(TestModTab.ITEMS_TAB);
    }
}
