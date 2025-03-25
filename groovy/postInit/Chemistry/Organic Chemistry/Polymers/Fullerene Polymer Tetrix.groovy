import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

        CHEMICAL_PLANT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ferrocene')*1000)
                .fluidInputs(fluid('fluorohydride_ammonium_carbama')*1000)
                .fluidInputs(fluid('dichloromethane')*1000)
                .fluidInputs(fluid('phenylpentanoicacid')*1000)
                .fluidOutputs(fluid('pcbb')*1000)
                .inputs(metaitem('dustFullerene')*1)
                .inputs(metaitem('dustRhodiumIiAcetate')*1)
                .notConsumable(metaitem('platePlatinum'))
                .duration(700)
                .EUt(800)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('methane')*1000)
                .fluidInputs(fluid('hydrofluoric_acid')*1000)
                .fluidOutputs(fluid('hydrofluoric_methane')*1000)
                .duration(120)
                .EUt(900)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hydrofluoric_methane')*1000)
                .fluidInputs(fluid('nitric_oxide')*1000)
                .fluidOutputs(fluid('carbon_dioxide')*1000)
                .fluidOutputs(fluid('fluorohydride_ammonium_carbama')*1000)
                .fluidOutputs(fluid('water')*2000)
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(fluid('chlorine')*3000)
                .inputs(metaitem('dustRhodium')*2)
                .outputs(metaitem('dustRhodiumIiiChloride')*2)
                .blastFurnaceTemp(1900)
                .EUt(700)
                .duration(102)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(fluid('acetic_acid')*1000)
                .outputs(metaitem('dustRhodiumIiAcetate'))
                .inputs(metaitem('dustRhodiumIiiChloride'))
                .blastFurnaceTemp(2700)
                .duration(1200)
                .EUt(700)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('pcbb')*1000)
                .inputs(metaitem('dustPalladiumFullereneMatrix'))
                .outputs(metaitem('dustFullerenePolymerTetrix'))
                .duration(120)
                .EUt(800)
                .buildAndRegister();