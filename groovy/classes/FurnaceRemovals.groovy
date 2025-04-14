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
        // Bornite
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustImpure, Bornite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Bornite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustPure, Bornite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushed, Bornite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedCentrifuged, Bornite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedPurified, Bornite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(ore, Bornite));

        // Chalcocite
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustImpure, Chalcocite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Chalcocite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustPure, Chalcocite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushed, Chalcocite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedCentrifuged, Chalcocite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedPurified, Chalcocite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(ore, Chalcocite));

        // Tetrahedrite
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustImpure, Tetrahedrite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Tetrahedrite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustPure, Tetrahedrite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushed, Tetrahedrite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedCentrifuged, Tetrahedrite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedPurified, Tetrahedrite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(ore, Tetrahedrite));

        // Malachite
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustImpure, Malachite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Malachite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustPure, Malachite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushed, Malachite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedCentrifuged, Malachite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedPurified, Malachite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(ore, Malachite));

        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustImpure, Magnetite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Magnetite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustPure, Magnetite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushed, Magnetite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedCentrifuged, Magnetite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedPurified, Magnetite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(ore, Magnetite));

        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustImpure, BandedIron));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, BandedIron));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustPure, BandedIron));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushed, BandedIron));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedCentrifuged, BandedIron));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedPurified, BandedIron));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(ore, BandedIron));

        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustImpure, YellowLimonite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, YellowLimonite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustPure, YellowLimonite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushed, YellowLimonite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedCentrifuged, YellowLimonite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedPurified, YellowLimonite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(ore, YellowLimonite));

        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustImpure, BrownLimonite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, BrownLimonite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustPure, BrownLimonite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushed, BrownLimonite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedCentrifuged, BrownLimonite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedPurified, BrownLimonite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(ore, BrownLimonite));

        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustImpure, BasalticMineralSand));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, BasalticMineralSand));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustPure, BasalticMineralSand));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushed, BasalticMineralSand));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedCentrifuged, BasalticMineralSand));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedPurified, BasalticMineralSand));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(ore, BasalticMineralSand));

        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustImpure, Molybdenite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Molybdenite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustPure, Molybdenite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushed, Molybdenite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedCentrifuged, Molybdenite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedPurified, Molybdenite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(ore, Molybdenite));

        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustImpure, Pentlandite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Pentlandite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustPure, Pentlandite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushed, Pentlandite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedCentrifuged, Pentlandite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedPurified, Pentlandite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(ore, Pentlandite));

        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustImpure, Galena));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Galena));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustPure, Galena));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushed, Galena));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedCentrifuged, Galena));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedPurified, Galena));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(ore, Galena));

        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustImpure, Garnierite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Garnierite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustPure, Garnierite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushed, Garnierite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedCentrifuged, Garnierite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedPurified, Garnierite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(ore, Garnierite));

        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustImpure, Cassiterite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Cassiterite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustPure, Cassiterite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushed, Cassiterite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedCentrifuged, Cassiterite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedPurified, Cassiterite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(ore, Cassiterite));

        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustImpure, CassiteriteSand));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, CassiteriteSand));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustPure, CassiteriteSand));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushed, CassiteriteSand));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedCentrifuged, CassiteriteSand));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedPurified, CassiteriteSand));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(ore, CassiteriteSand));

        ModHandler.addSmeltingRecipe(OreDictUnifier.get(dustImpure, Platinum), OreDictUnifier.get(ingot, PlatinumRaw));
        ModHandler.addSmeltingRecipe(OreDictUnifier.get(dust, Platinum), OreDictUnifier.get(ingot, PlatinumRaw));
        ModHandler.addSmeltingRecipe(OreDictUnifier.get(dustPure, Platinum), OreDictUnifier.get(ingot, PlatinumRaw));
        ModHandler.addSmeltingRecipe(OreDictUnifier.get(crushed, Platinum), OreDictUnifier.get(ingot, PlatinumRaw));
        ModHandler.addSmeltingRecipe(OreDictUnifier.get(crushedCentrifuged, Platinum), OreDictUnifier.get(ingot, PlatinumRaw));
        ModHandler.addSmeltingRecipe(OreDictUnifier.get(crushedPurified, Platinum), OreDictUnifier.get(ingot, PlatinumRaw));
        ModHandler.addSmeltingRecipe(OreDictUnifier.get(ore, Platinum), OreDictUnifier.get(ingot, PlatinumRaw));

        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, BorosilicateGlass));

        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Cupronickel));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Invar));

        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, KaptonK));

        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustImpure, Platinum));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Platinum));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustPure, Platinum));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushed, Platinum));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedCentrifuged, Platinum));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedPurified, Platinum));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(ore, Platinum));

        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, SolderingAlloy));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, FullerenePolymerTetrix));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, FullerenePolymerMatrix));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Zylon));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Polycaprolactam));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Polyethylene));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Polytetrafluoroethylene));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Polybenzimidazole));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Nomex));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Kevlar));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, KaptonE));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Cupronickel));

        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Cupronickel));

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
