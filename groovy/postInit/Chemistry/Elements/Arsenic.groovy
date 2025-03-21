import globals.Globals

ROASTER_RECIPES = recipemap('roaster_recipes')
BLAST_RECIPES = recipemap('electric_blast_furnace')
CRYSTALLIZATION_RECIPES = recipemap('crystallization_recipes')
EXTRACTOR_RECIPES = recipemap('extractor')
CHEMICAL_BATH_RECIPES = recipemap('chemical_bath')
MIXER_RECIPES = recipemap('mixer')
CENTRIFUGE_RECIPES = recipemap('centrifuge')
VACUUM_RECIPES = recipemap('vacuum_freezer')

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('water')*1000)
                .inputs(metaitem('dustRealgar')*2)
                .fluidOutputs(fluid('realgar_solution')*1000)
                .duration(120)
                .EUt(10)
                .buildAndRegister();

        CRYSTALLIZATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('realgar_solution')*1000)
                .outputs(metaitem('dustRecrystallizedRealgar')*1)
                .duration(100)
                .EUt(12)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustRecrystallizedRealgar')*1)
                .outputs(metaitem('dustArsenicHydroxide')*2)
                .fluidOutputs(fluid('sulfur_dioxide')*1000)
                .duration(200)
                .EUt(7)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('dustArsenicHydroxide')* 2)
                .fluidInputs(fluid('oxygen')*1000)
                .fluidOutputs(fluid('steam')*1000)
                .outputs(metaitem('dustArsenic')*1)
                .duration(50)
                .blastFurnaceTemp(1200)
                .EUt(70)
                .buildAndRegister();

// Arsenic Dust * 1
mods.gregtech.centrifuge.removeByInput(30, [metaitem('dustRealgar') * 2], null)

// Arsenic Dust * 2
mods.gregtech.electrolyzer.removeByInput(30, [metaitem('dustArsenicTrioxide') * 5], null)

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('dustArsenicTrioxide')*5)
                .inputs(metaitem('dustCarbon')*3)
                .outputs(metaitem('dustArsenic')*2)
                .fluidOutputs(fluid('carbon_dioxide')*3000)
                .duration(50)
                .blastFurnaceTemp(1200)
                .EUt(70)
                .buildAndRegister();