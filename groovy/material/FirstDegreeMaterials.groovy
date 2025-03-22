package material;

import static material.GTBMaterials.*;

import gregtech.api.unification.material.Material;
import gregtech.api.GregTechAPI;
import gregtech.api.fluids.attribute.FluidAttributes;
import gregtech.api.fluids.FluidBuilder;
import gregtech.api.unification.material.properties.*

import gtb.api.utils.GTBUtil;

import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.Materials.*;
import static gtb.api.unification.materials.info.GTBMaterialFlags.*;

public class FirstDegreeMaterials {

  public static void register() {

        log.infoMC('Registering First Degree Materials!');


        PotassiumPersulfate = new Material.Builder(12001, GTBUtil.gtb("potassium_persulfate"))
                .dust()
                .color(0x6A8D9F)
                .build();

        PotassiumPersulfate.setFormula("K2S2O8", true)
        
        
        ParaPhenylenediamine = new Material.Builder(12002, GTBUtil.gtb("para_phenylenediamine"))
                .dust()
                .color(0x7AB8B2)
                .build();

        ParaPhenylenediamine.setFormula("C6H8N2", true)



  }

}