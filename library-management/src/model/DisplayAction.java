package model;

import java.util.List;

public class DisplayAction extends Action{
    public DisplayAction(String message, List<Object> objs) {
        super(message,objs);
    }

    @Override
    public void doAction() {
        objs.stream().forEach(doc->doc.display());
    }
}
