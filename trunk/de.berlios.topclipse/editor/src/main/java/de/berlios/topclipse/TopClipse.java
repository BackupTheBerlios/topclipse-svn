package de.berlios.topclipse;

import javax.swing.JDialog;
import javax.swing.JPanel;

import de.berlios.topclipse.config.ConfigKey;
import de.berlios.topclipse.config.ConfigurationDialog;
import de.berlios.topclipse.tcapplet.IEntryPoint;

import com.topcoder.client.contestApplet.common.LocalPreferences;
import com.topcoder.client.contestant.ProblemComponentModel;
import com.topcoder.client.contestant.ProblemModel;
import com.topcoder.netCommon.contestantMessages.response.data.ComponentChallengeData;
import com.topcoder.shared.language.Language;
import com.topcoder.shared.problem.Constraint;
import com.topcoder.shared.problem.DataType;
import com.topcoder.shared.problem.Element;
import com.topcoder.shared.problem.ProblemComponent;
import com.topcoder.shared.problem.Renderer;
import com.topcoder.shared.problem.TestCase;

/**
 * TopClipse is an open-source editor plugin for the TopCoder Arena applet. It
 * allows developers to use Eclipse IDE by providing integration with it.
 * TopClipse generates source code and test cases based on competition problem
 * statement. It helps developers to speed up their programming. TopClipse was
 * never planned as rich source editor. It is rather a source generator.
 * 
 * @author Maciek Mazur
 */
public class TopClipse implements IEntryPoint {

	/**
	 * Editor panel.
	 */
	private JPanel editorPanel;

	/**
	 * Creates main class of TopClipse editor. It is required by TopCoder Arena
	 * API.
	 */
	public TopClipse() {
		this.editorPanel = new JPanel();
		// TODO only for development process
		// BEGIN
		LocalPreferences lp = LocalPreferences.getInstance();
		lp.setProperty(ConfigKey.ECLIPSE_HOME.key(),
				"C:\\Program Files\\eclipse 3.2"); //$NON-NLS-1$
		lp.setProperty(ConfigKey.ECLIPSE_WORKSPACE.key(),
				"D:\\Documents\\My Eclipse Workspaces\\topcoder"); //$NON-NLS-1$
		// END
	}

	public void clear() {
		// TODO Auto-generated method stub

	}

	public void configure() {
		JDialog configurationPanel = new ConfigurationDialog();
		configurationPanel.setVisible(true);
	}

	public void dispose() {
		// TODO Auto-generated method stub

	}

	public JPanel getEditorPanel() {
		return this.editorPanel;
	}

	public String getSource() {
		// TODO zaimplementowa�
		return ""; //$NON-NLS-1$
	}

	public void install() {
		// TODO Auto-generated method stub

	}

	public Boolean isCacheable() {
		// TODO Auto-generated method stub
		return Boolean.FALSE;
	}

	public void setName(String name) {
		// TODO Auto-generated method stub

	}

	public void setProblemComponent(ProblemComponentModel component,
			Language language, Renderer renderer) {
		// TODO Auto-generated method stub
		
		System.out.println("ProblemComponentModel - START");
		System.out.println("ProblemComponentModel.getClassName():" + component.getClassName());
		ProblemComponent problemComponent = component.getComponent();
		System.out.println("\tProblemComponent - START");
			String[] allMethodNames = problemComponent.getAllMethodNames();
			System.out.println("\t\tproblemComponent.getAllMethodNames() - START");
			for (String string : allMethodNames) {
				System.out.println(string);
			}
			System.out.println("\t\tproblemComponent.getAllMethodNames() - END");
			String[][] allParamNames = problemComponent.getAllParamNames();
			System.out.println("\t\t\tProblemComponent.getAllParamNames() - START");
			for (int i = 0; i < allParamNames.length; i++) {
				String[] strings = allParamNames[i];
				for (int j = 0; j < strings.length; j++) {
					String string = strings[j];
					System.out.println("\t\t\t\t["+i+"]"+"["+j+"]:" +string);
				}
			}
			System.out.println("\t\t\tProblemComponent.getAllParamNames() - END");
			problemComponent.getAllParamTypes();
		System.out.println("\tProblemComponent - END");
		ComponentChallengeData componentChallangeData = component.getComponentChallengeData();
		Integer componentTypeId = component.getComponentTypeID();
		System.out.println("ProblemComponentModel.getComponentTypeID(): " + componentTypeId);
		Constraint[] constraints = component.getConstraints();
		System.out.println("ProblemComponentModel.getDefaultSolution(): " + component.getDefaultSolution());
		Long id = component.getID();
		System.out.println("ProblemComponentModel.getID():" + component.getID());
		Element intro = component.getIntro();
		
		System.out.println("ProblemComponentModel.getMethodName():" + component.getMethodName());
		Element[] notes = component.getNotes();
		String[] paramNames = component.getParamNames();
		DataType[] paramTypes = component.getParamTypes();
		Double points = component.getPoints();
		System.out.println("ProblemComponentModel.getPoints(): " + component.getPoints());
		ProblemModel problemModel = component.getProblem();
		DataType returnType = component.getReturnType();
		Element spec = component.getSpec();
		TestCase[] testCases = component.getTestCases();
		component.hasConstraints();
		System.out.println("ProblemComponentModel.hasConstraints(): " + component.hasConstraints());
		component.hasDefaultSolution();
		System.out.println("ProblemComponentModel.hasDefaultSolution(): "  + component.hasDefaultSolution());
		System.out.println("ProblemComponentModel.hasIntro(): " + component.hasIntro());
		System.out.println("ProblemComponentModel.hasNotes():" + component.hasNotes());
		System.out.println("ProblemComponentModel.hasSignature(): " + component.hasSignature());
		System.out.println("ProblemComponentModel.hasSpec(): " + component.hasSpec());
		System.out.println("ProblemComponentModel.hasStatement():" + component.hasStatement());
		System.out.println("ProblemComponentModel.hasTestCases():" + component.hasTestCases());
		System.out.println("ProblemComponentModel - END");
		
		System.out.println("Langueage - START");
		System.out.println("Language.getId() :" + language.getId());
		System.out.println("Language.getName() :" + language.getName());		
		System.out.println("Langueage - END");
		
		System.out.println("Renderer - START");
		System.out.println("Renderer.toHTML() START:");
		try {
			System.out.println(renderer.toHTML(language));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Renderer.toHTML() END:");
		System.out.println("Renderer - END");		
	}

	public void setSource(String source) {
		// TODO zaimplementowa�
	}

	public void setTextEnabled(Boolean enable) {
		// TODO Auto-generated method stub

	}

	public void startUsing() {
		// TODO Auto-generated method stub

	}

	public void stopUsing() {
		// TODO Auto-generated method stub

	}

	public void uninstall() {
		// TODO Auto-generated method stub

	}
}
