cd gateway
mvn clean package -DskipTests
cd ..

cd hotels
mvn clean package -DskipTests
cd ..

cd bookings
mvn clean package -DskipTests
cd ..
