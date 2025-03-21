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

        MIXER_RECIPES.recipeBuilder()
                .fluidOutputs(fluid('impure_pitchblende_slurry')*1000)
                .fluidInputs(fluid('sulfuric_acid')*1000)
                .inputs(metaitem('dustPitchblende')*4)
                .duration(290)
                .EUt(700)
                .buildAndRegister();

        FROTH_FLOTATION_UNIT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sulfuric_acid')*1000)
                .fluidInputs(fluid('impure_pitchblende_slurry')*1000)
                .notConsumable(metaitem('dustCalciumDioxide')*2)
                .notConsumable(fluid('sodium_isopropyl_xanthate')*1000)
                .notConsumable(fluid('methyl_isobutyl_carbonyl')*1000)
                .fluidOutputs(fluid('pitchblende_slurry')*1000)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CLARIFIER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('pitchblende_slurry')*1000)
                .fluidOutputs(fluid('waste_water')*1000)
                .outputs(metaitem('dustPitchblendeFiltrate')*2)
                .outputs(metaitem('dustUraniumThoriumFiltrate')*2)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        SIFTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPitchblendeFiltrate'))
                .outputs(metaitem('dustLeadMetallicPowder'))
                .outputs(metaitem('dustUraniumMetallicPowder'))
                .duration(200)
                .EUt(200)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustUraniumMetallicPowder'))
                .fluidInputs(fluid('hydrochloric_acid')*1000)
                .outputs(metaitem('dustUraniumResidues'))
                .outputs(metaitem('dustUraninite'))
                .duration(200)
                .EUt(190)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(fluid('uranium_extraction_mixture')*1000)
                .inputs(metaitem('dustUraninite')*2)
                .fluidOutputs(fluid('uraninite_extract')*1000)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sulfuric_acid')*1000)
                .fluidInputs(fluid('uraninite_extract')*1000)
                .fluidOutputs(fluid('uranyl_sulfide')*1000)
                .fluidOutputs(fluid('uranium_extraction_mixture')*1000)
                .duration(800)
                .EUt(700)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ammonia')*1000)
                .fluidInputs(fluid('uranyl_sulfide')*1000)
                .fluidOutputs(fluid('ammonia_sulfate_solution')*1000)
                .outputs(metaitem('dustUraniumDioxide')*3)
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('fluorine')*2000)
                .inputs(metaitem('dustUraniumDioxide')*2)
                .fluidInputs(fluid('hydrofluoric_acid')*4000)
                .fluidOutputs(fluid('uranium_hexafluoride')*1000)
                .fluidOutputs(fluid('water')*2000)
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('kerosene')*1000)
                .fluidInputs(fluid('tributyl_phosphate')*100)
                .inputs(metaitem('dustPhosphorusPentoxide')*5)
                .fluidOutputs(fluid('uranium_extraction_mixture')*1000)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        BURNER_REACTOR_RECIPES.recipeBuilder()
                .inputs(metaitem('dustUraniumResidues')*2)
                .fluidInputs(fluid('oxygen')*1000)
                .chancedOutput(metaitem('dustUraniumDioxide')*1,200,100)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        SIFTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustLeadMetallicPowder'))
                .outputs(metaitem('dustLead'))
                .duration(200)
                .EUt(280)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('uranium_extraction_mixture')*1000)
                .inputs(metaitem('dustUraniumThoriumFiltrate')*2)
                .fluidOutputs(fluid('thorium_phosphate_cake_solution')*1000)
                .fluidOutputs(fluid('uranium_solution')*1000)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('thorium_phosphate_cake_solution')*1000)
                .outputs(metaitem('dustThoriumPhoshpateCake'))
                .fluidOutputs(fluid('water')*1000)
                .fluidOutputs(fluid('uranium_extraction_mixture')*500)
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('uranium_solution')*1000)
                .outputs(metaitem('dustUraniumDioxide'))
                .fluidOutputs(fluid('water')*1000)
                .fluidOutputs(fluid('uranium_extraction_mixture')*500)
                .duration(200)
                .EUt(700)
                .buildAndRegister();