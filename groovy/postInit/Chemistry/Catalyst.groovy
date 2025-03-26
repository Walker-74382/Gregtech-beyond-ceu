import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


        ASSEMBLER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('polystyrene')*144)
                .inputs(metaitem('wireFineGold'))
                .inputs(metaitem('dustGlucose'))
                .outputs(metaitem('boron_retaining_yarn'))
                .duration(120)
                .EUt(80)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustLithiumTitanate')* 2)
                .inputs(metaitem('platePolyetheretherketone'))
                .inputs(metaitem('dustPolystyreneNanoParticles')* 2)
                .outputs(metaitem('lithium_foam_base'))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sulfuric_acid')*1000)
                .fluidInputs(fluid('tetrapropylammoniumbromide')*1000)
                .inputs(metaitem('dustSodiumHydroxide')*1)
                .inputs(metaitem('dustSiliconDioxide')*6)
                .inputs(metaitem('dustAluminiumSulfite')*51)
                .outputs(metaitem('dustZsm5')*1)
                .duration(800)
                .EUt(70)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('propene')*1000)
                .fluidInputs(fluid('bromine')*1000)
                .fluidInputs(fluid('tripropylamine')*1000)
                .fluidOutputs(fluid('tetrapropylammoniumbromide')*1000)
                .duration(90)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('npropanol')*1500)
                .fluidInputs(fluid('ammonia')*500)
                .fluidOutputs(fluid('water')*1500)
                .fluidOutputs(fluid('tripropylamine')*500)
                .duration(80)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPyrolusite')*3)
                .fluidInputs(fluid('oxygen')*1000)
                .fluidInputs(fluid('potassium_hydroxide')*2000)
                .fluidOutputs(fluid('water')*1000)
                .outputs(metaitem('dustPotassiumManganate')*7)
                .duration(80)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSodiumHydroxide')*3)
                .fluidInputs(fluid('carbon_sulfide')*1000)
                .fluidInputs(fluid('isobutyl_alcohol')*1000)
                .outputs(metaitem('dustSodiumIsobutylXanthate'))
                .duration(120)
                .EUt(780)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('dustCarbon'))
                .inputs(metaitem('dustSulfur')*2)
                .fluidOutputs(fluid('carbon_sulfide')*1000)
                .chancedOutput(metaitem('dustAsh')*1, 1111, 0)
                .duration(1200)
                .blastFurnaceTemp(1290)
                .EUt(660)
                .buildAndRegister();

        // Philips Catalyst

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSiliconDioxide')*3)
                .inputs(metaitem('dustChromiumTrioxide')*4)
                .outputs(metaitem('dustPhilipsCatalyst')*7)
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        // Ziegler Natta Catalyst

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('titanium_tetrachloride')*1000)
                .fluidInputs(fluid('triethylaluminium')*1000)
                .outputs(metaitem('dustZieglerNattaCatalyst')*2)
                .duration(120)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ethylene')*3000)
                .inputs(metaitem('dustAluminium'))
                .fluidOutputs(fluid('triethylaluminium')*1000)
                .duration(120)
                .EUt(90)
                .buildAndRegister();

        // Kaminsky Catalyst

        CHEMICAL_RECIPES.recipeBuilder()
                .notConsumable(fluid('toluene')*1000)
                .inputs(metaitem('dustMethylAluminoxane'))
                .inputs(metaitem('dustRecrystallizedZirconiumDioxide')*6)
                .outputs(metaitem('dustKaminskyCatalyst'))
                .duration(200)
                .EUt(900)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('methane')*1000)
                .fluidOutputs(fluid('trimethylaluminium')*1000)
                .inputs(metaitem('dustAluminium'))
                .EUt(120)
                .duration(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('water')*1000)
                .fluidInputs(fluid('trimethylaluminium')*1000)
                .fluidOutputs(fluid('methane')*2000)
                .outputs(metaitem('dustMethylAluminoxane'))
                .EUt(120)
                .duration(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('chlorine')*1000)
                .inputs(metaitem('dustZirconium'))
                .fluidOutputs(fluid('zirconium_chlorine')*1000)
                .duration(120)
                .EUt(800)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('zirconium_chlorine')*1000)
                .fluidInputs(fluid('water')*1000)
                .fluidOutputs(fluid('zirconium_dioxide_solution')*1000)
                .fluidOutputs(fluid('hydrogen_chloride')*1000)
                .duration(200)
                .EUt(600)
                .buildAndRegister();

        CRYSTALLIZATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('zirconium_dioxide_solution')*1000)
                .outputs(metaitem('dustRecrystallizedZirconiumDioxide')*2)
                .duration(500)
                .EUt(670)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('plateFullerenePolymerTetrix')*6)
                .inputs(metaitem('frameFullerenePolymerMatrix'))
                .circuitMeta(6)
                .outputs(item('gtb:gtb_multiblock_casing', 11))
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('nomex')*1000)
                .inputs(metaitem('gemChromaticGlass'))
                .inputs(metaitem('stickStainlessSteel')*2)
                .inputs(metaitem('foilPolytetrafluoroethylene')*4)
                .outputs(metaitem('chromatic_glass_fiber'))
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('soldering_alloy')*144)
                .outputs(metaitem('ultrasonic_homogenizer'))
                .inputs(metaitem('stickRhodiumPlatedPalladium'))
                .inputs(metaitem('piezoelectric_crystal'))
                .duration(1000)
                .EUt(1700)
                .buildAndRegister();
        
        ASSEMBLER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('soldering_alloy')*1296)
                .inputs(metaitem('gemExquisiteNetherQuartz'))
                .inputs(metaitem('wireFineGold')* 4)
                .outputs(metaitem('piezoelectric_crystal'))
                .duration(1000)
                .EUt(1700)
                .buildAndRegister();
        
        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('platePolybenzimidazole'))
                .inputs(metaitem('electric.motor.hv'))
                .inputs(ore('dyeOrange'))
                .inputs(metaitem('stickSteel')* 4)
                .outputs(metaitem('rotarry_spinning_whisker'))
                .duration(2000)
                .EUt(700)
                .buildAndRegister();