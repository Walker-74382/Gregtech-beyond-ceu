import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


        ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustGarnierite')*2)
                .outputs(metaitem('dustNickel'))
                .fluidOutputs(fluid('oxygen')*1000)
                .duration(20)
                .EUt(90)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('water')*9500)
                .fluidInputs(fluid('oxygen')*37000)
                .fluidInputs(fluid('sulfuric_acid')*4000)
                .inputs(metaitem('dustPentlandite')*17)
                .fluidOutputs(fluid('nickel_sulfuric_solution')*10000)
                .outputs(metaitem('dustNickelRareResidue'))
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        SIFTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustNickelRareResidue'))
                .outputs(metaitem('dustPlatinumGroupSludge'))
                .outputs(metaitem('dustSilver'))
                .outputs(metaitem('dustZinc'))
                .duration(900)
                .EUt(70)
                .buildAndRegister();

        VACUUM_RECIPES.recipeBuilder()
                .fluidInputs(fluid('nickel_sulfuric_solution')*1000)
                .outputs(metaitem('dustNickelSulfatePrecipitate'))
                .fluidOutputs(fluid('sodium_arsenate_sulfuric_solution')*150)
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sodium_arsenate_sulfuric_solution')*2000)
                .inputs(metaitem('dustSodiumIodide')*8)
                .outputs(metaitem('dustSodiumSulfide')*14)
                .outputs(metaitem('dustArsenicTrioxide')*5)
                .outputs(metaitem('dustIodine')*4)
                .fluidOutputs(fluid('water')*5000)
                .EUt(700)
                .duration(500)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sodium_hydroxide_solution')*6000)
                .inputs(metaitem('dustIodine')*6)
                .outputs(metaitem('dustSodiumIodate')* 5)
                .outputs(metaitem('dustSodiumIodide')* 10)
                .fluidOutputs(fluid('water')*9000)
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(fluid('oxygen')*2000)
                .inputs(metaitem('dustSulfur')* 2)
                .inputs(metaitem('dustNickelSulfatePrecipitate')* 12)
                .outputs(metaitem('dustCopperFreeNickelSulfide')* 12)
                .outputs(metaitem('dustCopperSulfide')* 2)
                .fluidOutputs(fluid('sulfur_dioxide')*1000)
                .duration(500)
                .blastFurnaceTemp(500)
                .EUt(70)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(fluid('oxygen')*2000)
                .inputs(metaitem('dustSulfur')* 2)
                .outputs(metaitem('dustCupricOxide')*2)
                .fluidOutputs(fluid('sulfur_dioxide')*1000)
                .duration(500)
                .blastFurnaceTemp(1100)
                .EUt(70)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hydrogen')*2000)
                .fluidInputs(fluid('ammonia')*2800)
                .inputs(metaitem('dustCopperFreeNickelSulfide')* 6)
                .outputs(metaitem('dustNickel'))
                .fluidOutputs(fluid('ammonia_metal_sulfuric_solution')*1000)
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hydrogen_sulfide')*2000)
                .outputs(metaitem('dustCobaltSulfide')* 2)
                .outputs(metaitem('dustNickelSulfide')* 2)
                .fluidInputs(fluid('ammonia_metal_sulfuric_solution')*5000)
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('distilled_water')*1000)
                .inputs(metaitem('dustCopperSulfide'))
                .fluidOutputs(fluid('copper_sulfide_solution')*1000)
                .duration(200)
                .EUt(90)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('copper_sulfide_solution')*1000)
                .outputs(metaitem('dustCupricOxide')* 2)
                .fluidOutputs(fluid('sulfur_dioxide')*1000)
                .duration(200)
                .EUt(12)
                .buildAndRegister();

// Nickel Dust * 1
mods.gregtech.electrolyzer.removeByInput(30, [metaitem('dustGarnierite') * 2], null)
// Copper Dust * 1
mods.gregtech.electrolyzer.removeByInput(30, [metaitem('dustCupricOxide') * 2], null)




//Nickeliferous Limonite

        ROTARY_EVAPORATOR_RECIPES.recipeBuilder()
                .inputs(metaitem('dustNickeliferousLimonite')*2)
                .fluidOutputs(fluid('water')*1000)
                .outputs(metaitem('dustDriedNickeliferousLimonite'))
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        AUTOCLAVE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sulfuric_acid')*1000)
                .inputs(metaitem('dustDriedNickeliferousLimonite'))
                .outputs(metaitem('dustHematite'))
                .fluidOutputs(fluid('pregnant_cobalt_leach_solution')*1000)
                .duration(40)
                .EUt(50)
                .buildAndRegister();