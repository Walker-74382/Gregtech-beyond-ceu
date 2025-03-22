import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

        ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustZincite')*2)
                .outputs(metaitem('dustZinc'))
                .fluidOutputs(fluid('steam')*1000)
                .circuitMeta(1)
                .duration(20)
                .EUt(7)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustZincite')*2)
                .outputs(metaitem('dustZinc'))
                .circuitMeta(0)
                .duration(20)
                .EUt(7)
                .buildAndRegister();