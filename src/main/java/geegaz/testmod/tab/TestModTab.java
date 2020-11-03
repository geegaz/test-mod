package geegaz.testmod.tab;

import geegaz.testmod.TestMod;
import geegaz.testmod.registry.ItemRegistry;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

/**
 * To display items in a specific order, use
 * <code> .create().icon().appendItems().build();
 */
public class TestModTab {
    public static final ItemGroup ITEMS_TAB = FabricItemGroupBuilder.build(
        new Identifier(TestMod.MOD_ID, "items"),
        () -> new ItemStack(ItemRegistry.SMALL_FEATHER));
    
    public static final ItemGroup BLOCKS_TAB = FabricItemGroupBuilder.build(
        new Identifier(TestMod.MOD_ID, "blocks"),
        () -> new ItemStack(ItemRegistry.SMALL_FEATHER));
}
