import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


        ION_EXCHANGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('water')*1000)
                .fluidOutputs(fluid('demineralized_water')*900)
                .notConsumable(metaitem('dustMolecularSieve'))
                .duration(400)
                .EUt(20)
                .buildAndRegister();

        VACUUM_EJECTION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('demineralized_water')*1000)
                .fluidOutputs(fluid('deaerated_water')*900)
                .duration(400)
                .EUt(50)
                .buildAndRegister();

        ION_EXCHANGE_RECIPES.recipeBuilder()
                .notConsumable(metaitem('dustActivatedCarbon'))
                .fluidInputs(fluid('deaerated_water')*1000)
                .fluidOutputs(fluid('deionized_water')*700)
                .duration(400)
                .EUt(600)
                .buildAndRegister();

        UV_LIGHT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('deionized_water')*1000)
                .fluidOutputs(fluid('sterilized_water')*900)
                .duration(400)
                .EUt(600)
                .buildAndRegister();

        DISTILLERY_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sterilized_water')*1000)
                .circuitMeta(1)
                .fluidOutputs(fluid('ultrapure_water')*800)
                .duration(600)
                .EUt(200)
                .buildAndRegister();

        ION_EXCHANGE_RECIPES.recipeBuilder()
                .notConsumable(metaitem('dustActivatedCarbon'))
                .fluidInputs(fluid('ultrapure_water')*1000)
                .fluidOutputs(fluid('ultrapure_water_grade_1')*900)
                .duration(600)
                .EUt(1200)
                .buildAndRegister();

        FLUID_COMPRESSOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ultrapure_water_grade_1')*1000)
                .fluidOutputs(fluid('high_pressure_ultrapure_water_grade_1')*100)
                .duration(800)
                .EUt(2200)
                .buildAndRegister();

        FLUID_COMPRESSOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('high_pressure_ultrapure_water_grade_1')*1000)
                .fluidOutputs(fluid('supercritical_ultrapure_water_grade_1')*100)
                .duration(800)
                .EUt(2200)
                .buildAndRegister();

        VACUUM_RECIPES.recipeBuilder()
                .fluidInputs(fluid('supercritical_ultrapure_water_grade_1')*1000)
                .fluidOutputs(fluid('ultrapure_water_grade_2')*1000)
                .duration(800)
                .EUt(8200)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ultrapure_water_grade_2')*1000)
                .fluidOutputs(fluid('ultrapure_water_grade_3')*200)
                .fluidOutputs(fluid('ultrapure_water_grade_1')*300)
                .fluidOutputs(fluid('ultrapure_water')*500)
                .duration(800)
                .EUt(16200)
                .buildAndRegister();