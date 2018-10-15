package electron.jfabiantorres.practica3.repositories;

import com.orm.SugarRecord;

import java.util.List;

import electron.jfabiantorres.practica3.models.Note;

public class NoteRepository {

    public static List<Note> list (){
        List<Note> notes = SugarRecord.listAll(Note.class);
        return notes;
    }

    public static Note read (Long id){
        Note note = SugarRecord.findById(Note.class, id);
        return note;
    }

    public static void create (String title, String description, String date){
        Note note = new Note();

        note.setTitle(title);
        note.setDescription(description);
        note.setDate(date);

        SugarRecord.save(note);

    }

    public static void update (String title, String description, String date, Long id) {
        Note note = SugarRecord.findById(Note.class, id);

        note.setTitle(title);
        note.setDescription(description);
        note.setDate(date);

        SugarRecord.save(note);

    }

    public static void delete (Long id) {
        Note note = SugarRecord.findById(Note.class, id);
        SugarRecord.delete(note);
    }

}
