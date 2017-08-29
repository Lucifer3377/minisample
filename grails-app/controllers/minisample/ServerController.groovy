package minisample

import grails.converters.JSON

class ServerController {

    def getdata() {
        def favourite=[sports:"baskeball",sing:"solo",color:"red"]
        def res=[first:"sandeep",second:"chandel",other:[favourite]]
        def all=[data:[res]]

        render all as JSON
    }
}
