import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;




ROASTER_RECIPES.recipeBuilder()
    .inputs(metaitem('dustEuropiumOxide')*3)
    .outputs(metaitem('dustEuropium'))
    .duration(200)
    .EUt(80)
    .buildAndRegister();