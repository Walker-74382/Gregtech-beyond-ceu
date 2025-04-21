import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


        BLAST_RECIPES.recipeBuilder()
                .blastFurnaceTemp(1000)
                .EUt(70)
                .duration(300)
                .inputs(metaitem('dustGraphite')*3)
                .inputs(metaitem('dustSodiumNitride')*2)
                .outputs(metaitem('dustSodaAsh')*6)
                .fluidOutputs(fluid('very_hot_nitrogen')*2000)
                .fluidOutputs(fluid('carbon_dioxide')*1000)
                .buildAndRegister();