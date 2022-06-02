def call(message) {
    echo "${message}"
    setup()
    def p = []
    p.add(string(name: 'ENV', defaultValue: message, description: 'target environment'))
    properties([
        parameters(p)
    ])
}

def setup() {
    echo params.ENV
}