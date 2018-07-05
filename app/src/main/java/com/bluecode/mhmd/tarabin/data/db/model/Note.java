package com.bluecode.mhmd.tarabin.data.db.model;

import com.orm.SugarRecord;
import com.orm.dsl.Unique;

import java.net.URI;

public class Note extends SugarRecord {

    @Unique
    private Long id;
    private URI notePic;
    private String note;

    public Note() {
    }

    public Note(Long id, URI notePic, String note) {
        this.id = id;
        this.notePic = notePic;
        this.note = note;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
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
