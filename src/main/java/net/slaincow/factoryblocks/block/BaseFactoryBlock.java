package net.slaincow.factoryblocks.block;

import net.minecraft.block.Block;
import net.minecraft.state.property.BooleanProperty;

import static net.slaincow.factoryblocks.FactorySound.FACTORY_BLOCKS;

public class BaseFactoryBlock extends Block
{
    public static final BooleanProperty ON = BooleanProperty.of("on");
    public BaseFactoryBlock(Settings settings)
    {
        super(settings.strength(2.0f).sounds(FACTORY_BLOCKS));
    }
}
