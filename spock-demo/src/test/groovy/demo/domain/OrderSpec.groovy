package demo.domain

import spock.lang.Specification
import spock.lang.Unroll

class OrderSpec extends Specification {
    @Unroll
    def "Testing order setQuantity()"() {
        given: "Create order object"
        Order order = new Order()
        when:
        order.setQuantity(item)
        then:
        order.quantity == expectedItem
        where:
        sno | item | expectedItem
        1   | 20   | 20
        2   | 30   | 30
        3   | 0    | 0
    }
    
    @Unroll
    def "Testing order getQuantity()"() {
        given: "Create order object"
        Order order = new Order()
        and:
        order.setQuantity(item)
        when:
        int a = order.getQuantity()
        then:
        a == expectedItem
        where:
        sno | item | expectedItem
        1   | 20   | 20
        2   | 30   | 30
        3   | 0    | 0
    }
    
    @Unroll
    def "Testing order setItemName()"() {
        given: "Create order object"
        Order order = new Order()
        when:
        order.setItemName(item)
        then:
        order.itemName == expectedItem
        where:
        sno | item     | expectedItem
        1   | "banana" | "banana"
        2   | "mango"  | "mango"
    }
    
    def "Testing order getItemName()"() {
        given: "Create order object"
        Order order = new Order()
        and:
        order.setItemName(item)
        when:
        String a = order.getItemName()
        then:
        a == expectedItem
        where:
        sno | item     | expectedItem
        1   | "banana" | "banana"
        2   | "mango"  | "mango"
    }
    
    @Unroll
    def "Testing order setPrice()"() {
        given: "Create order object"
        Order order = new Order()
        when:
        order.setPrice(item)
        then:
        order.price == expectedItem
        where:
        sno | item | expectedItem
        1   | 20   | 20
        2   | 30   | 30
        3   | 0    | 0
        4   | 30D  | 30D
    }
    
    @Unroll
    def "Testing order getPrice()"() {
        given: "Create order object"
        Order order = new Order()
        and:
        order.setPrice(item)
        when:
        double a = order.getPrice()
        then:
        a == expectedItem
        where:
        sno | item | expectedItem
        1   | 20   | 20
        2   | 30   | 30
        3   | 0    | 0
        4   | 30D  | 30D
    }
    
    @Unroll
    def "Testing order setPriceWithTex()"() {
        given: "Create order object"
        Order order = new Order()
        when:
        order.setPriceWithTex(item)
        then:
        order.priceWithTex == expectedItem
        where:
        sno | item | expectedItem
        1   | 20   | 20
        2   | 30   | 30
        3   | 0    | 0
        4   | 30D  | 30D
    }
    
    @Unroll
    def "Testing order getPriceWithTex()"() {
        given: "Create order object"
        Order order = new Order()
        and:
        order.setPriceWithTex(item)
        when:
        double a = order.getPriceWithTex()
        then:
        order.priceWithTex == expectedItem
        where:
        sno | item | expectedItem
        1   | 20   | 20
        2   | 30   | 30
        3   | 0    | 0
        4   | 30D  | 30D
    }
}
