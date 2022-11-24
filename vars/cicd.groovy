def newDownload(repo)
{
  "git 'https://github.com/99518111/${repo}"
}


def newBuild{}
{
 sh 'mvn package'
}
