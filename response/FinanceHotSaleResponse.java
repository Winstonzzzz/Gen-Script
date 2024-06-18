package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public class FinanceHotSaleResponse {

    @ApiModelProperty(value = "结果")
    @JsonProperty("res")
    private String res;

}
