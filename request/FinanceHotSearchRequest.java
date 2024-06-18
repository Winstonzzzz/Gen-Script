package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;
import java.util.Map;

public class FinanceHotSaleRequest {

    @ApiModelProperty(value = "流水号")
    @JsonProperty("txnNo")
    private String txnNo;

    @ApiModelProperty(value = "列表")
    @JsonProperty("list")
    private List<Map<String, Object>> list;

    @ApiModelProperty(value = "信息表")
    @JsonProperty("resMap")
    private Map<String,Object> resMap;

    @ApiModelProperty(value = "ceshi1")
    @JsonProperty("listInteger")
    private List<Integer> listInteger;

    @ApiModelProperty(value = "测试2")
    @JsonProperty("srlNo")
    private List<Map<String,Object>> srlNo;

}
