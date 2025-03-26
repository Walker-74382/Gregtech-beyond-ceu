import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

        SOLAR_THERMAL_CONCENTRATOR_RECIPES.recipeBuilder()
                .circuitMeta(1)
                .duration(20)
                .fluidInputs(fluid('water')*10)
                .fluidOutputs(fluid('steam')*5000)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('lava')*1000)
                .inputs(metaitem('stickSteel'))
                .outputs(metaitem('alumino_silicate_wool_sheet'))
                .duration(200)
                .EUt(250)
                .buildAndRegister();

        MACERATOR_RECIPES.recipeBuilder()
                .inputs(metaitem('alumino_silicate_wool_sheet'))
                .outputs(metaitem('dustAluminoSilicateWool')* 3)
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSiliconDioxide'))
                .inputs(metaitem('dustSapphire'))
                .outputs(metaitem('dustAluminoSilicateWool')* 2)
                .duration(100)
                .EUt(8)
                .buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSiliconDioxide'))
                .inputs(metaitem('dustGreenSapphire'))
                .outputs(metaitem('dustAluminoSilicateWool')* 2)
                .duration(100)
                .EUt(8)
                .buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSiliconDioxide'))
                .inputs(metaitem('dustGreenSapphire'))
                .outputs(metaitem('dustAluminoSilicateWool')* 2)
                .duration(100)
                .EUt(8)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('water')*1000)
                .inputs(metaitem('dustAluminoSilicateWool'))
                .fluidOutputs(fluid('alumino_silicate_wool_solution')*1000)
                .duration(80)
                .EUt(16)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('oxygen')*2000)
                .inputs(metaitem('dustSilver'))
                .outputs(metaitem('dustSilverOxide')* 3)
                .duration(40)
                .EUt(7)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSilverOxide')* 3)
                .outputs(metaitem('dustSilver'))
                .duration(90)
                .EUt(8)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('glue')*100)
                .inputs(metaitem('dustGrapheneOxide'))
                .outputs(metaitem('dustGraphene'))
                .duration(200)
                .EUt(780)
                .buildAndRegister();


        CVD_UNIT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('methane')*1000)
                .inputs(metaitem('annealed_nickel_plate'))
                .outputs(metaitem('nickel_breeding_bed'))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        ARC_FURNACE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('oxygen')*1000)
                .inputs(metaitem('plateNickel'))
                .outputs(metaitem('annealed_nickel_plate'))
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('foilZinc')* 16)
                .inputs(metaitem('plateSteel'))
                .outputs(metaitem('item_filter'))
                .duration(200)
                .EUt(12)
                .buildAndRegister();