package material;

import gregtech.api.unification.material.Material;

import gregtech.api.GregTechAPI;
import gregtech.api.unification.material.properties.*

import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.Materials.*;

import static material.FirstDegreeMaterials.*;
import static material.SecondDegreeMaterials.*;
import static material.ThirdDegreeMaterials.*;
import static material.UnknownCompositionMaterials.*;

class GTBMaterials {


//FD Materials






//SD Materials

        public static Material StyreneSuspension;



    

        public static void init() {
                UnknownCompositionMaterials.register();
                FirstDegreeMaterials.register();
                SecondDegreeMaterials.register();
                ThirdDegreeMaterials.register();
}

}