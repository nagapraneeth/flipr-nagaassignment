package com.springrest.springrest.entity; 
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(doNotUseGetters = true)
@Document(collection = "Customer")
public class Customer {

    @Field("name")
    private String name;

    @Field("email")
    private String email;

    @Field("number")
    private Integer number;

    @Field("city")
    private String city;

}