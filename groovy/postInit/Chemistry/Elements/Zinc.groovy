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

  //      GTRecipeHandler.removeRecipesByInputs(ELECTROLYZER_RECIPES,
   //             new ItemStack[] {
   //                     OreDictUnifier.get(dust, Sphalerite, 2) });
//
      //  GTRecipeHandler.removeRecipesByInputs(ELECTROLYZER_RECIPES,
      //          new ItemStack[] {
      //                  OreDictUnifier.get(dust, Zincite, 2) });

        ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustZincite')*2)
                .outputs(metaitem('dustZinc'))
                .fluidOutputs(fluid('steam')*1000)
                .circuitMeta(1)
                .duration(20)
                .EUt(7)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustZincite')*2)
                .outputs(metaitem('dustZinc'))
                .circuitMeta(0)
                .duration(20)
                .EUt(7)
                .buildAndRegister();