echo "Maintenance..."
docker stop api-service
docker rm api-service
echo "Running..."
docker run -p 9090:8080 -d --name api-service 906739970468.dkr.ecr.us-east-2.amazonaws.com/cca-spring-boot:latest
