package com.haywirehax.rimurucraft

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object RimuruCraft : ModInitializer {
	val MOD_ID = "rimurucraft"
    private val logger = LoggerFactory.getLogger(MOD_ID)

	override fun onInitialize() {
		logger.info("Hello Fabric world!")
	}
}