import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


    BLAST_RECIPES.recipeBuilder()
            .blastFurnaceTemp(700)
            .inputs(metaitem('dustSilverChloride')*2)
            .outputs(metaitem('dustSilver')*2)
            .fluidOutputs(fluid('chlorine_vapor')*2000)
            .duration(300)
            .EUt(80)
            .buildAndRegister();

        //Silver Purification [ Ammonia Complexation ]

    CHEMICAL_RECIPES.recipeBuilder()
            .fluidInputs(fluid('ammonia')*4000)
            .inputs(metaitem('dustSilverChloride')*2)
            .fluidOutputs(fluid('chlorine')*2000)
            .notConsumable(metaitem('fume_hood'))
            .fluidOutputs(fluid('diamminesilver')*2000)
            .duration(150)
            .EUt(180)
            .buildAndRegister();

    CHEMICAL_RECIPES.recipeBuilder()
            .fluidInputs(fluid('hydrazine')*1000)
            .fluidInputs(fluid('diamminesilver')*2000)
            .outputs(metaitem('dustSilver')*2)
            .fluidOutputs(fluid('very_hot_nitrogen')*2000)
            .fluidOutputs(fluid('ammonia')*4000)
            .duration(150)
            .EUt(180)
            .buildAndRegister();