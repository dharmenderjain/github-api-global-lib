def call(Map config = [:]) {
    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
}

def mycall(Map config = [:]) {
    sh "echo Hello there ${config.name}. Today is ${config.dayOfWeek}."
}
