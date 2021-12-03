package com.dcmarvel.apilive.document;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nonapi.io.github.classgraph.json.Id;

@Data
@NoArgsConstructor
@DynamoDBTable(tableName = "Heroes")
@Getter
@Setter
public class Heroes {

    @Id
    @DynamoDBHashKey(attributeName = "id")
    private String id;
    @DynamoDBHashKey(attributeName = "nome")
    private String name;
    @DynamoDBHashKey(attributeName = "universe")
    private String universe;
    @DynamoDBHashKey(attributeName = "films")
    private int films;


    public Heroes(String id, String name, String universe, int films) {
        this.id = id;
        this.name = name;
        this.universe = universe;
        this.films = films;
    }
}
