def call(message) {
    echo "${message}"
    setup()
    def p = null
    p.add(string(name: 'ENV', defaultValue: message, description: 'target environment'))
    properties([
        parameters(p)
    ])
}

def setup() {
    echo params.ENV
}