import globals.Globals

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
PRIMITIVE_BLAST_FURNACE_RECIPES = recipemap('primitive_blast_furnace')
SINTERING_OVEN_RECIPES = recipemap('sintering_oven_recipes')



       ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSphalerite')* 2)
                .fluidInputs(fluid('oxygen')*5000)
                .outputs(metaitem('dustRoastedSphalerite')* 3)
                .outputs(metaitem('dustZincOxide')* 2)
                .fluidOutputs(fluid('sulfur_dioxide')*1000)
                .duration(200)
                .EUt(480)
                .buildAndRegister();

        // GeO2 + 2Zn -> Zn2(GeO2)
        MIXER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustRoastedSphalerite')* 3)
                .inputs(metaitem('dustZinc')* 2)
                .outputs(metaitem('dustZincRichSphalerite')* 5)
                .duration(320)
                .EUt(30)
                .buildAndRegister();

        // Zn2(GeO2) + H2SO4 -> ZnGeO2 + ZnSO4 + 2H (lost)
        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .inputs(metaitem('dustZincRichSphalerite')* 5)
                .fluidInputs(fluid('sulfuric_acid')*1000)
                .outputs(metaitem('dustWaelzOxide'))
                .outputs(metaitem('dustWaelzSlag')* 5)
                .duration(400)
                .EUt(30)
                .buildAndRegister();

        // ZnSO4 + H2O -> ZnO + H2SO4
        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .inputs(metaitem('dustWaelzSlag')* 5)
                .fluidInputs(fluid('water')*1000)
                .outputs(metaitem('dustZincOxide')* 2)
                .chancedOutput(metaitem('dustGallium')*1, 2000, 1000)
                .fluidOutputs(fluid('sulfuric_acid')*1000)
                .duration(160)
                .EUt(480)
                .buildAndRegister();

        // ZnGeO2 + H2SO4 -> GeO2 + ZnSO4 + 2H (lost)
        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .inputs(metaitem('dustWaelzOxide'))
                .fluidInputs(fluid('sulfuric_acid')*1000)
                .outputs(metaitem('dustImpureGermaniumDioxide')* 3)
                .outputs(metaitem('dustWaelzSlag')* 5)
                .chancedOutput(metaitem('dustManganese')*1, 1000, 1000)
                .duration(200)
                .EUt(480)
                .buildAndRegister();

        // GeO2 + 4HCl -> GeCl4 + 2H2O
        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .inputs(metaitem('dustImpureGermaniumDioxide')* 3)
                .fluidInputs(fluid('hydrochloric_acid')*4000)
                .chancedOutput(metaitem('dustCadmium')*1 ,500, 1000)
                .fluidOutputs(fluid('germanium_tetrachloride')*1000)
                .duration(300)
                .EUt(480)
                .buildAndRegister();

        // GeCl4 + 2H2O -> GeO2 + 4HCl
        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('germanium_tetrachloride')*1000)
                .fluidInputs(fluid('water')*2000)
                .outputs(metaitem('dustGermaniumDioxide')* 3)
                .fluidOutputs(fluid('hydrochloric_acid')*4000)
                .duration(100)
                .EUt(30)
                .buildAndRegister();

        // GeO2 + 4HCl -> GeCl4 + 2H2O
        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustGermaniumDioxide')* 3)
                .fluidInputs(fluid('hydrochloric_acid')*4000)
                .fluidOutputs(fluid('germanium_tetrachloride')*1000)
                .fluidOutputs(fluid('water')*2000)
                .duration(100)
                .EUt(30)
                .buildAndRegister();

        // GeO2 + 4H -> Ge + 2H2O
        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustGermaniumDioxide')* 3)
                .fluidInputs(fluid('hydrogen')*4000)
                .outputs(metaitem('dustGermanium'))
                .fluidOutputs(fluid('water')*2000)
                .duration(240)
                .EUt(1500)
                .buildAndRegister();