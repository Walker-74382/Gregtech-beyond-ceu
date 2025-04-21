import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

    VACUUM_RECIPES.recipeBuilder()
            .fluidInputs(fluid('very_hot_nitrogen')*2000)
            .fluidOutputs(fluid('nitrogen')*2000)
            .EUt(180)
            .duration(300)
            .buildAndRegister();