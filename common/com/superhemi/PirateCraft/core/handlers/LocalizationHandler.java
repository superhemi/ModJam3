package com.superhemi.PirateCraft.core.handlers;

import com.superhemi.PirateCraft.core.util.LocalizationUtil;
import com.superhemi.PirateCraft.lib.Localizations;

import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * PirateCraft
 * 
 * LocalizationHandler
 * 
 * @author superhemi
 *@license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */

public class LocalizationHandler {

	/***
	 * Loads in all the localization files from the Localizations library class
	 */
	public static void loadLanguages() {
		
		// For every file specified in the Localization library class, load them into the Language Registry
		for (String localizationFile : Localizations.localeFiles){
		    LanguageRegistry.instance().loadLocalization(localizationFile, LocalizationUtil.getLocaleFromFileName(localizationFile), LocalizationUtil.isXMLLanguageFile(localizationFile));
		}
	}
}
