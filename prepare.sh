cd gateway
mvn clean package -DskipTests
cd ..

cd service1
mvn clean package -DskipTests
cd ..

cd bookings
mvn clean package -DskipTests
cd ..
