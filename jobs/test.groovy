job('DSL-TEST') {
    steps {
        shell(readFileFromWorkspace('/scripts/helloword.sh'))
    }
}
