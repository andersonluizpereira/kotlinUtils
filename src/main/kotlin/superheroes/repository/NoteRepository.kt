package superheroes.repository

import org.springframework.data.repository.CrudRepository
import superheroes.model.Note

interface NoteRepository : CrudRepository<Note, Long> {}