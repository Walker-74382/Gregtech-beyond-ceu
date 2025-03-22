import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


POLYMERIZATION_TANK_RECIPES.recipeBuilder()
        .fluidInputs(fluid('polyvinyl_acetate')*144)
        .fluidInputs(fluid('butyraldehyde')*255)
        .fluidOutputs(fluid('polyvinyl_butyral')*144)
        .notConsumable(metaitem('dustZieglerNattaCatalyst'))
        .duration(200)
        .EUt(80)
        .buildAndRegister();