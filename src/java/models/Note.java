package models;

public class Note {
    // attributes
    private String noteTitle;
    private String noteContents;

    // no argument consutrctor (with null safety)
    public Note() {
        this.noteTitle = "";
        this.noteContents = "";
    }
    
    // user generated constructor
    public Note(String noteTitle, String noteContents) {
        this.noteTitle = noteTitle;
        this.noteContents = noteContents;
    }

    // access modifiers
    public String getNoteTitle() {
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public String getNoteContents() {
        return noteContents;
    }

    public void setNoteContents(String noteContents) {
        this.noteContents = noteContents;
    }
}