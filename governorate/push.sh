export COMPONENT_NAME=cca-spring-boot
export URL_REPO=906739970468.dkr.ecr.us-east-2.amazonaws.com

echo "Building object [$COMPONENT_NAME]..."
./refresh-dependencies.sh
./gradlew :spring-boot:build build
 
echo "Building image [$COMPONENT_NAME]..."
docker build -t $COMPONENT_NAME .
docker tag $COMPONENT_NAME:latest $URL_REPO/$COMPONENT_NAME:latest

echo "Pushing image [$COMPONENT_NAME]..."
docker push $URL_REPO/$COMPONENT_NAME:latest