package com.dcmarvel.apilive.config;

import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.PutItemOutcome;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Table;

import static com.dcmarvel.apilive.constants.HeroesConstant.ENDPOINT_DYNAMO;
import static com.dcmarvel.apilive.constants.HeroesConstant.REGION_DYNAMO;


public class HeroesData {

    public static void main(String[] args) throws Exception{

        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
                .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(ENDPOINT_DYNAMO,REGION_DYNAMO))
                .build();

        DynamoDB dynamoDB = new DynamoDB(client);

        Table table = dynamoDB.getTable("Heroes");
        Item hero = new Item()
                .withPrimaryKey("id",1)
                .withString("nome", "Meu Ovo")
                .withString("universe", "CoatinaMarvel")
                .withNumber("films", 4);

        PutItemOutcome outcome = table.putItem(hero);
    }
}
