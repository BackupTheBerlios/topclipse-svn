package de.berlios.topclipse.tcapplet;

import javax.swing.JPanel;

import com.topcoder.client.contestant.ProblemComponentModel;
import com.topcoder.shared.language.Language;
import com.topcoder.shared.problem.Renderer;

/**
 * Methods recognized by the TCApplet that entry point class must implement in
 * order to be properly recognized.
 * 
 * @author Maciek Mazur
 */
public interface IEntryPoint {
	/**
	 * This method is called to clear the current source code from the editor.
	 * This method will be called between opening problems to clear the prior
	 * problems source code.
	 */
	public void clear();

	/**
	 * This method will be called from the Editor Preferences window to allow
	 * any editor configuration that needs to be preformed.
	 */
	public void configure();

	/**
	 * Tells the plugin that the plugin object will no longer be called or
	 * referenced (ie can be garbage collected). See plugin life-cycle for
	 * information as to when this method is being called.
	 */
	public void dispose();

	/**
	 * This method will be called to retrieve the JPanel containing editor. This
	 * method will be called initially (if plugin is the default plugin) when
	 * the coder enters the coding room or called when the coder switches
	 * editors. Please note that the contest applet will size the panel
	 * accordingly.
	 * 
	 * @return reference to JPanel containing editor
	 */
	public JPanel getEditorPanel();

	/**
	 * This method will be called to retrieve the current source code in editor.
	 * This method will be called when the coder presses the
	 * Save/Test/Compile/Submit buttons OR if the coder switches editors or
	 * language.
	 * 
	 * @return current source code in editor
	 */
	public String getSource();

	/**
	 * This method is called ONCE (per instance) when the plugin is being
	 * installed. This gives the plugin a chance to setup (or request) the
	 * plugin when it is installed. The plugin can throw an runtime exception to
	 * prevent the installation of the plugin if a critical error occurs. See
	 * plugin life-cycle for information as to when this method is being called.
	 */
	public void install();

	/**
	 * Tells the applet that the plugin object can be cached and reused or not.
	 * The applet should return TRUE (the default) if the plugin object can be
	 * reused. Return FALSE if the a new plugin object should be instantiated
	 * each time it is needed. See plugin life-cycle below for information as to
	 * when this method is being called.
	 * 
	 * @return TRUE or FALSE
	 */
	public Boolean isCacheable();

	/**
	 * Tells the plugin the UNIQUE name that was given to it. This is useful to
	 * the plugin to denote each unique instance of the plugin that the user has
	 * setup (so that plugin configuration information can be kept unique per
	 * instance). See plugin life-cycle for information as to when this method
	 * is being called.
	 * 
	 * @param name
	 *            unique name for the plugin
	 */
	public void setName(String name);

	/**
	 * This method gives all the information about the problem, the current
	 * language and the specific component of the problem being edited (there
	 * may be more than one in a team environment). Please refer to the javadoc
	 * on the Problem and Language objects for details. You must import
	 * com.topcoder.client.contestant.ProblemComponentModel,
	 * com.topcoder.shared.problem.Renderer and import
	 * com.topcoder.shared.language.* from the ContestApplet.jar file.
	 * 
	 * @param component
	 * @param language
	 * @param renderer
	 */
	// TODO dokoczyc powyzszy komentarz
	public void setProblemComponent(ProblemComponentModel component,
			Language language, Renderer renderer);

	/**
	 * This method will be called to set the current source code. This method
	 * will be called when a problem is opened OR if the coder switches editors
	 * or language. Please note that the source could be blank.
	 * 
	 * @param source
	 *            current source code to set
	 */
	public void setSource(String source);

	/**
	 * This method is called to enable/disable editing of text within the
	 * editor. This method will be called with TRUE when you enter (or reenter)
	 * the coding phase and will be called with FALSE when the coding phase
	 * ends.
	 * 
	 * @param enable
	 *            TRUE or FALSE
	 */
	public void setTextEnabled(Boolean enable);

	/**
	 * Tells the plugin that the plugin is about to be used. See plugin
	 * life-cycle below for information as to when this method is being called.
	 */
	public void startUsing();

	/**
	 * Tells the plugin that the plugin will not be used until the next
	 * startUsing() method call. See plugin life-cycle for information as to
	 * when this method is being called.
	 */
	public void stopUsing();

	/**
	 * This method is called ONCE (per instance) when the plugin is being
	 * uninstalled. This gives the plugin a chance to cleanup any resources that
	 * were used. See plugin life-cycle for information as to when this method
	 * is being called.
	 */
	public void uninstall();
}
