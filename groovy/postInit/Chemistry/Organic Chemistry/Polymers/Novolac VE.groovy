import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


    CHEMICAL_RECIPES.recipeBuilder()
            .fluidInputs(fluid('phenol')*1000)
            .fluidInputs(fluid('formaldehyde')*1000)
            .fluidOutputs(fluid('phenol_formaldehyde_precursor')*1000)
            .fluidOutputs(fluid('water')*2000)
            .duration(400)
            .EUt(80)
            .buildAndRegister()

    POLYMERIZATION_TANK_RECIPES.recipeBuilder()
            .fluidInputs(fluid('phenol_formaldehyde_precursor')*1000)
            .fluidOutputs(fluid('phenol_formaldehyde_oligomer')*1000)
            .notConsumable(fluid('p_toluenesulfonic_acid')*200)
            .duration(600)
            .EUt(180)
            .buildAndRegister()

    CHEMICAL_RECIPES.recipeBuilder()
            .fluidInputs(fluid('phenol_formaldehyde_oligomer')*1000)
            .fluidInputs(fluid('epichlorohydrin')*1000)
            .inputs(metaitem('dustSodiumHydroxide')*3)
            .fluidOutputs(fluid('novolac_epoxy_resin')*1000)
            .duration(300)
            .EUt(380)
            .buildAndRegister()

    CHEMICAL_RECIPES.recipeBuilder()
            .fluidInputs(fluid('novolac_epoxy_resin')*1000)
            .fluidInputs(fluid('methacrylic_acid')*1000)
            .fluidOutputs(fluid('novolac_vinyl_ester_solution')*1000)
            .duration(200)
            .fluidInputs(fluid('triphenylphosphine')*500)
            .EUt(260)
            .buildAndRegister()

    DISTILLATION_RECIPES.recipeBuilder()
            .fluidInputs(fluid('novolac_vinyl_ester_solution')*1000)
            .fluidOutputs(fluid('triphenylphosphine')*500)
            .fluidOutputs(fluid('novolac_vinyl_ester')*1000)
            .fluidOutputs(fluid('water')*1000)
            .duration(700)
            .EUt(120)
            .buildAndRegister()

    MIXER_RECIPES.recipeBuilder()
            .fluidInputs(fluid('novolac_vinyl_ester')*1000)
            .fluidInputs(fluid('epoxy')*1000)
            .fluidOutputs(fluid('novolac_epoxy_vinyl_ester')*1000)
            .duration(400)
            .EUt(130)
            .buildAndRegister()

        //Methacrylic Acid


    CHEMICAL_RECIPES.recipeBuilder()
            .fluidInputs(fluid('gtfo_hydrogen_cyanide')*1000)
            .fluidInputs(fluid('acetone')*1000)
            .fluidOutputs(fluid('acetone_cyanohydrin')*1000)
            .duration(400)
            .EUt(130)
            .buildAndRegister()

    CHEMICAL_RECIPES.recipeBuilder()
            .fluidInputs(fluid('acetone_cyanohydrin')*1000)
            .fluidInputs(fluid('sulfuric_acid')*1000)
            .fluidOutputs(fluid('methacrylamide_sulfate')*1000)
            .duration(600)
            .EUt(130)
            .buildAndRegister()

    CHEMICAL_RECIPES.recipeBuilder()
            .fluidInputs(fluid('methacrylamide_sulfate')*1000)
            .fluidInputs(fluid('methanol')*1000)
            .fluidOutputs(fluid('methyl_methacrylate')*1000)
            .fluidOutputs(fluid('ammonium_bisulfate')*1000)
            .duration(500)
            .EUt(130)
            .buildAndRegister()

    CHEMICAL_RECIPES.recipeBuilder()
            .fluidOutputs(fluid('methacrylic_acid')*1000)
            .fluidOutputs(fluid('methanol')*1000)
            .fluidInputs(fluid('methyl_methacrylate')*1000)
            .fluidInputs(fluid('water')*1000)
            .duration(500)
            .EUt(130)
            .buildAndRegister()

    CHEMICAL_RECIPES.recipeBuilder() //CSTR
            .fluidInputs(fluid('chlorosulfonic_acid')*1000)
            .fluidOutputs(fluid('hydrochloric_acid')*1000)
            .fluidOutputs(fluid('water')*1000)
            .fluidOutputs(fluid('p_toluenesulfonic_acid')*1000)
            .fluidInputs(fluid('sulfuric_acid')*1000)
            .fluidInputs(fluid('toluene')*1000)
            .duration(200)
            .EUt(800)
            .buildAndRegister() 