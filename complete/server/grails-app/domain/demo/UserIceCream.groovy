package demo

import org.codehaus.groovy.util.HashCodeHelper

class UserIceCream implements Serializable {
    User user
    IceCream iceCream

    static mapping = {
        table 'user_ice_creams'
        id composite: ['user', 'iceCream']
        user column: 'username'
        iceCream column: 'ice_cream_id'
        version false
    }


    @Override
    boolean equals(other) {
        if (other instanceof UserRole) {
            other.userId == user?.username && other.roleId == iceCream?.id
        }
    }

    @Override
    int hashCode() {
        int hashCode = HashCodeHelper.initHash()
        if (user) {
            hashCode = HashCodeHelper.updateHash(hashCode, user.username)
        }
        if (iceCream) {
            hashCode = HashCodeHelper.updateHash(hashCode, iceCream.id)
        }
        hashCode
    }

}