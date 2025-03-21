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
PHASE_SEPARATOR_RECIPES = recipemap('phase_separator_recipes')


        BURNER_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('titanium_tetrachloride')*1000)
                .fluidInputs(fluid('oxygen')*2000)
                .fluidOutputs(fluid('chlorine')*4000)
                .outputs(metaitem('dustTitaniumDioxide')*2)
                .duration(200)
                .EUt(480)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustTitaniumDioxide')*2)
                .outputs(metaitem('dustTitanium'))
                .fluidOutputs(fluid('steam')*1000)
                .duration(200)
                .EUt(120)
                .buildAndRegister();


        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('chlorine')*4000)
                .inputs(metaitem('dustCarbon')* 2)
                .inputs(metaitem('dustRutile'))
                .fluidOutputs(fluid('gaseous_titanium_tetrachloride')*1000)
                .fluidOutputs(fluid('carbon_monoxide')*2000)
                .duration(200)
                .EUt(400)
                .buildAndRegister();

        PHASE_SEPARATOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('gaseous_titanium_tetrachloride')*1000)
                .fluidOutputs(fluid('titanium_tetrachloride')*1000)
                .duration(600)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustRedMudConcentrate'))
                .fluidInputs(fluid('hydrochloric_acid')*1000)
                .fluidOutputs(fluid('neutralised_red_mud')*1000)
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('neutralised_red_mud')*2000)
                .fluidOutputs(fluid('iron_chloride_solution')*1000)
                .fluidOutputs(fluid('red_slurry')*1000)
                .fluidOutputs(fluid('salt_water')*4000)
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('iron_chloride_solution')*2000)
                .fluidOutputs(fluid('iron_2_chloride')*1000)
                .fluidOutputs(fluid('iron_iii_chloride') * 1000)
                .fluidOutputs(fluid('water')*1000)
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sulfuric_acid')*2000)
                .fluidInputs(fluid('red_slurry')*2000)
                .fluidOutputs(fluid('titanyl_sulfate')*2000)
                .fluidOutputs(fluid('water')*2000)
                .duration(400)
                .EUt(700)
                .buildAndRegister();

        CRYSTALLIZATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('titanyl_sulfate')*1000)
                .outputs(metaitem('dustCrystallizedTitanylSulfate')* 2)
                .duration(400)
                .EUt(290)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hydrochloric_acid')*4000)
                .inputs(metaitem('dustCrystallizedTitanylSulfate')* 1)
                .outputs(metaitem('dustTitanium')* 1)
                .fluidOutputs(fluid('sulfuric_acid')*1000)
                .duration(460)
                .EUt(800)
                .buildAndRegister();