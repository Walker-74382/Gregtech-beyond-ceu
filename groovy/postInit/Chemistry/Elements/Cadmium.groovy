import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;



        EXTRACTOR_RECIPES.recipeBuilder()
                .inputs(metaitem('dustZincite'))
                .fluidOutputs(fluid('crude_zinc')*144)
                .duration(200)
                .EUt(70)
                .buildAndRegister()

        FLUID_SOLIDFICATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('crude_zinc')*144)
                .notConsumable(metaitem('shape.mold.ingot'))
                .duration(200)
                .outputs(metaitem('ingotZinc'))
                .EUt(80)
                .buildAndRegister()

        HIGH_TEMP_DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('crude_zinc')*1728)
                .fluidOutputs(fluid('cadmium_rich_zinc')*1728)
                .fluidOutputs(fluid('copper')*48)
                .fluidOutputs(fluid('lead')*36)
                .fluidOutputs(fluid('tin')*16)
                .duration(200)
                .EUt(80)
                .buildAndRegister()

        HIGH_TEMP_DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('cadmium_rich_zinc')*1728)
                .fluidOutputs(fluid('zinc')*1728)
                .fluidOutputs(fluid('cadmium')*144)
                .duration(80)
                .EUt(120)
                .buildAndRegister()