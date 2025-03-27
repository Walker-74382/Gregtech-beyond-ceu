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


        
        Flerovium.setProperty(PropertyKey.DUST, new DustProperty());
        Phosphate.addFlags(GENERATE_ORE);
        Andradite.addFlags(GENERATE_ORE);










  }}