import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;



    // Methanol * 1000
mods.gregtech.chemical_reactor.removeByInput(96, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('hydrogen') * 4000 * 4000, fluid('carbon_monoxide') * 1000 * 1000])
// Water * 1000
mods.gregtech.chemical_reactor.removeByInput(96, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('hydrogen') * 6000 * 6000, fluid('carbon_dioxide') * 1000 * 1000])
// Methanol * 1000
mods.gregtech.chemical_reactor.removeByInput(96, [metaitem('circuit.integrated').withNbt(['Configuration': 3]), metaitem('dustCarbon')], [fluid('hydrogen') * 4000 * 4000, fluid('oxygen') * 1000 * 1000])

        DISTILLATION_RECIPES.recipeBuilder() //FRACTIONAL DISTILLATION
            .fluidInputs(fluid('methanol')*1000)
            .fluidOutputs(fluid('methanol_100')*800)
            .fluidOutputs(fluid('water')*200)
            .duration(500)
            .EUt(120)
            .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder() //FRACTIONAL DISTILLATION
            .fluidInputs(fluid('nbutanol')*1000)
            .fluidOutputs(fluid('butanol_100')*800)
            .fluidOutputs(fluid('water')*200)
            .duration(500)
            .EUt(120)
            .buildAndRegister();