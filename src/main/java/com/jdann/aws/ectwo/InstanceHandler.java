package com.jdann.aws.ectwo;

import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2ClientBuilder;
import com.amazonaws.services.ec2.model.StartInstancesRequest;
import com.amazonaws.services.ec2.model.StopInstancesRequest;

public class InstanceHandler {

    private static final String instanceId = "i-068c06ac87d1e7c35";
    private final AmazonEC2 ec2 = AmazonEC2ClientBuilder.defaultClient();

    public void stop() {

        StopInstancesRequest request = new StopInstancesRequest()
                .withInstanceIds(instanceId);

        ec2.stopInstances(request);
    }

    public void start() {

        StartInstancesRequest request = new StartInstancesRequest()
                .withInstanceIds(instanceId);

        ec2.startInstances(request);
    }
}
