package material;

import gregtech.api.unification.material.Material;

import gregtech.api.GregTechAPI;
import gregtech.api.unification.material.properties.*;

import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.Materials.*;

import static material.FirstDegreeMaterials.*;
import static material.SecondDegreeMaterials.*;

class GTBMaterial {
        
        //First Degree Material

        public static Material PotassiumPersulfate;
        public static Material ParaPhenylenediamine;
        public static Material Bromotoluene;
        public static Material MethylFormate;
        public static Material FluorotolueneMixture;
        public static Material Fluorotoluene;
        public static Material Dimethylformamide;
        public static Material FluorobenzoicAcid;
        public static Material FluorobenzoylChloride;
        public static Material DiphenylSulfone;
        public static Material AluminiumBromide;
        public static Material Fluorobenzene;


        //Second Degree Material
        public static Material StyreneSuspension;
        public static Material PolystyreneSuspension;
        public static Material PolyvinylAcetateSolution;
        public static Material PolyvinylChlorideSolution;
        public static Material PeekReactionMixture;
        public static Material FluorobenzeneMixture;
        public static Material PostPolymerizationPeekMixture;
        public static Material PurifiedPeekMixture;
        public static Material PrecipitatedPeekMixture;
        public static Material PolyetheretherketoneWaste;



public static void init() {
        FirstDegreeMaterials.register();
        SecondDegreeMaterials.register();
        }


}