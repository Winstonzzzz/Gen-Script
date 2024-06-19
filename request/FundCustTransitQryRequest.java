package cn.bosc.channel.fortune.model.invest.request;

import cn.bosc.channel.fortune.utils.ValidationData;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import static cn.bosc.channel.fortune.enums.ValidaTypeEnum.VALIDA_ACCOUNT_NO;

@Data
public class FundCustTransitQryRequest {

	@ApiModelProperty("账户号")
    @JsonProperty("_Account_No")
	private String _Account_No;

	@ApiModelProperty(value = "流水号")
    @JsonProperty("txnNo")
    private String txnNo;
}