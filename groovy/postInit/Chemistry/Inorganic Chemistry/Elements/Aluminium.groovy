import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


        ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustBauxite'))
                .outputs(metaitem('dustRoastedBauxite'))
                .fluidInputs(fluid('steam')*1000)
                .duration(200)
                .EUt(2)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('dustRoastedBauxite')* 5)
                .fluidInputs(fluid('oxygen')*1000)
                .outputs(metaitem('ingotAluminium')*2)
                .blastFurnaceTemp(1200)
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(fluid('nitrogen')*1000)
                .circuitMeta(2)
                .inputs(metaitem('dustAluminium'))
                .outputs(metaitem('ingotAluminium'))
                .duration(360)
                .EUt(140)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .circuitMeta(1)
                .inputs(metaitem('dustAluminium'))
                .outputs(metaitem('ingotAluminium'))
                .duration(580)
                .EUt(190)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .inputs(metaitem('dustRoastedBauxite')*2)
                .fluidInputs(fluid('hydrochloric_acid')*1000)
                .outputs(metaitem('dustLeachedBauxite'))
                .chancedOutput(metaitem('dustRedMudConcentrate') * 1, 200, 20)
                .chancedOutput(metaitem('dustAluminiumHydroxide')* 2, 400, 0)
                .duration(200)
                .EUt(300)
                .buildAndRegister();

        CRYSTALLIZATION_RECIPES.recipeBuilder()
                .inputs(metaitem('dustLeachedBauxite')* 2)
                .fluidInputs(fluid('hydrogen')*4000)
                .fluidOutputs(fluid('hydrogen_chloride')*2000)
                .outputs(metaitem('dustAluminiumHydroxide')* 7)
                .duration(200)
                .EUt(100)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('water')*1000)
                .inputs(metaitem('dustSodiumAluminate')* 3)
                .fluidOutputs(fluid('sodium_aluminate_solution')*1000)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CRYSTALLIZATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sodium_aluminate_solution')*1000)
                .fluidInputs(fluid('water')*1000)
                .fluidOutputs(fluid('sodium_hydroxide_solution')*1000)
                .outputs(metaitem('dustAluminiumHydroxide')* 7)
                .duration(200)
                .EUt(100)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('dustAluminiumHydroxide')* 4)
                .outputs(metaitem('ingotAluminium'))
                .fluidOutputs(fluid('steam')*2000)
                .duration(200)
                .EUt(400)
                .blastFurnaceTemp(1800)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustAluminiumHydroxide')* 5)
                .outputs(metaitem('dustAlumina')* 2)
                .fluidOutputs(fluid('steam')*2000)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

// Aluminium Dust * 6
mods.gregtech.electrolyzer.removeByInput(60, [metaitem('dustBauxite') * 15], null)


        //Aluminium Salt

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .inputs(metaitem('dustAluminiumSalt')*2)
                .fluidInputs(fluid('distilled_water')*1000)
                .fluidOutputs(fluid('aluminium_salt_solution')*1000)
                .duration(60)
                .EUt(7)
                .buildAndRegister();

        ELECTROLYTIC_CELL_RECIPES.recipeBuilder()
                .notConsumable(metaitem('stickIron'))
                .notConsumable(metaitem('stickCobalt'))
                .notConsumable(fluid('sodium_hydroxide_solution')*864)
                .fluidInputs(fluid('aluminium_salt_solution')*1000)
                .fluidOutputs(fluid('water')*1000)
                .outputs(metaitem('dustAluminium'))
                .outputs(metaitem('dustSalt'))
                .duration(260)
                .EUt(7)
                .buildAndRegister();

        //Kaolinite

        ELECTROMAGNETIC_SEPARATOR_RECIPES.recipeBuilder()
                .inputs(metaitem('dustKaolinite'))
                .chancedOutput(metaitem('dustHematite')*1, 2000, 0)
                .outputs(metaitem('dustBeneficatedKaolinite'))
                .duration(200)
                .EUt(80)
                .buildAndRegister()
        
        BLAST_RECIPES.recipeBuilder()           //ROTARY KILN
                .inputs(metaitem('dustBeneficatedKaolinite'))
                .outputs(metaitem('dustFusedMetakaolin'))
                .fluidOutputs(fluid('water')*2000)
                .blastFurnaceTemp(900)
                .EUt(100)
                .duration(200)
                .buildAndRegister()

        CENTRIFUGE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustMetakaolin')*2)
                .fluidOutputs(fluid('chlorine')*300)
                .chancedOutput(metaitem('dustSiliconDioxide')*1, 2000, 1000)
                .outputs(metaitem('dustAlumina'))
                .EUt(120)
                .duration(200)
                .buildAndRegister()

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hydrochloric_acid')*6000)
                .inputs(metaitem('dustFusedMetakaolin'))
                .fluidOutputs(fluid('water')*3000)
                .outputs(metaitem('dustMetakaolin')*2)
                .EUt(90)
                .duration(300)
                .buildAndRegister()

        ELECTROLYTIC_CELL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustAlumina')*5)
                .inputs(metaitem('dustCarbon')*3)
                .notConsumable(fluid('cryolite')*1000)
                .fluidOutputs(fluid('aluminium')*288)
                .fluidOutputs(fluid('carbon_dioxide')*3000)
                .EUt(70)
                .duration(250)
                .buildAndRegister()
        
        //Modified Hall-Héroult Process

        ELECTROLYTIC_CELL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustAluminiumTrifluoride')*8)
                .inputs(metaitem('dustCarbon')*3)
                .notConsumable(metaitem('graphite_electrode'))
                .notConsumable(metaitem('carbon_lined_cathode'))
                .fluidOutputs(fluid('carbon_dioxide')*3000)
                .fluidOutputs(fluid('fluorine')*6000)
                .fluidOutputs(fluid('aluminium')*288)
                .EUt(70)
                .duration(250)
                .buildAndRegister()

// Sodium Dust * 2
mods.gregtech.electrolyzer.removeByInput(60, [metaitem('dustClay') * 13], null)
// Aluminium Dust * 2
mods.gregtech.electrolyzer.removeByInput(30, [metaitem('dustSapphire') * 5], null)


        //Aluminium Sulfite Production

        CHEMICAL_RECIPES.recipeBuilder()
                .notConsumable(metaitem('fume_hood'))
                .inputs(metaitem('dustAluminium')*2)
                .fluidInputs(fluid('diluted_sulfuric_acid')*1000)
                .fluidOutputs(fluid('hydrogen')*3000)
                .outputs(metaitem('dustAluminiumSulfate')*2)
                .EUt(370)
                .duration(250)
                .buildAndRegister()

        CHEMICAL_RECIPES.recipeBuilder() //CSTR
                .fluidInputs(fluid('distilled_water')*2000)
                .notConsumable(metaitem('fume_hood'))
                .inputs(metaitem('dustAluminiumSulfate')*2)
                .fluidOutputs(fluid('sulfur_dioxide')*3000)
                .outputs(metaitem('dustAluminiumSulfite')*2)
                .duration(400)
                .EUt(180)
                .buildAndRegister();
