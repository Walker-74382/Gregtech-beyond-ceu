import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

        FLUID_SOLIDFICATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('rhodium')*144)
                .inputs(metaitem('ingotPalladium')*3)
                .outputs(metaitem('ingotRhodiumPlatedPalladium')*4)
                .duration(122)
                .EUt(24)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('dustTitaniumNitrate')*17)
                .inputs(metaitem('dustSodiumHydroxide')*6)
                .fluidInputs(fluid('lithium_carbonate_solution')*1000)
                .outputs(metaitem('ingotLithiumTitanate')*6)
                .outputs(metaitem('dustSodaAsh')*6)
                .fluidOutputs(fluid('nitric_acid')*4000)
                .blastFurnaceTemp(1280)
                .EUt(800)
                .duration(70)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('carbon_monoxide')*1000)
                .fluidInputs(fluid('lithium_peroxide_solution')*1000)
                .fluidOutputs(fluid('lithium_carbonate_solution')*2000)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        DEHYDRATOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hydrogen_peroxide')*1000)
                .fluidInputs(fluid('lithium_hydroxide_solution')*1000)
                .fluidOutputs(fluid('lithium_peroxide_solution')*1000)
                .duration(800)
                .EUt(70)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('oxygen')*2000)
                .fluidInputs(fluid('titanium_tetrachloride')*1000)
                .fluidInputs(fluid('nitrogen_pentoxide')*1000)
                .fluidOutputs(fluid('chlorine')*4000)
                .outputs(metaitem('dustBariumTitanate')*17)
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        VACUUM_FURNACE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustCupronickel'))
                .outputs(metaitem('ingotCupronickel'))
                .EUt(2)
                .duration(200)
                .buildAndRegister();

        VACUUM_FURNACE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSolderingAlloy'))
                .outputs(metaitem('ingotSolderingAlloy'))
                .EUt(2)
                .duration(200)
                .buildAndRegister();

        VACUUM_FURNACE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustFullerenePolymerTetrix'))
                .outputs(metaitem('ingotFullerenePolymerTetrix'))
                .EUt(2)
                .duration(200)
                .buildAndRegister();

        VACUUM_FURNACE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustFullerenePolymerMatrix'))
                .outputs(metaitem('ingotFullerenePolymerMatrix'))
                .EUt(2)
                .duration(200)
                .buildAndRegister();

        VACUUM_FURNACE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustZylon'))
                .outputs(metaitem('ingotZylon'))
                .EUt(2)
                .duration(200)
                .buildAndRegister();

        VACUUM_FURNACE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPolycaprolactam'))
                .outputs(metaitem('ingotPolycaprolactam'))
                .EUt(2)
                .duration(200)
                .buildAndRegister();

        VACUUM_FURNACE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPlastic'))
                .outputs(metaitem('ingotPlastic'))
                .EUt(2)
                .duration(200)
                .buildAndRegister();

        VACUUM_FURNACE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPolytetrafluoroethylene'))
                .outputs(metaitem('ingotPolytetrafluoroethylene'))
                .EUt(2)
                .duration(200)
                .buildAndRegister();

        VACUUM_FURNACE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPolybenzimidazole'))
                .outputs(metaitem('ingotPolybenzimidazole'))
                .EUt(2)
                .duration(200)
                .buildAndRegister();

        VACUUM_FURNACE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustNomex'))
                .outputs(metaitem('ingotNomex'))
                .EUt(2)
                .duration(200)
                .buildAndRegister();

        VACUUM_FURNACE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustKevlar'))
                .outputs(metaitem('ingotKevlar'))
                .EUt(2)
                .duration(200)
                .buildAndRegister();

        VACUUM_FURNACE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustKaptonE'))
                .outputs(metaitem('ingotKaptonE'))
                .EUt(2)
                .duration(200)
                .buildAndRegister();

        VACUUM_FURNACE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustKaptonK'))
                .outputs(metaitem('ingotKaptonK'))
                .EUt(2)
                .duration(200)
                .buildAndRegister();


        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPlatinum'))
                .outputs(metaitem('ingotPlatinum'))
                .blastFurnaceTemp(1600)
                .duration(200)
                .EUt(180)
                .buildAndRegister();

        MACERATOR_RECIPES.recipeBuilder()
                .inputs(metaitem('ingotPlatinumRaw'))
                .outputs(metaitem('ingotPlatinumRaw'))
                .EUt(12)
                .duration(80)
                .buildAndRegister();

        VACUUM_FURNACE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustBorosilicateGlass'))
                .outputs(metaitem('ingotBorosilicateGlass'))
                .EUt(2)
                .duration(200)
                .buildAndRegister();


        VACUUM_FURNACE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustCupronickel'))
                .outputs(metaitem('ingotCupronickel'))
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        VACUUM_FURNACE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustInvar'))
                .outputs(metaitem('ingotInvar'))
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustInvar')*5)
                .inputs(metaitem('dustIron')*4)
                .inputs(metaitem('dustKanthal'))
                .outputs(metaitem('dustEglinSteelBase')*10)
                .duration(600)
                .EUt(710)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSulfur'))
                .inputs(metaitem('dustCarbon'))
                .inputs(metaitem('dustEglinSteelBase')*10)
                .inputs(metaitem('dustSilicon'))
                .outputs(metaitem('dustEglinSteel')*13)
                .duration(500)
                .EUt(500)
                .buildAndRegister();

        CRYSTALLIZATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('silicon_carbide')*1000)
                .outputs(metaitem('dustPurifiedSiliconCarbide'))
                .duration(200)
                .EUt(120)
                .buildAndRegister();

         SINTERING_OVEN_RECIPES.recipeBuilder()
                .fluidInputs(fluid('methane')*1000)
                .notConsumable(metaitem('shape.extruder.ingot'))
                .inputs(metaitem('dustSilver'))
                .outputs(metaitem('ingotSinteredSilver'))
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('oxygen')*2000)
                .inputs(metaitem('dustCobalt')* 2)
                .inputs(metaitem('dustSilver')* 5)
                .inputs(metaitem('dustSteel')* 1)
                .outputs(metaitem('dustSilverAlloy')* 8)
                .circuitMeta(3)
                .duration(80)
                .EUt(500)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(fluid('oxygen')*1000)
                .inputs(metaitem('dustSilverAlloy')* 1)
                .outputs(metaitem('ingotSilverAlloy')* 1)
                .blastFurnaceTemp(2000)
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('nomex')*1000)
                .inputs(metaitem('plateSilverAlloy')* 4)
                .inputs(metaitem('sintered_silver_coil'))
                .inputs(metaitem('foilZylon')* 2)
                .outputs(item('gtb:cooling_coil'))
                .duration(400)
                .EUt(2000)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('silvertetrafluoroborate')*144)
                .inputs(metaitem('foilMica')* 2)
                .inputs(metaitem('stickSinteredSilver')* 2)
                .outputs(metaitem('sintered_silver_coil'))
                .duration(200)
                .EUt(80)
                .buildAndRegister();
