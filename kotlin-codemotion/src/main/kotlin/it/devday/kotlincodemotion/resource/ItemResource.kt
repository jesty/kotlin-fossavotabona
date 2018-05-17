package  it.devday.kotlincodemotion.resource;

import it.devday.kotlincodemotion.domain.Item
import it.devday.kotlincodemotion.repository.delete
import it.devday.kotlincodemotion.repository.findAll
import it.devday.kotlincodemotion.repository.findById
import it.devday.kotlincodemotion.repository.save
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/items")
class ItemResource {

    //@GetMapping //curl -XGET http://localhost:8080/items
    //fun getAll(): List<Item> = listOf(Item(0,"Test", ValueAddedTax(10.0), Price(22.0), Quantity(1.0)))

    @GetMapping //curl -XGET http://localhost:8080/items
    fun getAll() = Item.findAll()

    @GetMapping("/{id}") //curl -XGET http://localhost:8080/items/1
    fun getAll(@PathVariable id: Long) = Item.findById(id)

    @PostMapping //curl -XPOST http://localhost:8080/items  -H 'Content-Type: application/json' -d '{"description":"Kotlin in action", "vat":{"percentage":10}, "price":{"amount":1.5}, "quantity":{"value":"10"}}'
    fun insert(@RequestBody item: Item): Item {
        Item.save(item)
        return item
    }

    @DeleteMapping("/{id}") //curl -XDELETE http://localhost:8080/items/1
    fun delete(@PathVariable id: Long): Item {
        return Item.delete(id)
    }

}



