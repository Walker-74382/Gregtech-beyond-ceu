import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sulfuric_acid')*1000)
                .inputs(metaitem('dustFluorite'))
                .fluidOutputs(fluid('hydrogen_fluoride')*2000)
                .outputs(metaitem('dustCalciumSulfate'))
                .duration(300)
                .EUt(8)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()   
                .inputs(metaitem('dustCalciumSulfate'))
                .fluidOutputs(fluid('sulfur_trioxide')*1000)
                .outputs(metaitem('dustQuicklime'))
                .duration(300)
                .EUt(8)
                .buildAndRegister();

// Calcium Dust * 1
mods.gregtech.electrolyzer.removeByInput(30, [metaitem('dustQuicklime') * 2], null)

        ELECTROLYZER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustQuicklime'))
                .notConsumable(fluid('dissolved_calcium_chloride')*1000)
                .notConsumable(metaitem('graphite_electrode'))
                .notConsumable(metaitem('stickSteel'))
                .fluidOutputs(fluid('oxygen')*1000)
                .outputs(metaitem('dustCalcium'))
                .duration(200)
                .EUt(28)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('water')*1000)
                .inputs(metaitem('dustCalciumChloride')*2)
                .fluidOutputs(fluid('dissolved_calcium_chloride')*1000)
                .duration(100)
                .EUt(12)
                .buildAndRegister();