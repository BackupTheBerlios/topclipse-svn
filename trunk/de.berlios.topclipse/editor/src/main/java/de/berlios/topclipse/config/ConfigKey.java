package de.berlios.topclipse.config;

/**
 * This enumaration contains names of the configuration keys. They are used when
 * saving user preferences with mechanism TopCoder Arena LocalPreferences class.
 * 
 * @author Maciek Mazur
 */
public enum ConfigKey {
	/**
	 * Name of the configuration key for eclipse home directory.
	 */
	ECLIPSE_HOME("de.berlios.topclipse.config.eclipseHome"), //$NON-NLS-1$
	/**
	 * Name of the configuration key for eclipse workspace directory.
	 */
	ECLIPSE_WORKSPACE("de.berlios.topclipse.config.eclipseWorkspace"); //$NON-NLS-1$

	/**
	 * Name of the configuration name.
	 */
	private final String key;

	/**
	 * Constructor of configuration key.
	 * 
	 * @param key
	 *            name of the configuration key
	 */
	ConfigKey(String key) {
		this.key = key;
	}

	/**
	 * Gets the String representation of configuration key.
	 * 
	 * @return name of the configuration name
	 */
	public String key() {
		return this.key;
	}
}
