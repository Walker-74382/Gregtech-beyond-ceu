import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('impure_ethanol')*2000)
                .fluidOutputs(fluid('water')*1000)
                .outputs(metaitem('dustWood'))
                .fluidOutputs(fluid('ethanol_water_azeotrope')*720)
                .fluidOutputs(fluid('fusel_oil')*80)
                .duration(120)
                .EUt(20)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ethanol_water_azeotrope')*1000)
                .fluidInputs(fluid('sulfuric_acid')*1000)
                .fluidOutputs(fluid('diluted_sulfuric_acid')*800)
                .fluidOutputs(fluid('ethylene')*1200)
                .duration(200)
                .circuitMeta(1)
                .EUt(20)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ethanol_water_azeotrope')*1000)
                .fluidInputs(fluid('sulfuric_acid')*1000)
                .fluidOutputs(fluid('diluted_sulfuric_acid')*800)
                .fluidOutputs(fluid('ethylene')*1200)
                .duration(200)
                .circuitMeta(1)
                .EUt(40)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('fusel_oil')*1000)
                .fluidOutputs(fluid('water')*120)
                .fluidOutputs(fluid('npropanol')*10)
                .fluidOutputs(fluid('ethanol_water_azeotrope')*100)
                .fluidOutputs(fluid('isoamyl_alcohol')*615)
                .fluidOutputs(fluid('nbutanol')*10)
                .fluidOutputs(fluid('isobutyl_alcohol')*155)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        FERMENTATION_VAT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('water')*16000)
                .fluidInputs(fluid('grain_solution')*1000)
                .inputs(item('minecraft:sugar')* 24)
                .circuitMeta(1)
                .fluidOutputs(fluid('impure_ethanol')*16000)
                .duration(2000)
                .EUt(12)
                .buildAndRegister();

        FERMENTATION_VAT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('water')*16000)
                .fluidInputs(fluid('oxygen')*4000)
                .inputs(item('minecraft:sugar')* 24)
                .circuitMeta(0)
                .fluidOutputs(fluid('vinegar')*16000)
                .duration(2000)
                .EUt(12)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('vinegar')*2000)
                .fluidOutputs(fluid('water')*1600)
                .fluidOutputs(fluid('acetic_acid')*400)
                .outputs(metaitem('dustWood'))
                .duration(200)
                .EUt(20)
                .buildAndRegister();