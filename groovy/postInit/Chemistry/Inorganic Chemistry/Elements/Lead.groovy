import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


        EXTRACTOR_RECIPES.recipeBuilder()
                .inputs(metaitem('dustGalena'))
                .fluidOutputs(fluid('molten_galena')*144)
                .duration(200)
                .EUt(8)
                .buildAndRegister()

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('molten_galena')*144)
                .fluidInputs(fluid('oxygen')*1000)
                .fluidOutputs(fluid('molten_oxidized_galena')*144)
                .duration(208)
                .EUt(70)
                .buildAndRegister()

        ROASTER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('molten_oxidized_galena')*144)
                .fluidOutputs(fluid('sulfur_dioxide')*1000)
                .fluidOutputs(fluid('desulfurized_molten_galena')*144)
                .duration(200)
                .EUt(90)
                .buildAndRegister()

        HIGH_TEMP_DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('desulfurized_molten_galena')*144)
                .fluidOutputs(fluid('lead')*144)
                .fluidOutputs(fluid('silver')*14)
                .duration(200)
                .EUt(70)
                .buildAndRegister()

// Lead Dust * 1
mods.gregtech.electrolyzer.removeByInput(30, [metaitem('dustGalena') * 2], null)


                //Lead Chloride
                

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('dustLeadChloride')*3)
                .inputs(metaitem('dustIron'))
                .fluidOutputs(fluid('iron_2_chloride')*1000)
                .outputs(metaitem('dustLead'))
                .duration(250)
                .EUt(20)
                .buildAndRegister()