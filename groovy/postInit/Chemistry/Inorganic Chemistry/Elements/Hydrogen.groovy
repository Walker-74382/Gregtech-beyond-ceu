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