package com.bluecode.mhmd.tarabin.data.db.model;

import com.orm.SugarRecord;
import com.orm.dsl.Unique;

import java.net.URI;

public class Note extends SugarRecord {

    private URI notePic;
    private String note;

    public Note() {
    }

    public Note(URI notePic, String note) {
        this.notePic = notePic;
        this.note = note;
    }

    public URI getNotePic() {
        return notePic;
    }

    public void setNotePic(URI notePic) {
        this.notePic = notePic;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
