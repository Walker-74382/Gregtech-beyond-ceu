package material;

import gregtech.api.unification.material.Material;

import gregtech.api.GregTechAPI;
import gregtech.api.unification.material.properties.*;

import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.Materials.*;

import static material.FirstDegreeMaterials.*;
import static material.SecondDegreeMaterials.*;

class GTBMaterials {

        if (GTBMaterials.class == null) {
            throw new IllegalStateException("[GTB] GTBMaterials (Java) is not loaded!");
        }
        
        //First Degree Material

        public static Material PotassiumPersulfate;


        //Second Degree Material
        public static Material StyreneSuspension;
        public static Material PolystyreneSuspension;
        public static Material PolyvinylAcetateSolution;
        public static Material PolyvinylChlorideSolution;



public static void init() {
        FirstDegreeMaterials.register();
        SecondDegreeMaterials.register();
        }


}