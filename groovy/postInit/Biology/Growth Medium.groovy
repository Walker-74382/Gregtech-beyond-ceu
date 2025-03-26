import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;




        DRYER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('milk')*1000)
                .circuitMeta(2)
                .outputs(metaitem('dustSolidMilkResidues'))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSolidMilkResidues'))
                .fluidInputs(fluid('milk')*1000)
                .fluidOutputs(fluid('milk_residue_slurry')*1000)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        BIO_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('milk_residue_slurry')*1000)
                .fluidInputs(fluid('bacterial_growth_medium')*1000)
                .inputs(metaitem('plus_sterilized_petri_dish'))
                .outputs(metaitem('bifidobacterium_brave_culture'))
                .duration(2000)
                .EUt(800)
                .buildAndRegister();

        BIO_REACTOR_RECIPES.recipeBuilder()
                .inputs(metaitem('bifidobacterium_brave_culture'))
                .fluidInputs(fluid('bacterial_growth_medium')*1000)
                .outputs(metaitem('dustBifidobacteriumBrave')* 1)
                .duration(200)
                .EUt(150)
                .buildAndRegister();

        BIO_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('bacterial_growth_medium')*250)
                .fluidOutputs(fluid('depleted_bacterial_growth_medium')*250)
                .notConsumable(fluid('yeem_solution')*100)
                .inputs(metaitem('dustBifidobacteriumBrave')* 1)
                .outputs(metaitem('dustBifidobacteriumBrave')* 2)
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        BACTERIAL_VAT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('chitin')*1000)
                .fluidOutputs(fluid('chitosan')*1000)
                .inputs(metaitem('dustBifidobacteriumBrave')* 1)
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        DILUTION_REFRIGERATOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('distilled_water')*1000)
                .inputs(item('minecraft:red_mushroom'))
                .fluidOutputs(fluid('mushroom_solution')*1000)
                .duration(120)
                .EUt(780)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('mushroom_solution')*1000)
                .notConsumable(metaitem('ultrasonic_homogenizer'))
                .fluidOutputs(fluid('chitin')*1000)
                .duration(200)
                .EUt(780)
                .buildAndRegister();

        ENZYMATIC_HYDROLISIS_RECIPES.recipeBuilder()
                .fluidInputs(fluid('rapidly_replicating_animal_cells')*1000)
                .fluidOutputs(fluid('myc_gene')*1000)
                .fluidOutputs(fluid('oct_4_gene')*1000)
                .fluidOutputs(fluid('sox_2_gene')*1000)
                .fluidOutputs(fluid('kfl_4_gene')*1000)
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        MICROSCOPE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('waste_water')*100)
                .chancedOutput(metaitem('dustStreptococcusPyogenes')*1, 300, 0)
                .duration(212)
                .EUt(700)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('extra_distilled_water')*1000)
                .notConsumable(metaitem('dustStreptococcusPyogenes'))
                .inputs(item('minecraft:rotten_flesh'))
                .fluidOutputs(fluid('rotten_solution')*1000)
                .duration(200)
                .EUt(280)
                .buildAndRegister();

        DISSOLUTION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(fluid('rotten_solution')*1000)
                .fluidInputs(fluid('distilled_water')*1000)
                .notConsumable(metaitem('ultrasonic_homogenizer'))
                .fluidOutputs(fluid('homogenized_rotten_solution')*1000)
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        ENZYMATIC_HYDROLISIS_RECIPES.recipeBuilder()
                .fluidInputs(fluid('homogenized_rotten_solution')*1000)
                .fluidOutputs(fluid('cas_9')*1000)
                .duration(200)
                .EUt(712)
                .buildAndRegister();

        BIO_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('oct_4_gene')*1000)
                .fluidInputs(fluid('sox_2_gene')*1000)
                .fluidInputs(fluid('myc_gene')*1000)
                .fluidInputs(fluid('cas_9')*1000)
                .fluidInputs(fluid('kfl_4_gene')*1000)
                .fluidOutputs(fluid('gene_plasmids')*5000)
                .inputs(metaitem('dustEschericiaColi'))
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('chitosan')*1000)
                .fluidInputs(fluid('gene_plasmids')*1000)
                .fluidOutputs(fluid('gene_therapy_fluid')*2000)
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('raw_growth_medium')*1000)
                .fluidInputs(fluid('sulfanilamide')*1000)
                .fluidOutputs(fluid('sterilized_growth_medium')*1000)
                .duration(200)
                .EUt(1200)
                .buildAndRegister();

        BACTERIAL_VAT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('gene_therapy_fluid')*10000)
                .fluidInputs(fluid('animal_cells')*10000)
                .circuitMeta(1)
                .fluidInputs(fluid('sterilized_growth_medium') * 1000)
                .outputs(metaitem('stem_cells'))
                .duration(2000)
                .EUt(800)
                .buildAndRegister();

        BACTERIAL_VAT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('gene_therapy_fluid')*10000)
                .fluidInputs(fluid('animal_cells')*10000)
                .circuitMeta(2)
                .notConsumable(metaitem('stem_cell_lab_on_chip'))
                .fluidInputs(fluid('sterilized_growth_medium')*10000)
                .outputs(metaitem('stem_cells')* 2)
                .duration(2000)
                .EUt(800)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('plateIridium')* 4)
                .inputs(metaitem('screwNaquadah')* 4)
                .inputs(metaitem('plate.qbit_central_processing_unit'))
                .outputs(metaitem('lab_on_chip_base'))
                .duration(200)
                .EUt(1200)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('bacterial_growth_medium')*100)
                .inputs(metaitem('lab_on_chip_base'))
                .outputs(metaitem('lab_on_chip'))
                .duration(120)
                .EUt(890)
                .buildAndRegister();

        BIO_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sterilized_growth_medium')*1000)
                .inputs(metaitem('stem_cells'))
                .inputs(metaitem('lab_on_chip_base'))
                .outputs(metaitem('stem_cell_lab_on_chip'))
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        ENZYMATIC_HYDROLISIS_RECIPES.recipeBuilder()
                .fluidInputs(fluid('blood_cells')*1000)
                .fluidOutputs(fluid('animal_cells')*1000)
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('animal_cells')*1000)
                .fluidOutputs(fluid('rapidly_replicating_animal_cells')*1000)
                .notConsumable(metaitem('dustNaquadria'))
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustMeat'))
                .fluidOutputs(fluid('blood')*1000)
                .duration(200)
                .EUt(90)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('blood')*1000)
                .fluidOutputs(fluid('blood_cells')*500)
                .fluidOutputs(fluid('plasma.blood_plasma') * 500)
                .duration(200)
                .EUt(90)
                .buildAndRegister();