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


    