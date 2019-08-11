job('DSL-TEST') {
    steps {
        shell('${WORKSPACE}/scripts/helloword.sh')
    }
}
