import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .inputs(metaitem('engraved.crystal_chip'))
                .notConsumable(metaitem('biologically_approved_lens'))
                .outputs(metaitem('crystal.central_processing_unit'))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(fluid('xerizin')*1000)
                .inputs(metaitem('glass_lens.black'))
                .duration(200)
                .outputs(metaitem('biologically_approved_lens'))
                .EUt(120)
                .buildAndRegister();