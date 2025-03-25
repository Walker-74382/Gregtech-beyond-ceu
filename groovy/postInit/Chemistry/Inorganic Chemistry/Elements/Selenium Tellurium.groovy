import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

        ELECTROLYTIC_CELL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('blue_vitriol')*1000)
                .fluidInputs(fluid('water')*1000)
                .circuitMeta(3)
                .outputs(metaitem('dustCopper'))
                .chancedOutput(metaitem('dustChalcogenAnodeMud')*1, 500, 0)
                .fluidOutputs(fluid('sulfuric_acid')*1000)
                .fluidOutputs(fluid('oxygen')*1000)
                .duration(100)
                .EUt(60)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustChalcogenAnodeMud'))
                .outputs(metaitem('dustSilver'))
                .chancedOutput(metaitem('dustCopper')*1, 1000, 1000)
                .chancedOutput(metaitem('dustGold')*1, 750, 750)
                .duration(300)
                .EUt(64)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustChalcogenAnodeMud'))
                .inputs(metaitem('dustSodaAsh')* 6)
                .fluidInputs(fluid('oxygen')*4000)
                .outputs(metaitem('dustSodiumTellurite')* 6)
                .outputs(metaitem('dustSeleniumDioxide')* 3)
                .outputs(metaitem('ingotSilver')* 2)
                .fluidOutputs(fluid('carbon_dioxide')*1000)
                .duration(600)
                .EUt(480)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSodiumTellurite')* 6)
                .fluidInputs(fluid('water')*1000)
                .circuitMeta(2)
                .outputs(metaitem('dustTelluriumDioxide')* 3)
                .outputs(metaitem('dustSodiumHydroxide')* 6)
                .duration(400)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustTelluriumDioxide')* 3)
                .fluidInputs(fluid('sulfur_dioxide')*2000)
                .fluidInputs(fluid('water')*1000)
                .outputs(metaitem('dustTellurium'))
                .fluidOutputs(fluid('sulfuric_acid')*1000)
                .fluidOutputs(fluid('sulfur_trioxide')*1000)
                .duration(300)
                .EUt(960)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSeleniumDioxide')* 3)
                .fluidInputs(fluid('water')*1000)
                .outputs(metaitem('dustSelenousAcid')* 6)
                .duration(400)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSelenousAcid')* 6)
                .fluidInputs(fluid('sulfur_dioxide')*2000)
                .outputs(metaitem('dustSelenium'))
                .fluidOutputs(fluid('sulfuric_acid')*1000)
                .fluidOutputs(fluid('sulfur_trioxide')*1000)
                .duration(300)
                .EUt(960)
                .buildAndRegister();