import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


        ASSEMBLER_RECIPES.recipeBuilder()
                .input(GLASS_TUBE)
                .input(stick, Steel)
                .output(SYRINGE)
                .duration(120)
                .EUt(70)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(SYRINGE)
                .fluidInputs(fluid('butanol_100')*1000)
                .fluidInputs(fluid('methanol_100')*1000)
                .output(STERILIZED_SYRINGE)
                .duration(120)
                .EUt(90)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(MUTTON)
                .input(STERILIZED_SYRINGE)
                .output(SHEEP_BLOOD_SYRINGE)
                .duration(120)
                .EUt(90)
                .buildAndRegister();

        EXTRACTOR_RECIPES.recipeBuilder()
                .input(SHEEP_BLOOD_SYRINGE)
                .fluidOutputs(fluid('sheep_blood')*1000)
                .output(SYRINGE)
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
                .notConsumable(SHAPE_MOLD_CYLINDER)
                .outputs(metaitem('dustSolidifiedSterileDefibernatedsheep_blood')* 1)
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
                .inputs(metaitem('dustSolidifiedSterileDefibernatedsheep_blood')* 1)
                .fluidOutputs(fluid('phenyl_ethyl_alcohol_blood_agar')*1000)
                .duration(120)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('phenyl_ethyl_alcohol_blood_agar')*100)
                .input(PLUS_STERILIZED_PETRI_DISH)
                .output(PAD_PETRI_DISH)
                .duration(900)
                .EUt(560)
                .buildAndRegister();

        BIO_REACTOR_RECIPES.recipeBuilder()
                .input(PAD_PETRI_DISH)
                .inputs(metaitem('dustIriditus'))
                .fluidOutputs(fluid('xerizin')*100)
                .duration(120)
                .EUt(80)
                .buildAndRegister();

        TEXTILE_FACTORY_RECIPES.recipeBuilder()
                .input(COTTON)
                .output(COTTON_SHEET)
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        TEXTILE_FACTORY_RECIPES.recipeBuilder()
                .input(COTTON_SHEET)
                .output(CHEESE_CLOTH)
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .notConsumable(CHEESE_CLOTH)
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
                .input(PANCREAS)
                .fluidOutputs(fluid('homogenized_pancreas_mixture')*1000)
                .notConsumable(ULTRASONIC_HOMOGENIZER)
                .duration(120)
                .EUt(800)
                .buildAndRegister();

        MACERATOR_RECIPES.recipeBuilder()
                .input(SOY_BEAN)
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
                .outputs(metaitem('dustPapaicDigestOfSoybeanMeal')* 1)
                .duration(800)
                .EUt(12)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPapaicDigestOfSoybeanMeal')* 1)
                .fluidOutputs(fluid('bean_slurry')*1000)
                .fluidInputs(fluid('water')*1000)
                .outputs(metaitem('dustWood')* 1)
                .duration(800)
                .EUt(160)
                .buildAndRegister();

        BIO_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('bean_slurry')*1000)
                .notConsumable(YEEM_PETRI)
                .duration(200)
                .outputs(metaitem('dustRhizobium')*1)
                .EUt(400)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('yeem_solution')*100)
                .input(PLUS_STERILIZED_PETRI_DISH)
                .output(YEEM_PETRI)
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
                .input(PLUS_STERILIZED_PETRI_DISH)
                .outputs(GROWN_YEAST_CULTURE)
                .duration(120)
                .EUt(800)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .input(GROWN_YEAST_CULTURE)
                .outputs(YEAST_CELLS)
                .fluidOutputs(fluid('waste_water')*12)
                .duration(700)
                .EUt(812)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(YEAST_CELLS)
                .outputs(CONTAMINATED_STERILIZED_PETRI_DISH)
                .fluidOutputs(fluid('yeast_extract')*1000)
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
                .fluidInputs(fluid('distiled_water')*1000)
                .inputs(metaitem('dustYeastExtractMannitolMedium')* 1)
                .fluidOutputs(fluid('yeem_solution')*1000)
                .duration(800)
                .EUt(2000)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sodium_hydroxide_solution')*1000)
                .inputs(metaitem('dustFructose')* 6)
                .notConsumable(fluid('dustSodiumBorohydride')* 1)
                .duration(200)
                .fluidOutputs(fluid('mannitol')*1000)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sodium_hydroxide_solution')*1000)
                .inputs(metaitem('dustGlucose')*6)
                .notConsumable(metaitem('dustSodiumBorohydride')* 1)
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
                .inputs(BARLEY)
                .outputs(metaitem('dustGristPowder')*)
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hot_water')*1000)
                .inputs(metaitem('dustGristPowder')*)
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