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
DIGESTER_RECIPES = recipemap('digester_recipes')
DISSOLUTION_TANK_RECIPES = recipemap('dissolution_tank_recipes')
SIFTER_RECIPES = recipemap('sifter')
DILUTION_TANK_RECIPES = recipemap('dilution_tank_recipes')
DILUTION_REFRIGERATOR_RECIPES = recipemap('dilution_refrigerator_recipes')
CRYOGENIC_DISTILLATION_PLANT_RECIPES = recipemap('cryogenic_distillation_plant_recipes')

        DIGESTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustGadolinite')* 1)
                .fluidInputs(fluid('sulfuric_acid')*1000)
                .fluidOutputs(fluid('gadolinite_leach_solution')*1000)
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        DILUTION_REFRIGERATOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('gadolinite_leach_solution')*1000)
                .fluidInputs(fluid('ice')*1000)
                .fluidOutputs(fluid('cooled_gadolinite_leach_solution')*1000)
                .fluidOutputs(fluid('water')*1000)
                .duration(800)
                .EUt(120)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('oxygen')*1000)
                .fluidInputs(fluid('cooled_gadolinite_leach_solution')*1000)
                .notConsumable(metaitem('dustWroughtIron'))
                .fluidOutputs(fluid('roasted_gadolinite_leach_solution')*1000)
                .duration(120)
                .EUt(890)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('roasted_gadolinite_leach_solution')*1000)
                .fluidOutputs(fluid('water')*1000)
                .fluidOutputs(fluid('gadolinium_leach')*600)
                .fluidOutputs(fluid('ree_group_mud')*400)
                .duration(900)
                .EUt(700)
                .buildAndRegister();

        ELECTROLYTIC_CELL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('gadolinium_leach')*1000)
                .notConsumable(fluid('alumina')*100)
                .fluidOutputs(fluid('gadolinium_solution')*600)
                .fluidOutputs(fluid('sulfuric_residues')*400)
                .notConsumable(metaitem('stickTitanium'))
                .notConsumable(metaitem('stickAluminium'))
                .duration(600)
                .EUt(600)
                .buildAndRegister();

        CRYOGENIC_DISTILLATION_PLANT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sulfuric_residues')*1000)
                .fluidOutputs(fluid('liquid_air')*1000)
                .outputs(metaitem('dustSulfur'))
                .fluidOutputs(fluid('sulfur_dioxide')*1000)
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('gadolinium_solution')*1000)
                .outputs(metaitem('dustGadoliniumOxide')* 4)
                .fluidOutputs(fluid('water')*1000)
                .duration(240)
                .EUt(700)
                .buildAndRegister();

        DILUTION_REFRIGERATOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ree_group_mud')*1000)
                .fluidInputs(fluid('aqua_regia')*1000)
                .fluidOutputs(fluid('diluted_aqua_regia')*2000)
                .fluidOutputs(fluid('lanthanum_leach_emulsion')*500)
                .fluidOutputs(fluid('rarer_earth_concentrate')*500)
                .duration(800)
                .EUt(670)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(fluid('lanthanum_leach_emulsion')*1000)
                .inputs(metaitem('dustSodiumHydroxide')* 9)
                .fluidOutputs(fluid('lanthanum_leach_solution')*1000)
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        DISSOLUTION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(fluid('lanthanum_leach_solution')*1000)
                .fluidInputs(fluid('distilled_water')*2000)
                .outputs(metaitem('dustSodium')* 3)
                .outputs(metaitem('dustYttriumOxide')* 2)
                .outputs(metaitem('dustLanthanumOxide')* 2)
                .fluidOutputs(fluid('exquisite_scandium_leach_solution')*200)
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        BURNER_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('oxygen')*1000)
                .fluidInputs(fluid('exquisite_scandium_leach_solution') * 1000)
                .notConsumable(metaitem('chromatic_glass_fiber'))
                .fluidOutputs(fluid('purified_scandium_leach_residues')*1000)
                .outputs(metaitem('saturated_chromatic_glass_fiber'))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('saturated_chromatic_glass_fiber'))
                .outputs(metaitem('chromatic_glass_fiber'))
                .fluidInputs(fluid('hydrochloric_acid')*1000)
                .fluidOutputs(fluid('sodium_sulfide_solution')*1000)
                .duration(100)
                .EUt(700)
                .buildAndRegister();

        SIFTER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('purified_scandium_leach_residues')*1000)
                .fluidOutputs(fluid('hydrochloric_acid')*1000)
                .chancedOutput(metaitem('dustScandiumOxide')* 2, 200, 100)
                .chancedOutput(metaitem('dustPotassium')*1, 2500, 0)
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustScandiumOxide')* 2)
                .outputs(metaitem('dustScandium'))
                .fluidOutputs(fluid('oxygen')*1000)
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('rarer_earth_concentrate')*1000)
                .fluidInputs(fluid('oxygen')*1000)
                .fluidOutputs(fluid('water')*1600)
                .fluidOutputs(fluid('rarer_earth_mixture')*400)
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        BURNER_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('rarer_earth_mixture')*1000)
                .outputs(metaitem('dustErbiumOxide')* 2)
                .outputs(metaitem('dustCeriumOxide')* 2)
                .fluidOutputs(fluid('dysprosium_oxide_solution')*1000)
                .duration(200)
                .EUt(780)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('dysprosium_oxide_solution')*1000)
                .fluidOutputs(fluid('water')*1000)
                .outputs(metaitem('dustDysprosiumOxide')* 3)
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustDysprosiumOxide')* 2)
                .fluidOutputs(fluid('oxygen')*1000)
                .outputs(metaitem('dustDysprosium'))
                .duration(900)
                .EUt(80)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustErbiumOxide')* 2)
                .fluidOutputs(fluid('oxygen')*1000)
                .outputs(metaitem('dustErbium'))
                .duration(900)
                .EUt(80)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustYttriumOxide')* 2)
                .fluidOutputs(fluid('oxygen')*1000)
                .outputs(metaitem('dustYttrium'))
                .duration(900)
                .EUt(80)
                .buildAndRegister();
    