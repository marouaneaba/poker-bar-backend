package com.common.kafka.producter;

import com.common.kafka.topic.Topic;
//import org.springframework.util.concurrent.ListenableFutureCallback;

public interface ProducterInterface {

	public void sendMessage(Topic topic, Object message);

	//public void sendMessageWithFeedBack(Topic topic, Object message, ListenableFutureCallback callback);
}
