import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('plateGold')*4)
                .circuitMeta(4)
                .outputs(item('minecraft:golden_boots'))
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('plateGold')*7)
                .circuitMeta(7)
                .outputs(item('minecraft:golden_leggings'))
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('plateGold')*5)
                .circuitMeta(5)
                .outputs(item('minecraft:golden_helmet'))
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('plateGold')*8)
                .circuitMeta(8)
                .outputs(item('minecraft:golden_chestplate'))
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('plateDiamond')*4)
                .circuitMeta(4)
                .outputs(item('minecraft:diamond_boots'))
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('plateDiamond')*7)
                .circuitMeta(7)
                .outputs(item('minecraft:diamond_leggings'))
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('plateDiamond')*5)
                .circuitMeta(5)
                .outputs(item('minecraft:diamond_helmet'))
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('plateDiamond')*8)
                .circuitMeta(8)
                .outputs(item('minecraft:diamond_chestplate'))
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('ringIron')*4)
                .circuitMeta(4)
                .outputs(item('minecraft:chainmail_boots'))
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('ringIron')*7)
                .circuitMeta(7)
                .outputs(item('minecraft:chainmail_leggings'))
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('ringIron')*5)
                .circuitMeta(5)
                .outputs(item('minecraft:chainmail_helmet'))
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('ringIron')*8)
                .circuitMeta(8)
                .outputs(item('minecraft:chainmail_chestplate'))
                .duration(200)
                .EUt(8)
                .buildAndRegister();


crafting.remove('minecraft:furnace');

// Furnace * 1
mods.gregtech.assembler.removeByInput(7, [metaitem('circuit.integrated').withNbt(['Configuration': 8]), item('minecraft:mossy_cobblestone:*') * 8 * 8], null)


crafting.addShaped("furnace",  item('minecraft:furnace'), [
[ore('plateStone'), ore('plateStone'), ore('plateStone')], 
[ore('plateStone'), item('pyrotech:furnace_core'), ore('plateStone')], 
[ore('plateStone'), ore('plateStone'), ore('plateStone')]
])

crafting.remove('minecraft:chest');
crafting.remove('minecraft:crafting_table');
crafting.remove('minecraft:bow')
crafting.remove('minecraft:arrow')
crafting.remove('minecraft:boat')
crafting.remove('minecraft:acacia_boat')
crafting.remove('minecraft:spruce_boat')
crafting.remove('minecraft:birch_boat')
crafting.remove('minecraft:jungle_boat')
crafting.remove('minecraft:dark_oak_boat')