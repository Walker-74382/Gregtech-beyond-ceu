import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


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