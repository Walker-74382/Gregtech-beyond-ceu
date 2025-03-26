import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


        THERMAL_PRESS_RECIPES.recipeBuilder()
                .inputs(metaitem('plateReinforcedEpoxyResin')* 2)
                .inputs(metaitem('foilCopper')* 2)
                .outputs(metaitem('laminated_rer_board'))
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(fluid('novolacs_photoresist')*250)
                .inputs(metaitem('laminated_rer_board'))
                .outputs(metaitem('patterned_pr4_plate'))
                .duration(190)
                .EUt(1100)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hydrofluoric_acid')*1000)
                .inputs(metaitem('patterned_pr4_plate'))
                .outputs(metaitem('etched_pr4_plate'))
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        CVD_UNIT_RECIPES.recipeBuilder()
                .inputs(metaitem('dustCopper')*2)
                .inputs(metaitem('dustAluminium')*2)
                .inputs(metaitem('etched_pr4_plate'))
                .outputs(metaitem('sputtered_pr4_plate'))
                .duration(200)
                .EUt(78)
                .buildAndRegister();

        THERMAL_PRESS_RECIPES.recipeBuilder()
                .inputs(metaitem('sputtered_pr4_plate'))
                .inputs(metaitem('plateSiliconDioxide'))
                .outputs(metaitem('pressed_pr4_plate'))
                .duration(120)
                .EUt(270)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('soldering_alloy')*144)
                .inputs(metaitem('pressed_pr4_plate'))
                .inputs(item('gregtech:cable_single', 2)*2)
                .inputs(ore('circuitLv'))
                .inputs(metaitem('sensor.hv'))
                .inputs(metaitem('emitter.hv'))
                .outputs(metaitem('planar_transformer'))
                .duration(1200)
                .EUt(200)
                .buildAndRegister();