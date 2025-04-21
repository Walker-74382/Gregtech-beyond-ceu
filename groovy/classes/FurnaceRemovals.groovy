package classes;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.common.items.MetaItems.*;
import static gtb.api.unification.materials.GTBMaterials.*;
import static net.minecraft.init.Items.*;
import static material.GTBMaterials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import net.minecraft.init.Blocks.*;

import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.OreDictUnifier;

class FurnaceRemovals {

    public static void init() {



        ModHandler.removeRecipeByOutput(IRON_BOOTS.getDefaultInstance());
        ModHandler.removeRecipeByOutput(IRON_HELMET.getDefaultInstance());
        ModHandler.removeRecipeByOutput(IRON_CHESTPLATE.getDefaultInstance());
        ModHandler.removeRecipeByOutput(IRON_LEGGINGS.getDefaultInstance());

        ModHandler.removeRecipeByOutput(DIAMOND_BOOTS.getDefaultInstance());
        ModHandler.removeRecipeByOutput(DIAMOND_HELMET.getDefaultInstance());
        ModHandler.removeRecipeByOutput(DIAMOND_CHESTPLATE.getDefaultInstance());
        ModHandler.removeRecipeByOutput(DIAMOND_LEGGINGS.getDefaultInstance());

        ModHandler.removeRecipeByOutput(GOLDEN_BOOTS.getDefaultInstance());
        ModHandler.removeRecipeByOutput(GOLDEN_HELMET.getDefaultInstance());
        ModHandler.removeRecipeByOutput(GOLDEN_CHESTPLATE.getDefaultInstance());
        ModHandler.removeRecipeByOutput(GOLDEN_LEGGINGS.getDefaultInstance());
    }
}
