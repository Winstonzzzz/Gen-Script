package cn.bosc.channel.fortune.model.invest.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class FundCustTransitQryResponse {

	@ApiModelProperty("私募基金")
    @JsonProperty("listSM")
	private List<FundList> listSM;
	
	@ApiModelProperty("公募基金")
    @JsonProperty("listGM")
	private List<FundList> listGM;
	
}