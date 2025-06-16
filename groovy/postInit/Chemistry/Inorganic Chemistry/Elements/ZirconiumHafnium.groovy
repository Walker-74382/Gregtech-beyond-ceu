import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


        GRAVITY_SEPARATOR_RECIPES.recipeBuilder()
                .inputs(metaitem('dustZircon'))
                .outputs(metaitem('siftedZircon'))
                .duration(200)
                .EUt(60)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('distilled_water')*1000)
                .inputs(metaitem('siftedZircon')*4)
                .fluidOutputs(fluid('impure_zircon_slurry')*1000)
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        FROTH_FLOTATION_UNIT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('impure_zircon_slurry')*1000)
                .notConsumable(metaitem('dustIronIiiChloride')* 2)
                .notConsumable(metaitem('dustSodiumSulfate')*2)
                .fluidInputs(fluid('soda_ash_solution')*1000)
                .notConsumable(metaitem('dustSodiumEthylXanthate')*3)
                .fluidOutputs(fluid('zircon_slurry')*1000)
                .duration(200)
                .EUt(90)
                .buildAndRegister();

        CLARIFIER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('zircon_slurry')*1000)
                .fluidOutputs(fluid('waste_water')*1000)
                .outputs(metaitem('floatedZircon')* 16)
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        ARC_FURNACE_RECIPES.recipeBuilder()
                .inputs(metaitem('floatedZircon')* 1)
                .outputs(metaitem('dustFusedZircon')* 3)
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hydrochloric_acid')*1000)
                .inputs(metaitem('dustFusedZircon'))
                .fluidOutputs(fluid('zirconyl_chloride_solution')*1000)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('zirconyl_chloride_solution')*1000)
                .fluidInputs(fluid('hafnium_extraction_mixture')*1000)
                .fluidOutputs(fluid('purified_zirconyl_chloride_solution')*1000)
                .fluidOutputs(fluid('hafnium_extract')*1000)
                .duration(200)
                .EUt(90)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sulfuric_acid')*200)
                .fluidInputs(fluid('hafnium_extract')*1000)
                .fluidOutputs(fluid('hafnium_sulfate_solution')*200)
                .fluidOutputs(fluid('hafnium_extraction_mixture')*1000)
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hafnium_sulfate_solution')*1000)
                .fluidOutputs(fluid('sulfur_trioxide')*1000)
                .outputs(metaitem('dustHafniumDioxide')* 2)
                .duration(200)
                .blastFurnaceTemp(1900)
                .EUt(1200)
                .buildAndRegister();

        BURNER_REACTOR_RECIPES.recipeBuilder()
                .inputs(metaitem('dustHafniumDioxide')* 2)
                .outputs(metaitem('dustHafnium'))
                .fluidOutputs(fluid('oxygen')*1000)
                .duration(400)
                .EUt(70)
                .buildAndRegister();

        CHEMICAL_PLANT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('distilled_water')*1000)
                .fluidInputs(fluid('sulfuric_acid')*1000)
                .fluidInputs(fluid('purified_zirconyl_chloride_solution')*1000)
                .fluidOutputs(fluid('hydrochloric_acid')*1000)
                .outputs(metaitem('dustZirconiumBase')* 2)
                .duration(450)
                .EUt(900)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustZirconiumBase')* 12)
                .fluidInputs(fluid('hydrochloric_acid')*4000)
                .outputs(metaitem('dustZirconiumOxide')* 5)
                .duration(60)
                .EUt(70)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustZirconiumOxide')* 2)
                .outputs(metaitem('dustZirconium')* 1)
                .fluidOutputs(fluid('oxygen')*1000)
                .duration(100)
                .EUt(80)
                .buildAndRegister();

// Hafnium Dust * 1
mods.gregtech.electrolyzer.removeByInput(80, [metaitem('dustHafniumOxide') * 2], null)


        //Extraction Mixture

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('tridecane')*1000)
                .fluidInputs(fluid('oxygen')*1000)
                .fluidOutputs(fluid('tridecanoic_acid')*1000)
                .duration(120)
                .EUt(50)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('tridecanoic_acid')*1000)
                .fluidInputs(fluid('hydrogen')*2000)
                .notConsumable(metaitem('dustNickel'))
                .fluidOutputs(fluid('tridecanol')*1000)
                .fluidOutputs(fluid('water')*1000)
                .duration(400)
                .EUt(20)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('tridecanol')*1000)
                .fluidInputs(fluid('hydrobromic_acid')*1000)
                .fluidOutputs(fluid('bromotridecane')*100)
                .fluidOutputs(fluid('water')*1000)
                .duration(120)
                .EUt(50)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('bromotridecane')*3000)
                .fluidInputs(fluid('toluene')*1000)
                .fluidInputs(fluid('phosphorus_trichloride')*1000)
                .inputs(metaitem('dustSodiumHydroxide')*3)
                .fluidOutputs(fluid('tridecylphosphine_solution')*1000)
                .duration(320)
                .EUt(250)
                .buildAndRegister();
        
        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('tridecylphosphine_solution')*1000)
                .outputs(metaitem('dustSodiumHydroxide')*3)
                .fluidOutputs(fluid('toluene')*1000)
                .fluidOutputs(fluid('tridecylphosphine')*1000)
                .duration(120)
                .EUt(140)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder() //CSTR
                .fluidInputs(fluid('tridecylphosphine')*1000)
                .fluidInputs(fluid('oxygen')*1000)
                .fluidOutputs(fluid('tridecylphosphine_oxide')*1000)
                .duration(160)
                .EUt(150)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hydrobromic_acid')*1000)
                .fluidInputs(fluid('octanol')*1000)
                .fluidOutputs(fluid('bromooctane')*1000)
                .fluidOutputs(fluid('water')*1000)
                .duration(160)
                .EUt(150)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('bromooctane')*3000)
                .fluidInputs(fluid('toluene')*1000)
                .fluidInputs(fluid('phosphorus_trichloride')*1000)
                .inputs(metaitem('dustSodiumHydroxide')*3)
                .fluidOutputs(fluid('trioctylphosphine_solution')*1000)
                .duration(320)
                .EUt(250)
                .buildAndRegister();
        
        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('trioctylphosphine_solution')*1000)
                .outputs(metaitem('dustSodiumHydroxide')*3)
                .fluidOutputs(fluid('toluene')*1000)
                .fluidOutputs(fluid('trioctylphosphine')*1000)
                .duration(120)
                .EUt(140)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder() //CSTR
                .fluidInputs(fluid('trioctylphosphine')*1000)
                .fluidInputs(fluid('oxygen')*1000)
                .fluidOutputs(fluid('trioctylphosphine_oxide')*1000)
                .duration(160)
                .EUt(150)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('trioctylphosphine_oxide')*1000)
                .fluidInputs(fluid('tridecylphosphine_oxide')*1000)
                .fluidOutputs(fluid('cyanex_923')*2000)
                .duration(260)
                .EUt(150)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('trioctylamine')*1000)
                .fluidInputs(fluid('bromotridecane')*1000)
                .fluidOutputs(fluid('alamine_336')*2000)
                .duration(260)
                .EUt(150)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('cyanex_923')*1000)
                .fluidInputs(fluid('alamine_336')*1000)
                .fluidOutputs(fluid('zirconium_hafnium_extraction_mixture')*2000)
                .duration(260)
                .EUt(150)
                .buildAndRegister();

        //Zirkelite

        GRAVITY_SEPARATOR_RECIPES.recipeBuilder()
                .inputs(metaitem('dustZirkelite'))
                .outputs(metaitem('siftedZirkelite'))
                .duration(200)
                .EUt(180)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .inputs(metaitem('siftedZirkelite')*6)
                .fluidInputs(fluid('water')*1000)
                .fluidOutputs(fluid('impure_zirkelite_slurry')*1000)
                .duration(200)
                .EUt(180)
                .buildAndRegister();

        FROTH_FLOTATION_UNIT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('impure_zirkelite_slurry')*1000)
                .inputs(metaitem('dustCalciumHydroxide')*3)
                .notConsumable(metaitem('dustSodiumEthylXanthate'))
                .notConsumable(fluid('methyl_isobutyl_carbonyl'))
                .fluidOutputs(fluid('zirkelite_slurry')*1000)
                .duration(300)
                .EUt(180)
                .buildAndRegister();

        CLARIFIER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('zirkelite_slurry')*1000)
                .outputs(metaitem('dustCalciumHydroxide')*3)
                .fluidOutputs(fluid('waste_water')*1000)
                .outputs(metaitem('floatedZirkelite')*8)
                .duration(300)
                .EUt(180)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hydrofluoric_acid')*68000)
                .inputs(metaitem('floatedZirkelite')*58)
                .outputs(metaitem('dustFluorite')*6)
                .outputs(metaitem('dustZirconiumHafniumFluorides')*35)
                .outputs(metaitem('dustThoriumFluoride')*10)
                .outputs(metaitem('dustCeriumFluoride')*5)
                .duration(800)
                .EUt(480)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('distilled_water')*1000)
                .inputs(metaitem('dustZirconiumHafniumFluorides')*5)
                .fluidOutputs(fluid('zirconium_hafnium_fluoride_solution')*1000)
                .duration(800)
                .EUt(480)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('zirconium_hafnium_fluoride_solution')*1000)
                .fluidInputs(fluid('zirconium_hafnium_extraction_mixture')*2000)
                .fluidOutputs(fluid('zirconium_hafnium_fluoride_extract')*1000)
                .duration(800)
                .EUt(480)
                .buildAndRegister();

        FRACTIONAL_DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('zirconium_hafnium_fluoride_extract')*1000)
                .fluidOutputs(fluid('zirconium_fluoride_solution')*1000)
                .fluidOutputs(fluid('hafnium_fluoride_solution')*1000)
                .duration(800)
                .EUt(480)
                .buildAndRegister();

        ION_EXCHANGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hafnium_fluoride_solution')*1000)
                .notConsumable(metaitem('dowex_50_exchange_beads'))
                .fluidOutputs(fluid('hafnium_fluoride_extract')*1000)
                .duration(800)
                .EUt(480)
                .buildAndRegister();

        ION_EXCHANGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('zirconium_fluoride_solution')*1000)
                .notConsumable(metaitem('dowex_50_exchange_beads'))
                .fluidOutputs(fluid('zirconium_fluoride_extract')*1000)
                .duration(800)
                .EUt(480)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('zirconium_fluoride_extract')*1000)
                .fluidOutputs(fluid('zirconium_fluoride')*1000)
                .fluidOutputs(fluid('zirconium_hafnium_extraction_mixture')*1000)
                .duration(500)
                .EUt(350)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hafnium_fluoride_extract')*1000)
                .fluidOutputs(fluid('hafnium_fluoride')*1000)
                .fluidOutputs(fluid('zirconium_hafnium_extraction_mixture')*1000)
                .duration(500)
                .EUt(350)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hafnium_fluoride')*1000)
                .inputs(metaitem('dustMagnesium')*2)
                .outputs(metaitem('dustMagnesiumChloride')*4)
                .outputs(metaitem('dustHafnium'))
                .duration(200)
                .EUt(330)
                .blastFurnaceTemp(1500)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(fluid('zirconium_fluoride')*1000)
                .inputs(metaitem('dustMagnesium')*2)
                .outputs(metaitem('dustMagnesiumChloride')*4)
                .outputs(metaitem('dustZirconium'))
                .duration(200)
                .EUt(330)
                .blastFurnaceTemp(1500)
                .buildAndRegister();