import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


        ROASTER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('oxygen')*2000)
                .inputs(metaitem('dustBornite')* 2)
                .outputs(metaitem('dustRoastedBornite')* 2)
                .fluidOutputs(fluid('sulfur_dioxide')*2000)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        PRIMITIVE_BLAST_FURNACE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustRoastedBornite')* 1)
                .inputs(metaitem('dustCarbon')* 2)
                .outputs(metaitem('ingotCopper'))
                .duration(200)
                .buildAndRegister();

        PRIMITIVE_BLAST_FURNACE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustRoastedBornite')* 1)
                .inputs(metaitem('dustCharcoal')* 2)
                .outputs(metaitem('ingotCopper'))
                .duration(200)
                .buildAndRegister();

        PRIMITIVE_BLAST_FURNACE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustRoastedBornite')* 1)
                .inputs(metaitem('dustCoal')* 2)
                .outputs(metaitem('ingotCopper'))
                .duration(200)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('dustRoastedBornite'))
                .outputs(metaitem('ingotCopper'))
                .chancedOutput(item('minecraft:iron_ingot')*1, 2000, 1)
                .blastFurnaceTemp(800)
                .EUt(80)
                .duration(160)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('oxygen')*2000)
                .inputs(metaitem('dustChalcocite')* 2)
                .outputs(metaitem('dustCopper'))
                .fluidOutputs(fluid('sulfur_dioxide')*2000)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('dustMalachite'))
                .fluidInputs(fluid('oxygen')*2000)
                .inputs(metaitem('dustCoke')* 2)
                .outputs(metaitem('dustMalachiteSlag'))
                .fluidOutputs(fluid('carbon_dioxide')*2000)
                .blastFurnaceTemp(1200)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        SINTERING_OVEN_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hydrogen')*2000)
                .fluidOutputs(fluid('steam')*4000)
                .inputs(metaitem('dustMalachiteSlag'))
                .outputs(metaitem('dustSinteredMalachiteSlag'))
                .duration(200)
                .EUt(90)
                .buildAndRegister();

        BURNER_REACTOR_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSinteredMalachiteSlag'))
                .outputs(metaitem('ingotCopper'))
                .duration(400)
                .EUt(50)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustCupricOxide')* 2)
                .circuitMeta(1)
                .outputs(metaitem('dustCopper'))
                .fluidOutputs(fluid('steam')*1000)
                .duration(200)
                .EUt(90)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustCupricOxide')* 2)
                .circuitMeta(0)
                .outputs(metaitem('dustCopper'))
                .duration(200)
                .EUt(90)
                .buildAndRegister();

// Copper Dust * 2
mods.gregtech.electrolyzer.removeByInput(30, [metaitem('dustChalcocite') * 3], null)
// Copper Dust * 5
mods.gregtech.electrolyzer.removeByInput(60, [metaitem('dustBornite') * 10], null)
// Copper Dust * 3
mods.gregtech.electrolyzer.removeByInput(60, [metaitem('dustTetrahedrite') * 8], null)

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(fluid('oxygen')*42000)
                .inputs(metaitem('dustCarrolite')*12)
                .outputs(metaitem('dustRoastedCarrolite')*21)
                .fluidOutputs(fluid('sulfur_dioxide')*14000)
                .blastFurnaceTemp(1100)
                .duration(400)
                .EUt(116)
                .buildAndRegister()

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sulfuric_acid')*13000)
                .inputs(metaitem('dustRoastedCarrolite')*21)
                .outputs(metaitem('dustBandedIron')*5)
                .fluidOutputs(fluid('carrolite_sulfuric_solution')*7500)
                .duration(600)
                .EUt(16)
                .buildAndRegister()

        ELECTROLYZER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('carrolite_sulfuric_solution')*2500)
                .notConsumable(metaitem('wireFineCopper'))
                .fluidOutputs(fluid('oxygen')*1000)
                .fluidOutputs(fluid('impure_cobalt_sulfide_solution')*2000)
                .duration(600)
                .EUt(16)
                .buildAndRegister()

        DEHYDRATOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('impure_cobalt_sulfide_solution') * 12000)
                .inputs(metaitem('dustQuicklime')*53)
                .inputs(metaitem('dustSodiumHydrosulfide')*6)
                .outputs(metaitem('dustSodiumSulfate')*7)
                .outputs(metaitem('dustGypsum')*114)
                .outputs(metaitem('dustCobaltOxideHydroxide')*48)
                .outputs(metaitem('dustAlumina')*3)
                .outputs(metaitem('dustNickelSulfide')*4)
                .duration(500)
                .EUt(26)
                .buildAndRegister()

        ARC_FURNACE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustCobaltOxideHydroxide')*4)
                .fluidInputs(fluid('hydrogen')*1000)
                .outputs(metaitem('dustCobaltOxide'))
                .duration(200)
                .EUt(56)
                .buildAndRegister()

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hydrogen')*2000)
                .inputs(metaitem('dustNickelSulfide')*2)
                .outputs(metaitem('dustNickel'))
                .fluidOutputs(fluid('hydrogen_sulfide')*1000)
                .duration(200)
                .EUt(56)
                .buildAndRegister()

// Copper Dust * 2
mods.gregtech.electrolyzer.removeByInput(60, [metaitem('dustMalachite') * 10], null)
