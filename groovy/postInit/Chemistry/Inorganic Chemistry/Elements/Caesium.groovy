import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;



        GRAVITY_SEPARATOR_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPollucite'))
                .outputs(metaitem('siftedPollucite'))
                .duration(400)
                .EUt(800)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .inputs(metaitem('siftedPollucite')* 4)
                .fluidInputs(fluid('distilled_water') *1000)
                .fluidOutputs(fluid('impure_pollucite_slurry') *1000)
                .duration(400)
                .EUt(800)
                .buildAndRegister();

        FROTH_FLOTATION_UNIT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('impure_pollucite_slurry')*1000)
                .notConsumable(fluid('oleic_acid')*1000)
                .notConsumable(fluid('methyl_isobutyl_carbonyl')*1000)
                .notConsumable(metaitem('dustSodiumSilicate'))
                .inputs(metaitem('dustSodiumHydride') * 3)
                .fluidOutputs(fluid('pollucite_slurry')* 1000)
                .duration(400)
                .EUt(800)
                .buildAndRegister();

        CLARIFIER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('pollucite_slurry')* 1000)
                .outputs(metaitem('floatedPollucite')* 10)
                .outputs(metaitem('dustSodiumHydride') * 3)
                .duration(400)
                .EUt(600)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hydrochloric_acid')*3000)
                .inputs(metaitem('floatedPollucite')* 10)
                .outputs(metaitem('dustSiliconDioxide'))
                .fluidOutputs(fluid('heavy_alkali_chloride_solution') *1000)
                .duration(500)
                .EUt(700)
                .buildAndRegister();

// Caesium Dust * 1
mods.gregtech.electrolyzer.removeByInput(60, [metaitem('dustPollucite') * 11], null)

