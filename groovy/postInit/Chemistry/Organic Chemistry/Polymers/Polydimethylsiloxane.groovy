import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('water')*1000)
                .fluidInputs(fluid('dimethyldichlorosilane')*1000)
                .fluidOutputs(fluid('dimethylsiloxane')* 1000)
                .fluidOutputs(fluid('diluted_hydrochloric_acid')*1000)
                .duration(120)
                .EUt(80)
                .buildAndRegister();

        THERMAL_PRESS_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPolydimethylsiloxane')* 9)
                .inputs(metaitem('dustSulfur'))
                .fluidOutputs(fluid('silicone_rubber')*1296)
                .EUt(700)
                .duration(100)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(fluid('dimethylsiloxane')*1000)
                .notConsumable(metaitem('dustKaminskyCatalyst'))
                .outputs(metaitem('dustPolydimethylsiloxane')*3)
                .duration(120)
                .EUt(120)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(fluid('dimethylsiloxane')*1000)
                .notConsumable(metaitem('dustPhilipsCatalyst'))
                .outputs(metaitem('dustPolydimethylsiloxane')*3)
                .duration(120)
                .EUt(120)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(fluid('dimethylsiloxane')*1000)
                .notConsumable(metaitem('dustZieglerNattaCatalyst'))
                .outputs(metaitem('dustPolydimethylsiloxane')*3)
                .duration(120)
                .EUt(120)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(fluid('dimethylsiloxane')*1000)
                .fluidInputs(fluid('oxygen')*1000)
                .outputs(metaitem('dustPolydimethylsiloxane')*3)
                .duration(120)
                .EUt(120)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(fluid('dimethylsiloxane')*1000)
                .fluidInputs(fluid('air')*1000)
                .outputs(metaitem('dustPolydimethylsiloxane')*3)
                .duration(120)
                .EUt(120)
                .buildAndRegister();

// Polydimethylsiloxane Dust * 3
mods.gregtech.chemical_reactor.removeByInput(96, null, [fluid('dimethyldichlorosilane') * 1000 * 1000, fluid('water') * 1000 * 1000])
// Liquid Silicone Rubber * 1296
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('dustPolydimethylsiloxane') * 9, metaitem('dustSulfur')], null)
