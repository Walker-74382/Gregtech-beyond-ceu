import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


    VACUUM_RECIPES.recipeBuilder()
            .fluidInputs(fluid('chlorine_vapor')*2000)
            .fluidOutputs(fluid('chlorine')*2000)
            .EUt(200)
            .duration(100)
            .buildAndRegister();