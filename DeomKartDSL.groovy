job('DemoKart-via-DSL'){
    description("My first DemoKart project via DSL")
    scm{
        git("https://github.com/saba231097/DeomKartApp.git", "*/main")
    }
    triggers{
        scm('* * * * *')
    }
    steps{
        maven('clean package', 'pom.xml')
    }
    publishers{
        //archive the generated war file....
        archiveArtifacts '**/*.war'
    }
}
views {
        listView('DSL_Jobs') {
            jobs {
                name('DemoKart-via-DSL')
            }
        }
    }