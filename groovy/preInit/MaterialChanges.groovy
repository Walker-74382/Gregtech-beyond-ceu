package preInit;

import net.minecraftforge.fml.common.eventhandler.EventPriority
import gregtech.api.unification.material.event.MaterialEvent;

import material.GTBMaterials;

log.infoMC("Registering new material event listener")

eventManager.listen(EventPriority.HIGHEST) {
    MaterialEvent event ->

        log.infoMC("Starting new material registration")
        
        GTBMaterials.init()
} 