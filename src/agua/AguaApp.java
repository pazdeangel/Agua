package agua;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

public class AguaApp extends SingleFrameApplication
{

    @Override protected void startup() {
        show(new JFrmMdi());
        
    }

    @Override protected void configureWindow(java.awt.Window root) {
    }

    public static AguaApp getApplication() {
        return Application.getInstance(AguaApp.class);
    }

    public static void main(String[] args) {
        launch(AguaApp.class, args);
    }
}
