
ROASTER_RECIPES = recipemap('roaster_recipes')
BLAST_RECIPES = recipemap('electric_blast_furnace')
CRYSTALLIZATION_RECIPES = recipemap('crystallization_recipes')
EXTRACTOR_RECIPES = recipemap('extractor')
CHEMICAL_BATH_RECIPES = recipemap('chemical_bath')
MIXER_RECIPES = recipemap('mixer')
CENTRIFUGE_RECIPES = recipemap('centrifuge')
VACUUM_RECIPES = recipemap('vacuum_freezer')
FROTH_FLOTATION_UNIT_RECIPES = recipemap('froth_flotation_unit_recipes')
CLARIFIER_RECIPES = recipemap('clarifier_recipes')
FUSION_RECIPES = recipemap('fusion_reactor')
BEDROCK_PUMP_RECIPES = recipemap('bedrock_pump_recipes')
ELECTROLYZER_RECIPES = recipemap('electrolyzer')
CHEMICAL_PLANT_RECIPES = recipemap('chemical_plant_recipes')
CHEMICAL_RECIPES = recipemap('chemical_reactor')
LARGE_CHEMICAL_RECIPES = recipemap('large_chemical_reactor')
DISTILLATION_RECIPES = recipemap('distillation_tower')
DIGESTER_RECIPES = recipemap('digester_recipes')
SIFTER_RECIPES = recipemap('sifter')
LASER_ENGRAVER_RECIPES = recipemap('laser_engraver')
NEUTRON_ACCELERATOR_RECIPES = recipemap('neutron_accelerator_recipes')
VACUUM_DISTILLATION_TOWER_RECIPES = recipemap('vacuum_distillation_tower_recipes')
BIO_REACTOR_RECIPES = recipemap('bio_reactor_recipes')





        CHEMICAL_PLANT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ferrocene')*1000)
                .fluidInputs(fluid('fluorohydride_ammonium_carbama')*1000)
                .fluidInputs(fluid('dichloromethane')*1000)
                .fluidInputs(fluid('phenylpentanoicacid')*1000)
                .fluidOutputs(fluid('pcbb')*1000)
                .inputs(metaitem('dustFullerene')*1)
                .inputs(metaitem('dustRhodiumIiAcetate')*1)
                .notConsumable(metaitem('platePlatinum'))
                .duration(700)
                .EUt(800)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('methane')*1000)
                .fluidInputs(fluid('hydrofluoric_acid')*1000)
                .fluidOutputs(fluid('hydrofluoric_methane')*1000)
                .duration(120)
                .EUt(900)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hydrofluoric_methane')*1000)
                .fluidInputs(fluid('nitric_oxide')*1000)
                .fluidOutputs(fluid('carbon_dioxide')*1000)
                .fluidOutputs(fluid('fluorohydride_ammonium_carbama')*1000)
                .fluidOutputs(fluid('water')*2000)
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(fluid('chlorine')*3000)
                .inputs(metaitem('dustRhodium')*2)
                .outputs(metaitem('dustRhodiumIiiChloride')*2)
                .blastFurnaceTemp(1900)
                .EUt(700)
                .duration(102)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(fluid('acetic_acid')*1000)
                .outputs(metaitem('dustRhodiumIiAcetate'))
                .inputs(metaitem('dustRhodiumIiiChloride'))
                .blastFurnaceTemp(2700)
                .duration(1200)
                .EUt(700)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('pcbb')*1000)
                .inputs(metaitem('dustPalladiumFullereneMatrix'))
                .outputs(metaitem('dustFullerenePolymerTetrix'))
                .duration(120)
                .EUt(800)
                .buildAndRegister();