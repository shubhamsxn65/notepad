/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad;

/**
 *
 * @author DELL
 */
public interface NotepadModelIf {
    void writeOnDisk(String string, String fileName);
    void readFromDisk(String name);
    void registerReceiver(NotepadViewIf n);
    void removeReceiver(NotepadViewIf n);
    
}
