import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


    CHEMICAL_RECIPES.recipeBuilder()
            .inputs(metaitem('dustSulfur')*4)
            .fluidInputs(fluid('methane')*1000)
            .fluidOutputs(fluid('carbon_disulfide')*1000)
            .fluidOutputs(fluid('hydrogen_sulfide')*1000)
            .duration(400)
            .EUt(12)
            .buildAndRegister();

    CHEMICAL_RECIPES.recipeBuilder()    //CSTR
            .fluidInputs(fluid('ammonia')*1000)
            .fluidInputs(fluid('nitric_acid')*1000)
            .fluidOutputs(fluid('ammonium_nitrate')*1000)
            .duration(400)
            .EUt(12)
            .buildAndRegister();

    MIXER_RECIPES.recipeBuilder()
            .fluidInputs(fluid('water')*1000)
            .inputs(metaitem('dustWheat')*3)
            .circuitMeta(3)
            .fluidOutputs(fluid('grain_solution')*1000)
            .duration(400)
            .EUt(12)
            .buildAndRegister();

    BLAST_RECIPES.recipeBuilder()
            .blastFurnaceTemp(1200)
            .EUt(700)
            .duration(200)
            .inputs(metaitem('dustCalciumCarbide')*3)
            .outputs(metaitem('dustCalciumHydroxide')*5)
            .fluidInputs(fluid('steam')*2000)
            .fluidOutputs(fluid('acetylene')*1000)
            .buildAndRegister();

// Calcium Dust * 1
mods.gregtech.electrolyzer.removeByInput(30, [metaitem('dustCalciumChloride') * 3], null)

        ELECTROLYZER_RECIPES.recipeBuilder()
                .notConsumable(metaitem('stickIron'))
                .notConsumable(metaitem('stickGold'))
                .inputs(metaitem('dustCalciumChloride')*3)
                .fluidOutputs(fluid('chlorine')*2000)
                .outputs(metaitem('dustCalcium'))
                .EUt(40)
                .duration(200)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .notConsumable(metaitem('stickIron'))
                .notConsumable(metaitem('stickGold'))
                .inputs(metaitem('dustZincChloride')*3)
                .fluidOutputs(fluid('chlorine')*2000)
                .outputs(metaitem('dustZinc'))
                .EUt(40)
                .duration(200)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('nitrobenzene')*1000)
                .fluidInputs(fluid('hydrogen')*3000)
                .fluidOutputs(fluid('water')*2000)
                .fluidOutputs(fluid('aniline')*1000)
                .EUt(300)
                .duration(100)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('acetylene')*1000)
                .fluidInputs(fluid('formaldehyde')*1000)
                .notConsumable(metaitem('dustCopper'))
                .fluidOutputs(fluid('propargyl_alcohol')*1000)
                .EUt(300)
                .duration(100)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()    //CSTR
                .fluidInputs(fluid('dichloromethane')*1000)
                .fluidInputs(fluid('propargyl_alcohol')*1000)
                .fluidInputs(fluid('thionyl_chloride')*1000)
                .fluidOutputs(fluid('propargyl_chloride_solution')*1000)
                .EUt(250)
                .duration(200)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('propargyl_chloride_solution')*1000)
                .fluidOutputs(fluid('propargylchloride')*1000)
                .fluidOutputs(fluid('sulfur_dioxide')*1000)
                .fluidOutputs(fluid('hydrochloric_acid')*1000)
                .EUt(250)
                .duration(200)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ethylene')*1000)
                .fluidInputs(fluid('oxygen')*1000)
                .notConsumable(metaitem('dustGold'))
                .fluidOutputs(fluid('ethylene_oxide')*1000)
                .EUt(20)
                .duration(240)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('chloromethane')*1000)
                .inputs(metaitem('dustWood'))
                .inputs(metaitem('dustSodiumHydroxide'))
                .fluidOutputs(fluid('methylcellulose')*1000)
                .outputs(metaitem('dustSalt'))
                .fluidOutputs(fluid('water')*1000)
                .EUt(110)
                .duration(300)
                .buildAndRegister();
        
        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('chlorine')*1000)
                .inputs(metaitem('dustIron'))
                .fluidOutputs(fluid('iron_chloride')*1000)
                .EUt(110)
                .duration(300)
                .buildAndRegister();

        //Trimethyl Tin Chloride

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hydrobromic_acid')*1000)
                .fluidInputs(fluid('methanol')*1000)
                .fluidOutputs(fluid('methyl_bromide')*1000)
                .duration(300)
                .EUt(40)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('methyl_bromide')*1000)
                .notConsumable(metaitem('dustIodine')*2)
                .notConsumable(fluid('dry_diethyl_ether')*1000)
                .inputs(metaitem('dustMagnesium'))
                .notConsumable(fluid('nitrogen')*2000)
                .notConsumable(metaitem('fume_hood'))
                .fluidOutputs(fluid('methylmagnesium_bromide')*1000)
                .duration(300)
                .EUt(40)
                .buildAndRegister();

        FRACTIONAL_DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('diethyl_ether')*1000)
                .notConsumable(fluid('difluorobenzophenone')*1000)
                .fluidOutputs(fluid('dry_diethyl_ether')*1000)
                .duration(300)
                .EUt(240)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('chlorine')*4000)
                .inputs(metaitem('dustTin'))
                .outputs(metaitem('dustTinChloride'))
                .duration(300)
                .EUt(380)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustTinChloride'))
                .fluidInputs(fluid('methylmagnesium_bromide')*1000)
                .fluidOutputs(fluid('trimethyl_tin_chloride') * 1000)
                .outputs(metaitem('dustMagnesiumChloride')*3)
                .duration(150)
                .EUt(480)
                .buildAndRegister();

        //Chichibabin Synthesis

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('formaldehyde')*1000)
                .fluidInputs(fluid('ammonia')*1000)
                .fluidInputs(fluid('gtfo_acetaldehyde')*1000)
                .fluidOutputs(fluid('pyridine')*1000)
                .fluidOutputs(fluid('water')*1000)
                .duration(150)
                .EUt(480)
                .buildAndRegister();

        //Dichloromethane

        UV_LIGHT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('methane')*1000)
                .fluidInputs(fluid('chlorine')*2000)
                .fluidOutputs(fluid('hydrogen_chloride')*1000)
                .fluidOutputs(fluid('dichloromethane')*1000)
                .duration(100)
                .EUt(250)
                .buildAndRegister();

        //Diluted Acetone

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('distilled_water')*1000)
                .fluidInputs(fluid('acetone')*1000)
                .fluidOutputs(fluid('diluted_acetone')*1000)
                .duration(100)
                .EUt(40)
                .buildAndRegister();

        //Phosphorus Oxychloride

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('oxygen')*2000)
                .fluidInputs(fluid('phosphoric_acid')*1000)
                .fluidInputs(fluid('phosphorus_oxychloride')*1000)
                .duration(200)
                .EUt(40)
                .buildAndRegister();

        //Barium Peroxide

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(fluid('oxygen')*2000)
                .inputs(metaitem('dustBariumOxide')*4)
                .outputs(metaitem('dustBariumPeroxide')*6)
                .duration(200)
                .EUt(40)
                .blastFurnaceTemp(2300)
                .buildAndRegister();

        //Boron Oxide

        ELECTROLYZER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustBoronOxide')*2)
                .notConsumable(metaitem('stickIron'))
                .notConsumable(metaitem('stickPlatinum'))
                .fluidOutputs(fluid('oxygen')*1000)
                .outputs(metaitem('dustBoron'))
                .duration(200)
                .EUt(40)
                .buildAndRegister();
