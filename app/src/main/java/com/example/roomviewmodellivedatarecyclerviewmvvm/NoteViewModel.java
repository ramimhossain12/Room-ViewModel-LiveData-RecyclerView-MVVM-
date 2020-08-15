package com.example.roomviewmodellivedatarecyclerviewmvvm;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class NoteViewModel extends AndroidViewModel {
    private  NoteRepsotory repsotory;
    private LiveData<List<Note>> allNotes;
    public NoteViewModel(@NonNull Application application) {
        super(application);

        repsotory = new NoteRepsotory(application);
        allNotes = repsotory.getAllNotes();

    }
     public  void  insert(Note note){
        repsotory.insert(note);
     }

    public  void  update(Note note){
        repsotory.update(note);
    }


    public  void  delete(Note note){
        repsotory.delete(note);
    }

    public  void  deleteAllNotes(Note note){
        repsotory.deleteAllNotes(note);
    }

    public  LiveData<List<Note>> getAllNotes(){
        return allNotes;
    }

}
