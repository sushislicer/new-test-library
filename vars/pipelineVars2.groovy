def call(Map config = [:]) {
    if(config.inParallel) {
        parallel {
            "pipe1" : {
                runPOCProxy("pipe1")
            },
            "pipe2" : {
                runPOCProxy("pipe2")
            }
        }
    } else {
        runPOCProxy(pipe1)
    }
}

def runPOCProxy(String branch){
    build job: "POC-aggregate/${branch}", parameters: [
    ]
}