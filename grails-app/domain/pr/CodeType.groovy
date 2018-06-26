package pr

class CodeType extends Stamp {

    String name
    String code
    String displayCode
    Integer displayOrder
    Boolean isActive = true

    static constraints = {
    }

    static mapping = {
        discriminator column: 'discriminator', maxSize: 30
    }
}
