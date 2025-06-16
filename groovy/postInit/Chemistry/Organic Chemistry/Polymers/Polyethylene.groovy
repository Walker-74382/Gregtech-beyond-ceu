import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(fluid('air')*1000)
                .fluidInputs(fluid('ethylene')*144)
                .fluidOutputs(fluid('plastic')*144)
                .duration(500)
                .EUt(20)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(fluid('oxygen')*1000)
                .fluidInputs(fluid('ethylene')*144)
                .fluidOutputs(fluid('plastic')*144)
                .duration(500)
                .EUt(20)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .notConsumable(metaitem('dustKaminskyCatalyst'))
                .fluidInputs(fluid('ethylene')*144)
                .fluidOutputs(fluid('plastic')*576)
                .duration(500)
                .EUt(20)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .notConsumable(metaitem('dustPhilipsCatalyst'))
                .fluidInputs(fluid('ethylene')*144)
                .fluidOutputs(fluid('plastic')*288)
                .duration(500)
                .EUt(20)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .notConsumable(metaitem('dustZieglerNattaCatalyst'))
                .fluidInputs(fluid('ethylene')*144)
                .fluidOutputs(fluid('plastic')*432)
                .duration(500)
                .EUt(20)
                .buildAndRegister();


// Liquid Polyethylene (PE) * 216
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('oxygen') * 1000 * 1000, fluid('ethylene') * 144 * 144])
// Liquid Polyethylene (PE) * 144
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('air') * 1000 * 1000, fluid('ethylene') * 144 * 144])
// Liquid Polyethylene (PE) * 144
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('air') * 1000 * 1000, fluid('ethylene') * 144 * 144])
// Liquid Polyethylene (PE) * 216
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('oxygen') * 1000 * 1000, fluid('ethylene') * 144 * 144])
// Liquid Polyethylene (PE) * 3240
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 3])], [fluid('air') * 7500 * 7500, fluid('ethylene') * 2160 * 2160, fluid('titanium_tetrachloride') * 100 * 100])
// Liquid Polyethylene (PE) * 4320
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 3])], [fluid('oxygen') * 7500 * 7500, fluid('ethylene') * 2160 * 2160, fluid('titanium_tetrachloride') * 100 * 100])
