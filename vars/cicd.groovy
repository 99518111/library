def newDownload(repo)
{
  https://github.com/99518111/${repo}"
}


def newBuild()
{
  sh 'mvn package'()
}

def newDeploy(jobname,ip,appname)
{
  sh "scp /var/lib/jenkins/workspace/practice_${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname}.war"
}
