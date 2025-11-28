package org.evlis.yui.client.mixin;

import net.minecraft.client.multiplayer.ClientAdvancements;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ChorusFlowerBlock;
import net.minecraft.world.level.block.LiquidBlockContainer;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(ChorusFlowerBlock.class)
abstract class ChorusFlowerMixin extends Block implements LiquidBlockContainer {
    public ChorusFlowerMixin(Properties properties) {
        super(properties);
    }

    @Override
    protected FluidState getFluidState(BlockState state) {
        return Fluids.WATER.getSource(false);
    }
}
