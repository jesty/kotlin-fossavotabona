package it.devday.kotlincodemotion.resource

import it.devday.kotlincodemotion.domain.Contact
import it.devday.kotlincodemotion.repository.ContactRepository
import it.devday.kotlincodemotion.unwrap
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/contacts")
class ContactResource(val contactRepository: ContactRepository) {
    @GetMapping //curl -XGET http://localhost:8080/contacts
    fun getAll() = contactRepository.findAll()

    @GetMapping("/{id}") //curl -XGET http://localhost:8080/contacts/1
    fun getAll(@PathVariable id: Long) = contactRepository.findById(id)

    @PostMapping //curl -XPOST http://localhost:8080/contacts  -H 'Content-Type: application/json' -d '{"name":"Davide", "surname":"Cerbo"}'
    fun insert(@RequestBody contact: Contact) = contactRepository.save(contact)

    @DeleteMapping("/{id}") //curl -XDELETE http://localhost:8080/contacts/1
    fun delete(@PathVariable id: Long) {
        val contact = contactRepository.findById(id).unwrap()
        contact?.let { contactRepository.delete(contact) }
    }
}