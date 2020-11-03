package geegaz.testmod.item;

import java.util.List;

import geegaz.testmod.TestMod;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

public class SmallFeatherItem extends Item { 
    public SmallFeatherItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(new TranslatableText("item."+TestMod.MOD_ID+".small_feather.tooltip"));
    }
}
