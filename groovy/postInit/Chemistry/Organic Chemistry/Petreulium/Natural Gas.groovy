import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sulfuric_acid')*3000)
                .fluidInputs(fluid('natural_gas')*1000)
                .fluidOutputs(fluid('alkylated_natural_gas')*4000)
                .duration(200)
                .EUt(480)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('alkylated_natural_gas')*4000)
                .fluidOutputs(fluid('gasoline')*1000)
                .fluidOutputs(fluid('sulfuric_acid')*3000)
                .duration(80)
                .EUt(120)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(fluid('natural_gas')*1500)
                .notConsumable(metaitem('dustNickel')* 1)
                .fluidInputs(fluid('steam')*1000)
                .fluidOutputs(fluid('syngas')*7000)
                .blastFurnaceTemp(1200)
                .duration(200)
                .EUt(8)
                .buildAndRegister();