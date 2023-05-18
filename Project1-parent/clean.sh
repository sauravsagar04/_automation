#!/bin/bash

echo "clean ..."
# rm Project1-api
rm -rf Project1-api/src/

# rm Project1-api-test
rm -rf Project1-api-test/src/main/
rm -rf Project1-api-test/src/test/java/
rm -rf Project1-api-test/src/test/resources/testng.xml
rm -rf Project1-api-test/src/test/data/

# rm Project1-base
rm -rf Project1-base/src/

# rm Project1-api
rm -rf Project1-api/src/

# rm Project1-bundle
rm -rf Project1-bundle/src/

# rm Project1-bundle-mock
rm -rf Project1-bundle-mock/src/

mvn clean
echo "clean done."