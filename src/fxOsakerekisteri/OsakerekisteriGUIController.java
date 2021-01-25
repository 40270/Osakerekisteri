package fxOsakerekisteri;

import fi.jyu.mit.fxgui.Dialogs;
import javafx.fxml.FXML;
/**
 * @author Julio
 * @version 18.1.2021
 *
 */
public class OsakerekisteriGUIController {
	
    @FXML
    void handleUusiOsake() {
    	Dialogs.showQuestionDialog("Uusi osake?", "Ostetaanko osake: Gamestop?", "Kyll�", "Eiku");

    }
	
	
    @FXML void handleOstaOsake() {
    	osta();
    }
    
    // ===============================================================
    
    
    private void osta() {
    	Dialogs.showMessageDialog("Ostit osakkeen! Mutta �l�p� h�tt�ile, ei toimi viel�.");
    }
	
}
