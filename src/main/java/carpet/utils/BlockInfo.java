package carpet.utils;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.pathfinding.PathType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.registry.IRegistry;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BlockInfo
{
    public static Map<SoundType, String> soundName = new HashMap<SoundType, String>() {{
        put(SoundType.WOOD,   "wood"  );
        put(SoundType.GROUND, "gravel");
        put(SoundType.PLANT,  "grass" );
        put(SoundType.STONE,  "stone" );
        put(SoundType.METAL,  "metal" );
        put(SoundType.GLASS , "glass" );
        put(SoundType.CLOTH , "wool"  );
        put(SoundType.SAND  , "sand"  );
        put(SoundType.SNOW  , "snow"  );
        put(SoundType.LADDER, "ladder");
        put(SoundType.ANVIL , "anvil" );
        put(SoundType.SLIME , "slime" );
        put(SoundType.WET_GRASS , "sea_grass" );
        put(SoundType.CORAL , "coral" );
    }};

    public static Map<MaterialColor, String> mapColourName = new HashMap<MaterialColor, String>() {{
        put(MaterialColor.AIR       , "air"       );
        put(MaterialColor.GRASS     , "grass"     );
        put(MaterialColor.SAND      , "sand"      );
        put(MaterialColor.WOOL      , "wool"      );
        put(MaterialColor.TNT       , "tnt"       );
        put(MaterialColor.ICE       , "ice"       );
        put(MaterialColor.IRON      , "iron"      );
        put(MaterialColor.FOLIAGE   , "foliage"   );
        put(MaterialColor.SNOW      , "snow"      );
        put(MaterialColor.CLAY      , "clay"      );
        put(MaterialColor.DIRT      , "dirt"      );
        put(MaterialColor.STONE     , "stone"     );
        put(MaterialColor.WATER     , "water"     );
        put(MaterialColor.WOOD      , "wood"      );
        put(MaterialColor.QUARTZ    , "quartz"    );
        put(MaterialColor.ADOBE     , "adobe"     );
        put(MaterialColor.MAGENTA   , "magenta"   );
        put(MaterialColor.LIGHT_BLUE, "light_blue");
        put(MaterialColor.YELLOW    , "yellow"    );
        put(MaterialColor.LIME      , "lime"      );
        put(MaterialColor.PINK      , "pink"      );
        put(MaterialColor.GRAY      , "gray"      );
        put(MaterialColor.LIGHT_GRAY, "light_gray");
        put(MaterialColor.CYAN      , "cyan"      );
        put(MaterialColor.PURPLE    , "purple"    );
        put(MaterialColor.BLUE      , "blue"      );
        put(MaterialColor.BROWN     , "brown"     );
        put(MaterialColor.GREEN     , "green"     );
        put(MaterialColor.RED       , "red"       );
        put(MaterialColor.BLACK     , "black"     );
        put(MaterialColor.GOLD      , "gold"      );
        put(MaterialColor.DIAMOND   , "diamond"   );
        put(MaterialColor.LAPIS     , "lapis"     );
        put(MaterialColor.EMERALD   , "emerald"   );
        put(MaterialColor.OBSIDIAN  , "obsidian"  );
        put(MaterialColor.NETHERRACK, "netherrack");
        put(MaterialColor.WHITE_TERRACOTTA     , "white_terracotta"      );
        put(MaterialColor.ORANGE_TERRACOTTA    , "orange_terracotta"     );
        put(MaterialColor.MAGENTA_TERRACOTTA   , "magenta_terracotta"    );
        put(MaterialColor.LIGHT_BLUE_TERRACOTTA, "light_blue_terracotta" );
        put(MaterialColor.YELLOW_TERRACOTTA    , "yellow_terracotta"     );
        put(MaterialColor.LIME_TERRACOTTA      , "lime_terracotta"       );
        put(MaterialColor.PINK_TERRACOTTA      , "pink_terracotta"       );
        put(MaterialColor.GRAY_TERRACOTTA      , "gray_terracotta"       );
        put(MaterialColor.LIGHT_GRAY_TERRACOTTA, "light_gray_terracotta" );
        put(MaterialColor.CYAN_TERRACOTTA      , "cyan_terracotta"       );
        put(MaterialColor.PURPLE_TERRACOTTA    , "purple_terracotta"     );
        put(MaterialColor.BLUE_TERRACOTTA      , "blue_terracotta"       );
        put(MaterialColor.BROWN_TERRACOTTA     , "brown_terracotta"      );
        put(MaterialColor.GREEN_TERRACOTTA     , "green_terracotta"      );
        put(MaterialColor.RED_TERRACOTTA       , "red_terracotta"        );
        put(MaterialColor.BLACK_TERRACOTTA     , "black_terracotta"      );
    }};

    public static Map<Material, String> materialName = new HashMap<Material, String>() {{
        put(Material.AIR            , "air"          );
        put(Material.STRUCTURE_VOID , "void"         );
        put(Material.PORTAL         , "portal"       );
        put(Material.CARPET         , "carpet"       );
        put(Material.PLANTS         , "plant"        );
        put(Material.OCEAN_PLANT    , "water_plant"  );
        put(Material.VINE           , "vine"         );
        put(Material.SEA_GRASS      , "sea_grass"    );
        put(Material.WATER          , "water"        );
        put(Material.BUBBLE_COLUMN  , "bubble_column");
        put(Material.LAVA           , "lava"         );
        put(Material.SNOW           , "snow_layer"   );
        put(Material.FIRE           , "fire"         );
        put(Material.CIRCUITS       , "redstone_bits");
        put(Material.WEB            , "cobweb"       );
        put(Material.REDSTONE_LIGHT , "redstone_lamp");
        put(Material.CLAY           , "clay"         );
        put(Material.GROUND         , "dirt"         );
        put(Material.GRASS          , "grass"        );
        put(Material.PACKED_ICE     , "packed_ice"   );
        put(Material.SAND           , "sand"         );
        put(Material.SPONGE         , "sponge"       );
        put(Material.WOOD           , "wood"         );
        put(Material.CLOTH          , "wool"         );
        put(Material.TNT            , "tnt"          );
        put(Material.LEAVES         , "leaves"       );
        put(Material.GLASS          , "glass"        );
        put(Material.ICE            , "ice"          );
        put(Material.CACTUS         , "cactus"       );
        put(Material.ROCK           , "stone"        );
        put(Material.IRON           , "iron"         );
        put(Material.CRAFTED_SNOW   , "snow"         );
        put(Material.ANVIL          , "anvil"        );
        put(Material.BARRIER        , "barrier"      );
        put(Material.PISTON         , "piston"       );
        put(Material.CORAL          , "coral"        );
        put(Material.GOURD          , "gourd"        );
        put(Material.DRAGON_EGG     , "dragon_egg"   );
        put(Material.CAKE           , "cake"         );
    }};

    public static List<ITextComponent> blockInfo(BlockPos pos, World world)
    {
        IBlockState state = world.getBlockState(pos);
        Material material = state.getMaterial();
        Block block = state.getBlock();
        String metastring = "";
        for (net.minecraft.state.IProperty<?> iproperty : state.getProperties())
        {
            metastring += ", "+iproperty.getName() + '='+state.get(iproperty);
        }
        List<ITextComponent> lst = new ArrayList<>();
        lst.add(Messenger.s(""));
        lst.add(Messenger.s("====================================="));
        lst.add(Messenger.s(String.format("Block info for %s%s (id %d%s):",IRegistry.BLOCK.getKey(block),metastring, IRegistry.BLOCK.getId(block), metastring )));
        lst.add(Messenger.s(String.format(" - Material: %s", materialName.get(material))));
        lst.add(Messenger.s(String.format(" - Map colour: %s", mapColourName.get(state.getMaterialColor(world, pos)))));
        lst.add(Messenger.s(String.format(" - Sound type: %s", soundName.get(block.getSoundType()))));
        lst.add(Messenger.s(""));
        lst.add(Messenger.s(String.format(" - Full block: %s", state.isFullCube() )));
        lst.add(Messenger.s(String.format(" - Normal cube: %s", state.isNormalCube())));
        lst.add(Messenger.s(String.format(" - Is liquid: %s", material.isLiquid())));
        lst.add(Messenger.s(String.format(" - Is solid: %s", material.isSolid())));
        lst.add(Messenger.s(""));
        lst.add(Messenger.s(String.format(" - Light in: %d, above: %d", world.getLight(pos), world.getLight(pos.up()))));
        lst.add(Messenger.s(String.format(" - Brightness in: %.2f, above: %.2f", world.getBrightness(pos), world.getBrightness(pos.up()))));
        lst.add(Messenger.s(String.format(" - Is opaque: %s", material.isOpaque() )));
        lst.add(Messenger.s(String.format(" - Light opacity: %d", state.getOpacity(world,pos))));
        lst.add(Messenger.s(String.format(" - Blocks light: %s", state.propagatesSkylightDown(world, pos))));
        lst.add(Messenger.s(String.format(" - Emitted light: %d", state.getLightValue())));
        lst.add(Messenger.s(String.format(" - Picks neighbour light value: %s", state.useNeighborBrightness(world, pos))));
        lst.add(Messenger.s(""));
        lst.add(Messenger.s(String.format(" - Causes suffocation: %s", state.causesSuffocation())));
        lst.add(Messenger.s(String.format(" - Blocks movement on land: %s", !state.allowsMovement(world,pos, PathType.LAND))));
        lst.add(Messenger.s(String.format(" - Blocks movement in air: %s", !state.allowsMovement(world,pos, PathType.AIR))));
        lst.add(Messenger.s(String.format(" - Blocks movement in liquids: %s", !state.allowsMovement(world,pos, PathType.WATER))));
        lst.add(Messenger.s(String.format(" - Can burn: %s", material.isFlammable())));
        lst.add(Messenger.s(String.format(" - Requires a tool: %s", !material.isToolNotRequired())));
        lst.add(Messenger.s(String.format(" - Hardness: %.2f", state.getBlockHardness(world, pos))));
        lst.add(Messenger.s(String.format(" - Blast resistance: %.2f", block.getExplosionResistance())));
        lst.add(Messenger.s(String.format(" - Ticks randomly: %s", block.ticksRandomly(state))));
        lst.add(Messenger.s(""));
        lst.add(Messenger.s(String.format(" - Can provide power: %s", state.canProvidePower())));
        lst.add(Messenger.s(String.format(" - Strong power level: %d", world.getStrongPower(pos))));
        lst.add(Messenger.s(String.format(" - Redstone power level: %d", world.getRedstonePowerFromNeighbors(pos))));
        lst.add(Messenger.s(""));
        lst.add(wander_chances(pos.up(), world));

        return lst;
    }

    private static ITextComponent wander_chances(BlockPos pos, World worldIn)
    {
        EntityCreature creature = new EntityPigZombie(worldIn);
        creature.onInitialSpawn(worldIn.getDifficultyForLocation(pos), null, null);
        creature.setLocationAndAngles(pos.getX()+0.5F, pos.getY(), pos.getZ()+0.5F, 0.0F, 0.0F);
        EntityAIWander wander = new EntityAIWander(creature, 0.8D);
        int success = 0;
        for (int i=0; i<1000; i++)
        {

            Vec3d vec = RandomPositionGenerator.findRandomTarget(creature, 10, 7);
            if (vec == null)
            {
                continue;
            }
            success++;
        }
        long total_ticks = 0;
        for (int trie=0; trie<1000; trie++)
        {
            int i;
            for (i=1;i<30*20*60; i++) //*60 used to be 5 hours, limited to 30 mins
            {
                if (wander.shouldExecute())
                {
                    break;
                }
            }
            total_ticks += 3*i;
        }
        creature.remove();
        long total_time = (total_ticks)/1000/20;
        return Messenger.s(String.format(" - Wander chance above: %.1f%%%%\n - Average standby above: %s",
                (100.0F*success)/1000,
                ((total_time>5000)?"INFINITY":(Long.toString(total_time)+" s"))
        ));
    }
}
