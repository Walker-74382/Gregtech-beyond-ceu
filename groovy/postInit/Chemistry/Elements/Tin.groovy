ROASTER_RECIPES = recipemap('roaster_recipes')
BLAST_RECIPES = recipemap('electric_blast_furnace')
CRYSTALLIZATION_RECIPES = recipemap('crystallization_recipes')
EXTRACTOR_RECIPES = recipemap('extractor')
CHEMICAL_BATH_RECIPES = recipemap('chemical_bath')
MIXER_RECIPES = recipemap('mixer')
CENTRIFUGE_RECIPES = recipemap('centrifuge')
VACUUM_RECIPES = recipemap('vacuum_freezer')
CHEMICAL_RECIPES = recipemap('chemical_reactor')
DEHYDRATOR_RECIPES = recipemap('dehydrator_recipes')
BURNER_REACTOR_RECIPES = recipemap('burner_reactor_recipes')
HIGH_TEMP_DISTILLATION_RECIPES = recipemap('high_temp_distillation_recipes')
DISTILLATION_RECIPES = recipemap('distillation_tower')
ELECTROLYTIC_CELL_RECIPES = recipemap('electrolytic_cell_recipes')
OXIDATION_FURNACE_RECIPES = recipemap('oxidation_furnace_recipes')




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
