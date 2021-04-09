package devlaunchers.exploration;


import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.generator.BlockPopulator;

import java.util.Random;


public class TestStructure extends BlockPopulator {
    @Override
    public void populate(World world, Random random, Chunk source){
        System.out.println("Bedrock placed");
        Block block = world.getBlockAt(source.getX(), world.getHighestBlockYAt(source.getX(), source.getZ()), source.getZ());
        block.setType(Material.BEDROCK);

    }

}
