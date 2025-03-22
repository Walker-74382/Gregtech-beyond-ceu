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
        
        
        
        
        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('aqua_regia')*9000)
                .inputs(metaitem('dustPlatinumGroupSludge')* 18)
                .outputs(metaitem('dustPlatinumResidues')* 5)
                .fluidOutputs(fluid('platinum_concentrate')*9000)
                .circuitMeta(1)
                .duration(20)
                .EUt(120)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPotassiumDisulfate')* 11)
                .inputs(metaitem('dustPlatinumResidues')* 5)
                .outputs(metaitem('dustSulfur')* 7)
                .outputs(metaitem('dustLeachResidues')* 4)
                .fluidInputs(fluid('oxygen')*1000)
                .fluidOutputs(fluid('rhodium_sulfate')*1000)
                .EUt(120)
                .duration(120)
                .blastFurnaceTemp(775)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('water')*9000)
                .fluidInputs(fluid('rhodium_sulfate')*27000)
                .outputs(metaitem('dustLeachResidues')* 4)
                .circuitMeta(1)
                .fluidOutputs(fluid('rhodium_sulfate_solution')*27000)
                .EUt(30)
                .duration(800)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(fluid('oxygen')*3000)
                .inputs(metaitem('dustSodaAsh')* 18)
                .inputs(metaitem('dustLeachResidues')* 40)
                .outputs(metaitem('dustSodiumRuthenate')* 21)
                .outputs(metaitem('dustRarestMetalMixture')* 6)
                .fluidOutputs(fluid('carbon_monoxide')*3000)
                .EUt(120)
                .duration(600)
                .blastFurnaceTemp(775)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('chlorine')*4000)
                .inputs(metaitem('dustSodiumRuthenate')* 14)
                .fluidOutputs(fluid('ruthenium_tetroxide_solution')*2000)
                .EUt(30)
                .duration(200)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ruthenium_tetroxide_solution')*1000)
                .outputs(metaitem('dustSalt')* 4)
                .fluidOutputs(fluid('ruthenium_tetroxide_liquid')*1000)
                .fluidOutputs(fluid('water')*1000)
                .EUt(480)
                .duration(2000)
                .buildAndRegister();

        FLUID_SOLIDFICATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ruthenium_tetroxide_liquid')*1000)
                .notConsumable(metaitem('shape.mold.ball'))
                .outputs(metaitem('dustRutheniumTetroxide'))
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('dustIridiumMetalResidue')* 5)
                .outputs(metaitem('dustIridiumDioxide')* 6)
                .outputs(metaitem('dustPlatinumSludgeResidue')* 5)
                .blastFurnaceTemp(775)
                .duration(200)
                .EUt(30)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustIridiumDioxide')* 6)
                .fluidInputs(fluid('hydrochloric_acid')*1000)
                .fluidOutputs(fluid('acidic_iridium_dioxide')*1000)
                .duration(200)
                .EUt(100)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustAmmoniumChloride')* 4)
                .fluidInputs(fluid('acidic_iridium_dioxide')*1000)
                .fluidOutputs(fluid('water')*1000)
                .outputs(metaitem('dustIridiumChloride')* 8)
                .fluidOutputs(fluid('ammonia')*4000)
                .duration(800)
                .EUt(900)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('platinum_extraction_mixture')*4000)
                .fluidInputs(fluid('platinum_concentrate')*4000)
                .fluidOutputs(fluid('palladium_extract')*1000)
                .fluidOutputs(fluid('platinum_extract')*3000)
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('platinum_extract')*1000)
                .fluidOutputs(fluid('platinum_extraction_mixture')*1000)
                .fluidOutputs(fluid('platinum_solution')*1000)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('platinum_solution')*1000)
                .inputs(metaitem('dustAmmoniumChloride')* 2)
                .fluidOutputs(fluid('nitric_acid')*2000)
                .fluidOutputs(fluid('hydrogen')*1200)
                .outputs(metaitem('dustPlatinumSalt')* 1)
                .outputs(metaitem('dustPlatinumRaw')* 2)
                .duration(400)
                .EUt(80)
                .buildAndRegister();

        SIFTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPlatinumSalt'))
                .outputs(metaitem('dustPlatinumMetallicPowder'))
                .duration(129)
                .EUt(80)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('palladium_extract')*1000)
                .fluidOutputs(fluid('platinum_extraction_mixture')*1000)
                .fluidOutputs(fluid('palladium_mother_liqour')*1000)
                .fluidOutputs(fluid('palladium_enriched_ammonia')*1000)
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('palladium_enriched_ammonia')*1000)
                .circuitMeta(1)
                .outputs(metaitem('dustPalladiumSalt')* 2)
                .duration(80)
                .EUt(90)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPalladiumMetallicPowder')* 12)
                .fluidInputs(fluid('palladium_enriched_ammonia')*6000)
                .circuitMeta(1)
                .outputs(metaitem('dustPalladiumSalt')* 15)
                .outputs(metaitem('dustReprecipitatedPalladium')* 8)
                .duration(80)
                .EUt(90)
                .buildAndRegister();

        SIFTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPalladiumSalt')* 1)
                .outputs(metaitem('dustPalladiumMetallicPowder')* 1)
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(fluid('aqua_regia')*1000)
                .inputs(metaitem('dustPlatinumMetallicPowder')* 3)
                .fluidOutputs(fluid('platinum_solution')*1000)
                .blastFurnaceTemp(1900)
                .duration(700)
                .EUt(120)
                .buildAndRegister();

        DEHYDRATOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('rhodium_sulfate_solution')*1000)
                .inputs(metaitem('dustZinc'))
                .outputs(metaitem('dustZincSulfide')* 6)
                .outputs(metaitem('dustCrudeRhodiumMetal')* 2)
                .EUt(30)
                .duration(300)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('dustCrudeRhodiumMetal')* 2)
                .inputs(metaitem('dustSalt')* 2)
                .outputs(metaitem('dustRhodiumSalt')* 3)
                .blastFurnaceTemp(775)
                .EUt(120)
                .duration(300)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustRhodiumSalt')* 3)
                .fluidInputs(fluid('chlorine')*1000)
                .fluidOutputs(fluid('rhodium_salt_solution')*1000)
                .EUt(30)
                .duration(30)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSodium')* 2)
                .fluidInputs(fluid('nitric_acid')*2000)
                .fluidInputs(fluid('oxygen')*1000)
                .outputs(metaitem('dustSodiumNitrate')* 10)
                .fluidOutputs(fluid('water')*1000)
                .EUt(60)
                .duration(8)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('rhodium_salt_solution')*1000)
                .fluidInputs(fluid('nitrogen_dioxide')*2000)
                .fluidInputs(fluid('oxygen')*2000)
                .inputs(metaitem('dustSodiumNitrate')* 5)
                .outputs(metaitem('dustSalt')* 6)
                .outputs(metaitem('dustRhodiumNitrate')* 13)
                .EUt(30)
                .duration(300)
                .buildAndRegister();

        SIFTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustRhodiumNitrate')* 13)
                .chancedOutput(metaitem('dustRhodiumFilterCake')*1, 9500, 0)
                .EUt(30)
                .duration(600)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustRhodiumFilterCake')* 2)
                .fluidInputs(fluid('water')*2000)
                .fluidOutputs(fluid('rhodium_filter_cake_solution')*1000)
                .EUt(30)
                .duration(300)
                .buildAndRegister();

        DEHYDRATOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('rhodium_filter_cake_solution')*1000)
                .outputs(metaitem('dustRhodium'))
                .fluidOutputs(fluid('ammonia')*2000)
                .EUt(30)
                .duration(500)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(fluid('deionized_water')*1000)
                .inputs(metaitem('dustReprecipitatedPalladium')* 1)
                .outputs(metaitem('dustDeionizedPalladium')* 1)
                .EUt(150)
                .duration(500)
                .buildAndRegister();

        DRYER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustDeionizedPalladium')* 1)
                .fluidOutputs(fluid('water')*1000)
                .outputs(metaitem('dustDriedPalladium')* 1)
                .EUt(400)
                .duration(400)
                .buildAndRegister();

        OXIDATION_FURNACE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustDriedPalladium')* 1)
                .outputs(metaitem('dustPalladium')* 1)
                .fluidOutputs(fluid('ammonia')*1000)
                .EUt(500)
                .duration(300)
                .buildAndRegister();