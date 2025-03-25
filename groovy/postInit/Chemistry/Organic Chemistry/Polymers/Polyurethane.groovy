import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('toluene_diisocyanate')*1000)
                .fluidInputs(fluid('ethylene_glycol')*1000)
                .fluidInputs(fluid('oxygen')*1000)
                .fluidOutputs(fluid('urethane_pre_polymer')*1000)
                .fluidOutputs(fluid('water')*1000)
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('toluene')*1000)
                .fluidInputs(fluid('phosgene')*2000)
                .fluidInputs(fluid('hydrogen')*10000)
                .fluidInputs(fluid('nitric_acid')*2000)
                .circuitMeta(2)
                .fluidOutputs(fluid('toluene_diisocyanate')*2000)
                .fluidOutputs(fluid('diluted_hydrochloric_acid')*10000)
                .duration(800)
                .EUt(1900)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(fluid('urethane_pre_polymer')*1000)
                .fluidOutputs(fluid('polyurethane')*1000)
                .fluidInputs(fluid('air')*1000)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(fluid('urethane_pre_polymer')*1000)
                .fluidOutputs(fluid('polyurethane')*1000)
                .fluidInputs(fluid('oxygen')*1000)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(fluid('urethane_pre_polymer')*1000)
                .fluidOutputs(fluid('polyurethane')*4000)
                .notConsumable(metaitem('dustKaminskyCatalyst'))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(fluid('urethane_pre_polymer')*1000)
                .fluidOutputs(fluid('polyurethane')*2000)
                .notConsumable(metaitem('dustPhilipsCatalyst'))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(fluid('urethane_pre_polymer')*1000)
                .fluidOutputs(fluid('polyurethane')*3000)
                .notConsumable(metaitem('dustZieglerNattaCatalyst'))
                .duration(200)
                .EUt(80)
                .buildAndRegister();