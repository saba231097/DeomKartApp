job('DemoKart-via-DSL'){
    description("My first DemoKart project via DSL")
    scm{
        git("https://github.com/saba231097/DeomKartApp.git")
    }
    triggers{
        scm('*****')
    }
    steps{
        maven('clean package', 'maven pom.xml pom.xml')
    }
    publishers{
        //archive the generated war file
        archiveArtifacts '**/*.war'
    }
}