import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


        ASSEMBLER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('polystyrene')*144)
                .inputs(metaitem('wireFineGold'))
                .inputs(metaitem('dustGlucose'))
                .outputs(BORON_RETAINING_YARN)
                .duration(120)
                .EUt(80)
                .buildAndRegister();