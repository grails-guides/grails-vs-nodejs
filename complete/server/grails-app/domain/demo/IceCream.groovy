package demo

class IceCream implements Serializable {
    String flavor

    static mapping = {
        table 'ice_creams'
        flavor type: 'text'
        version false
    }
}