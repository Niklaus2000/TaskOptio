package Utils;

import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;

public class FileUploadAutomatically {

    public static void main(String[] args) {
        try {
            uploadMemo(args);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void uploadMemo(String[] paths) throws AWTException {
        Robot robot = new Robot();


        robot.keyPress(KeyEvent.VK_CONTROL);

        for (String path : paths) {
            StringSelection ss = new StringSelection(path);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);


            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);


            robot.delay(5000);
        }


        robot.keyRelease(KeyEvent.VK_CONTROL);


        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
}
