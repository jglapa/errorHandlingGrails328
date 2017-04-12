package errorhandlinggrails328

class TestController {

    def deny() {
        render status: 403
    }
}
