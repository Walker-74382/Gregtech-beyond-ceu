import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


SPACE_COMPONENT_ASSEMBLING.recipeBuilder()
    .inputs(metaitem('frameAluminium')*2)
    .inputs(metaitem('cableGtDoubleGold')*4)
    .inputs(metaitem('wireGtOctalMagnesiumDiboride')*2)
    .inputs(metaitem('cover.solar.panel')*2)
    .inputs(metaitem('plateAluminium')*12)
    .inputs(ore('circuitHv')*4)
    .fluidInputs(fluid('soldering_alloy')*144)
    .outputs(metaitem('satellite'))
    .EUt(80)
    .duration(800)
    .buildAndRegister();
