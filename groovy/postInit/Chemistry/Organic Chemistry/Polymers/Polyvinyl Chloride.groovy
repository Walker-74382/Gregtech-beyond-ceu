import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


POLYMERIZATION_TANK_RECIPES.recipeBuilder()
    .fluidInputs(fluid('vinyl_chloride')*144)
    .fluidInputs(fluid('hydrogen_peroxide')*1000)
    .fluidOutputs(fluid('polyvinyl_chloride_solution')*1000)
    .fluidInputs(fluid('air')*1000)
    .duration(1000)
    .EUt(800)
    .buildAndRegister();

POLYMERIZATION_TANK_RECIPES.recipeBuilder()
    .fluidInputs(fluid('vinyl_chloride')*144)
    .fluidInputs(fluid('hydrogen_peroxide')*1000)
    .fluidOutputs(fluid('polyvinyl_chloride_solution')*1000)
    .fluidInputs(fluid('oxygen')*1000)
    .duration(1000)
    .EUt(800)
    .buildAndRegister();

POLYMERIZATION_TANK_RECIPES.recipeBuilder()
    .fluidInputs(fluid('vinyl_chloride')*144)
    .fluidInputs(fluid('hydrogen_peroxide')*4000)
    .fluidOutputs(fluid('polyvinyl_chloride_solution')*4000)
    .inputs(metaitem('dustKaminskyCatalyst'))
    .duration(400)
    .EUt(700)
    .buildAndRegister();

POLYMERIZATION_TANK_RECIPES.recipeBuilder()
    .fluidInputs(fluid('vinyl_chloride')*144)
    .fluidInputs(fluid('hydrogen_peroxide')*3000)
    .fluidOutputs(fluid('polyvinyl_chloride_solution')*3000)
    .inputs(metaitem('dustZieglerNattaCatalyst'))
    .duration(500)
    .EUt(750)
    .buildAndRegister();

POLYMERIZATION_TANK_RECIPES.recipeBuilder()
    .fluidInputs(fluid('vinyl_chloride')*144)
    .fluidInputs(fluid('hydrogen_peroxide')*2000)
    .fluidOutputs(fluid('polyvinyl_chloride_solution')*2000)
    .inputs(metaitem('dustPhilipsCatalyst'))
    .duration(600)
    .EUt(800)
    .buildAndRegister();

DISTILLATION_RECIPES.recipeBuilder()
    .fluidInputs(fluid('polyvinyl_chloride_solution')*1000)
    .fluidOutputs(fluid('polyvinyl_chloride')*144)
    .fluidOutputs(fluid('hydrogen_peroxide')*1000)
    .duration(500)
    .EUt(500)
    .buildAndRegister();


// Liquid Polyvinyl Chloride (PVC) * 3240
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('air') * 7500 * 7500, fluid('vinyl_chloride') * 2160 * 2160, fluid('titanium_tetrachloride') * 100 * 100])
// Liquid Polyvinyl Chloride (PVC) * 4320
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('oxygen') * 7500 * 7500, fluid('vinyl_chloride') * 2160 * 2160, fluid('titanium_tetrachloride') * 100 * 100])
// Liquid Polyvinyl Chloride (PVC) * 144
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('air') * 1000 * 1000, fluid('vinyl_chloride') * 144 * 144])
// Liquid Polyvinyl Chloride (PVC) * 216
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('oxygen') * 1000 * 1000, fluid('vinyl_chloride') * 144 * 144])
