import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('component.glass.tube'))
                .inputs(metaitem('stickSteel'))
                .outputs(metaitem('syringe'))
                .duration(120)
                .EUt(70)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('syringe'))
                .fluidInputs(fluid('butanol_100')*1000)
                .fluidInputs(fluid('methanol_100')*1000)
                .outputs(metaitem('sterilized_syringe'))
                .duration(120)
                .EUt(90)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(item('minecraft:mutton'))
                .inputs(metaitem('sterilized_syringe'))
                .outputs(metaitem('sheep_blood_syringe'))
                .duration(120)
                .EUt(90)
                .buildAndRegister();

        EXTRACTOR_RECIPES.recipeBuilder()
                .inputs(metaitem('sheep_blood_syringe'))
                .fluidOutputs(fluid('sheep_blood')*1000)
                .outputs(metaitem('syringe'))
                .duration(120)
                .EUt(800)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sheep_blood')*1000)
                .fluidOutputs(fluid('sheep_blood_plasma')*200)
                .fluidOutputs(fluid('sheep_blood_cells')*800)
                .duration(200)
                .EUt(670)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sheep_blood_plasma')*1000)
                .notConsumable(fluid('edetic_acid')*200)
                .fluidOutputs(fluid('defibernated_sheep_blood')*1000)
                .duration(120)
                .EUt(1200)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .notConsumable(metaitem('shape.mold.cylinder'))
                .outputs(metaitem('dustSolidifiedSterileDefibernatedSheepBlood'))
                .notConsumable(fluid('ethylene_oxide')*200)
                .fluidInputs(fluid('defibernated_sheep_blood')*1000)
                .duration(120)
                .EUt(1200)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .notConsumable(metaitem('dustAluminiumChloride')* 1)
                .fluidInputs(fluid('benzene')*1000)
                .fluidInputs(fluid('ethylene')*1000)
                .fluidOutputs(fluid('phenyl_ethyl_alcohol')*1000)
                .duration(120)
                .EUt(80)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('phenyl_ethyl_alcohol')*1000)
                .fluidInputs(fluid('distilled_water')*1000)
                .inputs(metaitem('dustAgar')* 1)
                .fluidOutputs(fluid('phenyl_ethyl_alcohol_agar_solution')*1000)
                .duration(500)
                .EUt(8000)
                .buildAndRegister();

        FLUID_HEATER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('phenyl_ethyl_alcohol_agar_solution')*1000)
                .fluidOutputs(fluid('dissolved_phenyl_ethyl_alcohol_agar')*1000)
                .circuitMeta(0)
                .duration(80)
                .EUt(1290)
                .buildAndRegister();

        AUTOCLAVE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('dissolved_phenyl_ethyl_alcohol_agar')*1000)
                .inputs(metaitem('dustSolidifiedSterileDefibernatedSheepBlood'))
                .fluidOutputs(fluid('phenyl_ethyl_alcohol_agar')*1000)
                .duration(120)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('phenyl_ethyl_alcohol_agar')*100)
                .inputs(metaitem('plus_sterilized_petri_dish'))
                .outputs(metaitem('pad_petri_dish'))
                .duration(900)
                .EUt(560)
                .buildAndRegister();

        BIO_REACTOR_RECIPES.recipeBuilder()
                .inputs(metaitem('pad_petri_dish'))
                .inputs(metaitem('dustIriditus'))
                .fluidOutputs(fluid('xerizin')*100)
                .duration(120)
                .EUt(80)
                .buildAndRegister();

        TEXTILE_FACTORY_RECIPES.recipeBuilder()
                .inputs(metaitem('cotton'))
                .outputs(metaitem('cotton_sheet'))
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        TEXTILE_FACTORY_RECIPES.recipeBuilder()
                .inputs(metaitem('cotton_sheet'))
                .outputs(metaitem('cheese_cloth'))
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .notConsumable(metaitem('cheese_cloth'))
                .fluidInputs(fluid('heated_milk_slurry')*1000)
                .fluidOutputs(fluid('peptone_mixture')*400)
                .outputs(metaitem('dustSolidMilkResidues'))
                .duration(800)
                .EUt(612)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSolidMilkResidues'))
                .fluidOutputs(fluid('alpha_linolenic_acid')*400)
                .fluidOutputs(fluid('milk_oil')*600)
                .duration(200)
                .EUt(150)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .notConsumable(fluid('trypsin')*100)
                .notConsumable(fluid('nonoxynol_9')*20)
                .fluidInputs(fluid('peptone_mixture')*1000)
                .fluidOutputs(fluid('peptone')*500)
                .fluidOutputs(fluid('water')*500)
                .duration(600)
                .EUt(560)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('homogenized_pancreas_mixture')*1000)
                .fluidOutputs(fluid('trypsin')*50)
                .duration(200)
                .notConsumable(fluid('nonylphenol')*100)
                .EUt(120)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('distilled_water')*1000)
                .inputs(metaitem('pancreas'))
                .fluidOutputs(fluid('homogenized_pancreas_mixture')*1000)
                .notConsumable(metaitem('ultrasonic_homogenizer'))
                .duration(120)
                .EUt(800)
                .buildAndRegister();

        MACERATOR_RECIPES.recipeBuilder()
                .inputs(metaitem('soy_bean'))
                .outputs(metaitem('dustCrushedSoybean')* 1)
                .duration(50)
                .EUt(60)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('nheptane')*1000)
                .inputs(metaitem('dustCrushedSoybean')* 1)
                .outputs(metaitem('dustDefattedSoybeanFlour')* 1)
                .fluidOutputs(fluid('soybean_oil')*100)
                .duration(120)
                .EUt(500)
                .buildAndRegister();

        DEHYDRATOR_RECIPES.recipeBuilder()
                .inputs(metaitem('dustDefattedSoybeanFlour')* 1)
                .outputs(metaitem('dustPapairDigestOfSoybeanMeal'))
                .duration(800)
                .EUt(12)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPapairDigestOfSoybeanMeal'))
                .fluidOutputs(fluid('bean_slurry')*1000)
                .fluidInputs(fluid('water')*1000)
                .outputs(metaitem('dustWood')* 1)
                .duration(800)
                .EUt(160)
                .buildAndRegister();

        BIO_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('bean_slurry')*1000)
                .notConsumable(metaitem('yeem_petri'))
                .duration(200)
                .outputs(metaitem('dustRhizobium')*1)
                .EUt(400)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('yeem_solution')*100)
                .inputs(metaitem('plus_sterilized_petri_dish'))
                .outputs(metaitem('yeem_petri'))
                .duration(120)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidOutputs(fluid('ethoxylated_nonylphenol')*2000)
                .fluidInputs(fluid('nonylphenol')*1000)
                .fluidInputs(fluid('ethylene_oxide')*1000)
                .notConsumable(metaitem('dustPotassiumManganate')* 1)
                .duration(20)
                .EUt(70)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('nonoxynol_9_solution')*2000)
                .fluidOutputs(fluid('nonoxynol_9')*500)
                .fluidOutputs(fluid('water')*1500)
                .duration(800)
                .EUt(7120)
                .buildAndRegister();

        ELECTROLYTIC_CELL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('water')*1000)
                .fluidInputs(fluid('ethoxylated_nonylphenol')*1000)
                .fluidOutputs(fluid('nonylphenol')*800)
                .fluidOutputs(fluid('ethylene_glycol')*800)
                .fluidOutputs(fluid('nonoxynol_9_solution')*200)
                .fluidOutputs(fluid('hydrogen')*200)
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('nutrient_rich_solution')*1000)
                .inputs(metaitem('dustYeast')*1)
                .inputs(metaitem('plus_sterilized_petri_dish'))
                .outputs(metaitem('grown_yeast_culture'))
                .duration(120)
                .EUt(800)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .inputs(metaitem('grown_yeast_culture'))
                .outputs(metaitem('yeast_cells'))
                .fluidOutputs(fluid('waste_water')*12)
                .duration(700)
                .EUt(812)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('yeast_cells'))
                .outputs(metaitem('contaminated_sterilized_petri_dish'))
                .fluidOutputs(fluid('yeast_mixture')*1000)
                .fluidInputs(fluid('water')*1000)
                .duration(700)
                .EUt(812)
                .buildAndRegister();
                
        ROTARY_EVAPORATOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('yeast_mixture')*1000)
                .fluidOutputs(fluid('yeast_extract')*1000)
                .duration(800)
                .EUt(90)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('yeast_extract')*1000)
                .fluidInputs(fluid('water')*200)
                .fluidInputs(fluid('mannitol')*1000)
                .fluidOutputs(fluid('dissolved_yeast_extract_mannitol_mixture')*2200)
                .EUt(590)
                .duration(120)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('dissolved_yeast_extract_mannitol_mixture')*1000)
                .inputs(metaitem('dustAgar')* 2)
                .fluidOutputs(fluid('yeast_extract_mannitol_agar_solution')*1000)
                .duration(228)
                .EUt(9012)
                .buildAndRegister();

        AUTOCLAVE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('yeast_extract_mannitol_agar_solution')*1000)
                .notConsumable(metaitem('dustIron')* 1)
                .outputs(metaitem('dustYeastExtractMannitolMedium')* 2)
                .duration(900)
                .EUt(8000)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('distilled_water')*1000)
                .inputs(metaitem('dustYeastExtractMannitolMedium')* 1)
                .fluidOutputs(fluid('yeem_solution')*1000)
                .duration(800)
                .EUt(2000)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sodium_hydroxide_solution')*1000)
                .inputs(metaitem('dustFructose')* 6)
                .notConsumable(metaitem('dustSodiumBorohydride')* 1)
                .duration(200)
                .fluidOutputs(fluid('mannitol')*1000)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sodium_hydroxide_solution')*1000)
                .inputs(metaitem('dustGlucose')*6)
                .notConsumable(metaitem('dustSodiumBorohydride'))
                .duration(200)
                .fluidOutputs(fluid('mannitol')*1000)
                .EUt(120)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('water')*1000)
                .inputs(metaitem('dustSodiumHydroxide')* 3)
                .fluidOutputs(fluid('sodium_hydroxide_solution')*1000)
                .circuitMeta(0)
                .duration(120)
                .EUt(300)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hydrogen')*1000)
                .inputs(metaitem('dustSodium')* 1)
                .outputs(metaitem('dustSodiumHydride')* 2)
                .duration(200)
                .EUt(78)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSodiumHydride')* 2)
                .notConsumable(fluid('sulfuric_acid')*1000)
                .fluidInputs(fluid('ethanol')*3000)
                .fluidInputs(fluid('boric_acid')*1000)
                .outputs(metaitem('dustSodiumEthoxide')* 27)
                .outputs(metaitem('dustSodiumBorohydride')* 6)
                .fluidOutputs(fluid('water')*3000)
                .duration(60)
                .EUt(480)
                .buildAndRegister();

        MACERATOR_RECIPES.recipeBuilder()
                .inputs(metaitem('barley'))
                .outputs(metaitem('dustGristPowder'))
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hot_water')*1000)
                .inputs(metaitem('dustGristPowder'))
                .fluidOutputs(fluid('hot_grist_solution')*1000)
                .duration(1280)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hot_grist_solution')*1000)
                .notConsumable(metaitem('dustActivatedCarbon')* 1)
                .fluidOutputs(fluid('wort')*200)
                .outputs(metaitem('dustSolidGrain')* 1)
                .duration(120)
                .EUt(780)
                .buildAndRegister();

        FERMENTATION_VAT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('wort')*1000)
                .fluidOutputs(fluid('malt_extract')*1000)
                .duration(900)
                .EUt(2)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustGlucose')* 2)
                .fluidInputs(fluid('hot_water')*1000)
                .fluidInputs(fluid('peptone')*1000)
                .fluidOutputs(fluid('nutrient_rich_solution')*4000)
                .fluidInputs(fluid('malt_extract')*1000)
                .duration(800)
                .EUt(120)
                .buildAndRegister();