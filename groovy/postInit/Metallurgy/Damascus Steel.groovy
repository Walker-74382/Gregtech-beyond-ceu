ASSEMBLER_RECIPES = recipemap('assembler')
BLAST_RECIPES = recipemap('electric_blast_furnace')
FORGE_HAMMER_RECIPES = recipemap('forge_hammer')
EXTRUDER_RECIPES = recipemap('extruder')

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('plateSteel')* 8)
                .inputs(metaitem('plateBlackSteel')* 8)
                .inputs(metaitem('dustBorax')* 8)
                .circuitMeta(16)
                .fluidInputs(fluid('steel')*576)
                .outputs(metaitem('damascus_steel_assembly')* 1)
                .duration(300)
                .EUt(512)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('damascus_steel_assembly')* 1)
                .outputs(metaitem('hot_damascus_steel_assembly')* 1)
                .blastFurnaceTemp(1200)
                .duration(1200)
                .EUt(1920)
                .buildAndRegister();

        FORGE_HAMMER_RECIPES.recipeBuilder()
                .inputs(metaitem('hot_damascus_steel_assembly')* 1)
                .outputs(metaitem('lightly_forged_damascus_steel_assembly')* 1)
                .duration(160)
                .EUt(384)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('lightly_forged_damascus_steel_assembly')* 1)
                .outputs(metaitem('hot_lightly_forged_damascus_steel_assembly')* 1)
                .blastFurnaceTemp(1200)
                .duration(1200)
                .EUt(1920)
                .buildAndRegister();

        FORGE_HAMMER_RECIPES.recipeBuilder()
                .inputs(metaitem('hot_lightly_forged_damascus_steel_assembly')* 1)
                .outputs(metaitem('moderately_forged_damascus_steel_assembly')* 1)
                .duration(160)
                .EUt(384)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('moderately_forged_damascus_steel_assembly')* 1)
                .outputs(metaitem('hot_moderately_forged_damascus_steel_assembly')* 1)
                .blastFurnaceTemp(1200)
                .duration(1200)
                .EUt(1920)
                .buildAndRegister();

        FORGE_HAMMER_RECIPES.recipeBuilder()
                .inputs(metaitem('hot_moderately_forged_damascus_steel_assembly')* 1)
                .outputs(metaitem('highly_forged_damascus_steel_assembly')* 1)
                .duration(160)
                .EUt(384)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('highly_forged_damascus_steel_assembly')* 1)
                .outputs(metaitem('hot_highly_forged_damascus_steel_assembly')* 1)
                .blastFurnaceTemp(1200)
                .duration(1200)
                .EUt(1920)
                .buildAndRegister();

        EXTRUDER_RECIPES.recipeBuilder()
                .inputs(metaitem('hot_highly_forged_damascus_steel_assembly')* 1)
                .notConsumable(metaitem('shape.extruder.ingot'))
                .outputs(metaitem('ingotDamascusSteel')* 1)
                .duration(160)
                .EUt(384)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustDamascusSteel')* 1)
                .outputs(metaitem('dustSteel')* 8)
                .outputs(metaitem('dustBlackSteel')* 8)
                .duration(84)
                .EUt(30)
                .buildAndRegister();