package imooc.test2.test;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Student {

    @SerializedName("name")
//    @JsonProperty("name")
    private String trueName;
    @SerializedName("age")
//    @JsonProperty("age")
    private String trueAge;
}