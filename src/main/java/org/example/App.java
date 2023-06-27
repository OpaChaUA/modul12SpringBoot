package org.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        NoteService noteService = new NoteService();

        Note note1 = new Note();
        note1.setTitle("Note 1");
        note1.setContent("Content 1");
        Note addedNote1 = noteService.addNewNote(note1);
        System.out.println("Added Note 1: " + addedNote1);

        System.out.println("###############################");

        Note note2 = new Note();
        note2.setTitle("Note 2");
        note2.setContent("Content 2");
        Note addedNote2 = noteService.addNewNote(note2);
        System.out.println("Added Note 2: " + addedNote2);

        System.out.println("###############################");

        System.out.println("getAllNotes");
        System.out.println("All Notes: " + noteService.allNote());

        System.out.println("###############################");

        System.out.println("getNoteById");
        long id = addedNote1.getId();
        Note retrievedNote = noteService.getById(id);
        System.out.println("Retrieved Note with id " + id + ": " + retrievedNote);

        System.out.println("###############################");

        System.out.println("updateNote");
        Note updatedNote = new Note();
        updatedNote.setId(id);
        updatedNote.setTitle("Updated Note");
        updatedNote.setContent("Updated Content");
        noteService.update(updatedNote);
        System.out.println("Updated Note with id " + id + ": " + noteService.getById(id));

        System.out.println("###############################");

        System.out.println("deleteNote");
        noteService.deleteById(id);
        System.out.println("All Notes after deletion: " + noteService.allNote());
    }
}


