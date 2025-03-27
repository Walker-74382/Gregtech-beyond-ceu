import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('gasoline')*1000)
                .fluidOutputs(fluid('nheptane')*400)
                .fluidOutputs(fluid('noctane')*400)
                .fluidOutputs(fluid('nhexadecane')*50)
                .fluidOutputs(fluid('mxylene')*50)
                .fluidOutputs(fluid('toluene')*9)
                .fluidOutputs(fluid('ethylbenzene')*20)
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        CATALYTIC_REFORMATION_UNIT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('mxylene')*1000)
                .notConsumable(metaitem('dustZsm5')* 1)
                .fluidOutputs(fluid('pxylene')*1000)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sulfuric_acid')*1000)
                .inputs(metaitem('dustWood')* 4)
                .fluidOutputs(fluid('furfural')*5000)
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('furfural')*1000)
                .fluidInputs(fluid('naphtha')*1000)
                .fluidOutputs(fluid('btex')*1000)
                .duration(800)
                .EUt(90)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('btex')*2000)
                .fluidOutputs(fluid('benzene')*300)
                .fluidOutputs(fluid('ethylbenzene')*200)
                .fluidOutputs(fluid('toluene')*500)
                .fluidOutputs(fluid('ortho_xylene')*200)
                .fluidOutputs(fluid('opxylene')*800)
                .duration(500)
                .EUt(120)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('opxylene')*4000)
                .fluidOutputs(fluid('pxylene')*1000)
                .fluidOutputs(fluid('mxylene')*3000)
                .duration(80)
                .EUt(190)
                .buildAndRegister();