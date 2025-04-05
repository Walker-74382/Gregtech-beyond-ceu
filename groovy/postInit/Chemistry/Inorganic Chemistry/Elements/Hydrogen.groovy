import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


        ELECTROLYZER_RECIPES.recipeBuilder()
                .notConsumable(metaitem('stickSteel'))
                .notConsumable(metaitem('stickNickel'))
                .fluidInputs(fluid('water')*1000)
                .fluidOutputs(fluid('hydrogen')*2000)
                .fluidOutputs(fluid('oxygen')*1000)
                .duration(200)
                .EUt(8)
                .buildAndRegister();
// Hydrogen Gas * 2000
mods.gregtech.electrolyzer.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('water') * 1000 * 1000])

// Hydrogen Gas * 2000
mods.gregtech.electrolyzer.removeByInput(30, null, [fluid('distilled_water') * 1000 * 1000])


        ELECTROLYZER_RECIPES.recipeBuilder()
                .notConsumable(metaitem('stickSteel'))
                .notConsumable(metaitem('stickNickel'))
                .fluidInputs(fluid('distilled_water')*1000)
                .fluidOutputs(fluid('hydrogen')*2000)
                .fluidOutputs(fluid('oxygen')*1000)
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        // Deuterium Gas * 40
mods.gregtech.centrifuge.removeByInput(20, null, [fluid('hydrogen') * 160 * 160])
        
        COLD_TOWER.recipeBuilder()
                .fluidInputs(fluid('demineralized_water')*16000)
                .fluidInputs(fluid('hydrogen_sulfide')*2000)
                .fluidOutputs(fluid('slightly_enriched_water')*16000)
                .fluidOutputs(fluid('slightly_depleted_hydrogen_sulfide')*2000)
                .duration(1000)
                .EUt(80)
                .buildAndRegister();

        HOT_TOWER.recipeBuilder()
                .fluidInputs(fluid('slightly_enriched_water')*16000)
                .fluidInputs(fluid('slightly_depleted_hydrogen_sulfide')*2000)
                .fluidOutputs(fluid('moderately_enriched_hydrogen_sulfide')*2000)
                .fluidOutputs(fluid('moderately_depleted_steam')*16000)
                .duration(1000)
                .EUt(80)
                .buildAndRegister();

        COLD_TOWER.recipeBuilder()
                .fluidInputs(fluid('moderately_depleted_steam')*16000)
                .fluidInputs(fluid('moderately_enriched_hydrogen_sulfide')*2000)
                .fluidOutputs(fluid('heavily_enriched_water')*16000)
                .fluidOutputs(fluid('heavily_depleted_hydrogen_sulfide')*2000)
                .duration(1000)
                .EUt(80)
                .buildAndRegister();

        HOT_TOWER.recipeBuilder()
                .fluidInputs(fluid('heavily_enriched_water')*16000)
                .fluidInputs(fluid('heavily_depleted_hydrogen_sulfide')*2000)
                .fluidOutputs(fluid('severely_enriched_hydrogen_sulfide')*2000)
                .fluidOutputs(fluid('severely_depleted_steam')*16000)
                .duration(1000)
                .EUt(80)
                .buildAndRegister();

        COLD_TOWER.recipeBuilder()
                .fluidInputs(fluid('severely_depleted_steam')*16000)
                .fluidInputs(fluid('severely_enriched_hydrogen_sulfide')*2000)
                .fluidOutputs(fluid('heavy_water')*16000)
                .fluidOutputs(fluid('depleted_hydrogen_sulfide')*2000)
                .duration(1000)
                .EUt(80)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('heavy_water')*1000)
                .fluidOutputs(fluid('deuterium')*2000)
                .fluidOutputs(fluid('oxygen')*1000)
                .duration(200)
                .EUt(280)
                .buildAndRegister();