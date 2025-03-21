ROASTER_RECIPES = recipemap('roaster_recipes')
BLAST_RECIPES = recipemap('electric_blast_furnace')
CRYSTALLIZATION_RECIPES = recipemap('crystallization_recipes')
EXTRACTOR_RECIPES = recipemap('extractor')
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
GRAVITY_SEPARATOR_RECIPES = recipemap('gravity_separator_recipes')
FROTH_FLOTATION_UNIT_RECIPES = recipemap('froth_flotation_unit_recipes')
CLARIFIER_RECIPES = recipemap('clarifier_recipes')
CHEMICAL_PLANT_RECIPES = recipemap('chemical_plant_recipes')
ARC_FURNACE_RECIPES = recipemap('arc_furnace')


        GRAVITY_SEPARATOR_RECIPES.recipeBuilder()
                .inputs(metaitem('dustZircon'))
                .outputs(metaitem('siftedZircon'))
                .duration(200)
                .EUt(60)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('distilled_water')*1000)
                .inputs(metaitem('siftedZircon')*4)
                .fluidOutputs(fluid('impure_zircon_slurry')*1000)
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        FROTH_FLOTATION_UNIT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('impure_zircon_slurry')*1000)
                .notConsumable(metaitem('dustIronIiiChloride')* 2)
                .notConsumable(metaitem('dustSodiumSulfate')*2)
                .fluidInputs(fluid('soda_ash_solution')*1000)
                .notConsumable(metaitem('dustSodiumEthylXanthate')*3)
                .fluidOutputs(fluid('zircon_slurry')*1000)
                .duration(200)
                .EUt(90)
                .buildAndRegister();

        CLARIFIER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('zircon_slurry')*1000)
                .fluidOutputs(fluid('waste_water')*1000)
                .outputs(metaitem('floatedZircon')* 16)
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        ARC_FURNACE_RECIPES.recipeBuilder()
                .inputs(metaitem('floatedZircon')* 1)
                .outputs(metaitem('dustFusedZircon')* 3)
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hydrochloric_acid')*1000)
                .inputs(metaitem('dustFusedZircon'))
                .fluidOutputs(fluid('zirconyl_chloride_solution')*1000)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('zirconyl_chloride_solution')*1000)
                .fluidInputs(fluid('hafnium_extraction_mixture')*1000)
                .fluidOutputs(fluid('purified_zirconyl_chloride_solution')*1000)
                .fluidOutputs(fluid('hafnium_extract')*1000)
                .duration(200)
                .EUt(90)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sulfuric_acid')*200)
                .fluidInputs(fluid('hafnium_extract')*1000)
                .fluidOutputs(fluid('hafnium_sulfate_solution')*200)
                .fluidOutputs(fluid('hafnium_extraction_mixture')*1000)
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hafnium_sulfate_solution')*1000)
                .fluidOutputs(fluid('sulfur_trioxide')*1000)
                .outputs(metaitem('dustHafniumDioxide')* 2)
                .duration(200)
                .blastFurnaceTemp(1900)
                .EUt(1200)
                .buildAndRegister();

        BURNER_REACTOR_RECIPES.recipeBuilder()
                .inputs(metaitem('dustHafniumDioxide')* 2)
                .outputs(metaitem('dustHafnium'))
                .fluidOutputs(fluid('oxygen')*1000)
                .duration(400)
                .EUt(70)
                .buildAndRegister();

        CHEMICAL_PLANT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('distilled_water')*1000)
                .fluidInputs(fluid('sulfuric_acid')*1000)
                .fluidInputs(fluid('purified_zirconyl_chloride_solution')*1000)
                .fluidOutputs(fluid('hydrochloric_acid')*1000)
                .outputs(metaitem('dustZirconiumBase')* 2)
                .duration(450)
                .EUt(900)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustZirconiumBase')* 12)
                .fluidInputs(fluid('hydrochloric_acid')*4000)
                .outputs(metaitem('dustZirconiumOxide')* 5)
                .duration(60)
                .EUt(70)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustZirconiumOxide')* 2)
                .outputs(metaitem('dustZirconium')* 1)
                .fluidOutputs(fluid('oxygen')*1000)
                .duration(100)
                .EUt(80)
                .buildAndRegister();