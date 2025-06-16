import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


        ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPyrite')* 3)
                .fluidInputs(fluid('oxygen')*6000)
                .outputs(item('minecraft:iron_ingot'))
                .chancedOutput(metaitem('dustThalliumSulfate')*7 , 200, 0)
                .fluidOutputs(fluid('sulfur_dioxide')*1000)
                .duration(100)
                .EUt(400)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustGalena')* 4)
                .fluidInputs(fluid('oxygen')*6000)
                .outputs(metaitem('ingotLead')*2)
                .chancedOutput(metaitem('dustThalliumSulfate')*7 , 200, 0)
                .fluidOutputs(fluid('sulfur_dioxide')*1000)
                .duration(100)
                .EUt(12)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustThalliumSulfate')*7)
                .fluidInputs(fluid('water')*1000)
                .notConsumable(metaitem('stickPlatinum'))
                .outputs(metaitem('dustThallium')*2)
                .fluidOutputs(fluid('sulfuric_acid')*1000)
                .fluidOutputs(fluid('oxygen')*1000)
                .duration(200)
                .EUt(60)
                .buildAndRegister();