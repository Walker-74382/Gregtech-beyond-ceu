import mods.treetweaker.TreeFactory;


var palm_tree = TreeFactory.createTree("palm_tree");
palm_tree.setTreeType("PALM");
palm_tree.setLog("gtb:gtb_log");
palm_tree.setLeaf("minecraft:leaves:3");
palm_tree.setGenFrequency(7);
palm_tree.setGenBiome("minecraft:desert");
palm_tree.setMinHeight(10);
palm_tree.register();