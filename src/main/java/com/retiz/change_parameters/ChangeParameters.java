package com.retiz.change_parameters;

import com.retiz.change_parameters.item.ModItemGroups;
import com.retiz.change_parameters.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChangeParameters implements ModInitializer {
	public static final String MOD_ID = "change_parameters";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
	}
}