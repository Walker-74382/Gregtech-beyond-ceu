package material;

import static gregtech.api.unification.material.Materials.*;

import gregtech.api.fluids.FluidBuilder;
import gregtech.api.fluids.store.FluidStorageKeys;
import gregtech.api.unification.material.properties.*;
import gregtech.api.GregTechAPI.PostMaterialEvent
import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.Materials.*;
import static gtb.api.unification.materials.GTBMaterials.*;

public class MaterialPropertyAddition {

  public static void register() {

        event_manager.listen { PostMaterialEvent event ->
        material('nether_star').setProperty(PropertyKey.FLUID, new FluidProperty())
        material('blue_alloy').addFlags("generate_fine_wire")
        material('certus_quartz').setProperty(PropertyKey.FLUID, new FluidProperty())
        material('certus_quartz').setMaterialRGB(0xa7cafc) //0xa7cafc
        material('nether_quartz').setProperty(PropertyKey.FLUID, new FluidProperty())
        material('nether_quartz').addFlags("generate_lens")
        material('quartzite').setProperty(PropertyKey.FLUID, new FluidProperty())
        material('blue_topaz').addFlags("generate_lens")
        material('ender_pearl').addFlags("generate_lens")
        material('topaz').addFlags("generate_lens")
        material('lapis').addFlags("generate_lens")
        material('amethyst').addFlags("generate_lens")
        material('garnet_yellow').addFlags("generate_lens")
    
        material('brass').addFlags("generate_round")
        material('electrum').addFlags("generate_round")
        material('chrome').addFlags("generate_round")
        material('platinum').addFlags("generate_round")
        material('iridium').addFlags("generate_round")

        material('flerovium').addFlags("generate_dust")
        material('barium').addFlags("generate_ingot")
        }
  }
}
