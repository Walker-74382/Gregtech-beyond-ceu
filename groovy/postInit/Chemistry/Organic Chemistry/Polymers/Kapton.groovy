import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('para_xylene')*1000)
                .fluidInputs(fluid('chloromethane')*2000)
                .outputs(metaitem('dustDurene')*24)
                .fluidOutputs(fluid('hydrochloric_acid')*2000)
                .duration(120)
                .EUt(100)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustDurene')*4)
                .fluidInputs(fluid('oxygen')*2000)
                .outputs(metaitem('dustPyromelliticDianhydride')*3)
                .fluidOutputs(fluid('water')*1000)
                .duration(30)
                .EUt(470)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('nitrobenzene')*1000)
                .fluidInputs(fluid('hydrogen')*4000)
                .circuitMeta(1)
                .fluidOutputs(fluid('aminophenol')*1000)
                .fluidOutputs(fluid('water')*1000)
                .duration(300)
                .EUt(32)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .notConsumable(metaitem('dustTin'))
                .fluidInputs(fluid('aniline')*2000)
                .fluidInputs(fluid('phenol')*1000)
                .notConsumable(fluid('hydrochloric_acid')*1000)
                .outputs(metaitem('dustOxydianiline')*27)
                .fluidOutputs(fluid('methane')*2000)
                .duration(100)
                .EUt(12000)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .notConsumable(metaitem('dustSaltpeter'))
                .fluidInputs(fluid('aminophenol')*1000)
                .fluidInputs(fluid('nitrochlorobenzene')*1000)
                .fluidInputs(fluid('water')*1000)
                .notConsumable(fluid('dimethylformamide')*2000)
                .outputs(metaitem('dustOxydianiline')*27)
                .fluidOutputs(fluid('oxygen')*3000)
                .fluidOutputs(fluid('hydrochloric_acid')*1000)
                .duration(200)
                .EUt(32)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPhthalicAnhydride')*13)
                .notConsumable(metaitem('dustPalladium'))
                .outputs(metaitem('dustBiphenylTetracarboxylicAcidDianhydride')*28)
                .fluidOutputs(fluid('hydrogen')*2000)
                .duration(200)
                .EUt(470)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('nitrochlorobenzene')*1000)
                .fluidInputs(fluid('ammonia')*2000)
                .fluidOutputs(fluid('nitroaniline')*1000)
                .outputs(metaitem('dustAmmoniumChloride')*2)
                .duration(100)
                .EUt(470)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('nitroaniline')*1000)
                .fluidInputs(fluid('hydrogen')*6000)
                .outputs(metaitem('dustParaPhenylenediamine')*16)
                .fluidOutputs(fluid('water')*2000)
                .duration(200)
                .EUt(2000)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPyromelliticDianhydride')*2)
                .inputs(metaitem('dustOxydianiline')*3)
                .fluidOutputs(fluid('kapton_k')*1000)
                .duration(30)
                .EUt(2000)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustBiphenylTetracarboxylicAcidDianhydride')*2)
                .inputs(metaitem('dustParaPhenylenediamine'))
                .fluidInputs(fluid('kapton_k')*1000)
                .fluidOutputs(fluid('kapton_e')*1000)
                .duration(30)
                .EUt(12000)
                .buildAndRegister();