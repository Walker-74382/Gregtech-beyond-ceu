package material;

import gregtech.api.unification.material.Material;

import gregtech.api.GregTechAPI;
import gregtech.api.unification.material.properties.*;

import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.Materials.*;

import static material.FirstDegreeMaterials.*;
import static material.SecondDegreeMaterials.*;
import static material.BiologicalMaterials.*;

public class GTBMaterial {
        //Biological Materials
        
        public static Material CupriavidusNecator;
        public static Material BacterialGrowthMedium;
        public static Material DepletedBacterialGrowthMedium;
        public static Material Blood;
        public static Material BloodCells;
        public static Material BloodPlasma;
        public static Material Catalase;
        public static Material BasicFibroblastGrowthMedium;
        public static Material EpidermalGrowthFactor;
        public static Material CupriavidusNecatorBacteriaSample;
        public static Material Cuproquin;
        public static Material Sulfanilamide;
        public static Material AcetylsulfanilylChloride;
        public static Material ChlorosulfonicAcid;
        public static Material AceticAnhydride;
        public static Material Aniline;
        public static Material AmmoniumNitrate;
        public static Material B_27_Supplement;
        public static Material Glutamine;
        public static Material LinoleicAcid;
        public static Material Biotin;
        public static Material Ethanolamine;
        public static Material VitaminA;
        public static Material BetaIonone;
        public static Material PropargylChloride;
        public static Material Citral;
        public static Material BetaPinene;
        public static Material Turpentine;
        public static Material PropargylAlcohol;
        public static Material Acetylene;
        public static Material CleanAmmoniaSolution;
        public static Material Leucine;
        public static Material Yeast;
        public static Material BrevibacteriumFlavium;
        public static Material YEEMSolution;
        public static Material YeastExtractMannitolMedium;
        public static Material YeastExtractMannitolAgarSolution;
        public static Material DissolvedYeastExtractMannitolMixture;
        public static Material YeastExtract;
        public static Material Mannitol;
        public static Material YeastMixture;
        public static Material WasteWater;
        public static Material NutrientRichSolution;
        public static Material MaltExtract;
        public static Material Peptone;
        public static Material Wort;
        public static Material HotGristSolution;
        public static Material GristPowder;
        public static Material SolidGrain;
        public static Material Glucose;
        public static Material Nonoxynol_9;
        public static Material Nonoxynol_9_Solution;
        public static Material EthoxylatedNonylphenol;
        public static Material Nonylphenol;
        public static Material EschericiaColi;
        public static Material Iriditus;
        public static Material Fructose;
        public static Material SheepBlood;
        public static Material SheepBloodPlasma;
        public static Material SheepBloodCells;
        public static Material DefibernatedSheepBlood;
        public static Material EdeticAcid;
        public static Material PhenylEthylAlcoholBloodAgar;
        public static Material SolidifiedSterileDefibernatedSheepBlood;
        public static Material DissolvedPhenylEthylAlcoholAgar;
        public static Material PhenylEthylAlcoholAgarSolution;
        public static Material PhenylEthylAlcohol;
        public static Material Xerizin;
        public static Material SolidMilkResidues;
        public static Material HeatedMilkSlurry;
        public static Material PeptoneMixture;
        public static Material AlphaLinolenicAcid;
        public static Material MilkOil;
        public static Material HomogenizedPancreasMixture;
        public static Material Trypsin;
        public static Material BeanSlurry;
        public static Material Rhizobium;
        public static Material PapaicDigestOfSoybeanMeal;
        public static Material DefattedSoybeanFlour;
        public static Material SoybeanOil;
        public static Material CrushedSoybean;
        public static Material MethyleneDiphosphoricAcid;
        public static Material OrthophosphoricAcid;
        public static Material OrthophosphoricAcidSolution;
        public static Material PhosphoricAnihydride;
        public static Material PolyhydroxylAlkanoate;
        public static Material YButyrolacetone;
        public static Material PalmOil;
        public static Material BetaPineneSolution;
        public static Material PhthalicAnhydride;
        public static Material MilkResidueSlurry;

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
        public static Material CarbonDisulfide;


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
        BiologicalMaterials.register();

        }


}