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

// Iron Dust * 3
mods.gregtech.electrolyzer.removeByInput(30, [metaitem('dustMagnetite') * 7], null)

// Iron Dust * 1
mods.gregtech.centrifuge.removeByInput(30, [metaitem('dustBrownLimonite') * 4], null)

// Iron Dust * 1
mods.gregtech.centrifuge.removeByInput(30, [metaitem('dustYellowLimonite') * 4], null)

// Iron Dust * 2
mods.gregtech.electrolyzer.removeByInput(30, [metaitem('dustBandedIron') * 5], null)
        

        //Hematite Processing

        MIXER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustCoke'))
                .inputs(metaitem('dustHematite'))
                .outputs(metaitem('dustHematiteCokePellets'))
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('dustHematiteCokePellets'))
                .fluidInputs(fluid('carbon_monoxide')*2000)
                .fluidOutputs(fluid('carbon_dioxide')*3000)
                .outputs(metaitem('ingotPigIron'))
                .blastFurnaceTemp(800)
                .duration(200)
                .EUt(48)
                .buildAndRegister();

        //MIDREX PROCESS
