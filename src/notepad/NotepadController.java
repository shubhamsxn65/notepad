/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author DELL
 */
public class NotepadController implements NotepadControllerIf {
    NotepadViewIf view;
    NotepadModelIf model;
    
    public NotepadController(NotepadModelIf model){
        this.model = model;
        view = new NotepadView(this,model);
    }
    
    @Override
    public void save(final String path) {
        try{
            model.writeOnDisk(view.textInTextArea(),path);
        }catch(Exception e){
            e.printStackTrace();
        }
        Timer saveTimer = new Timer();
        saveTimer.schedule(new TimerTask(){

            @Override
            public void run() {
                save(path);
            }
        }, 10000);
    }

    @Override
    public void open(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
