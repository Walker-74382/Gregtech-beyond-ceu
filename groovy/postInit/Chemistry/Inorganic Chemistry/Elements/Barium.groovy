import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('dustBarite')*6)
                .inputs(metaitem('dustCarbon')*2)
                .fluidOutputs(fluid('carbon_dioxide')*2000)
                .outputs(metaitem('dustBariumSulfide')*2)
                .duration(300)
                .EUt(80)
                .buildAndRegister();
        
        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustBariumSulfide')*2)
                .fluidInputs(fluid('carbon_dioxide')*1000)
                .fluidInputs(fluid('water')*1000)
                .fluidOutputs(fluid('hydrogen_sulfide')*1000)
                .outputs(metaitem('dustBariumCarbonate')*5)
                .duration(200)
                .EUt(50)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustBariumCarbonate')*5)
                .fluidOutputs(fluid('carbon_dioxide')*1000)
                .outputs(metaitem('dustBariumOxide')*2)
                .circuitMeta(1)
                .duration(200)
                .EUt(50)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('dustBariumOxide')*8)
                .inputs(metaitem('dustAluminium')*2)
                .outputs(metaitem('ingotBarium')*3)
                .outputs(metaitem('dustBariumAluminate')*7)
                .duration(90)
                .blastFurnaceTemp(700)
                .EUt(250)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustBariumAluminate')*7)
                .outputs(metaitem('dustBariumOxide')*2)
                .outputs(metaitem('dustAlumina')*5)
                .duration(90)
                .EUt(250)
                .buildAndRegister();

        //Witherite

        CENTRIFUGE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustWitherite')*5)
                .outputs(metaitem('dustBariumCarbonate')*5)
                .chancedOutput(metaitem('dustBarite')*1, 440, 0)
                .chancedOutput(metaitem('dustGalena')*1, 770, 0)
                .chancedOutput(metaitem('dustCalcite')*1, 100, 0)
                .duration(290)
                .EUt(150)
                .buildAndRegister();