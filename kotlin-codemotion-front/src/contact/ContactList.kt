package contact

import react.*
import react.dom.div
import react.dom.h2
import react.dom.li
import react.dom.ul
import utils.async
import utils.httpGet
import kotlin.js.JSON
import ReactBootstrap

interface ContactListProps : RProps {
    var owner: String
}

interface ContactListState : RState {
    var list: Array<Contact>
}

class ContactList(props: ContactListProps) : RComponent<ContactListProps, ContactListState>(props) {

    override fun ContactListState.init(props: ContactListProps) {
        list = emptyArray()
    }

    override fun componentDidMount() {
        async {
            val listData = httpGet("/contacts")
            setState { list = JSON.parse<Array<Contact>>(listData) }
        }

    }

    override fun componentWillUnmount() {
    }

    override fun RBuilder.render() {
        div("ContactList-header") {
            key = "contactListHeader"
            Alert {
                attrs {
                    bsStyle = "warning"
                }

                +"Got an error"
            }
            h2 {
                +"${props.owner}'s contact list"
            }
            ul {
                for (c in state.list) {
                    li { +"${c.id}: ${c.name} ${c.surname}" }
                }
            }
        }
    }
}

fun RBuilder.contactList(owner: String = "No-name") = child(ContactList::class) {
    attrs.owner = owner
}
