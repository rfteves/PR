package pr.exception

class RecordNotFoundException extends RuntimeException {

    RecordNotFoundException(String domainName, String findByMethodName, Object value) {
        println "\ndomainName $domainName"
        println "findByMethodName $findByMethodName"
        println "value $value"
    }

}
