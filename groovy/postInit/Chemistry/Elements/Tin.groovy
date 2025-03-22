import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;



        ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustCassiteriteSand')*3)
                .fluidOutputs(fluid('steam')*2000)
                .circuitMeta(1)
                .outputs(metaitem('dustTin'))
                .duration(200)
                .EUt(7)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustCassiteriteSand')* 3)
                .circuitMeta(0)
                .outputs(metaitem('dustTin'))
                .duration(200)
                .EUt(7)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustCassiterite')* 3)
                .fluidOutputs(fluid('steam')*2000)
                .circuitMeta(1)
                .outputs(metaitem('dustTin'))
                .duration(200)
                .EUt(7)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustCassiterite')* 3)
                .circuitMeta(0)
                .outputs(metaitem('dustTin'))
                .duration(200)
                .EUt(7)
                .buildAndRegister();

        // Tin Dust * 1
mods.gregtech.electrolyzer.removeByInput(30, [metaitem('dustCassiteriteSand') * 3], null)

// Tin Dust * 1
mods.gregtech.electrolyzer.removeByInput(30, [metaitem('dustCassiterite') * 3], null)
