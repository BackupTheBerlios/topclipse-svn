package de.berlios.topclipse.config;

import javax.swing.JDialog;
import javax.swing.JFrame;

import de.berlios.topclipse.messages.Messages;

/**
 * This is dialog that is shown to user after clicking the Configure button. It
 * provides GUI to set various configuration variables.
 * 
 * @author Maciek Mazur
 */
public class ConfigurationDialog extends JDialog {
	/**
	 * Message base name is used as a prefix when accessing strings in resource
	 * bundle.
	 */
	private static final String MESSAGE_BASE = "de.berlios.topclipse.config.ConfigurationDialog"; //$NON-NLS-1$

	/**
	 * Creates configuration dialog.
	 */
	public ConfigurationDialog() {
		super((JFrame) null, Messages.getString(
				"dialogTitle", ConfigurationDialog.MESSAGE_BASE), true); //$NON-NLS-1$
		// TODO create layout
	}
}
