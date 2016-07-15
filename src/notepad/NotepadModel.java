/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad;

import java.io.*;

/**
 *
 * @author DELL
 */
public class NotepadModel implements NotepadModelIf{

    NotepadViewIf mainView;
    @Override
    public void writeOnDisk(String string, String fileName) {
        byte buf[] = string.getBytes();
        try {
            OutputStream os = new FileOutputStream(fileName);
            os.write(buf);
            os.close();
            mainView.updateView();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }

    @Override
    public void readFromDisk(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void registerReceiver(NotepadViewIf n) {
        this.mainView = n;
    }

    @Override
    public void removeReceiver(NotepadViewIf n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
