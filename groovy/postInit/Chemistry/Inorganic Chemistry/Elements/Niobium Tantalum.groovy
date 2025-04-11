import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;



// Manganese Dust * 1
mods.gregtech.electrolyzer.removeByInput(60, [metaitem('dustTantalite') * 9], null)


        GRAVITY_SEPARATOR_RECIPES.recipeBuilder()
                .inputs(metaitem('dustTantalite'))
                .outputs(metaitem('siftedTantalite'))
                .duration(300)
                .EUt(120)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()   
                .fluidInputs(fluid('distilled_water')*1000)
                .inputs(metaitem('siftedTantalite')*4)
                .fluidOutputs(fluid('impure_tantalite_slurry')*1000)
                .duration(300)
                .EUt(120)
                .buildAndRegister();

        FROTH_FLOTATION_UNIT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('impure_tantalite_slurry')*1000)
                .notConsumable(fluid('oleic_acid')*1000)
                .notConsumable(fluid('methyl_isobutyl_carbonyl')*1000)
                .notConsumable(metaitem('dustSodaAsh')*3)
                .notConsumable(metaitem('dustSodiumSilicate')*3)
                .fluidOutputs(fluid('tantalite_slurry')*1000)
                .duration(300)
                .EUt(120)
                .buildAndRegister();
            
        CLARIFIER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('tantalite_slurry')*1000)
                .outputs(metaitem('dustSiliconDioxide')*2)
                .outputs(metaitem('floatedTantalite')*16)
                .duration(800)
                .EUt(700)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('floatedTantalite')*5)
                .inputs(metaitem('dustSodiumHydroxide')*3)
                .inputs(metaitem('dustBariumPeroxide')*3)
                .outputs(metaitem('dustTantaliteMinorOxideResidue')*4)
                .outputs(metaitem('dustFusedTantalite')*9)
                .fluidOutputs(fluid('water')*1000)
                .duration(400)
                .EUt(800)
                .blastFurnaceTemp(3000)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustTantaliteMinorOxideResidue')*4)
                .outputs(metaitem('dustBariumOxide')*2)
                .chancedOutput(metaitem('dustCubicZirconia')*3, 1000, 75)
                .chancedOutput(metaitem('dustRutile')*3, 1000, 75)
                .chancedOutput(metaitem('dustSiliconDioxide')*3, 1000, 75)
                .duration(400)
                .EUt(800)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sulfuric_acid')*4000)
                .inputs(metaitem('dustFusedTantalite')*9)
                .outputs(metaitem('dustLeachedTantalite')*17)
                .outputs(metaitem('dustSodiumSulfate')*14) //Manganese Sulfate *12
                .duration(320)                 
                .EUt(300)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hydrofluoric_acid')*13000)
                .inputs(metaitem('dustLeachedTantalite')*17)
                .fluidOutputs(fluid('fluorotantalic_acid')*2000)
                .fluidOutputs(fluid('water')*4800)
                .duration(300)
                .EUt(800)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('fluorotantalic_acid')*10000)
                .fluidInputs(fluid('nb_ta_separation_mixture') * 1000)
                .fluidOutputs(fluid('oxypentafluoroniobate') * 1000)
                .fluidOutputs(fluid('heptafluorotantalate') * 9000)
                .duration(250)
                .EUt(540)
                .buildAndRegister();
        
        CHEMICAL_RECIPES.recipeBuilder() //CSTR
                .fluidInputs(fluid('potassium_hydroxide')*2000)
                .fluidInputs(fluid('oxypentafluoroniobate') * 1000)
                .fluidOutputs(fluid('water')*2000)
                .outputs(metaitem('dustPotassiumFluoroniobate')*10)
                .duration(250)
                .EUt(540)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder() //PFR
                .fluidInputs(fluid('water')*9000)
                .inputs(metaitem('dustPotassiumFluoroniobate')*20)
                .fluidOutputs(fluid('potassium_fluoroniobate_solution')*1000)
                .duration(250)
                .EUt(540)
                .buildAndRegister();
        
        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('potassium_fluoroniobate_solution')*1000)
                .fluidOutputs(fluid('hydrofluoric_acid')*14000)
                .fluidOutputs(fluid('potassium_hydroxide')*4000)
                .outputs(metaitem('dustNiobiumOxide')*7)
                .duration(500)
                .EUt(300)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('dustNiobiumOxide')*7)
                .inputs(metaitem('dustCarbon')*5)
                .outputs(metaitem('dustNiobium')*2)
                .fluidOutputs(fluid('carbon_monoxide')*5000)
                .blastFurnaceTemp(4000)
                .duration(500)
                .EUt(700)
                .buildAndRegister();
        
        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('heptafluorotantalate')*1000)
                .fluidInputs(fluid('potassium_hydroxide')*1000)
                .outputs(metaitem('dustPotassiumFluorotantalate')*5)
                .fluidOutputs(fluid('water')*1000)
                .duration(300)
                .EUt(560)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder() //PFR
                .fluidInputs(fluid('water')*9000)
                .inputs(metaitem('dustPotassiumFluorotantalate')*20)
                .fluidOutputs(fluid('potassium_fluorotantalate_solution')*1000)
                .duration(250)
                .EUt(540)
                .buildAndRegister();
        
        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('potassium_fluorotantalate_solution')*1000)
                .fluidOutputs(fluid('hydrofluoric_acid')*14000)
                .fluidOutputs(fluid('potassium_hydroxide')*4000)
                .outputs(metaitem('dustTantalumOxide')*7)
                .duration(500)
                .EUt(300)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('dustTantalumOxide')*7)
                .inputs(metaitem('dustCarbon')*5)
                .outputs(metaitem('dustTantalum')*2)
                .fluidOutputs(fluid('carbon_monoxide')*5000)
                .blastFurnaceTemp(4000)
                .duration(500)
                .EUt(700)
                .buildAndRegister();

        //NB TA SEPARATION MIXTURE

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('methyl_isobutyl_ketone')*1000)
                .fluidInputs(fluid('tributyl_phosphate')*1000)
                .fluidOutputs(fluid('nb_ta_separation_mixture')*2000)
                .duration(250)
                .EUt(400)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('nbutanol')*3000)
                .fluidInputs(fluid('phosphoryl_chloride')*1000)
                .fluidOutputs(fluid('hydrochloric_acid')*3000)
                .fluidOutputs(fluid('tributyl_phosphate')*1000)
                .duration(300)
                .EUt(450)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('phosphorus_trichloride')*1000)
                .fluidInputs(fluid('oxygen')*1000)
                .fluidOutputs(fluid('phosphoryl_chloride')*1000)
                .duration(500)
                .EUt(200)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()       //FBR
                .fluidInputs(fluid('water')*1000)
                .fluidInputs(fluid('mesityl_oxide')*1000)
                .notConsumable(metaitem('dustActivatedCarbon'))
                .fluidOutputs(fluid('methyl_isobutyl_ketone')*1000)
                .fluidOutputs(fluid('carbon_monoxide')*1000)
                .duration(500)
                .EUt(200)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()        //TBR
                .fluidInputs(fluid('acetone')*2000)
                .fluidOutputs(fluid('mesityl_oxide')*1000)
                .fluidOutputs(fluid('water')*1000)
                .notConsumable(metaitem('dustBariumHydroxide'))
                .duration(500)
                .EUt(200)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hydrogen_peroxide')*1000)
                .inputs(metaitem('dustBarium'))
                .outputs(metaitem('dustBariumHydroxide')*5)
                .duration(300)
                .EUt(240)
                .buildAndRegister();
        