package material;

import static gregtech.api.unification.material.Materials.*;

import gregtech.api.fluids.FluidBuilder;
import gregtech.api.fluids.store.FluidStorageKeys;
import gregtech.api.unification.material.properties.*;
import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.Materials.*;
import static gtb.api.unification.materials.GTBMaterials.*;

public class MaterialPropertyAddition {

  public static void register() {
      
            CertusQuartz.setMaterialRGB(0xA7CAFC); //0xa7cafc

            Flerovium.setProperty(PropertyKey.DUST, new DustProperty());
            Barium.setProperty(PropertyKey.INGOT, new IngotProperty());
            Cadmium.setProperty(PropertyKey.INGOT, new IngotProperty());
            Cerium.setProperty(PropertyKey.INGOT, new IngotProperty());
            NetherQuartz.setProperty(PropertyKey.FLUID, new FluidProperty(FluidStorageKeys.LIQUID, new FluidBuilder()));
            CertusQuartz.setProperty(PropertyKey.FLUID, new FluidProperty(FluidStorageKeys.LIQUID, new FluidBuilder()));
            Quartzite.setProperty(PropertyKey.FLUID, new FluidProperty(FluidStorageKeys.LIQUID, new FluidBuilder()));

            Iridium.addFlags(GENERATE_ROUND);
            Platinum.addFlags(GENERATE_ROUND);
            Chrome.addFlags(GENERATE_ROUND);
            Electrum.addFlags(GENERATE_ROUND);
            Brass.addFlags(GENERATE_ROUND);
            Iridium.addFlags(GENERATE_ROUND);

            GarnetYellow.addFlags(GENERATE_LENS);
            Amethyst.addFlags(GENERATE_LENS);
            Lapis.addFlags(GENERATE_LENS);
            Topaz.addFlags(GENERATE_LENS);
            EnderPearl.addFlags(GENERATE_LENS);
            BlueTopaz.addFlags(GENERATE_LENS);
            NetherQuartz.addFlags(GENERATE_LENS);

            BlueAlloy.addFlags(GENERATE_FINE_WIRE);
            Cerium.addFlags(GENERATE_FINE_WIRE);



            Nickel.addFlags(GENERATE_ROD);


            Phosphate.setProperty(PropertyKey.ORE, new OreProperty());
            Andradite.setProperty(PropertyKey.ORE, new OreProperty());
            Zinc.setProperty(PropertyKey.ORE, new OreProperty());
            Rutile.setProperty(PropertyKey.ORE, new OreProperty());
      
      }
  }