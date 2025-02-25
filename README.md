# Kafka-Project-1

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
