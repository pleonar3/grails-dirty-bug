package app

class Person {
    String name
    Float wealth = 0.0f
    Person friend

    def payTaxes() {
        wealth -= wealth * 0.35f
    }

    static constraints = {
        name()
        wealth()
        friend nullable: true, cascade: 'save-update'
    }
}
