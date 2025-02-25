# Kafka-Project-1 ( On Spring Boot )

Starting Apache Kafka with Zookeeper on Console
To run Apache Kafka with Zookeeper on your local machine, follow these steps:
📌 Step 1: Download and Extract Kafka
1.	Download Apache Kafka 3.3+ from Kafka Downloads.
2.	Extract the ZIP file to C:\kafka_2.13-3.9.0
3.	Open CMD and navigate to Kafka folder:
       Run the following command in CMD:  - 
•	cd C:\kafka_2.13-3.9.0

📌 Step 2: Start Zookeeper
Run the following command in CMD:
Kafka requires Zookeeper to manage brokers.
Run Zookeeper from Kafka directory:  ( Windows command )
•	bin\windows\zookeeper-server-start.bat config/zookeeper.properties
![zookeeper-server-start](https://github.com/user-attachments/assets/2715f5d1-9bab-404c-830e-6b353e8496f4)

✔ Zookeeper starts on port 2181 by default.

📌 Step 2: Start Kafka Broker / Server
In a new CMD window, create a topic:
Once Zookeeper is running, start the Kafka broker: (Windows command)
•	bin\windows\kafka-server-start.bat config\server.properties
![kafka-server-start](https://github.com/user-attachments/assets/4a5f68e3-ecba-4538-9488-f00ce27f8221)

✔ Kafka runs on port 9092 by default.

Test On PostMan
![image](https://github.com/user-attachments/assets/18783d69-d781-49ec-a3dc-44df43d0c5db)

#IPM application.propertice.java (deliveryboy) 

spring.application.name=deliveryboy

## Kafka Broker Address
spring.kafka.bootstrap-servers=localhost:9092

## Kafka Producer Configuration
spring.kafka.producer.key-serializer=org.apache.kafka.common.serialization.StringSerializer
spring.kafka.producer.value-serializer=org.apache.kafka.common.serialization.StringSerializer

## Kafka Admin (for topic creation)
spring.kafka.admin.auto-create=true

#spring.kafka.admin.properties.request.timeout.ms=60000
#spring.kafka.admin.properties.retry.backoff.ms=50

#IPM application.propertice.java (enduser)

spring.application.name=enduser

## Consumer Configuration
server.port=8081
## Kafka Broker Address
spring.kafka.consumer.bootstrap-servers=localhost:9092

## Kafka Producer Configuration
spring.kafka.consumer.key-serializer=org.apache.kafka.common.serialization.StringSerializer
spring.kafka.consumer.value-serializer=org.apache.kafka.common.serialization.StringSerializer


## Kafka Consumer Configuration (if needed)
spring.kafka.consumer.group-id=deliveryboy-group-id
spring.kafka.consumer.auto-offset-reset=earliest
