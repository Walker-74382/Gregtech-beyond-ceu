package material;


import static material.GTBMaterial.*;

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


        PotassiumPersulfate = new Material.Builder(8000, GTBUtil.gtb("potassium_persulfate"))
                .dust()
                .color(0x6A8D9F)
                .build();

        PotassiumPersulfate.setFormula("K2S2O8", true)
        
        
        ParaPhenylenediamine = new Material.Builder(8001, GTBUtil.gtb("para_phenylenediamine"))
                .dust()
                .color(0x7AB8B2)
                .build();

        ParaPhenylenediamine.setFormula("C6H8N2", true)
        
      
        MethylFormate = new Material.Builder(8002, GTBUtil.gtb("methyl_formate"))
                .fluid()
                .color(0xD8AAAA)
                .build();

        MethylFormate.setFormula("C2H4O2", true)

        Bromotoluene = new Material.Builder(8003, GTBUtil.gtb("bromotoluene"))
                .fluid()
                .color(0xD8AAAA)
                .build();

        Bromotoluene.setFormula("C7H7Br", true)

        FluorotolueneMixture = new Material.Builder(8004, GTBUtil.gtb("fluorotoluene_mixture"))
                .fluid()
                .color(0xD8AAAA)
                .build();

        FluorotolueneMixture.setFormula("(C7H7F)(C3H7NO)", true)

        Fluorotoluene = new Material.Builder(8005, GTBUtil.gtb("fluorotoluene"))
                .fluid()
                .color(0xD8AAAA)
                .build();

        Fluorotoluene.setFormula("C7H7F", true)

        Dimethylformamide = new Material.Builder(8006, GTBUtil.gtb("dimethylformamide"))
                .fluid()
                .color(0xD8AAAA)
                .build();

        Dimethylformamide.setFormula("C3H7NO", true)

        FluorobenzoicAcid = new Material.Builder(8007, GTBUtil.gtb("fluorobenzoic_acid"))
                .fluid()
                .color(0xD8AAAA)
                .build();

        FluorobenzoicAcid.setFormula("C7H5FO2", true)

        FluorobenzoylChloride = new Material.Builder(8008, GTBUtil.gtb("fluorobenzoyl_chloride"))
                .fluid()
                .color(0xD8AAAA)
                .build();

        FluorobenzoylChloride.setFormula("FC6H4COCl", true)

        DiphenylSulfone = new Material.Builder(8009, GTBUtil.gtb("diphenyl_sulfone"))
                .fluid()
                .color(0xD8AAAA)
                .build();

        DiphenylSulfone.setFormula("C8H10O2S", true)

        AluminiumBromide = new Material.Builder(8010, GTBUtil.gtb("aluminium_bromide"))
                .dust()
                .color(0xD8AAAA)
                .build();

        AluminiumBromide.setFormula("AlBr3", true)

        Fluorobenzene = new Material.Builder(8011, GTBUtil.gtb("fluorobenzene"))
                .fluid()
                .color(0xD8AAAA)
                .build();

        Fluorobenzene.setFormula("(C6H5F)", true)



  }
  

}