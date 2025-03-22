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
                .fluidInputs(fluid('oxygen')*2000)
                .inputs(metaitem('dustBornite')* 2)
                .outputs(metaitem('dustRoastedBornite')* 2)
                .fluidOutputs(fluid('sulfur_dioxide')*2000)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        PRIMITIVE_BLAST_FURNACE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustRoastedBornite')* 1)
                .inputs(metaitem('dustCarbon')* 2)
                .outputs(metaitem('ingotCopper'))
                .duration(200)
                .buildAndRegister();

        PRIMITIVE_BLAST_FURNACE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustRoastedBornite')* 1)
                .inputs(metaitem('dustCharcoal')* 2)
                .outputs(metaitem('ingotCopper'))
                .duration(200)
                .buildAndRegister();

        PRIMITIVE_BLAST_FURNACE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustRoastedBornite')* 1)
                .inputs(metaitem('dustCoal')* 2)
                .outputs(metaitem('ingotCopper'))
                .duration(200)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('dustRoastedBornite'))
                .outputs(metaitem('ingotCopper'))
                .chancedOutput(item('minecraft:iron_ingot')*1, 2000, 1)
                .blastFurnaceTemp(800)
                .EUt(80)
                .duration(160)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('oxygen')*2000)
                .inputs(metaitem('dustChalcocite')* 2)
                .outputs(metaitem('dustCopper'))
                .fluidOutputs(fluid('sulfur_dioxide')*2000)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('dustMalachite'))
                .fluidInputs(fluid('oxygen')*2000)
                .inputs(metaitem('dustCoke')* 2)
                .outputs(metaitem('dustMalachiteSlag'))
                .fluidOutputs(fluid('carbon_dioxide')*2000)
                .blastFurnaceTemp(1200)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        SINTERING_OVEN_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hydrogen')*2000)
                .fluidOutputs(fluid('steam')*4000)
                .inputs(metaitem('dustMalachiteSlag'))
                .outputs(metaitem('dustSinteredMalachiteSlag'))
                .duration(200)
                .EUt(90)
                .buildAndRegister();

        BURNER_REACTOR_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSinteredMalachiteSlag'))
                .outputs(metaitem('ingotCopper'))
                .duration(400)
                .EUt(50)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustCupricOxide')* 2)
                .circuitMeta(1)
                .outputs(metaitem('dustCopper'))
                .fluidOutputs(fluid('steam')*1000)
                .duration(200)
                .EUt(90)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustCupricOxide')* 2)
                .circuitMeta(0)
                .outputs(metaitem('dustCopper'))
                .duration(200)
                .EUt(90)
                .buildAndRegister();