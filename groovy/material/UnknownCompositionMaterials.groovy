package material;

import static material.GTBMaterials.*;

import gregtech.api.unification.material.Material;
import gregtech.api.GregTechAPI;
import gregtech.api.fluids.attribute.FluidAttributes;
import gregtech.api.fluids.FluidBuilder;
import gregtech.api.unification.material.properties.*;
import gtb.api.utils.GTBUtil;

import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.Materials.*;
import static gtb.api.unification.materials.info.GTBMaterialFlags.*;


public class UnknownCompositionMaterials {
        
  public static void register() {

        log.infoMC('Registering Unknown Composition Materials!');



        NaquadahRichSterileGrowthMedium = new Material.Builder(14501, GTBUtil.gtb("naquadah_rich_sterile_growth_medium"))
                .fluid()
                .color(0x272529)
                .build();

        MuddyBastnasiteSolution = new Material.Builder(14502, GTBUtil.gtb("muddy_bastnasite_solution"))
                .fluid()
                .color(0x926F64).build();

        ConditionedBastnasiteMud = new Material.Builder(14503, GTBUtil.gtb("conditioned_bastnasite_mud"))
                .fluid()
                .color(0x5B210F).build();

        DilutedBastnasiteMud = new Material.Builder(14504, GTBUtil.gtb("diluted_bastnasite_mud"))
                .fluid()
                .color(0x973314).build();

        FilteredBastnasiteMud = new Material.Builder(14505, GTBUtil.gtb("filtered_bastnasite_mud"))
                .fluid()
                .color(0xAB7564).build();

        MonaziteRarerEarthFiltrate = new Material.Builder(14506, GTBUtil.gtb("monazite_rarer_earth_filtrate"))
                .dust()
                .color(0x758A6C).build();

        AmidoEthylAlkylImidazole = new Material.Builder(14507, GTBUtil.gtb("amido_ethyl_alkyl_imidazole"))
                .fluid()
                .color(0x442A62).build();

        PolymerizedStyreneButadieneSolution = new Material.Builder(14508, GTBUtil.gtb("polymerized_styrene_butadiene_solution"))
                .fluid()
                .color(0x454545)
                .build();

        DinitrobenzeneMixture = new Material.Builder(14509, GTBUtil.gtb("dinitrobenzene_mixture"))
                .dust()
                .color(0x599B5D).build();

        NomexPolymerizationBase = new Material.Builder(14510, GTBUtil.gtb("nomex_polymerization_base"))
                .fluid()
                .color(0x791BFF).build();

        PolymerizationReadyZylon = new Material.Builder(14511, GTBUtil.gtb("polymerization_ready_zylon"))
                .dust()
                .color(0xD2A842).build();

        RarerEarthConcentrate = new Material.Builder(14512, GTBUtil.gtb("rarer_earth_concentrate"))
                .fluid()
                .color(0x593F37).build();

        OxidizedOrthoXyleneMixture = new Material.Builder(14513, GTBUtil.gtb("oxidized_ortho_xylene_mixture"))
                .fluid()
                .color(0x555555).build();

        CooledOrthoXyleneMixture = new Material.Builder(14514, GTBUtil.gtb("cooled_ortho_xylene_mixture"))
                .fluid()
                .color(0x4C4C4C).build();

        SodiumSalts = new Material.Builder(14515, GTBUtil.gtb("sodium_salts"))
                .dust()
                .color(0x30345E)
                .build().setFormula("NaCl?", true);

        NaquadriaticCompound = new Material.Builder(14516, GTBUtil.gtb("naquadriatic_compound"))
                .dust()
                .color(0x333537)
                .build().setFormula("*Nq*?", true);

        EnrichedNaquadahCompound = new Material.Builder(14517, GTBUtil.gtb("enriched_naquadah_compound"))
                .dust()
                .color(0x333537)
                .build().setFormula("Nq+?", true);

        LeachResidue = new Material.Builder(14518, GTBUtil.gtb("leach_residues"))
                .dust()
                .color(0x8D8333)
                .build().setFormula("Ir2??", true);

        DarmstadtiumCatalyst = new Material.Builder(14519, GTBUtil.gtb("darmstadtium_catalyst"))
                .dust()
                .color(0x333537)
                .build().setFormula("?", true);

        SaltFreeBrine = new Material.Builder(14520, GTBUtil.gtb("salt_free_brine"))
                .fluid()
                .color(0xAFC896)
                .build().setFormula("?", true);

        BoronFreeSolution = new Material.Builder(14521, GTBUtil.gtb("boron_free_solution"))
                .fluid()
                .color(0xAFC896)
                .build().setFormula("?", true);

        AlkylatedAdamantanes = new Material.Builder(14522, GTBUtil.gtb("alkylated_adamantanes"))
                .fluid()
                .color(0x3949AB)
                .build().setFormula("C10H16(?)", true);

        PolybenzimidazolePrePolymerFoam = new Material.Builder(14523, GTBUtil.gtb("polybenzimidazole_pre_polymer_foam"))
                .dust()
                .color(0x2B2B2B)
                .build().setFormula("?", true);

        ImpurePolybenzimidazoleSolution = new Material.Builder(14524, GTBUtil.gtb("impure_polybenzimidazole_solution"))
                .fluid()
                .color(0x353637)
                .build().setFormula("?", true);

        PolybenzimidazoleSolution = new Material.Builder(14525, GTBUtil.gtb("polybenzimidazole_solution"))
                .fluid()
                .color(0x232425)
                .build().setFormula("?", true);

        PolybenzimidazoleWaste = new Material.Builder(14526, GTBUtil.gtb("polybenzimidazole_waste"))
                .fluid()
                .color(0x565453)
                .build().setFormula("?", true);

        PhenyleneSulfidePrePolymerMixture = new Material.Builder(14527, GTBUtil.gtb("phenylene_sulfide_pre_polymer_mixture"))
                .fluid()
                .color(0x565453)
                .build().setFormula("?", true);

        PlatinumMetallicPowder = new Material.Builder(14528, GTBUtil.gtb("platinum_metallic_powder"))
                .dust()
                .ore()
                .color(0xFAD28F)
                .build().setFormula("Pt?", true);

        CrudeRhodiumMetal = new Material.Builder(14529, GTBUtil.gtb("crude_rhodium_metal"))
                .dust()
                .color(0xFAD28F)
                .build().setFormula("Rh?", true);

        RhodiumSalt = new Material.Builder(14530, GTBUtil.gtb("rhodium_salt"))
                .dust()
                .color(0xFAD28F)
                .build().setFormula("Rh?", true);

        RhodiumSaltSolution = new Material.Builder(14531, GTBUtil.gtb("rhodium_salt_solution"))
                .fluid()
                .color(0xFAD28F)
                .build().setFormula("Rh?", true);

        CalcinatedBastnasite = new Material.Builder(14532, GTBUtil.gtb("calcinated_bastnasite"))
                .dust()
                .color(0x944C36).build().setFormula("?", true);

        DehydrogenationCatalyst = new Material.Builder(14533, GTBUtil.gtb("dehydrogenation_catalyst"))
                .dust()
                .color(0xFFB74D).build().setFormula("?", true);

        RhodiumFilterCake = new Material.Builder(14534, GTBUtil.gtb("rhodium_filter_cake"))
                .dust()
                .color(0xFAD28F)
                .build().setFormula("?", true);

        RhodiumFilterCakeSolution = new Material.Builder(14535, GTBUtil.gtb("rhodium_filter_cake_solution"))
                .fluid()
                .color(0xFAD28F)
                .build().setFormula("?", true);

        SamariumRareEarthConcentrate = new Material.Builder(14536, GTBUtil.gtb("samarium_rare_earth_concentrate"))
                .dust()
                .color(0xC4C3BB).build().setFormula("SmO?", true);

        BastnasiteConcentrate = new Material.Builder(14537, GTBUtil.gtb("bastnasite_concentrate"))
                .fluid()
                .color(0xD38973).build();

        CeriumRichBastnasiteConcentrate = new Material.Builder(14538, GTBUtil.gtb("cerium_rich_bastnasite_concentrate"))
                .fluid()
                .color(0x6D2712).build();

        AcidicBastnasiteConcentrate = new Material.Builder(14539, GTBUtil.gtb("acidic_bastnasite_concentrate"))
                .fluid()
                .color(0xAF662E).build();

        AcidicCeriumBasedMud = new Material.Builder(14540, GTBUtil.gtb("acidic_cerium_based_mud"))
                .fluid()
                .color(0x984A0F).build().setFormula("Ce?", true);

        BastnasiteRarerEarthOxidesMixture = new Material.Builder(14541, GTBUtil.gtb("bastnasite_rarer_earth_oxides_mixture"))
                .fluid()
                .color(0x826D67).build();

        DriedBastnasiteRarerEarthOxidesPulp = new Material.Builder(14542, GTBUtil.gtb("dried_bastnasite_rarer_earth_oxides_pulp"))
                .dust()
                .color(0x4E1B0C).build();

        BastnasiteRarerEarthOxidesEmulsion = new Material.Builder(14543, GTBUtil.gtb("bastnasite_rarer_earth_oxides_emulsion"))
                .fluid()
                .color(0x8E6254).build();

        BastnasiteRarerEarthOxidesSolution = new Material.Builder(14544, GTBUtil.gtb("bastnasite_rarer_earth_oxides_solution"))
                .fluid()
                .color(0x66210C).build();

        SamariumReducedRarerEarthOxides = new Material.Builder(14545, GTBUtil.gtb("samarium_reduced_rarer_earth_oxides"))
                .fluid()
                .color(0x623324).build();

        CeriumSolution = new Material.Builder(14546, GTBUtil.gtb("cerium_solution"))
                .fluid()
                .color(0xABB59E).build().setFormula("Ce?", true);

        DriedMonaziteFiltrate = new Material.Builder(14547, GTBUtil.gtb("dried_monazite_filtrate"))
                .dust()
                .color(0x677753)
                .build();

        ThoriumConcentrate = new Material.Builder(14549, GTBUtil.gtb("thorium_concentrate"))
                .dust()
                .color(0x354D21)
                .build().setFormula("ThU?", true);

        RareEarthFiltrate = new Material.Builder(14550, GTBUtil.gtb("rare_earth_filtrate"))
                .dust()
                .color(0x6C6C6B)
                .build().setFormula("REE?", true);

        ChlorinatedMonaziteFiltrate = new Material.Builder(14551, GTBUtil.gtb("chlorinated_monazite_filtrate"))
                .dust()
                .color(0x345727)
                .build().setFormula("?", true);

        SaturatedChlorinatedMonaziteFiltrate = new Material.Builder(14552, GTBUtil.gtb("saturated_chlorinated_monazite_filtrate"))
                .dust()
                .color(0x00695C)
                .build().setFormula("?", true);

        MonaziteSulfide = new Material.Builder(14553, GTBUtil.gtb("monazite_sulfide"))
                .dust()
                .color(0x2A3426).build().setFormula("?", true);

        ThoriumPhosphateCake = new Material.Builder(14554, GTBUtil.gtb("thorium_phoshpate_cake"))
                .dust()
                .color(0x1B5E20).build().setFormula("?", true);

        UraniumFiltrate = new Material.Builder(14555, GTBUtil.gtb("uranium_filtrate"))
                .dust()
                .color(0x1D4E20).build().setFormula("U?", true);

        ZieglerAlfolMixture = new Material.Builder(14556, GTBUtil.gtb("ziegler_alfol_mixture"))
                .fluid()
                .color(0x424C5A).build().setFormula("?", true);

        MonaziteOreByproductSlurry = new Material.Builder(14557, GTBUtil.gtb("monazite_ore_byproduct_slurry"))
                .fluid()
                .color(0x436436).build().setFormula("??", true);

        ImpureMonaziteOreByproductSlurry = new Material.Builder(14558, GTBUtil.gtb("impure_monazite_ore_byproduct_slurry"))
                .fluid()
                .color(0x33691E)
                .build().setFormula("?2", true);

        MuddyMonaziteOreByproducts = new Material.Builder(14559, GTBUtil.gtb("muddy_monazite_ore_byproducts"))
                .dust()
                .color(0x5C423A).build().setFormula("???", true);
                
        CooledRareEarthFiltrate = new Material.Builder(14561, GTBUtil.gtb("cooled_rare_earth_filtrate"))
                .fluid()
                .color(0x936E62).build().setFormula("??", true);

        NeutralizedRareEarthFiltrate = new Material.Builder(14562, GTBUtil.gtb("neutralized_rare_earth_filtrate"))
                .fluid()
                .color(0x7F5E54).build().setFormula("?", true);

        MonaziteSulfide = new Material.Builder(14563, GTBUtil.gtb("monazite_sulfide"))
                .fluid()
                .color(0x009688).build().setFormula("??", true);

        RareEarthFiltrate = new Material.Builder(14564, GTBUtil.gtb("rare_earth_filtrate"))
                .fluid()
                .color(0x6B524B).build().setFormula("???", true);

        DilutedMonaziteSulfide = new Material.Builder(14565, GTBUtil.gtb("diluted_monazite_sulfide"))
                .fluid()
                .color(0x388E3C).build().setFormula("??", true);

        MonaziteSolution = new Material.Builder(14566, GTBUtil.gtb("monazite_solution"))
                .fluid()
                .color(0x388E3C).build().setFormula("?", true);

        MuddyMonaziteSolution = new Material.Builder(14567, GTBUtil.gtb("muddy_monazite_solution"))
                .fluid()
                .color(0x652A18).build().setFormula("??", true);

        RareGasRichGaseousNitrogen = new Material.Builder(14568, GTBUtil.gtb("rare_gas_rich_gaseous_nitrogen"))
                        .fluid()
                        .color(0x7E57C2)
                        .build();

        RareGasMixture = new Material.Builder(14569, GTBUtil.gtb("rare_gas_mixture"))
                .fluid()
                .color(0x8F78B6)
                .build();
                
        NitrogenStrippedRareGasMixture = new Material.Builder(14570, GTBUtil.gtb("nitrogen_stripped_rare_gas_mixture"))
                .fluid()
                .color(0x7B1FA2)
                .build();

                PlatinumExtractionMixture = new Material.Builder(14571, GTBUtil.gtb("platinum_extraction_mixture"))
                .liquid(new FluidBuilder())
                .color(0x009688)
                .build();

        PalladiumMotherLiqour = new Material.Builder(14572, GTBUtil.gtb("palladium_mother_liqour"))
                .liquid(new FluidBuilder())
                .color(0x6B7271)
                .build().setFormula("(NH4Cl)2(ZnCl)2(HCl4)(H2O)16", true);

        DilutedOil = new Material.Builder(14573, GTBUtil.gtb("diluted_oil"))
                .liquid(new FluidBuilder())
                .color(0x141414)
                .build();

        DesaltedOil = new Material.Builder(14574, GTBUtil.gtb("desalted_oil"))
                .liquid(new FluidBuilder())
                .color(0x2C2C2C)
                .build();

        SulfuricDiesel = new Material.Builder(14575, GTBUtil.gtb("sulfuric_diesel"))
                .liquid(new FluidBuilder())
                .color(0xA19355)
                .build();

        SulfuricGasoline = new Material.Builder(14576, GTBUtil.gtb("sulfuric_gasoline"))
                .liquid(new FluidBuilder())
                .color(0xA8A374)
                .build();

        SulfuricKerosene = new Material.Builder(14577, GTBUtil.gtb("sulfuric_kerosene"))
                .liquid(new FluidBuilder())
                .color(0xB89E61)
                .build();

        SulfuricOilResidues = new Material.Builder(14578, GTBUtil.gtb("sulfuric_oil_residues"))
                .liquid(new FluidBuilder())
                .color(0x827717)
                .build();

        Resin = new Material.Builder(14579, GTBUtil.gtb("resin"))
                .liquid(new FluidBuilder())
                .color(0xBBA177)
                .build();

        Kerosene = new Material.Builder(14580, GTBUtil.gtb("kerosene"))
                .liquid(new FluidBuilder())
                .color(0xAB47BC)
                .build();

        SulfuricFuelOil = new Material.Builder(14581, GTBUtil.gtb("sulfuric_fuel_oil"))
                .liquid(new FluidBuilder())
                .color(0xFFB546)
                .build();

        FuelOil = new Material.Builder(14582, GTBUtil.gtb("fuel_oil"))
                .liquid(new FluidBuilder())
                .color(0x827717)
                .build();

        SteamCrackedKerosene = new Material.Builder(14583, GTBUtil.gtb("steam_cracked_kerosene"))
                .liquid(new FluidBuilder())
                .color(0xB89E61)
                .build();

        HydroCrackedKerosene = new Material.Builder(14584, GTBUtil.gtb("hydro_cracked_kerosene"))
                .liquid(new FluidBuilder())
                .color(0xB89E61)
                .build();

        Furfural = new Material.Builder(14585, GTBUtil.gtb("furfural"))
                .liquid(new FluidBuilder())
                .color(0x3949AB)
                .build().setFormula("C5H4O2", true);

        Btex = new Material.Builder(14586, GTBUtil.gtb("btex"))
                .liquid(new FluidBuilder())
                .color(0x605C35)
                .build();

        EthanolWaterAzeotrope = new Material.Builder(14587, GTBUtil.gtb("ethanol_water_azeotrope"))
                .liquid(new FluidBuilder())
                .color(0xD88267)
                .build().setFormula("(C2H6O)91(H2O)9", true);

        FuselOil = new Material.Builder(14588, GTBUtil.gtb("fusel_oil"))
                .liquid(new FluidBuilder())
                .color(0xa62403)
                .build();

        ImpureEthanol = new Material.Builder(14589, GTBUtil.gtb("impure_ethanol"))
                .liquid(new FluidBuilder())
                .color(0x6F6936)
                .build();

        GrainSolution = new Material.Builder(14590, GTBUtil.gtb("grain_solution"))
                .liquid(new FluidBuilder())
                .color(0xCDCDC8)
                .build();

        Vinegar = new Material.Builder(14591, GTBUtil.gtb("vinegar"))
                .liquid(new FluidBuilder())
                .color(0xc3c4b3)
                .build();

        FractionC_5 = new Material.Builder(14592, GTBUtil.gtb("fraction_c_5"))
                .liquid(new FluidBuilder())
                .color(0xc3c4b3)
                .build();

        LubricantMixture = new Material.Builder(14593, GTBUtil.gtb("lubricant_mixture"))
                .liquid(new FluidBuilder())
                .color(0x837D4A)
                .build();

        SlackWax = new Material.Builder(14594, GTBUtil.gtb("slack_wax"))
                .liquid(new FluidBuilder())
                .color(0xFBC02D)
                .build();

        AlkylatedNaturalGas = new Material.Builder(14595, GTBUtil.gtb("alkylated_natural_gas"))
                .liquid(new FluidBuilder())
                .color(0xFBC02D)
                .build();

        Syngas = new Material.Builder(14596, GTBUtil.gtb("syngas"))
                .liquid(new FluidBuilder())
                .color(0xE8D6D1)
                .build();

        NovolacsPhotoresist = new Material.Builder(14597, GTBUtil.gtb("novolacs_photoresist"))
                .fluid()
                .color(0xAF877B)
                .build();

        IodizedOil = new Material.Builder(14598, GTBUtil.gtb("iodized_oil"))
                .fluid()
                .color(0x41403C)
                .build().setFormula("I?", true);

        IodizedBrine = new Material.Builder(14599, GTBUtil.gtb("iodized_brine"))
                .fluid()
                .color(0x535147)
                .build().setFormula("I?", true);

        IodineSlurry = new Material.Builder(14600, GTBUtil.gtb("iodine_slurry"))
                .fluid()
                .color(0x2B2E43)
                .build().setFormula("I??", true);

        BrominatedBrine = new Material.Builder(14601, GTBUtil.gtb("brominated_brine"))
                .fluid()
                .color(0xE79E9D)
                .build().setFormula("I??", true);

        Brine = new Material.Builder(14602, GTBUtil.gtb("brine"))
                .fluid()
                .color(0xFDE785)
                .build().setFormula("I??", true);

        CrudeBromineSolution = new Material.Builder(14603, GTBUtil.gtb("crude_bromine_solution"))
                .fluid()
                .color(0xD29898)
                .build().setFormula("I??", true);

        ConcentratedBrine = new Material.Builder(14604, GTBUtil.gtb("concentrated_brine"))
                .fluid()
                .color(0xDBCF99)
                .build().setFormula("Br?", true);

        Brine = new Material.Builder(14605, GTBUtil.gtb("brine"))
                .fluid()
                .color(0xa88539)
                .build().setFormula("?", true);

        CrudeBromineSolution = new Material.Builder(14606, GTBUtil.gtb("crude_bromine_solution"))
                .fluid()
                .color(0xeb5a21)
                .build().setFormula("H2SO4Br(H2O)Cl", true);

        ConcentratedBrine = new Material.Builder(14607, GTBUtil.gtb("concentrated_brine"))
                .fluid()
                .color(0xebc221)
                .build().setFormula("?", true);

        BedrockContaminatedOil = new Material.Builder(14608, GTBUtil.gtb("bedrock_contaminated_oil"))
                .fluid()
                .color(0x888D83)
                .build();

        Perfluorotributylamine = new Material.Builder(14609, GTBUtil.gtb("perfluorotributylamine"))
                .fluid()
                .color(0x80638B)
                .build();

        BedrockSlurry = new Material.Builder(14610, GTBUtil.gtb("bedrock_slurry"))
                .fluid()
                .color(0x383739)
                .build();

        PurifiedBedrockSlurry = new Material.Builder(14611, GTBUtil.gtb("purified_bedrock_slurry"))
                .fluid()
                .color(0x2D2B2E)
                .build();

        AdamantaneRichOilSolution = new Material.Builder(14612, GTBUtil.gtb("adamantane_rich_oil_solution"))
                .fluid()
                .color(0x516B95)
                .build();

        TriniumSolution = new Material.Builder(14613, GTBUtil.gtb("trinium_solution"))
                .fluid()
                .color(0xB8BCBE)
                .build();

        AdamantiumPentoxide = new Material.Builder(14614, GTBUtil.gtb("adamantium_pentoxide"))
                .fluid()
                .dust()
                .color(0x04273B)
                .build();

        AdamantiumPhosphorusHydrogenPlasma = new Material.Builder(14615,
                GTBUtil.gtb("adamantium_phosphorus_hydrogen_plasma"))
                        .plasma()
                        .color(0x1B4F6B)
                        .build();

        GaseousAdamantane = new Material.Builder(14616, GTBUtil.gtb("gaseous_adamantane"))
                .fluid()
                .color(0x5C7786)
                .build();

        MoltenAdamantiumDioxide = new Material.Builder(14617, GTBUtil.gtb("molten_adamantium_dioxide"))
                .fluid()
                .color(0x0F374C)
                .build();

        MithrilFluoride = new Material.Builder(14618, GTBUtil.gtb("mithril_fluoride"))
                .fluid()
                .color(0x0F5A83)
                .build();

        AdamantaneLubricant = new Material.Builder(14619, GTBUtil.gtb("adamantane_lubricant"))
                .fluid()
                .color(0xB3AC87)
                .build();

        IodizedOil = new Material.Builder(14620, GTBUtil.gtb("iodized_oil"))
                .fluid()
                .color(0x32312F)
                .build();

        WetBedrockDust = new Material.Builder(14621, GTBUtil.gtb("wet_bedrock_dust"))
                .dust()
                .color(0x121212)
                .build();

        OilyBedrockDust = new Material.Builder(14622, GTBUtil.gtb("oily_bedrock_dust"))
                .dust()
                .color(0x7A7D7F)
                .build();

        FineBedrockDust = new Material.Builder(14623, GTBUtil.gtb("fine_bedrock_dust"))
                .dust()
                .color(0x010101)
                .build();

        Adamantite = new Material.Builder(14624, GTBUtil.gtb("adamantite"))
                .dust()
                .color(0x27374F)
                .build();

        EnrichedNaquadahNitrate = new Material.Builder(14625, GTBUtil.gtb("enriched_naquadah_nitrate"))
                .dust()
                .color(0x212121)
                .build();

        NaquadriaNitrate = new Material.Builder(14626, GTBUtil.gtb("naquadria_nitrate"))
                .dust()
                .color(0x1C1C1E)
                .build();

        PrecipitateMithril = new Material.Builder(14627, GTBUtil.gtb("precipitate_mithril"))
                .dust()
                .color(0x0277BD)
                .build();

        RoughenMithril = new Material.Builder(14628, GTBUtil.gtb("roughen_mithril"))
                .dust()
                .color(0x7DAAC4)
                .build();

        ExcitedRoughenMithril = new Material.Builder(14629, GTBUtil.gtb("excited_roughen_mithril"))
                .dust()
                .color(0x667F8E)
                .build();

        ExcitedMithril = new Material.Builder(14630, GTBUtil.gtb("excited_mithril"))
                .dust()
                .color(0x75AACA)
                .build();

        Mithril = new Material.Builder(14631, GTBUtil.gtb("mithril"))
                .dust()
                .color(0x0478BC)
                .build();

        GrainsOfInfinity = new Material.Builder(14632, GTBUtil.gtb("grains_of_infinity"))
                .dust()
                .color(0x292B2C)
                .build();

        MolybdenumFlue = new Material.Builder(14633, GTBUtil.gtb("molybdenum_flue"))
                .fluid()
                .color(0x39194A)
                .build();

        TraceRheniumFlue = new Material.Builder(14634, GTBUtil.gtb("trace_rhenium_flue"))
                .fluid()
                .color(0x96D6D5)
                .build();

        CrudeZinc = new Material.Builder(14635, GTBUtil.gtb("crude_zinc"))
                .fluid()
                .color(0xF3F3F3)
                .build();

        CadmiumRichZinc = new Material.Builder(14636, GTBUtil.gtb("cadmium_rich_zinc"))
                .fluid()
                .color(0x7A787B)
                .build();

        ChalcogenAnodeMud = new Material.Builder(14637, GTBUtil.gtb("chalcogen_anode_mud"))
                .dust().color(0x8A3324)
                .iconSet(FINE)
                .build();

        BlueVitriol = new Material.Builder(14638, GTBUtil.gtb("blue_vitriol"))
                .fluid()
                .color(0x1565C0)
                .build();

        UEVSuperconductor = new Material.Builder(14639, GTBUtil.gtb("uev_superconductor"))
                .fluid()
                .dust()
                .color(0x29B6F6)
                .build().setFormula("?", true);

        Zblan = new Material.Builder(14640, GTBUtil.gtb("zblan"))
                .fluid()
                .dust()
                .color(0xE0E1E1)
                .build().setFormula("?", true);

        PlatinumSolution = new Material.Builder(14641, GTBUtil.gtb("platinum_solution"))
                .fluid()
                .color(0xFAF3BD)
                .build().setFormula("Pt??", true);

        PalladiumExtract = new Material.Builder(14642, GTBUtil.gtb("palladium_extract"))
                .fluid()
                .color(0xEF5350)
                .build();

        PlatinumExtract = new Material.Builder(14643, GTBUtil.gtb("platinum_extract"))
                .fluid()
                .color(0xF1EED4)
                .build();

        PlatinumConcentrate = new Material.Builder(14644, GTBUtil.gtb("platinum_concentrate"))
                .fluid()
                .color(0xDBD49B)
                .build();

        PlatinumResidues = new Material.Builder(14645, GTBUtil.gtb("platinum_residues"))
                .dust()
                .color(0xC2BFA7)
                .build().setFormula("Ir2??", true);

        PlatinumSalt = new Material.Builder(14646, GTBUtil.gtb("platinum_salt"))
                .dust()
                .color(0xFAF3BD)
                .build().setFormula("Pt?", true);

        PalladiumSalt = new Material.Builder(14647, GTBUtil.gtb("palladium_salt"))
                .dust()
                .color(0xB4B4B4)
                .build().setFormula("Pd?", true);

        PalladiumMetallicPowder = new Material.Builder(14648, GTBUtil.gtb("palladium_metallic_powder"))
                .dust()
                .ore()
                .color(0x616161)
                .build().setFormula("Pd?", true);

        LiquidCrystalDetector = new Material.Builder(14649, GTBUtil.gtb("liquid_crystal_detector"))
                .fluid()
                .color(0x9C27B0)
                .build().setFormula("?", true);

        BastnasiteByproducts = new Material.Builder(14650, GTBUtil.gtb("bastnasite_byproducts"))
                .dust()
                .color(0x895E47)
                .build();

        SamaricRareEarthConcentrate = new Material.Builder(14651, GTBUtil.gtb("samaric_rare_earth_concentrate"))
                .dust()
                .color(0xCFC182)
                .build();

        DeoxygenationCatalyst = new Material.Builder(14652, GTBUtil.gtb("deoxygenation_catalyst"))
                .dust()
                .color(0x858EC2)
                .build();

        BastnasiteOxideComposite = new Material.Builder(14653, GTBUtil.gtb("bastnasite_oxide_composite"))
                .dust()
                .color(0x937971)
                .build();

        HydrogenationCatalyst = new Material.Builder(14654, GTBUtil.gtb("hydrogenation_catalyst"))
                .dust()
                .color(0xB68AC1)
                .build();

        NeodymiumRareEarthConcentrate = new Material.Builder(14655, GTBUtil.gtb("neodymium_rare_earth_concentrate"))
                .dust()
                .color(0x686569)
                .build().setFormula("NdO2???", true);

        CopperFreeNickelSulfide = new Material.Builder(14656, GTBUtil.gtb("copper_free_nickel_sulfide"))
                .dust()
                .color(0x7F9099)
                .build().setFormula("NiS2?", true);

        LiquidOzone = new Material.Builder(14657, GTBUtil.gtb("liquid_ozone"))
                .fluid()
                .color(0x0288D1)
                .build();

        ImpureSapphireSlurry = new Material.Builder(14658, GTBUtil.gtb("impure_sapphire_slurry"))
                .fluid()
                .color(0x3979C1)
                .build();

        ImpureGreenSapphireSlurry = new Material.Builder(14659, GTBUtil.gtb("impure_green_sapphire_slurry"))
                .fluid()
                .color(0x60B164)
                .build();

        ImpureRubySlurry = new Material.Builder(14660, GTBUtil.gtb("impure_ruby_slurry"))
                .fluid()
                .color(0xCF5F5F)
                .build();
        
        CeriumOxideFiltrate = new Material.Builder(14661, GTBUtil.gtb("cerium_oxide_filtrate"))
                .dust()
                .color(0xC8DCB1)
                .build().setFormula("CeO2?", true);
        
        HeavyOilResidues = new Material.Builder(14662, GTBUtil.gtb("heavy_oil_residues"))
                .fluid()
                .color(0x545454)
                .build().setFormula("?", true);

        CadmiumRichSolution = new Material.Builder(14663, GTBUtil.gtb("cadmium_rich_solution"))
                .fluid()
                .color(0x3B3B3B)
                .build().setFormula("Cd?", true);

  }

}