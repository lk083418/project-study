package imooc.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class SatVo {
    private Integer id;
    private String name;
    private String sex;
//    @SerializedName("aaAcPointId")
    @JsonProperty("aaAcPointId")
    private String aAcPointId;

//    @SerializedName("area-id")
//    @JsonProperty("area-id")
//    private String adminNodeId;

//    public String getAdminNodeId() {
//        return adminNodeId;
//    }
//
//    public void setAdminNodeId(String adminNodeId) {
//        this.adminNodeId = adminNodeId;
//    }
//
//
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getSex() {
//        return sex;
//    }
//
//    public void setSex(String sex) {
//        this.sex = sex;
//    }
//
//    public String getaAcPointId() {
//        return aAcPointId;
//    }
//
//    public void setaAcPointId(String aAcPointId) {
//        this.aAcPointId = aAcPointId;
//    }
}
