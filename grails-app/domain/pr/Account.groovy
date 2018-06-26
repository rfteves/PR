package pr

import java.sql.Date
import java.time.LocalDate

class Account {

    String firstName
    String lastName

    static class Gone implements grails.validation.Validateable {
        java.sql.Date startDate = Date.valueOf(LocalDate.now())
    }

    static constraints = {
    }
}
