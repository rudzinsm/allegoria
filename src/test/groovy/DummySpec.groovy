import spock.lang.*

@Unroll
class DummySpec extends Specification {

    def "minimum of #a and #b is #c"() {
        expect:
        Math.min(a, b) == c

        where:
        a | b || c
        3 | 7 || 3
        5 | 4 || 4
        9 | 9 || 9
    }

}
