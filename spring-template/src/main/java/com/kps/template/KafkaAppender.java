package com.kps.template;

import org.apache.log4j.RollingFileAppender;

public class KafkaAppender extends RollingFileAppender {
    // kafka配置 topic
    private String topic;
    //broker是指kafka集群的broker地址
    private String brokerList;
    //producerType是指producer的类型，sync和async
    private String producerType;
    //batchSize是指producer发送消息的批量大小
    private String batchSize;
    //requestTimeout是指producer发送消息请求的超时时间   
    private String requestTimeout;
    //acks是指producer发送消息的ack确认级别
    private String acks;
    //retries是指producer发送消息失败的重试次数
    private String retries;
    //maxBlock是指producer发送消息时，如果buffer已满，producer发送消息需要阻塞的时间
    private String maxBlock;
    //compressionType是指producer发送消息时，消息压缩的类型
    private String compressionType;
    //keySerializer和valueSerializer是指producer发送消息时，消息的key和value的序列化方式
    private String keySerializer;
    private String valueSerializer;
    //partitioner是指producer发送消息时，消息的分区方式
    private String partitioner;
    //batch是指producer发送消息时，消息的批量发送方式
    private String batchCount;
    //batchTime是指producer发送消息时，消息的批量发送时间
    private String batchTime;
    //batchSizeBytes是指producer发送消息时，消息的批量发送大小
    private String batchSizeBytes;
    //batchSizeBytesTime是指producer发送消息时，消息的批量发送大小和发送时间
    private String batchSizeBytesTime;
    //batchSizeBytesCount是指producer发送消息时，消息的批量发送大小和发送次数
    private String batchSizeBytesCount;
    //batchSizeBytesTimeCount是指producer发送消息时，消息的批量发送大小和发送时间和次数
    private String batchSizeBytesTimeCount;
    

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
