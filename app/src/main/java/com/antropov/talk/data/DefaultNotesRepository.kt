package com.antropov.talk.data

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

class DefaultNotesRepository @Inject constructor(
  private val notesDataSource: NotesDataSource,
  private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) : NotesRepository {

  override suspend fun getNotes(): List<Note> {
    return notesDataSource.getNotes()
  }

  override suspend fun getNote(noteId: Int): Note? {
    return notesDataSource.getNote(noteId)
  }

  override suspend fun addNote(note: Note) {
    notesDataSource.addNote(note)
  }

  override suspend fun updateNote(note: Note) {
    notesDataSource.updateNote(note)
  }

  override suspend fun clearNotes() {
    notesDataSource.clearNotes()
  }
}