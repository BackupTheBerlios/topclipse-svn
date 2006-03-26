package de.berlios.topclipse.messages;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * This class provides access to extenalized strings used by plugin.
 * 
 * @author Maciek Mazur
 */
public class Messages {
	/**
	 * Fully qualified name of the bundle.
	 */
	private static final String BUNDLE_NAME = "net.sourceforge.topclipse.messages.messages"; //$NON-NLS-1$

	/**
	 * Reference to the resource bundle.
	 */
	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle
			.getBundle(BUNDLE_NAME);

	/**
	 * Constructor of this class won't be used. Only static access is available.
	 */
	private Messages() {
		// For constructor won't be used, it is made private
	}

	/**
	 * Returns string from the resource bundle specified by the key.
	 * 
	 * @param key
	 *            key specifying which string from resource bundle to return
	 * @return string extracted from resource bundle
	 */
	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}

	/**
	 * Returns string from the resource bundle specified by the key.
	 * 
	 * @param key
	 *            key specifying which string from resource bundle to return
	 * @param base
	 *            base is used as a prefix to the key when accessing resource
	 *            bundle
	 * @return string extracted from resource bundle
	 */
	public static String getString(String key, String base) {
		String fullKey = base + "." + key; //$NON-NLS-1$
		return Messages.getString(fullKey);
	}
}
