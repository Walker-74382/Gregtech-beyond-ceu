

// Antimony Dust * 2
mods.gregtech.centrifuge.removeByInput(30, [metaitem('dustStibnite') * 5], null)

// Antimony Dust * 2
mods.gregtech.electrolyzer.removeByInput(30, [metaitem('dustAntimonyTrioxide') * 5], null)


        ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustAntimonyTrioxide')* 5)
                .outputs(metaitem('dustAntimony')* 2)
                .circuitMeta(1)
                .fluidOutputs(fluid('steam')*3000)
                .duration(200)
                .EUt(20)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustAntimonyTrioxide')* 5)
                .outputs(metaitem('dustAntimony')* 2)
                .circuitMeta(0)
                .duration(200)
                .EUt(20)
                .buildAndRegister();



