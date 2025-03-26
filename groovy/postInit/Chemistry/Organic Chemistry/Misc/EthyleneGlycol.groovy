import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

    CHEMICAL_RECIPES.recipeBuilder() //PFR TODO
        .fluidInputs(fluid('water')*1000)
        .fluidInputs(fluid('ethylene_oxide')*1000)
        .fluidOutputs(fluid('ethylene_glycol')*1000)
        .duration(400)
        .EUt(80)
        .buildAndRegister();