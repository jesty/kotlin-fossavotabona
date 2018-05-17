import react.*
import react.dom.div
import react.dom.h2
import react.dom.li
import react.dom.ul
import utils.async
import utils.httpGet
import kotlin.js.JSON

external interface AlertProps: RProps {
    var bsClass: String
    var bsStyle: String
    var closeLabel: String
}

@JsModule("react-bootstrap/lib/Alert")
external val Alert: RClass<AlertProps>
