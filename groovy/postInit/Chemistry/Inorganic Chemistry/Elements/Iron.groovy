import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hydrogen')*1000)
                .fluidOutputs(fluid('steam')*1000)
                .inputs(metaitem('dustMagnetite'))
                .outputs(item('minecraft:iron_ingot'))
                .duration(200)
                .EUt(12)
                .blastFurnaceTemp(1000)
                .buildAndRegister();

        PRIMITIVE_BLAST_FURNACE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustMagnetite')* 3)
                .inputs(metaitem('dustCarbon')* 2)
                .outputs(metaitem('ingotBandedIron')* 4)
                .duration(200)
                .buildAndRegister();

        PRIMITIVE_BLAST_FURNACE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustMagnetite')* 3)
                .inputs(metaitem('dustCharcoal')* 2)
                .outputs(metaitem('ingotBandedIron')* 4)
                .duration(200)
                .buildAndRegister();

        PRIMITIVE_BLAST_FURNACE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustMagnetite')* 3)
                .inputs(metaitem('dustCoal')* 2)
                .outputs(metaitem('ingotBandedIron')* 4)
                .duration(200)
                .buildAndRegister();

        PRIMITIVE_BLAST_FURNACE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustMagnetite')* 3)
                .inputs(metaitem('dustCoke'))
                .outputs(metaitem('ingotBandedIron')* 4)
                .duration(200)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hydrogen')*1000)
                .fluidOutputs(fluid('steam')*1000)
                .inputs(metaitem('ingotBandedIron')* 5)
                .outputs(item('minecraft:iron_ingot')* 2)
                .duration(200)
                .EUt(12)
                .blastFurnaceTemp(1000)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hydrogen')*1000)
                .fluidOutputs(fluid('steam')*1000)
                .inputs(metaitem('dustBandedIron')* 5)
                .outputs(item('minecraft:iron_ingot')* 2)
                .duration(200)
                .EUt(12)
                .blastFurnaceTemp(1000)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('oxygen')*100)
                .inputs(metaitem('dustBandedIron')* 5)
                .outputs(item('minecraft:iron_ingot')* 2)
                .EUt(8)
                .duration(80)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustYellowLimonite')* 4)
                .fluidInputs(fluid('hydrogen')*3000)
                .outputs(metaitem('dustIron'))
                .fluidOutputs(fluid('steam')*2000)
                .duration(200)
                .EUt(9)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustBrownLimonite')* 4)
                .fluidInputs(fluid('hydrogen')*3000)
                .outputs(metaitem('dustIron'))
                .fluidOutputs(fluid('steam')*2000)
                .duration(200)
                .EUt(9)
                .buildAndRegister();