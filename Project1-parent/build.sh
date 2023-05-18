#!/bin/bash

echo "build ..."
if [ "local_bundle_mock" = $1 ] ; then
    mvn clean package -pl Project1-bundle-mock -am -Dbdmgc.skip=false -Dcodeg.author=fastjrun
elif [ "provider_mock" = $1 ] ; then
    mvn clean package -pl Project1-provider-mock -am -Dbdmgc.skip=false -Dcodeg.author=fastjrun
    cp Project1-provider-mock/target/Project1-provider-mock.war ~/server/tomcat8/webapps/Project1-provider-mock.war
elif [ "package_api_test" = $1 ] ; then
    mvn clean package -pl Project1-api-test -am -Dclientgc.skip=false -Dcodeg.author=fastjrun
elif [ "unitTest" = $1 ] ; then
    mvn clean verify -pl Project1-test -PunitTest -am
elif [ "mock_test" = $1 ] ; then
    mvn clean package -pl Project1-api-test -Dclientgc.skip=false -Dcodeg.author=fastjrun -Pmock
elif [ "package_provider" = $1 ] ; then
    mvn clean package -pl Project1-provider -am -Dbasegc.skip=false -Dbdgc.skip=false -Dcodeg.author=fastjrun -P$2
    cp Project1-provider/target/Project1-provider.war ~/server/tomcat8/webapps/Project1-provider.war
elif [ "api_test" = $1 ] ; then
    mvn clean package -pl Project1-api-test -Dclientgc.skip=false -Dcodeg.author=fastjrun -P$2
elif [ "package_task" = $1 ] ; then
    mvn clean package -pl Project1-task -am -Dbasegc.skip=false -Dbdgc.skip=false -Dcodeg.author=fastjrun -P$2
    rm -rf ~/app/Project1/Project1-task
    cp -r Project1-task/target/Project1-task/Project1-task ~/app/Project1/Project1-task
elif [ "package_ci" = $1 ] ; then
    mvn clean package -pl Project1-base -am -Dbasegc.skip=false -Dcodeg.author=fastjrun
    mvn clean package -pl Project1-bundle -am -Dbdgc.skip=false -Dcodeg.author=fastjrun
    mvn clean package -pl Project1-api-test -am -Dclientgc.skip=false -Dcodeg.author=fastjrun -Dmaven.test.skip=true
    mvn clean package -pl Project1-bundle-mock -am -Dbdmgc.skip=false -Dcodeg.author=fastjrun
    mvn clean package -pl Project1-api -am -Dapigc.skip=false -Dcodeg.author=fastjrun
elif [ "service_ut" = $1 ] ; then
    mvn clean package -pl Project1-test -am -Dbasegc.skip=false -Dbdgc.skip=false -Dcodeg.author=fastjrun -P$2
fi
echo "build done."