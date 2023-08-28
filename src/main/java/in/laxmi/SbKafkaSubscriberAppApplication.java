package in.laxmi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import in.laxmi.constants.KafkaConstants;

@SpringBootApplication
public class SbKafkaSubscriberAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbKafkaSubscriberAppApplication.class, args);
	}
	@KafkaListener(topics = KafkaConstants.TOPIC, groupId="group_ashokit_order")
	public void subscribeMsg(String order) {
			System.out.print("*** Msg Recieved From Kafka *** :: ");
			System.out.println(order);
		//logic
	}
}
