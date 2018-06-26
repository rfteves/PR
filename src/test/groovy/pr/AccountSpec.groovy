package pr

import grails.testing.gorm.DomainUnitTest
import pr.exception.RecordNotFoundException
import spock.lang.Specification

class AccountSpec extends Specification implements DomainUnitTest<Account> {

    void "new Account"() {
        setup:
        Account account = new Account([
                firstName: 'Ricardo',
                lastName: 'Teves'
        ])

        when:
        account.save(flush: true, failOnError: true)

        then:
        Account.count == old(Account.count) + 1
        Account.getById(1)

        when:
        Account.getById(2)

        then:
        RecordNotFoundException recordNotFoundException = thrown()
        Account.Gone

        when:
        Account.Gone gone = new Account.Gone()

        then:
        gone
        gone.startDate

        when:
        Account.DateRange dateRange = new Account.DateRange()
        println("daterange is " + dateRange)

        then:
        dateRange
    }
}
