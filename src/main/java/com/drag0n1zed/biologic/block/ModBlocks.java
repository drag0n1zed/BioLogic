package com.drag0n1zed.biologic.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.drag0n1zed.biologic.main.BioLogic.MODID;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);

    public static final DeferredBlock<Block> BIOTECH_CORE = BLOCKS.register("biotech_core",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT)));
}
