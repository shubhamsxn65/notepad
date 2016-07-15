/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad;

/**
 *
 * @author DELL
 */
public class NotepadMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NotepadModelIf model = new NotepadModel();
        new NotepadController(model);
    }
}
