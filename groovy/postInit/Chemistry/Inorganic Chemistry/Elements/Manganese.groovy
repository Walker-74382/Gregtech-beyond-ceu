import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


    BLAST_RECIPES.recipeBuilder()
            .inputs(metaitem('dustTinySugar'))
            .fluidInputs(fluid('sulfuric_acid')*1000)
            .inputs(metaitem('dustPyrolusite')*3)
            .outputs(metaitem('dustManganeseSulfate')*6)
            .fluidOutputs(fluid('carbon_dioxide')*111)
            .blastFurnaceTemp(1500)
            .EUt(120)
            .duration(300)
            .buildAndRegister();

// Manganese Dust * 1
mods.gregtech.electrolyzer.removeByInput(30, [metaitem('dustPyrolusite') * 3], null)

    BLAST_RECIPES.recipeBuilder()
            .inputs(metaitem('dustTinySugar'))
            .fluidInputs(fluid('sulfuric_acid')*1000)
            .inputs(metaitem('dustRhodocrosite')*5)
            .outputs(metaitem('dustManganeseSulfate')*6)
            .fluidOutputs(fluid('carbon_dioxide')*111)
            .blastFurnaceTemp(1500)
            .EUt(120)
            .duration(300)
            .buildAndRegister();

// Aluminium Dust * 2
mods.gregtech.electrolyzer.removeByInput(60, [metaitem('dustSpessartine') * 20], null)

