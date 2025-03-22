import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('para_xylene')*1000)
                .fluidInputs(fluid('chlorine')*6000)
                .fluidOutputs(fluid('bistrichloromethylbenzene')*1000)
                .fluidOutputs(fluid('hydrogen')*6000)
                .duration(200)
                .EUt(1200)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('bromine')*4000)
                .fluidInputs(fluid('acetylene')*1000)
                .fluidOutputs(fluid('tetrabromoethane')*1000)
                .duration(80)
                .EUt(28)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder() // TODO corrosion proof reactor
                .notConsumable(metaitem('foilTitanium')* 10)
                .notConsumable(metaitem('dustManganese'))
                .notConsumable(metaitem('dustCobalt'))
                .notConsumable(fluid('acetone'))
                .fluidInputs(fluid('para_xylene')*1000)
                .fluidInputs(fluid('tetrabromoethane')*50)
                .fluidInputs(fluid('air')*12000) // TODO compressed air
                .outputs(metaitem('dustTerephthalicAcid')* 3)
                .fluidOutputs(fluid('water')*2000)
                .duration(240)
                .EUt(124230)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('terephthalic_acid')* 3)
                .fluidInputs(fluid('bistrichloromethylbenzene')*1000)
                .outputs(metaitem('dustTerephthaloylChloride')* 6)
                .fluidOutputs(fluid('hydrochloric_acid')*2000)
                .duration(100)
                .EUt(240)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('butene')*1000)
                .fluidInputs(fluid('hypochlorous_acid')*1000)
                .fluidInputs(fluid('water')*1000)
                .fluidOutputs(fluid('butanediol')*1000)
                .fluidOutputs(fluid('hydrochloric_acid')*1000)
                .duration(60)
                .EUt(230)
                .buildAndRegister();

        // C4H10O2 -> C4H6O2 + 4H (4H lost)
        BREWING_RECIPES.recipeBuilder()
                .notConsumable(metaitem('dustCopper'))
                .fluidInputs(fluid('butanediol')*1000)
                .fluidOutputs(fluid('gamma_butyrolactone')*1000)
                .duration(120)
                .EUt(1200)
                .buildAndRegister();

        // CH3NH2 + C4H6O2 -> C5H9NO + H2O
        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('methylamine')*1000)
                .fluidInputs(fluid('gamma_butyrolactone')*1000)
                .fluidOutputs(fluid('n_methyl_pyrrolidone')*1000)
                .fluidOutputs(fluid('water')*1000)
                .duration(240)
                .EUt(4230)
                .buildAndRegister();

        // Ca + 2Cl -> CaCl2
        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('Calcium'))
                .fluidInputs(fluid('chlorine')*2000)
                .outputs(metaitem('dustCalciumChloride')* 3)
                .duration(80)
                .EUt(28)
                .buildAndRegister();

        // C6H4(NH2)2 + C6H4(COCl)2 -> [-CO-C6H4-CO-NH-C6H4-NH-]n + 2HCl
        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('CalciumChloride'))
                .inputs(metaitem('para_phenylenediamine')* 8)
                .inputs(metaitem('terephthaloyl_chloride')* 3)
                .fluidInputs(fluid('n_methyl_pyrrolidone')*100)
                .fluidInputs(fluid('sulfuric_acid')*500)
                .outputs(metaitem('dustKevlarConcentrate')* 8)
                .duration(400)
                .EUt(424230).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('water')*1000)
                .inputs(metaitem('KevlarConcentrate')* 2)
                .fluidOutputs(fluid('kevlar_concentrate')*2000)
                .duration(20)
                .EUt(800)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('kevlar_concentrate')*2000)
                .fluidOutputs(fluid('hydrochloric_acid')*1000)
                .outputs(metaitem('dustPurifiedKevlarConcentrate')* 2)
                .EUt(590)
                .duration(80)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .notConsumable(ROTARRY_SPINNING_WHISKER)
                .inputs(metaitem('PurifiedKevlarConcentrate'))
                .outputs(metaitem('dustKevlarBlend'))
                .EUt(2000)
                .duration(800)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .inputs(metaitem('KevlarBlend'))
                .chancedOutput(metaitem('dustKevlar')*1, 3000, 100)
                .fluidInputs(fluid('air')*1000)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .inputs(metaitem('KevlarBlend'))
                .chancedOutput(metaitem('dustKevlar')*1 3000, 100)
                .fluidInputs(fluid('oxygen')*1000)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .inputs(metaitem('KevlarBlend'))
                .outputs(metaitem('dustKevlar'))
                .notConsumable(metaitem('dustKaminskyCatalyst'))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .inputs(metaitem('KevlarBlend'))
                .chancedOutput(metaitem('dustKevlar')*1, 8000, 100)
                .notConsumable(metaitem('dustPhilipsCatalyst'))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .inputs(metaitem('KevlarBlend'))
                .chancedOutput(metaitem('dustKevlar')* 5000, 100)
                .notConsumable(metaitem('dustZieglerNattaCatalyst'))
                .duration(200)
                .EUt(80)
                .buildAndRegister();