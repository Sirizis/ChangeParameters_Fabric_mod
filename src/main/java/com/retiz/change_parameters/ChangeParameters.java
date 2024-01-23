package com.retiz.change_parameters;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChangeParameters implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("change_parameters");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}